package com.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.dao.mapper.RegionMapper;
import com.manage.dao.model.Region;
import com.manage.dao.model.RegionExample;
import com.manage.service.IRegionService;

@Service
public class RegionService implements IRegionService {

	@Autowired
	private RegionMapper regionMapper;
	
	public int countByExample(RegionExample example) {
		return regionMapper.countByExample(example);
	}

	public int deleteByExample(RegionExample example) {
		return regionMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer addsid) {
		return regionMapper.deleteByPrimaryKey(addsid);
	}

	public int insertSelective(Region record) {
		return regionMapper.insertSelective(record);
	}

	public List<Region> selectByExample(RegionExample example) {
		return regionMapper.selectByExample(example);
	}

	public Region selectByPrimaryKey(Integer addsid) {
		return regionMapper.selectByPrimaryKey(addsid);
	}

	public int updateByPrimaryKeySelective(Region record) {
		return regionMapper.updateByPrimaryKeySelective(record);
	}

	public Region selectByCode(Integer code) {
		RegionExample regionExample=new RegionExample();
		regionExample.createCriteria().andCodeEqualTo(code);
		List<Region> resList=regionMapper.selectByExample(regionExample);
		if(resList.size()==1){
			return resList.get(0);
		}
		return null;
	}

}
