package com.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.dao.mapper.SpecMapper;
import com.manage.dao.model.Spec;
import com.manage.dao.model.SpecExample;
import com.manage.service.ISpecService;

@Service
public class SpecService implements ISpecService {

	@Autowired
	private SpecMapper specMapper;
	
	public int countByExample(SpecExample example) {
		return specMapper.countByExample(example);
	}

	public int deleteByExample(SpecExample example) {
		return specMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Long id) {
		return specMapper.deleteByPrimaryKey(id);
	}

	public int insertSelective(Spec record) {
		return specMapper.insertSelective(record);
	}

	public List<Spec> selectByExample(SpecExample example) {
		return specMapper.selectByExample(example);
	}

	public Spec selectByPrimaryKey(Long id) {
		return specMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(Spec record) {
		return specMapper.updateByPrimaryKeySelective(record);
	}

}
