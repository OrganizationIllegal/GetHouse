package com.kate.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kate.app.dao.BuyInfoDao;
import com.kate.app.model.BuyInfo;

@Service
public class BuyInfoService {
	@Autowired
	private BuyInfoDao buyInfoDao;
	public int getReturnMoney(){
		int returnMoney=buyInfoDao.BuyInfoDao();
		return returnMoney;
	}
	

}
