package com.manage.dao.mapper;

import com.manage.dao.model.Imgs;
import com.manage.dao.model.ImgsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImgsMapper {
    int countByExample(ImgsExample example);

    int deleteByExample(ImgsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Imgs record);

    int insertSelective(Imgs record);

    List<Imgs> selectByExample(ImgsExample example);

    Imgs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Imgs record, @Param("example") ImgsExample example);

    int updateByExample(@Param("record") Imgs record, @Param("example") ImgsExample example);

    int updateByPrimaryKeySelective(Imgs record);

    int updateByPrimaryKey(Imgs record);
}