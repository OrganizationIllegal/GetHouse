package com.kate.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kate.app.dao.HouseTaxDao;
import com.kate.app.model.HoldingTaxVo;
import com.kate.app.model.HouseTaxData;
import com.kate.app.model.HouseTaxVo;

@Service
public class HouseTaxService {
	@Autowired
	private HouseTaxDao houseTaxDao;
	 public List<HouseTaxVo> getHouseTaxVo(){
		 List<HouseTaxVo> HouseTaxVoList=houseTaxDao.getHouseTaxVo();
		 return HouseTaxVoList;
	 }
	 public List<HoldingTaxVo> getHoldingTaxVo(){
		 List<HoldingTaxVo> holdingTaxVoList=houseTaxDao.getHoldingTaxVo();
		 return holdingTaxVoList;
	 }
	 public List<HouseTaxData> getHouseTaxData(){
		 List<HouseTaxData> list=houseTaxDao.getHouseTaxData();
		 return list;
	 }
	 public List<HouseTaxData> getHoldingData(){
		 List<HouseTaxData> list=houseTaxDao.getHoldingData();
		 return list;
	 }
}
