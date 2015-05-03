package com.kate.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kate.app.dao.SchoolNearDao;
import com.kate.app.model.NearSchoolFacility;
import com.kate.app.model.NearSchoolVo;

@Service
public class SchoolNearService {
	@Autowired
	private SchoolNearDao schoolNearDao;
	public List<NearSchoolVo> getNearSchoolInfo(){
		List<NearSchoolVo> nearSchoolList=schoolNearDao.getNearSchoolInfo();
		return nearSchoolList;
	}
	public List<NearSchoolFacility> getNearSchoolFacilityInfo(){
		List<NearSchoolFacility> nearSchoolFacility=schoolNearDao.getNearSchoolFacilityInfo();
		return nearSchoolFacility;
	}

}
