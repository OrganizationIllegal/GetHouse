package com.kate.app.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.kate.app.dao.UserInfoDao;

@Controller
public class UserInfoController {
	@Autowired
	private UserInfoDao userInfoDao;
	
	/*开立账户*/
	@RequestMapping({ "/UserInfo/AddAccount" })
	public String addAccount(HttpServletRequest req, HttpServletResponse resp) throws Exception{
		String nick_name = req.getParameter("nick_name");
		String pwd = req.getParameter("pwd");
		String tel = req.getParameter("tel");
		String email = req.getParameter("email");
		String account = req.getParameter("account");
		String msg = req.getParameter("msg");
		int flag = userInfoDao.addAccount(nick_name, pwd, tel, email, account, msg);
		if(flag==0){
			System.out.println("添加失败！");
		}else{
			System.out.println("添加成功！");
		}
		return "/overseas.jsp"; 
	}
	
	/*索取完整价格单*/
	@RequestMapping({ "/UserInfo/AddAllPrice" })
	public void addAllPrice(HttpServletRequest req, HttpServletResponse resp) throws Exception{
		String nick_name = req.getParameter("nick_name");
		String pwd = req.getParameter("pwd");
		String tel = req.getParameter("tel");
		String email = req.getParameter("email");
		String allprice = req.getParameter("allprice");
		String msg = req.getParameter("msg");
		int flag = userInfoDao.addAllPrice(nick_name, pwd, tel, email, allprice, msg);
		if(flag==0){
			System.out.println("添加失败！");
		}else{
			System.out.println("添加成功！");
		} 
	}
	
	/*需求*/
	@RequestMapping({ "/UserInfo/AddNeed" })
	public void addNeed(HttpServletRequest req, HttpServletResponse resp) throws Exception{
		String nick_name = req.getParameter("nick_name");
		String tel = req.getParameter("tel");
		String email = req.getParameter("email");
		String need = req.getParameter("need");
		String msg = req.getParameter("msg");
		int flag = userInfoDao.addNeed(nick_name,tel, email, need, msg);
		if(flag==0){
			System.out.println("添加失败！");
		}else{
			System.out.println("添加成功！");
		}
	}
	
	/*详情咨询*/
	@RequestMapping({ "/UserInfo/AddAsk" })
	public void addAsk(HttpServletRequest req, HttpServletResponse resp) throws Exception{
		String nick_name = req.getParameter("nick_name");
		String pwd = req.getParameter("pwd");
		String tel = req.getParameter("tel");
		String email = req.getParameter("email");
		String ask = req.getParameter("ask");
		String msg = req.getParameter("msg");
		int flag = userInfoDao.addAsk(nick_name, pwd, tel, email, ask, msg);
		if(flag==0){
			System.out.println("添加失败！");
		}else{
			System.out.println("添加成功！");
		}
	}
	
	/*最新价格*/
	@RequestMapping({ "/UserInfo/AddNewestPrice" })
	public void addNewestPrice(HttpServletRequest req, HttpServletResponse resp) throws Exception{
		String nick_name = req.getParameter("nick_name");
		String pwd = req.getParameter("pwd");
		String tel = req.getParameter("tel");
		String email = req.getParameter("email");
		String newestprice = req.getParameter("newestprice");
		String msg = req.getParameter("msg");
		int flag = userInfoDao.addNewestPrice(nick_name, pwd, tel, email, newestprice, msg);
		if(flag==0){
			System.out.println("添加失败！");
		}else{
			System.out.println("添加成功！");
		}
	}
	
	/*完整户型*/
	@RequestMapping({ "/UserInfo/AddHouseType" })
	public void addHouseType(HttpServletRequest req, HttpServletResponse resp) throws Exception{
		String nick_name = req.getParameter("nick_name");
		String pwd = req.getParameter("pwd");
		String tel = req.getParameter("tel");
		String email = req.getParameter("email");
		String housetype = req.getParameter("housetype");
		String msg = req.getParameter("msg");
		int flag = userInfoDao.addHouseType(nick_name, pwd, tel, email, housetype, msg);
		if(flag==0){
			System.out.println("添加失败！");
		}else{
			System.out.println("添加成功！");
		}
	}
	
	/*注册账户*/
	@RequestMapping({ "/UserInfo/Register" })
	public String register(HttpServletRequest req, HttpServletResponse resp) throws Exception{
		String nick_name = req.getParameter("nick_name");
		String pwd = req.getParameter("pwd");
		String repwd = req.getParameter("repwd");
		String tel = req.getParameter("tel");
		String email = req.getParameter("email");
		int flag = userInfoDao.register(nick_name, pwd, repwd, tel, email);
		if(flag==0){
			System.out.println("注册失败！");
		}else{
			System.out.println("注册成功！");
		}
		return "/AboutUs.jsp";
	}
}
