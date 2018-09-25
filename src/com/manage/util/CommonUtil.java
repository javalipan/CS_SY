package com.manage.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;


public class CommonUtil {
	//md5加密
	public static String md5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		  BASE64Encoder base64en = new BASE64Encoder();
	     String newstr=base64en.encode(md5.digest(str.getBytes("utf-8")));

		return newstr;
	}
}
