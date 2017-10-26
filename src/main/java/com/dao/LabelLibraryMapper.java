package com.dao;

import com.model.LabelLibrary;

public interface LabelLibraryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LabelLibrary record);

    int insertSelective(LabelLibrary record);

    LabelLibrary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LabelLibrary record);

    int updateByPrimaryKey(LabelLibrary record);
}