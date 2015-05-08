package com.kate.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
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
	//Ôö
	public int  InsertAreaFamily(String family_type,int rate,int house_pro_id){
		int result=areaFamilyDao.InsertAreaFamily(family_type, rate, house_pro_id);
		return result;
	}
	//É¾
	public int delAreaFamily(int id){
		int result=areaFamilyDao.delAreaFamily(id);
		return result;
	}
	//²é
	public JSONArray listAreaFamily(){
		JSONArray jsonArray=areaFamilyDao.listAreaFamily();
		return jsonArray;
	}
	//¸Ä
	public int updateAreaFamily(int id,String family_type,int rate,int house_pro_id){
		int result=areaFamilyDao.updateAreaFamily(id, family_type, rate, house_pro_id);
		return result;
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
