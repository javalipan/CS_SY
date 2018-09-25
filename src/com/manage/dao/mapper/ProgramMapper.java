package com.manage.dao.mapper;

import com.manage.dao.model.Program;
import com.manage.dao.model.ProgramExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProgramMapper {
    int countByExample(ProgramExample example);

    int deleteByExample(ProgramExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Program record);

    int insertSelective(Program record);

    List<Program> selectByExample(ProgramExample example);

    Program selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Program record, @Param("example") ProgramExample example);

    int updateByExample(@Param("record") Program record, @Param("example") ProgramExample example);

    int updateByPrimaryKeySelective(Program record);

    int updateByPrimaryKey(Program record);
}