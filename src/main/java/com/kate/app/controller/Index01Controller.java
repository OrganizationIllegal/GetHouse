package com.kate.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kate.app.dao.HouseProjectDao;
import com.kate.app.dao.Index01Dao;
import com.kate.app.dao.ZhiYeDao;
import com.kate.app.model.HouseProject;
import com.kate.app.model.NewsBoke;

@Controller
public class Index01Controller {
	@Autowired
	private Index01Dao index01Dao;
	@Autowired
	private HouseProjectDao houseProjectDao;
	@Autowired
	private ZhiYeDao zhiYeDao;
	
	@RequestMapping({"/first/index01" })
	public String index01(HttpServletRequest req,HttpServletResponse resp){
		List<Integer> list = index01Dao.getTuijian();
		List<NewsBoke> newsList = zhiYeDao.selectNewsBoke();
		List<HouseProject> projectList = new ArrayList<HouseProject>();
		for(Integer i : list){
			HouseProject pro = new HouseProject();
			pro = houseProjectDao.HouseProjectDao(i);
			if(pro!=null){
				projectList.add(pro);
			}
		}
		if(newsList.size() > 3){
			newsList = newsList.subList(0, 3);
		}
		req.setAttribute("projectList", projectList);
		req.setAttribute("newsList",newsList);
		return "/index01.jsp";
	}
    
			
}
  	