package com.manage.dao.mapper;

import com.manage.dao.model.Recharge;
import com.manage.dao.model.RechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RechargeMapper {
    int countByExample(RechargeExample example);

    int deleteByExample(RechargeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Recharge record);

    int insertSelective(Recharge record);

    List<Recharge> selectByExample(RechargeExample example);

    Recharge selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Recharge record, @Param("example") RechargeExample example);

    int updateByExample(@Param("record") Recharge record, @Param("example") RechargeExample example);

    int updateByPrimaryKeySelective(Recharge record);

    int updateByPrimaryKey(Recharge record);
}