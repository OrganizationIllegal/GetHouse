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
	 public List<HouseTaxVo> getHouseTaxVo(int proId){
		 List<HouseTaxVo> HouseTaxVoList=houseTaxDao.getHouseTaxVo(proId);
		 return HouseTaxVoList;
	 }
	 public List<HoldingTaxVo> getHoldingTaxVo(int proId){
		 List<HoldingTaxVo> holdingTaxVoList=houseTaxDao.getHoldingTaxVo(proId);
		 return holdingTaxVoList;
	 }
	 public List<HouseTaxData> getHouseTaxData(int proId){
		 List<HouseTaxData> list=houseTaxDao.getHouseTaxData(proId);
		 return list;
	 }
	 public List<HouseTaxData> getHoldingData(int proId){
		 List<HouseTaxData> list=houseTaxDao.getHoldingData(proId);
		 return list;
	 }
}
