package com.kate.app.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kate.app.dao.BrokerInfoDao;
import com.kate.app.dao.UserDao;
import com.kate.app.model.BrokerInfo;
import com.kate.app.model.SearchList;
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
	//服务团队分页
//	@RequestMapping({"/brokerinfoPage"})
//	public void BrokerListPage(HttpServletRequest req, HttpServletResponse resp){
//		String pageIndex = req.getParameter("pageIndex");   //锟斤拷前页锟斤拷
//		int pageNum  = pageIndex==null? 0 :Integer.parseInt(pageIndex);
//		
//		String pageSize_str  = req.getParameter("pageSize");  //每页锟斤拷锟斤拷锟斤拷锟�
//		int pageSize  = pageSize_str==null? 0 :Integer.parseInt(pageSize_str);
//		
//		List<BrokerInfo> brokerList=brokerInfoDao.listBrokerInfo();
//		
//		int total = brokerList.size();
//		int pageEnd = pageNum * pageSize;
//		int end = pageEnd < total ? pageEnd : total;
//		
//		int start = (pageNum-1) * pageSize;
//		int pageStart = start == pageEnd ? 0 : start;
//		
//		JSONObject json = new JSONObject();
//		JSONArray array = new JSONArray();
//		if(pageStart <= end){
//			List<BrokerInfo> resultList=brokerList.subList(start, end);
//			for(BrokerInfo item : resultList){
//				JSONObject obj = new JSONObject();
//				obj.put("id", item.getId());
//				obj.put("Fanxian", item.getFanxian());
//				obj.put("Keshou", item.getKeshou());
//				obj.put("MaxArea", item.getMaxArea());
//				obj.put("MaxPrice", item.getMaxPrice());
//				obj.put("MinArea", item.getMinArea());
//				obj.put("MinPrice", item.getMinPrice());
//				obj.put("Project_img", item.getProject_img());
//				obj.put("Project_name", item.getProject_name());
//				obj.put("project_num", item.getProject_num());
//				array.add(obj);
//			}
//			json.put("List", array);
//			json.put("total", total);
//		}
//		else{
//			json.put("List", "");
//			json.put("total", total);
//		}
//		
//		
//		try{
//			writeJson(json.toJSONString(),resp);
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//	}
	
	
	
}
