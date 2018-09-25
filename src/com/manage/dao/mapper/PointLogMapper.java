package com.manage.dao.mapper;

import com.manage.dao.model.PointLog;
import com.manage.dao.model.PointLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointLogMapper {
    int countByExample(PointLogExample example);

    int deleteByExample(PointLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PointLog record);

    int insertSelective(PointLog record);

    List<PointLog> selectByExample(PointLogExample example);

    PointLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PointLog record, @Param("example") PointLogExample example);

    int updateByExample(@Param("record") PointLog record, @Param("example") PointLogExample example);

    int updateByPrimaryKeySelective(PointLog record);

    int updateByPrimaryKey(PointLog record);
}