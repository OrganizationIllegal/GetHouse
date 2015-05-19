package com.kate.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kate.app.dao.BrokerInfoDao;
import com.kate.app.dao.HouseProjectDao;
import com.kate.app.model.BrokerInfo;
import com.kate.app.model.User;

@Controller
public class ServiceController {
	@Autowired
	private HouseProjectDao houseProjectDao;
	@Autowired
	private BrokerInfoDao brokerInfoDao;
	
	
	@RequestMapping({"/Service"})
	public String Service(HttpServletRequest req,HttpServletResponse resp){
		String projectId = req.getParameter("projectId");
		String brokerId_str = req.getParameter("brokerId");
		BrokerInfo brokerInfo = new BrokerInfo();
		int proId = 0;
		int brokerId = 0;
		if(projectId!=null && !"".equals(projectId)){
			proId = Integer.parseInt(projectId);
		}
		if(brokerId_str!=null && !"".equals(brokerId_str)){
			brokerId = Integer.parseInt(brokerId_str);
		}
		List<BrokerInfo> list = brokerInfoDao.BrokerInfoList(proId);
		if(list!=null){
			for(BrokerInfo data : list){
				if(data.getId()==brokerId){
					brokerInfo = data;
					break;
				}
			}
		}	
		req.setAttribute("brokerInfo", brokerInfo);
	
		return "/Serivice.jsp";
	}
	
	
}
