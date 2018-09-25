package com.manage.util.mybatis;

import org.apache.commons.lang.StringUtils;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.internal.DefaultCommentGenerator;

/**
 * @ClassName LocalCommentGenerator
 * @Description 重写mybatis自动生成注释样式
 * @date 2014-7-4 下午02:13:53
 */
public class LocalCommentGenerator extends DefaultCommentGenerator {

	private boolean suppressComments = false;
	
	/**
	 * 针对字段的注释
	 * */
	@Override
	public void addFieldComment(Field field,IntrospectedTable introspectedTable,IntrospectedColumn introspectedColumn) {
		if (suppressComments) {
			return;
		} else {
			StringBuilder sb = new StringBuilder();
			sb.append("/**");
			sb.append("[");
			sb.append(introspectedColumn.getLength());
			sb.append(introspectedColumn.isNullable() ? "" : " NOTNULL");
			sb.append("] ");
			if(StringUtils.isEmpty(introspectedColumn.getRemarks())){
				sb.append(introspectedColumn.getActualColumnName());
			}else{
				sb.append(introspectedColumn.getRemarks());
			}
			sb.append("*/");
			field.addJavaDocLine(sb.toString());
			return;
		}
	}

	/**
	 * 针对getter方法的注释
	 * */
	@Override
	public void addGetterComment(Method method,IntrospectedTable introspectedTable,IntrospectedColumn introspectedColumn) {
		if(suppressComments){
			return;
		}else{
			StringBuilder sb = new StringBuilder();
			method.addJavaDocLine("/**");
			sb.append(" * @return  ");
			sb.append(method.getReturnType().getShortName());
			sb.append("  ");
			if(StringUtils.isEmpty(introspectedColumn.getRemarks())){
				sb.append(introspectedColumn.getActualColumnName());
			}else{
				sb.append(introspectedColumn.getRemarks());
			}
			
			method.addJavaDocLine(sb.toString());
			method.addJavaDocLine(" */");
			return;
		}
	}

	/**
	 * 针对setter方法的注释
	 * */
	@Override
	public void addSetterComment(Method method,IntrospectedTable introspectedTable,IntrospectedColumn introspectedColumn) {
		if(suppressComments){
			return;
		}else{
			StringBuilder sb = new StringBuilder();
			method.addJavaDocLine("/**");
			Parameter parm = (Parameter) method.getParameters().get(0);
			parm.getType().getShortName();
			sb.append(" * @param  ");
			sb.append(parm.getType().getShortName());
			sb.append("[");
			sb.append(introspectedColumn.getLength());
			sb.append(introspectedColumn.isNullable() ? "" : " NOTNULL");
			sb.append("] ");
			if(StringUtils.isEmpty(introspectedColumn.getRemarks())){
				sb.append(introspectedColumn.getActualColumnName());
			}else{
				sb.append(introspectedColumn.getRemarks());
			}
			method.addJavaDocLine(sb.toString());
			method.addJavaDocLine(" */");
			return;
		}
	}
	
}
