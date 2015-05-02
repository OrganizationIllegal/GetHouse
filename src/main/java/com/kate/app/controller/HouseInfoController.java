package com.kate.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kate.app.model.HouseInfo;
import com.kate.app.service.BuyInfoService;
import com.kate.app.service.HouseInfoService;

@Controller
public class HouseInfoController {
	@Autowired
	private HouseInfoService houseInfoService;
	@Autowired
	private BuyInfoService buyInfoService;
	@RequestMapping({ "/", "/index" })
	public String getHouseInfo(HttpServletRequest req,HttpServletResponse resp){
		List<HouseInfo> list = new ArrayList<HouseInfo>();
		list=houseInfoService.getHouseInfoList();
		String returnPrice=buyInfoService.getReturnMoney();
		req.setAttribute("returnPrice", returnPrice);
		req.setAttribute("HouseInfoList", list);
		return "/index.jsp";
	}
    
	
}
