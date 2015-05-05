package com.kate.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kate.app.dao.AjaxDao;

@Service
public class AjaxService {
	@Autowired
    private AjaxDao ajaxDao;
	
	public boolean addhouseStyleData(String style, int roomnum, int toiletnum, int size, int price, String img) throws Exception{
		boolean flag = ajaxDao.addhouseStyleData(style, roomnum, toiletnum, size, price, img);
		return flag;			
	}
	
	public boolean edithouseStyleData(int id,String style, int roomnum, int toiletnum, int size, int price, String img) throws Exception{
		boolean flag = ajaxDao.edithouseStyleData(id, style, roomnum, toiletnum, size, price, img);
		return flag;			
	}
	
	public boolean deletehouseStyleData(int id) throws Exception{
		boolean flag = ajaxDao.deletehouseStyleData(id);
	    return flag;			
	}
}
