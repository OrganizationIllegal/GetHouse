package com.kate.app.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kate.app.dao.SearchListDao;
import com.kate.app.model.SearchList;

@Controller
public class SearchListController {
	@Autowired
	private SearchListDao searchListDao;
	
	//房屋搜索列表显示
	@RequestMapping({"/SearchList"})
	public String search_controller(HttpServletRequest req, HttpServletResponse resp){
		List<SearchList> searchList=searchListDao.listSearchList();
		req.setAttribute("searchList",searchList);
		return "/searchList.jsp";
	}
}
