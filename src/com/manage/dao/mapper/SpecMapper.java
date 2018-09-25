package com.manage.dao.mapper;

import com.manage.dao.model.Spec;
import com.manage.dao.model.SpecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecMapper {
    int countByExample(SpecExample example);

    int deleteByExample(SpecExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Spec record);

    int insertSelective(Spec record);

    List<Spec> selectByExample(SpecExample example);

    Spec selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Spec record, @Param("example") SpecExample example);

    int updateByExample(@Param("record") Spec record, @Param("example") SpecExample example);

    int updateByPrimaryKeySelective(Spec record);

    int updateByPrimaryKey(Spec record);
}