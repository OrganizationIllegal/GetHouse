package com.kate.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kate.app.dao.HouseProjectDao;
import com.kate.app.model.HouseProject;

@Service
public class HouseProjectService {
	@Autowired
    private HouseProjectDao houseProjectDao;
	
	public List<HouseProject> getHouseProjectList(){
		List<HouseProject> list = new ArrayList<HouseProject>();
		list = houseProjectDao.HouseProjectDao();
		System.out.println("ffffffff"+list.size());
		return list;
				
	}
}
