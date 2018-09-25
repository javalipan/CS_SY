package com.manage.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class areautil {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/house?characterEncoding=utf-8", "root", "root");
		Statement stmt=connection.createStatement();
		File file=new File("C:\\Users\\Administrator\\Desktop\\areas.txt");
		InputStreamReader read = new InputStreamReader(new FileInputStream(file),"UTF-8");//考虑到编码格式
		BufferedReader bufferedReader = new BufferedReader(read);
		String lineTxt = null;
		while((lineTxt = bufferedReader.readLine()) != null){
			String[] strs=lineTxt.split(",");
			String sql="insert into areas(areacode,name,type,pcode) values('"+strs[0]+"','"+strs[1]+"','1','1')";
			stmt.execute(sql);
		}
		read.close();
	}
}
