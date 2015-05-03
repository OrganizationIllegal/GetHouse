package com.kate.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kate.app.dao.AreaFamilyDao;

@Service
public class AreaFamilyService {
	@Autowired
	private AreaFamilyDao areaFamilyDao;
	public int getdulirate(){
		int dulirate=areaFamilyDao.getdulirate();
		return dulirate;
	}
	public int getyoungfamilyrate(){
		int youngfamilyrate=areaFamilyDao.getyoungfamilyrate();
		return youngfamilyrate;
	}
	public int getoldfamilyrate(){
		int oldfamilyrate=areaFamilyDao.getoldfamilyrate();
		return oldfamilyrate;
	}
	

}
