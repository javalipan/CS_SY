package com.manage.query.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.manage.query.model.GoodsQuery;

public interface GoodsQueryMapper {

	/** 
	* 根据id查询商品
	* @param id
	* @return   GoodsQuery 
	* @author lipan@cqrainbowsoft.com    
	*/
	public GoodsQuery selectGoodsQueryById(@Param("id")Long id);
	/** 
	 * 根据code查询商品
	 * @param code
	 * @return   GoodsQuery 
	 * @author lipan@cqrainbowsoft.com    
	 */
	public GoodsQuery selectGoodsQueryByCode(@Param("code")String code);
    /** 
    * 查询商品列表
    * @param goodsQuery
    * @return    List<GoodsQuery> 
    * @author lipan@cqrainbowsoft.com    
    */
    public List<GoodsQuery> selectByGoodsQuery(GoodsQuery goodsQuery);
    /** 
    * 查询商品条数
    * @param goodsQuery
    * @return   Integer 
    * @author lipan@cqrainbowsoft.com    
    */
    public Integer countByGoodsQuery(GoodsQuery goodsQuery);
}
