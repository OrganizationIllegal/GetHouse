package com.kate.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kate.app.dao.BingMapDao;
import com.kate.app.model.BingMapVo;
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

}
