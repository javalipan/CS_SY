package com.manage.service;

import java.util.List;

import com.manage.dao.model.Imgs;
import com.manage.dao.model.ImgsExample;

public interface IImgsService {

	int countByExample(ImgsExample example);

    int deleteByExample(ImgsExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(Imgs record);

    List<Imgs> selectByExample(ImgsExample example);

    Imgs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Imgs record);

}
