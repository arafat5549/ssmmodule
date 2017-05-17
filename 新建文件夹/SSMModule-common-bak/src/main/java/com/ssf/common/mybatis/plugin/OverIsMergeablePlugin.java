package com.ssf.common.mybatis.plugin;

import java.lang.reflect.Field;
import java.util.List;

import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

/**
 * 强制覆盖xml文件(注意这样每次都会生成新的mapper.xml会覆盖掉你编写的部分)
 * 利用反射设置isMergeable为false
 * 
 * @author wyy
 *
 */
public class OverIsMergeablePlugin extends PluginAdapter{
	@Override
	public boolean validate(List warnings) {
		return true;
	}
	@Override
	public boolean sqlMapGenerated(GeneratedXmlFile sqlMap, IntrospectedTable introspectedTable) {
		try {
			Field field = sqlMap.getClass().getDeclaredField("isMergeable");
			field.setAccessible(true);
			field.setBoolean(sqlMap, false);
		} catch (Exception e) {
		e.printStackTrace();
		}
		return true;
	}
}
