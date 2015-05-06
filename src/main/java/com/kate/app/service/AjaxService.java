package com.kate.app.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kate.app.dao.AjaxDao;
import com.kate.app.dao.HouseProjectDao;
import com.kate.app.model.HouseInfo;
import com.kate.app.model.HouseProject;
import com.kate.app.model.InvestmentDate;

@Service
public class AjaxService {
	@Autowired
    private AjaxDao ajaxDao;
	
	public JSONArray select(){
		JSONArray array = new JSONArray();
		List<InvestmentDate> list = ajaxDao.select();
		for(InvestmentDate data : list){
			JSONObject obj = new JSONObject();
			obj.put("id", data.getId());
			obj.put("data_exam", data.getData_exam());
			obj.put("middle_price", data.getMiddle_price());
			obj.put("middle_zu_price", data.getMiddle_zu_price());
			obj.put("price_review", data.getPrice_review());
			obj.put("year_increment_rate", data.getYear_increment_rate());
			obj.put("zu_house_rate", data.getZu_house_rate());
			obj.put("zu_xuqiu", data.getZu_xuqiu());
			String name = ajaxDao.findProById(data.getHouse_pro_id()).getProject_name();
			String proName = name==null? "" : name;
			obj.put("project_name", proName);
			array.add(obj);
		}
		return array;
	}
	
	public JSONArray selectHouseInfo(){
		JSONArray array = new JSONArray();
		List<HouseInfo> list = ajaxDao.selectHouseInfo();
		for(HouseInfo data : list){
			JSONObject obj = new JSONObject();
			obj.put("id", data.getId());
			obj.put("house_type", data.getHouse_type());
			obj.put("house_room_num", data.getHouse_room_num());
			obj.put("house_toilet_num", data.getHouse_toilet_num());
			obj.put("house_size", data.getHouse_size());
			obj.put("house_price", data.getHouse_price());
			obj.put("house_img", data.getHouse_img());
			String name = ajaxDao.findProById(data.getHouse_project_id()).getProject_name();
			String proName = name==null? "" : name;
			obj.put("project_name", proName);
			array.add(obj);
		}
		return array;
	}
	
	public JSONArray selectHouseProject(){
		JSONArray array = new JSONArray();
		List<HouseProject> list = ajaxDao.selectHouseProject();
		for(HouseProject data : list){
			JSONObject obj = new JSONObject();
			obj.put("id", data.getId());
			obj.put("project_name", data.getProject_name());
			obj.put("project_area", data.getProject_area());
			obj.put("project_nation", data.getProject_nation());
			obj.put("project_address", data.getProject_address());
			obj.put("project_sales_remain", data.getProject_sales_remain());
			obj.put("project_finish_time", data.getProject_finish_time());
			obj.put("project_desc", data.getProject_desc());  // 项目详情
			obj.put("project_city", data.getProject_city());
			obj.put("project_house_type", data.getProject_house_type());
			obj.put("project_price", data.getProject_price());
			obj.put("project_lan", data.getProject_lan());  // 项目一句话
			array.add(obj);
		}
		return array;
	}
	
	
	public int count(){
		int count = ajaxDao.count();
		return count;
	}
	
	public int countHouseInfo(){
		int count = ajaxDao.countHouseInfo();
		return count;
	}
	
	public int countHouseProject(){
		int count = ajaxDao.countHouseProject();
		return count;
	}
	
	
	public boolean addTouziData(String project_name, int middle_price, int middle_zu_price, int price_review, int year_increment_rate, int zu_house_rate, String zu_xuqiu,String data_exam) throws Exception{
	    boolean result = false;
		int proId= ajaxDao.findProByName(project_name);
		/*
		boolean flag = ajaxDao.findById(proId);
		if(flag){
			result = ajaxDao.editTouziData(id, middle_price, middle_zu_price, price_review, year_increment_rate, zu_house_rate, zu_xuqiu, data_exam, id);
		}
		else{*/
			result = ajaxDao.addTouziData(middle_price, middle_zu_price, price_review, year_increment_rate, zu_house_rate, zu_xuqiu, data_exam, proId);
		//}
		
		return result;			
	}
	
	public boolean addHouseInfo(String project_name, String house_type, int house_room_num, int house_toilet_num, int house_size, String house_price, String house_img) throws Exception{
	    boolean result = false;
		int proId= ajaxDao.findProByName(project_name);
		result = ajaxDao.addHouseInfo(house_type, house_room_num, house_toilet_num, house_size, house_price, house_img, proId);
		return result;	
	}
	
	public boolean editTouziData(int id, String project_name, int middle_price, int middle_zu_price, int price_review, int year_increment_rate, int zu_house_rate, String zu_xuqiu,String data_exam) throws Exception{
		int proId= ajaxDao.findProByName(project_name);
		boolean flag = ajaxDao.editTouziData(id, middle_price, middle_zu_price, price_review, year_increment_rate, zu_house_rate, zu_xuqiu, data_exam, proId);
		return flag;			
	}
	
	public boolean editHouseInfo(int id, String project_name, String house_type, int house_room_num, int house_toilet_num, int house_size, String house_price, String house_img) throws Exception{
		int proId= ajaxDao.findProByName(project_name);
		boolean flag = ajaxDao.editHouseInfo(id, house_type, house_room_num, house_toilet_num, house_size, house_price, house_img, proId);
		return flag;			
	}
	
	
	
	public boolean deleteTouziData(int id) throws Exception{
		boolean flag = ajaxDao.deleteTouziData(id);
	    return flag;			
	}
	
	public boolean deleteHouseInfo(int id) throws Exception{
		boolean flag = ajaxDao.deleteHouseInfo(id);
	    return flag;			
	}
	
	public boolean deleteHouseProject(int id) throws Exception{
		boolean flag = ajaxDao.deleteHouseProject(id);
	    return flag;			
	}
	
	
	
	
	
	
	public boolean addPro(String project_name, String project_lan, String project_desc, String project_nation, String project_address, String project_area, int project_sales_remain, String project_finish_time, String project_city, String project_price) throws Exception{
		boolean flag = ajaxDao.addPro(project_name, project_lan, project_desc,project_nation,project_address,project_area,project_sales_remain,project_finish_time,project_city,project_price);
		return flag;			
	}
	
	public boolean findById(int id) throws Exception{
		boolean flag = ajaxDao.findById(id);
		return flag;			
	}
	
	
	public boolean editPro(int proid, String project_name, String project_lan, String project_desc, String project_nation, String project_address, String project_area, int project_sales_remain, String project_finish_time, String project_city, String project_price) throws Exception{
		boolean flag = ajaxDao.editPro(proid, project_name, project_lan, project_desc,project_nation,project_address,project_area,project_sales_remain,project_finish_time,project_city,project_price);
		return flag;			
	}
	
	public boolean deletePro(int proid) throws Exception{
		boolean flag = ajaxDao.deletePro(proid);
		return flag;	
	}
}
