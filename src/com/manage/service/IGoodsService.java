package com.manage.service;

import java.util.List;

import com.manage.dao.model.Goods;
import com.manage.dao.model.GoodsExample;
import com.manage.query.model.GoodsQuery;

public interface IGoodsService {

	int countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(Goods record);

    List<Goods> selectByExampleWithBLOBs(GoodsExample example);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKey(Long id);
    
    int updateByExampleSelective(Goods record,GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    public boolean saveGoods(Goods goods,String detailJson,String imgJson);
    
    /** 
	* 根据id查询商品
	* @param id
	* @return   GoodsQuery 
	* @author lipan@cqrainbowsoft.com    
	*/
	public GoodsQuery selectGoodsQueryById(Long id);
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
    
    public boolean updateGoodsStatus(String ids,String status);
    
    /** 
	 * 根据code查询商品
	 * @param code
	 * @return   GoodsQuery 
	 * @author lipan@cqrainbowsoft.com    
	 */
	public GoodsQuery selectGoodsQueryByCode(String code);
}
