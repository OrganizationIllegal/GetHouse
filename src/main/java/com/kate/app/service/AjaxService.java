package com.kate.app.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.kate.app.dao.AjaxDao;
import com.kate.app.dao.HouseProjectDao;
import com.kate.app.model.HouseProject;
import com.kate.app.model.InvestmentDate;

@Service
public class AjaxService {
	@Autowired
    private AjaxDao ajaxDao;
	
	public JSONArray select(){
		JSONArray array = new JSONArray();
		array = ajaxDao.select();
		return array;
	}
	public int count(){
		int count = ajaxDao.count();
		return count;
	}
	public boolean addTouziData(int middle_price, int middle_zu_price, int price_review, int year_increment_rate, int zu_house_rate, String zu_xuqiu,String data_exam) throws Exception{
	    boolean result = false;
		/*int id = ajaxDao.findProByName(proName);
		
		boolean flag = ajaxDao.findById(id);
		boolean result;
		if(flag){*/
		/*	result = ajaxDao.editTouziData(id, rate, middle_price, middle, zu_house, money_huibao, zu_xuqiu, exam);
		}
		else{*/
			result = ajaxDao.addTouziData(middle_price, middle_zu_price, price_review, year_increment_rate, zu_house_rate, zu_xuqiu, data_exam);
		//}
		
		return result;			
	}
	
	public boolean editTouziData(int id, int middle_price, int middle_zu_price, int price_review, int year_increment_rate, int zu_house_rate, String zu_xuqiu,String data_exam) throws Exception{
		boolean flag = ajaxDao.editTouziData(id, middle_price, middle_zu_price, price_review, year_increment_rate, zu_house_rate, zu_xuqiu, data_exam);
		return flag;			
	}
	
	public boolean deleteTouziData(int id) throws Exception{
		boolean flag = ajaxDao.deleteTouziData(id);
	    return flag;			
	}
	
	
	public boolean addPro(String name, String lan, String detail) throws Exception{
		boolean flag = ajaxDao.addPro(name, lan, detail);
		return flag;			
	}
	
	public boolean findById(int id) throws Exception{
		boolean flag = ajaxDao.findById(id);
		return flag;			
	}
	
	
	public boolean editPro(int proid, String name, String lan, String detail) throws Exception{
		boolean flag = ajaxDao.editPro(proid, name, lan, detail);
		return flag;			
	}
	
	public boolean deletePro(int proid) throws Exception{
		boolean flag = ajaxDao.deletePro(proid);
		return flag;	
	}
}
