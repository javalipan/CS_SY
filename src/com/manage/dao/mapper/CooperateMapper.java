package com.manage.dao.mapper;

import com.manage.dao.model.Cooperate;
import com.manage.dao.model.CooperateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CooperateMapper {
    int countByExample(CooperateExample example);

    int deleteByExample(CooperateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Cooperate record);

    int insertSelective(Cooperate record);

    List<Cooperate> selectByExampleWithBLOBs(CooperateExample example);

    List<Cooperate> selectByExample(CooperateExample example);

    Cooperate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Cooperate record, @Param("example") CooperateExample example);

    int updateByExampleWithBLOBs(@Param("record") Cooperate record, @Param("example") CooperateExample example);

    int updateByExample(@Param("record") Cooperate record, @Param("example") CooperateExample example);

    int updateByPrimaryKeySelective(Cooperate record);

    int updateByPrimaryKeyWithBLOBs(Cooperate record);

    int updateByPrimaryKey(Cooperate record);
}