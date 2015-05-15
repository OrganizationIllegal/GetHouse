package com.kate.app.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kate.app.dao.BrokerInfoDao;
import com.kate.app.dao.UserDao;
import com.kate.app.model.BrokerInfo;
import com.kate.app.model.User;

@Controller
public class BrokerInfoController {
	@Autowired
	private BrokerInfoDao brokerInfoDao;
	@Autowired
	private UserDao userDao;
	
	@RequestMapping({"/ServiceTeam"})
	public String listBingMap(HttpServletRequest req,HttpServletResponse resp){
		List<BrokerInfo> brokerInfoList=brokerInfoDao.listBrokerInfo();
		List<User> userList=userDao.listUser();
		req.setAttribute("brokerInfoList", brokerInfoList);
		req.setAttribute("userList", userList);
		return "/serviceTeam.jsp";
	}
	//点击提交，提交留言
	@RequestMapping({"/ServiceTeam/MessageSubmit"})
	public String messageSubmit(HttpServletRequest req,HttpServletResponse resp){
		String message_content=req.getParameter("message_content");
		//String message_time=req.getParameter("message_time");
		String message_time="20150513";
		int project_id=1;
		int viewed=0;
		int type=0;
		int userid=1;
		int result=brokerInfoDao.InsertMessage(message_content, message_time, project_id, viewed, type, userid);
		req.setAttribute("result", result);
		List<BrokerInfo> brokerInfoList=brokerInfoDao.listBrokerInfo();
		List<User> userList=userDao.listUser();
		req.setAttribute("brokerInfoList", brokerInfoList);
		req.setAttribute("userList", userList);
		return "/serviceTeam.jsp";
	}
	
}
