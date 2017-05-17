package org.mybatis.generator;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.mybatis.generator.api.ShellRunner;

/**
 * <pre>
 * add pagination using mysql limit. 
 * This class is only used in ibator code generator.
 * </pre>
 */
public class MybatisGenerator {
	public static void main(String[] args) {
		
		System.out.println("开始生成代码...");
		MybatisGenerator t = new MybatisGenerator();
		String config = "generatorConfigBak.xml";
		try {
			//config = t.getClass().getResource(config).toURI().getPath();
			config = Resources.getResourceAsFile(config).getPath();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("完整的配置文件路径：" + config);
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
		System.out.println("完成。");
	}
}
