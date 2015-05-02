package com.kate.app.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kate.app.dao.RecoProjectDao;

@Service
public class RecoProjectSerivice {
	@Autowired
	private RecoProjectDao recoproject;
	public String getProjectdescription(){
		String projectdescription=recoproject.RecoProjectDao();
		System.out.println(projectdescription);
		return projectdescription;
		
	}
	

}