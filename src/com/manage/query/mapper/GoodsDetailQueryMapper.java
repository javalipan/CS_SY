package com.manage.query.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.manage.query.model.GoodsDetailQuery;

public interface GoodsDetailQueryMapper {

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
