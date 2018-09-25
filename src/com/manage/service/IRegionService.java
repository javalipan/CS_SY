package com.manage.service;

import java.util.List;

import com.manage.dao.model.Region;
import com.manage.dao.model.RegionExample;

public interface IRegionService {

	int countByExample(RegionExample example);

    int deleteByExample(RegionExample example);

    int deleteByPrimaryKey(Integer addsid);

    int insertSelective(Region record);

    List<Region> selectByExample(RegionExample example);

    Region selectByPrimaryKey(Integer addsid);
    
    Region selectByCode(Integer code);

    int updateByPrimaryKeySelective(Region record);

}
