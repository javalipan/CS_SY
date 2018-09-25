package com.manage.query.mapper;

import org.apache.ibatis.annotations.Param;

public interface SequenceQueryMapper {

	
	/** 
	*根据序列名称获取序列值
	* @param sequenceName	: 序列名称
	* @return    Integer
	* @author lipan@cqrainbowsoft.com    
	*/
	public Long getSeqNextVal(@Param("sequenceName")String sequenceName);
}
