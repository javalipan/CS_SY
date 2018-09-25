package com.manage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.dao.mapper.GoodsDetailMapper;
import com.manage.dao.model.GoodsDetail;
import com.manage.dao.model.GoodsDetailExample;
import com.manage.query.mapper.GoodsDetailQueryMapper;
import com.manage.query.model.GoodsDetailQuery;
import com.manage.service.IGoodsDetailService;

@Service
public class GoodsDetailService implements IGoodsDetailService {

	@Autowired
	private GoodsDetailMapper goodsDetailMapper;
	@Autowired
	private GoodsDetailQueryMapper goodsDetailQueryMapper;
	
	public int countByExample(GoodsDetailExample example) {
		return goodsDetailMapper.countByExample(example);
	}

	public int deleteByExample(GoodsDetailExample example) {
		return goodsDetailMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Long id) {
		return goodsDetailMapper.deleteByPrimaryKey(id);
	}

	public int insertSelective(GoodsDetail record) {
		return goodsDetailMapper.insertSelective(record);
	}

	public List<GoodsDetail> selectByExample(GoodsDetailExample example) {
		return goodsDetailMapper.selectByExample(example);
	}

	public GoodsDetail selectByPrimaryKey(Long id) {
		return goodsDetailMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(GoodsDetail record) {
		return goodsDetailMapper.updateByPrimaryKeySelective(record);
	}

	public GoodsDetailQuery selectGoodsDetailQueryById(Long id) {
		return goodsDetailQueryMapper.selectGoodsDetailQueryById(id);
	}

	public List<GoodsDetailQuery> selectByGoodsDetailQuery(
			GoodsDetailQuery goodsDetailQuery) {
		return goodsDetailQueryMapper.selectByGoodsDetailQuery(goodsDetailQuery);
	}

	public Integer countByGoodsDetailQuery(GoodsDetailQuery goodsDetailQuery) {
		return goodsDetailQueryMapper.countByGoodsDetailQuery(goodsDetailQuery);
	}

}
