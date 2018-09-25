package com.manage.service.impl;

import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.dao.mapper.GoodsDetailMapper;
import com.manage.dao.mapper.GoodsMapper;
import com.manage.dao.mapper.ImgsMapper;
import com.manage.dao.model.Goods;
import com.manage.dao.model.GoodsDetail;
import com.manage.dao.model.GoodsDetailExample;
import com.manage.dao.model.GoodsExample;
import com.manage.dao.model.Imgs;
import com.manage.dao.model.ImgsExample;
import com.manage.query.mapper.GoodsQueryMapper;
import com.manage.query.model.GoodsQuery;
import com.manage.service.IGoodsService;
import com.manage.util.ArrayUtil;

@Service
public class GoodsService implements IGoodsService {

	@Autowired
	private GoodsMapper goodsMapper;
	@Autowired
	private GoodsQueryMapper goodsQueryMapper;
	@Autowired
	private ImgsMapper imgsMapper;
	@Autowired
	private GoodsDetailMapper goodsDetailMapper;
	
	public int countByExample(GoodsExample example) {
		return goodsMapper.countByExample(example);
	}

	public int deleteByExample(GoodsExample example) {
		return goodsMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Long id) {
		return goodsMapper.deleteByPrimaryKey(id);
	}

	public int insertSelective(Goods record) {
		return goodsMapper.insertSelective(record);
	}

	public List<Goods> selectByExampleWithBLOBs(GoodsExample example) {
		return goodsMapper.selectByExampleWithBLOBs(example);
	}

	public List<Goods> selectByExample(GoodsExample example) {
		return goodsMapper.selectByExample(example);
	}

	public Goods selectByPrimaryKey(Long id) {
		return goodsMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(Goods record) {
		return goodsMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByExampleSelective(Goods record, GoodsExample example) {
		return goodsMapper.updateByExampleSelective(record, example);
	}

	public boolean saveGoods(Goods goods, String detailJson, String imgJson) {
		if(StringUtils.isNotBlank(imgJson)){
			JSONArray jsonArray=JSONArray.fromObject(imgJson);
			if(jsonArray.size()>0){
				goods.setImg(jsonArray.getString(0));
			}
		}
		if(goods.getId()!=null){
			goods.setUpdatetime(new Date());
			goodsMapper.updateByPrimaryKeySelective(goods);
			if(StringUtils.isNotBlank(imgJson)){
				JSONArray jsonArray=JSONArray.fromObject(imgJson);
				if(jsonArray.size()>0){
					ImgsExample imgsExample=new ImgsExample();
					imgsExample.createCriteria().andReceiptidEqualTo(goods.getId()).andTypeEqualTo("1");
					imgsMapper.deleteByExample(imgsExample);
					
					for(int i=0;i<jsonArray.size();i++){
						Imgs imgs=new Imgs();
						imgs.setReceiptid(goods.getId());
						imgs.setType("1");
						imgs.setPath(jsonArray.getString(i));
						imgsMapper.insertSelective(imgs);
					}
				}
			}
			
			if(StringUtils.isNotBlank(detailJson)){
				JSONArray jsonArray=JSONArray.fromObject(detailJson);
				for(int i=0;i<jsonArray.size();i++){
					JSONObject detail=jsonArray.getJSONObject(i);
					GoodsDetail goodsDetail=new GoodsDetail();
					goodsDetail.setGoodsid(goods.getId());
					goodsDetail.setDetailcode(detail.getString("color"));
					goodsDetail.setSizeid(detail.getLong("size"));
					goodsDetail.setColorid(detail.getLong("color"));
					goodsDetail.setOldprice(detail.getDouble("oldprice"));
					goodsDetail.setPrice(detail.getDouble("price"));
					goodsDetail.setVipprice(detail.getDouble("vipprice"));
					goodsDetail.setAmount(0);
					goodsDetail.setStatus("0");
					goodsDetail.setUpdatetime(new Date());
					goodsDetailMapper.insertSelective(goodsDetail);
				}
			}
		}
		else{
			goods.setCreatetime(new Date());
			goods.setUpdatetime(new Date());
			goods.setStatus("0");
			goods.setClickcnt((long)0);
			goodsMapper.insertSelective(goods);
			if(StringUtils.isNotBlank(imgJson)){
				JSONArray jsonArray=JSONArray.fromObject(imgJson);
				for(int i=0;i<jsonArray.size();i++){
					Imgs imgs=new Imgs();
					imgs.setReceiptid(goods.getId());
					imgs.setType("1");
					imgs.setPath(jsonArray.getString(i));
					imgsMapper.insertSelective(imgs);
				}
			}
			
			if(StringUtils.isNotBlank(detailJson)){
				JSONArray jsonArray=JSONArray.fromObject(detailJson);
				for(int i=0;i<jsonArray.size();i++){
					JSONObject detail=jsonArray.getJSONObject(i);
					GoodsDetail goodsDetail=new GoodsDetail();
					goodsDetail.setGoodsid(goods.getId());
					goodsDetail.setDetailcode(detail.getString("color"));
					goodsDetail.setSizeid(detail.getLong("size"));
					goodsDetail.setColorid(detail.getLong("color"));
					goodsDetail.setOldprice(detail.getDouble("oldprice"));
					goodsDetail.setPrice(detail.getDouble("price"));
					goodsDetail.setVipprice(detail.getDouble("vipprice"));
					goodsDetail.setAmount(0);
					goodsDetail.setStatus("0");
					goodsDetail.setUpdatetime(new Date());
					goodsDetailMapper.insertSelective(goodsDetail);
				}
			}
		}
		return true;
	}

	public GoodsQuery selectGoodsQueryById(Long id) {
		return goodsQueryMapper.selectGoodsQueryById(id);
	}

	public List<GoodsQuery> selectByGoodsQuery(GoodsQuery goodsQuery) {
		return goodsQueryMapper.selectByGoodsQuery(goodsQuery);
	}

	public Integer countByGoodsQuery(GoodsQuery goodsQuery) {
		return goodsQueryMapper.countByGoodsQuery(goodsQuery);
	}

	public boolean updateGoodsStatus(String ids, String status) {
		List<Long> idlist=ArrayUtil.idsToLongList(ids);
		GoodsExample goodsExample=new GoodsExample();
		goodsExample.createCriteria().andIdIn(idlist);
		Goods goods=new Goods();
		goods.setStatus(status);
		goodsMapper.updateByExampleSelective(goods, goodsExample);
		
		GoodsDetailExample goodsDetailExample=new GoodsDetailExample();
		goodsDetailExample.createCriteria().andGoodsidIn(idlist);
		GoodsDetail goodsDetail=new GoodsDetail();
		goodsDetail.setStatus(status);
		goodsDetailMapper.updateByExampleSelective(goodsDetail, goodsDetailExample);
		return false;
	}

	public GoodsQuery selectGoodsQueryByCode(String code) {
		return goodsQueryMapper.selectGoodsQueryByCode(code);
	}

}
