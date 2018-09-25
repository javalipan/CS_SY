package com.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.dao.mapper.ImgsMapper;
import com.manage.dao.model.Imgs;
import com.manage.dao.model.ImgsExample;
import com.manage.service.IImgsService;

@Service
public class ImgsService implements IImgsService {

	@Autowired
	private ImgsMapper imgsMapper;
	
	public int countByExample(ImgsExample example) {
		return imgsMapper.countByExample(example);
	}

	public int deleteByExample(ImgsExample example) {
		return imgsMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Long id) {
		return imgsMapper.deleteByPrimaryKey(id);
	}

	public int insertSelective(Imgs record) {
		return imgsMapper.insertSelective(record);
	}

	public List<Imgs> selectByExample(ImgsExample example) {
		return imgsMapper.selectByExample(example);
	}

	public Imgs selectByPrimaryKey(Long id) {
		return imgsMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(Imgs record) {
		return imgsMapper.updateByPrimaryKeySelective(record);
	}

}
