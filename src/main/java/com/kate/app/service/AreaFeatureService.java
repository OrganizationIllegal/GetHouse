package com.kate.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kate.app.dao.AreaFeatureDao;

@Service
public class AreaFeatureService {
	@Autowired
	private AreaFeatureDao areaFeatureDao;
	public List<String> getAreaFeature(){
		List<String> featureList=areaFeatureDao.getAreaFeature();
		return featureList;
		
	}

}
