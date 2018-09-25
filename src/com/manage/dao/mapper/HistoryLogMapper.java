package com.manage.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.manage.dao.model.HistoryLog;
import com.manage.dao.model.HistoryLogExample;

public interface HistoryLogMapper {
    int countByExample(HistoryLogExample example);

    int deleteByExample(HistoryLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HistoryLog record);

    int insertSelective(HistoryLog record);

    List<HistoryLog> selectByExample(HistoryLogExample example);

    HistoryLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HistoryLog record, @Param("example") HistoryLogExample example);

    int updateByExample(@Param("record") HistoryLog record, @Param("example") HistoryLogExample example);

    int updateByPrimaryKeySelective(HistoryLog record);

    int updateByPrimaryKey(HistoryLog record);
}