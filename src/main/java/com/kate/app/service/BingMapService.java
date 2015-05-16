package com.kate.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kate.app.dao.BingMapDao;
import com.kate.app.model.BingMapVo;
import com.kate.app.model.Coordinates;
@Service
public class BingMapService {
	@Autowired
	private BingMapDao bingMapDao;
	public List<BingMapVo> listBingMap(){
		List<BingMapVo> bingMapList=new ArrayList<BingMapVo>();
		bingMapList=bingMapDao.listBingMap();
		return bingMapList;
	}
	public List<BingMapVo> filterByHouseType(int type){
		List<BingMapVo> bingMapList=new ArrayList<BingMapVo>();
		bingMapList=bingMapDao.filterByHouseType(type);
		return bingMapList;
	}
	public List<BingMapVo> orderByPrice(int order){
		List<BingMapVo> bingMapList=new ArrayList<BingMapVo>();
		bingMapList=bingMapDao.orderByPrice(order);
		return bingMapList;
	}
//经纬度及其相关信息
	public JSONArray jsonCoordinates(){
		JSONArray array = new JSONArray();
		List<Coordinates> list = bingMapDao.listCoordinates();
		for(Coordinates data : list){
			JSONObject obj = new JSONObject();
			obj.put("id", data.getId());
			obj.put("latitude", data.getLatitude());
			obj.put("longitude", data.getLongitude());
			obj.put("place", data.getPlace()==null?"":data.getPlace());
			obj.put("project_name", data.getProject_name()==null?"":data.getProject_name());
			obj.put("project_img", data.getProject_img()==null?"":data.getProject_img());
			obj.put("project_price", data.getProject_price()==null?"":data.getProject_price());
			obj.put("project_price_avg", data.getProject_price_avg());
			array.add(obj);
		}
		return array;
	}
}
