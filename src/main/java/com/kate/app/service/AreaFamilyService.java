package com.kate.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.kate.app.dao.AreaFamilyDao;
import com.kate.app.model.AreaFamily;

@Service
public class AreaFamilyService {
	@Autowired
	private AreaFamilyDao areaFamilyDao;
	public AreaFamily getAreaFamily(int proId){
		AreaFamily data=areaFamilyDao.getAreaFamily(proId);
		return data;
	}
	
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
	public int findProjectIdByname(String project_name){
		int project_id=areaFamilyDao.findProjectIdByName(project_name);
		return project_id;
	}
	public int findLatestid(){
		int id=areaFamilyDao.findLatestId();
		return id;
	}
	

}
