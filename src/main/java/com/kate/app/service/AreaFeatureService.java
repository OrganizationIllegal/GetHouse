package com.kate.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kate.app.dao.AreaFeatureDao;

@Service
public class AreaFeatureService {
	@Autowired
	private AreaFeatureDao areaFeatureDao;
	public List<String> getAreaFeature(int areaId){
		List<String> featureList=areaFeatureDao.getAreaFeature(areaId);
		return featureList;
		
	}

}
