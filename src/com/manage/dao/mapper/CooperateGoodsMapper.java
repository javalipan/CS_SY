package com.manage.dao.mapper;

import com.manage.dao.model.CooperateGoods;
import com.manage.dao.model.CooperateGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CooperateGoodsMapper {
    int countByExample(CooperateGoodsExample example);

    int deleteByExample(CooperateGoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CooperateGoods record);

    int insertSelective(CooperateGoods record);

    List<CooperateGoods> selectByExample(CooperateGoodsExample example);

    CooperateGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CooperateGoods record, @Param("example") CooperateGoodsExample example);

    int updateByExample(@Param("record") CooperateGoods record, @Param("example") CooperateGoodsExample example);

    int updateByPrimaryKeySelective(CooperateGoods record);

    int updateByPrimaryKey(CooperateGoods record);
}