package org.mybatis.generator;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mybatis.generator.api.ShellRunner;
import org.springside.modules.utils.io.URLResourceUtil;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;

/**
 * BASE_PREFIX的作用 所有表名前缀为这个List里面的表 比如rp_user rp_text都会放到这个包底下
 * 以基础包名为com.ssf.dao为例子,生成包名为com.ssf.rp.dao
 * 如果都不符合则生成到默认包名com.ssf.dao底下
 * 
 * 基础包名在mybatis-generator.properties配置文件里面
 * ORIGIN_CONFIG为基础配置xml文件 生成的xml文件是以他有模板的  
 * @author wyy
 *
 */
public class MybatisGenerator {
	public static final String ORIGIN_CONFIG    = "generatorConfig.xml";
	public static final String OUT_CONFIG       = "generatorConfigBak.xml";
	public static final String CONFIG_GENERATOR = "jdbc.properties";//"mybatis-generator.properties";
	public static final List<String> BASE_PREFIX = Lists.newArrayList("rp_","pms_","sys_");//也就是包名
	
	public static final Properties PROPERTIES = new Properties();
	//日记字典
	//public static final Properties DICT_PROPERTIES =new Properties();
	public static Map<String,String> COMMENT_MAPS = Maps.newHashMap();
	static
	{
		try {
			InputStream is = URLResourceUtil.asStream("classpath://"+CONFIG_GENERATOR);//DataSourceFactory.class.getResourceAsStream("/jdbc.properties");
			PROPERTIES.load(is);
			//PropertiesUtil.loadFromString(content)
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//工具方法区域
	public static  List<String> getTableNames(Properties props){
		String dbName = props.getProperty("dbName");
		String dbType = props.getProperty("dbType");
		return DataBasePopulator.getTableNames(props, dbName,dbType);
	}
	public static  Map<String,String> getTableComments(Properties props){
		if(COMMENT_MAPS.size()>0){
			return COMMENT_MAPS;
		}
		String dbName = props.getProperty("dbName");
		String dbType = props.getProperty("dbType");
		return DataBasePopulator.getTableComments(props, dbName,dbType);
	}
	/**
	 * 
	 * @param key 表名 比如sys_user
	 * @return
	 */
	public static String getTableComment(String key){
		 Map<String,String> maps = getTableComments(PROPERTIES);
		 return maps.get(key);
	}
	
	/**
	 * 首字母小写
	 * @param str
	 * @return
	 */
	public static String lowerCapital(final String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return str;
        }

        char firstChar = str.charAt(0);
        if (Character.isTitleCase(firstChar)) {
            return str;
        }

        return new StringBuilder(strLen)
            .append(Character.toLowerCase(firstChar))
            .append(str.substring(1))
            .toString();
    }
	/**
	 * 将基础包名比如com.ssf.dao 转化为指定的包名
	 */
	public static String parsePackageName(String basePackageName,String key){
		int idx = basePackageName.lastIndexOf(".");
		String pName = basePackageName.substring(0,idx)+"." + key+"."+basePackageName.substring(idx+1);
		pName = Joiner.on(".").join(Splitter.on(".").omitEmptyStrings().split(pName));
		return pName;
	}
	
    public static Multimap<String, String> getTableMultimap(List<String> tableNames,List<String> prefixs){
    	String regex = "";
		if(prefixs != null)
			regex = "("+Joiner.on("|").join(prefixs)+")";
		
		Pattern pattern = Pattern.compile(regex);
		Multimap<String, String> multimap = ArrayListMultimap.create();
		for (String tname : tableNames)  
		{
			String base = tname;
			Matcher macther = pattern.matcher(tname);
			String find = "";
			if(macther.find())
			{
				find = macther.group();
				tname = tname.replace(find, "");
			}
			String packageName = (find).replace("_", ".");
			multimap.put(packageName, base);
		}
		return multimap;
    }
	
	
	/**
	 * 第一步生成-数据库结构
	 * @param props
	 * @param lists
	 */
	public static void runSql(Properties props,List<String> lists){
		
		DataBasePopulator.initDatabase(props,lists);
	}
	/**
	 * 第三步 -生成-DAO/Model/Mapper映射文件
	 * @param config
	 */
	public static void generator(String config){
		System.out.println("开始生成代码...");
		try {
			config = URLResourceUtil.asFile("classpath://"+config).getPath();
			System.out.println("配置文件:"+config);
		}  catch (IOException e) {
			e.printStackTrace();
			return;
		}
		System.out.println("完整的配置文件路径：" + config);
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
		System.out.println("代码生成完成。");
	}
	
	/**
	 * 第二步-生成配置文件
	 * prefixs ==null 生成路径为generatorConfigBak.xml 统一生在一个包下面com.ssf.model
	 * 默认使用BASE_PREFIX
	 */
	public static List<String> generateConfigXML(Properties props,List<String> tableNames,List<String> prefixs){
		String dbName = props.getProperty("dbName");
		String dbType = props.getProperty("dbType");
		if(dbName==null || "".equals(dbName)){
			throw new RuntimeException("dbName没有在配置文件里面设置");
		}
		if(dbType==null || "".equals(dbType)){
			dbType="mysql";
			System.out.println("dbType为空设为默认值mysql");
		}
		 String myBussinessPackage = props.getProperty("myBussinessPackage");
		 String myMapperPackage = props.getProperty("myMapperPackage");
		 String myModelPackage 	   = props.getProperty("myModelPackage");
		 
		 try {
			return GeneratorConfigXMLUtil.generateConfigXML(tableNames, prefixs, ORIGIN_CONFIG, myBussinessPackage,myMapperPackage, myModelPackage);
		} catch (IOException | CloneNotSupportedException | IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException e) {
			e.printStackTrace();
		}
		 return Lists.newArrayList();
	}
	
}
