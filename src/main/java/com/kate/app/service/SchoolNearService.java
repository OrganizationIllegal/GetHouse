package com.kate.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kate.app.dao.SchoolNearDao;
import com.kate.app.model.NearPeiTao;
import com.kate.app.model.NearSchool;

@Service
public class SchoolNearService {
	@Autowired
	private SchoolNearDao schoolNearDao;
	public List<NearSchool> getNearSchoolInfo(int proId){
		List<NearSchool> nearSchoolList=schoolNearDao.getNearSchoolInfo(proId);
		return nearSchoolList;
	}
	public List<NearPeiTao> getNearSchoolFacilityInfo(int proId){
		List<NearPeiTao> nearSchoolFacility=schoolNearDao.getNearSchoolFacilityInfo(proId);
		return nearSchoolFacility;
	}

}
