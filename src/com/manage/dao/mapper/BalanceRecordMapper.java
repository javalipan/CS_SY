package com.manage.dao.mapper;

import com.manage.dao.model.BalanceRecord;
import com.manage.dao.model.BalanceRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BalanceRecordMapper {
    int countByExample(BalanceRecordExample example);

    int deleteByExample(BalanceRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BalanceRecord record);

    int insertSelective(BalanceRecord record);

    List<BalanceRecord> selectByExample(BalanceRecordExample example);

    BalanceRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BalanceRecord record, @Param("example") BalanceRecordExample example);

    int updateByExample(@Param("record") BalanceRecord record, @Param("example") BalanceRecordExample example);

    int updateByPrimaryKeySelective(BalanceRecord record);

    int updateByPrimaryKey(BalanceRecord record);
}