package com.manage.util.mybatis;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;


public class MyBatisGeneratorTool {

	public static void main(String[] args) {
		 	List<String> warnings = new ArrayList<String>();  
	        ConfigurationParser cp = new ConfigurationParser(warnings);  
	        boolean overwrite = true;
	        String configPath = "src/generatorConfig.xml";
	        //String configPath = "src/generatorConfig_org.xml";
	        File configFile = new File(configPath);
	        try{
	            Configuration config = cp.parseConfiguration(configFile);  
	            DefaultShellCallback callback = new DefaultShellCallback(overwrite);  
	            //LocalMyBatisGenerator继承自MyBatisGenerator,默认XML生成方式isMergeable为false
	            MyBatisGenerator myBatisGenerator = new LocalMyBatisGenerator(config, callback, warnings);
	            myBatisGenerator.generate(null);
	            System.out.println("完成！");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
