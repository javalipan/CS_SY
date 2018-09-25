package com.manage.dao.mapper;

import com.manage.dao.model.LevelSetting;
import com.manage.dao.model.LevelSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LevelSettingMapper {
    int countByExample(LevelSettingExample example);

    int deleteByExample(LevelSettingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LevelSetting record);

    int insertSelective(LevelSetting record);

    List<LevelSetting> selectByExample(LevelSettingExample example);

    LevelSetting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LevelSetting record, @Param("example") LevelSettingExample example);

    int updateByExample(@Param("record") LevelSetting record, @Param("example") LevelSettingExample example);

    int updateByPrimaryKeySelective(LevelSetting record);

    int updateByPrimaryKey(LevelSetting record);
}