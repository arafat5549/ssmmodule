package org.mybatis.generator;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 运行sql语句 创建数据库和测试数据
 * @author wyy
 *
 */
public class DataBasePopulator {

	private static final Properties PROPERTIES = new Properties();
	private static Logger logger = LoggerFactory.getLogger(DataBasePopulator.class);
	
	static
	{
		try {
			InputStream is = DataSourceFactory.class.getResourceAsStream("/jdbc.properties");
			PROPERTIES.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() 
	{
		String driver   = PROPERTIES.getProperty("jdbc.driverClassName");
		String url      = PROPERTIES.getProperty("jdbc.url");
		String username = PROPERTIES.getProperty("jdbc.username");
		String password = PROPERTIES.getProperty("jdbc.password");
		Connection connection = null;
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
		return connection;
	}
	/**
	 *  初始化数据库创建数据库测试数据
	 *  创建数据库和测试数据
	 */
	public static void initDatabase()
	{
		Connection connection = null;
		Reader reader = null;
		try {
			
			connection = getConnection();
			ScriptRunner scriptRunner = new ScriptRunner(connection);
			
			reader = Resources.getResourceAsReader("sql/finalssm.sql");
			scriptRunner.runScript(reader);
			logger.info("创建数据表结构成功:[sql/finalssm.sql]");
			
			reader = Resources.getResourceAsReader("sql/finalssm_data.sql");
			scriptRunner.runScript(reader);
			logger.info("生成数据成功:[sql/finalssm_data.sql]");
			
			connection.commit();
			reader.close();
			scriptRunner.closeConnection();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void main(String[] args) {
		initDatabase();
	}
	/**
	 * 获取所有数据库的名称
	 * databaseId ='mysql' , "oracle" , "sqlserver"
	 * @return
	 */
	public static List<String> getTableNames(String dbName,String databaseId)
	{
		//用sql获取数据库中所有的表名的方法：
		//1、oracle下：select table_name from all_tables;
		//2、MySQL下：select table_name from information_schema.tables where table_schema='csdb' and table_type='base table';
		//3、sql server下：select name from sys.tables go
		
		String sql = "select table_name from information_schema.tables where table_schema='"+dbName+"' and table_type='base table';";
		if(databaseId == "oracle"){
			sql = "select table_name from all_tables;";
		}
		
		List<String> lists = new ArrayList<String>();
		Connection conn = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			ptmt = conn.prepareStatement(sql);
			rs = ptmt.executeQuery();
			//ResultSetMetaData rsmd = rs.getMetaData();
			//int columnCount = rsmd.getColumnCount();
			while(rs.next()){
				String tname = rs.getString("table_name"); 
				lists.add(tname);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null )   rs.close();
				if(ptmt!=null ) ptmt.close();
				if(conn!=null ) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lists;
	}
}
