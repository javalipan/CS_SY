package com.manage.dao.mapper;

import com.manage.dao.model.LoginHistory;
import com.manage.dao.model.LoginHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginHistoryMapper {
    int countByExample(LoginHistoryExample example);

    int deleteByExample(LoginHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LoginHistory record);

    int insertSelective(LoginHistory record);

    List<LoginHistory> selectByExample(LoginHistoryExample example);

    LoginHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LoginHistory record, @Param("example") LoginHistoryExample example);

    int updateByExample(@Param("record") LoginHistory record, @Param("example") LoginHistoryExample example);

    int updateByPrimaryKeySelective(LoginHistory record);

    int updateByPrimaryKey(LoginHistory record);
}