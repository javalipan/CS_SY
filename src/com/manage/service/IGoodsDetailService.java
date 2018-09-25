package com.manage.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.manage.dao.model.GoodsDetail;
import com.manage.dao.model.GoodsDetailExample;
import com.manage.query.model.GoodsDetailQuery;

public interface IGoodsDetailService {

	int countByExample(GoodsDetailExample example);

    int deleteByExample(GoodsDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(GoodsDetail record);

    List<GoodsDetail> selectByExample(GoodsDetailExample example);

    GoodsDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodsDetail record);

    /** 
	* 根据id查询商品详情
	* @param id
	* @return   GoodsDetailQuery 
	* @author lipan@cqrainbowsoft.com    
	*/
	public GoodsDetailQuery selectGoodsDetailQueryById(@Param("id")Long id);
    /** 
    * 查询商品详情列表
    * @param goodsDetailQuery
    * @return    List<GoodsDetailQuery> 
    * @author lipan@cqrainbowsoft.com    
    */
    public List<GoodsDetailQuery> selectByGoodsDetailQuery(GoodsDetailQuery goodsDetailQuery);
    /** 
    * 查询商品详情条数
    * @param goodsDetailQuery
    * @return   Integer 
    * @author lipan@cqrainbowsoft.com    
    */
    public Integer countByGoodsDetailQuery(GoodsDetailQuery goodsDetailQuery);
}