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
	
	//���������б���ʾ
	@RequestMapping({"/SearchList"})
	public String search_controller(HttpServletRequest req, HttpServletResponse resp){
		//��һ����������Ŀ
		List<HouseProject> list = new ArrayList<HouseProject>();
		list = houseProjectService.getHouseProjectList();
		//�ڶ�����������Ϣ
		req.setAttribute("HouseProjectList", list);
		return "SearchList.jsp";
	}
	@RequestMapping({"/index01"})
	public String aa_controller(HttpServletRequest req, HttpServletResponse resp){
		return "index01.jsp";
	}

}
