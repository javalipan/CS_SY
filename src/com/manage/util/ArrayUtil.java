package com.manage.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class ArrayUtil {

	public static List<String> arrayToList(String array[]){
		List<String> list=new ArrayList<String>();
		for(String str:array){
			list.add(str);
		}
		return list;
	}
	
	public static List<Integer> arrayToIntegerList(String array[]){
		List<Integer> list=new ArrayList<Integer>();
		for(String str:array){
			list.add(Integer.parseInt(str));
		}
		return list;
	}
	
	public static List<Long> arrayToLongList(String array[]){
		List<Long> list=new ArrayList<Long>();
		for(String str:array){
			list.add(Long.parseLong(str));
		}
		return list;
	}
	
	public static List<String> idsToList(String ids){
		if(StringUtils.isBlank(ids)){
			return null;
		}
		String array[]=ids.split(",");
		return arrayToList(array);
	}
	
	public static List<Integer> idsToIntegerList(String ids){
		if(StringUtils.isBlank(ids)){
			return null;
		}
		String array[]=ids.split(",");
		return arrayToIntegerList(array);
	}
	
	public static List<Long> idsToLongList(String ids){
		if(StringUtils.isBlank(ids)){
			return null;
		}
		String array[]=ids.split(",");
		return arrayToLongList(array);
	}
}
