package com.kate.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kate.app.model.BingMapVo;
import com.kate.app.service.BingMapService;
@Controller
public class BingMapController {
	@Autowired
	private BingMapService bingMapService;
	@RequestMapping({"/BingMap"})
	public String listBingMap(HttpServletRequest req,HttpServletResponse resp){
		List<BingMapVo> bingMapList=bingMapService.listBingMap();
		req.setAttribute("bingMapList", bingMapList);
		return "/bingMap.jsp";
	}
	@RequestMapping({"/BingMap/FileterType"})
	public String filterByHouseType(HttpServletRequest req,HttpServletResponse resp){
		int type=Integer.parseInt(req.getParameter("house_type"));
		List<BingMapVo> bingMapList=bingMapService.filterByHouseType(type);
		req.setAttribute("bingMapList", bingMapList);
		return "/bingMap.jsp";
	}
	@RequestMapping({"/BingMap/OrderByPrice"})
	public String OrderByPrice(HttpServletRequest req,HttpServletResponse resp){
		int order=Integer.parseInt(req.getParameter("order"));
		List<BingMapVo> bingMapList=bingMapService.orderByPrice(order);
		req.setAttribute("bingMapList", bingMapList);
		return "/bingMap.jsp";
	}
}
