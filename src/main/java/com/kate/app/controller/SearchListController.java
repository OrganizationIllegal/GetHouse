package com.kate.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kate.app.model.HouseProject;
import com.kate.app.service.HouseProjectService;

@Controller
public class SearchListController {
	@Autowired
	private HouseProjectService houseProjectService;
	
	//房屋搜索列表显示
	@RequestMapping({"/SearchList"})
	public String search_controller(HttpServletRequest req, HttpServletResponse resp){
		//第一步：房产项目
		List<HouseProject> list = new ArrayList<HouseProject>();
		list = houseProjectService.getHouseProjectList();
		//第二步：房屋信息
		req.setAttribute("HouseProjectList", list);
		return "SearchList.jsp";
	}
	@RequestMapping({"/index01"})
	public String aa_controller(HttpServletRequest req, HttpServletResponse resp){
		return "index01.jsp";
	}

}
