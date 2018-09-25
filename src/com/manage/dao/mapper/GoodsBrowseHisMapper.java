package com.manage.dao.mapper;

import com.manage.dao.model.GoodsBrowseHis;
import com.manage.dao.model.GoodsBrowseHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsBrowseHisMapper {
    int countByExample(GoodsBrowseHisExample example);

    int deleteByExample(GoodsBrowseHisExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsBrowseHis record);

    int insertSelective(GoodsBrowseHis record);

    List<GoodsBrowseHis> selectByExample(GoodsBrowseHisExample example);

    GoodsBrowseHis selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsBrowseHis record, @Param("example") GoodsBrowseHisExample example);

    int updateByExample(@Param("record") GoodsBrowseHis record, @Param("example") GoodsBrowseHisExample example);

    int updateByPrimaryKeySelective(GoodsBrowseHis record);

    int updateByPrimaryKey(GoodsBrowseHis record);
}