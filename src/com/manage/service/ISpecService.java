package com.manage.service;

import java.util.List;

import com.manage.dao.model.Spec;
import com.manage.dao.model.SpecExample;

public interface ISpecService {

	int countByExample(SpecExample example);

    int deleteByExample(SpecExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(Spec record);

    List<Spec> selectByExample(SpecExample example);

    Spec selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Spec record);

}
