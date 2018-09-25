package com.manage.query.mapper;

import org.apache.ibatis.annotations.Param;

import com.manage.dao.model.LevelSetting;

public interface LevelSettingQueryMapper {

	
	/**
	 * 根据总消费金额查询等级
	 * @param totalcost：总消费金额
	 * @return
	 */
	public LevelSetting getLevel(@Param("totalcost")Double totalcost);
}
