package com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.LabelLibraryMapper;
import com.model.LabelLibrary;

@Service("labelService")
public class LabelService {
	@Resource
	private LabelLibraryMapper labelLibraryMapper;
	
	public LabelLibrary getLabelInfo(Integer id){
		return labelLibraryMapper.selectByPrimaryKey(id);
	}
}
