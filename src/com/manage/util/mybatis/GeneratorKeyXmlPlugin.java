package com.manage.util.mybatis;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.XmlElement;

/** 
* @ClassName: GeneratorKeyXmlPlugin 
* @Description:  插入数据后自动获取主键插件
* @author lipan@cqrainbowsoft.com
* @date 2015-1-18 下午11:38:24 
*  
*/
public class GeneratorKeyXmlPlugin extends PluginAdapter{

	public boolean validate(List<String> arg0) {
		return true;
	}

	@Override
	public boolean sqlMapInsertSelectiveElementGenerated(XmlElement element,
			IntrospectedTable introspectedTable) {
		element.addAttribute(new Attribute("useGeneratedKeys", "true"));
		String primaryKey=introspectedTable.getPrimaryKeyColumns().get(0).getJavaProperty();
		element.addAttribute(new Attribute("keyProperty", primaryKey));
		return super.sqlMapInsertSelectiveElementGenerated(element, introspectedTable);
	}

	@Override
	public boolean sqlMapInsertElementGenerated(XmlElement element,
			IntrospectedTable introspectedTable) {
		element.addAttribute(new Attribute("useGeneratedKeys", "true"));
		//String primaryKey=introspectedTable.getPrimaryKeyColumns().get(0).getActualColumnName();
		String primaryKey=introspectedTable.getPrimaryKeyColumns().get(0).getJavaProperty();
		element.addAttribute(new Attribute("keyProperty", primaryKey));
		return super.sqlMapInsertElementGenerated(element, introspectedTable);
	}

	
	
}
