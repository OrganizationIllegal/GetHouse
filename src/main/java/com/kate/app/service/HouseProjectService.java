package com.kate.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kate.app.dao.HouseProjectDao;
import com.kate.app.model.BrokerInfo;
import com.kate.app.model.DeveloperInfo;
import com.kate.app.model.HouseProject;
import com.kate.app.model.ProjectImage;

@Service
public class HouseProjectService {
	@Autowired
    private HouseProjectDao houseProjectDao;
	

	public HouseProject getHouseProject(int id){
		HouseProject projectInfo = new HouseProject();		
		projectInfo = houseProjectDao.HouseProjectDao(id);
		return projectInfo;
				
	}
	
	public BrokerInfo getBrokerInfo(int id){
		BrokerInfo brokerInfo = new BrokerInfo();		
		brokerInfo = houseProjectDao.BrokerInfoDao(id);
		return brokerInfo;
				
	}
	
	
	public DeveloperInfo getDeveloperInfo(int id){
		DeveloperInfo developerInfo = new DeveloperInfo();		
		developerInfo = houseProjectDao.DeveloperInfoDao(id);
		return developerInfo;
				
	}
	
	public List<ProjectImage> getHouseProjectImage(int proId){
		List<ProjectImage> list = new ArrayList<ProjectImage>();
		list = houseProjectDao.HouseProjectImageDao(proId);
		return list;
	}
	
	public List<ProjectImage> HousePeitaoImageDao(int proId){
		List<ProjectImage> list = new ArrayList<ProjectImage>();
		list = houseProjectDao.HousePeitaoImageDao(proId);
		return list;
	}
	
	
	
	public List<HouseProject> getHouseProjectList(int proId){
		List<HouseProject> list = new ArrayList<HouseProject>();
		//list = houseProjectDao.HouseProjectDao();

		return list;
				
	}
}
