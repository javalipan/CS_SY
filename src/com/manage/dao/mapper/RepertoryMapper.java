package com.manage.dao.mapper;

import com.manage.dao.model.Repertory;
import com.manage.dao.model.RepertoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepertoryMapper {
    int countByExample(RepertoryExample example);

    int deleteByExample(RepertoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Repertory record);

    int insertSelective(Repertory record);

    List<Repertory> selectByExample(RepertoryExample example);

    Repertory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Repertory record, @Param("example") RepertoryExample example);

    int updateByExample(@Param("record") Repertory record, @Param("example") RepertoryExample example);

    int updateByPrimaryKeySelective(Repertory record);

    int updateByPrimaryKey(Repertory record);
}