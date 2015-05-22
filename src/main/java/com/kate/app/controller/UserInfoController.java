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
	
	/*寮�珛璐︽埛*/
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
			System.out.println("娣诲姞澶辫触锛�");
		}else{
			System.out.println("娣诲姞鎴愬姛锛�");
		}
		return "/overseas.jsp"; 
	}
	
	/*绱㈠彇瀹屾暣浠锋牸鍗�/
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
			System.out.println("娣诲姞澶辫触锛�);
		}else{
			System.out.println("娣诲姞鎴愬姛锛�);
		} 
	}
	
	/*闇�眰*/
	@RequestMapping({ "/UserInfo/AddNeed" })
	public void addNeed(HttpServletRequest req, HttpServletResponse resp) throws Exception{
		String nick_name = req.getParameter("nick_name");
		String tel = req.getParameter("tel");
		String email = req.getParameter("email");
		String need = req.getParameter("need");
		String msg = req.getParameter("msg");
		int flag = userInfoDao.addNeed(nick_name,tel, email, need, msg);
		if(flag==0){
			System.out.println("娣诲姞澶辫触锛�");
		}else{
			System.out.println("娣诲姞鎴愬姛锛�");
		}
	}
	
	/*璇︽儏鍜ㄨ*/
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
			System.out.println("娣诲姞澶辫触锛�");
		}else{
			System.out.println("娣诲姞鎴愬姛锛�");
		}
	}
	
	/*鏈�柊浠锋牸*/
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
			System.out.println("娣诲姞澶辫触锛�");
		}else{
			System.out.println("娣诲姞鎴愬姛锛�");
		}
	}
	
	/*瀹屾暣鎴峰瀷*/
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
			System.out.println("娣诲姞澶辫触锛�:");
		}else{
			System.out.println("娣诲姞鎴愬姛锛�");
		}
	}
	
	/*娉ㄥ唽璐︽埛*/
	@RequestMapping({ "/UserInfo/Register" })
	public String register(HttpServletRequest req, HttpServletResponse resp) throws Exception{
		String nick_name = req.getParameter("nick_name");
		String pwd = req.getParameter("pwd");
		String repwd = req.getParameter("repwd");
		String tel = req.getParameter("tel");
		String email = req.getParameter("email");
		int flag = userInfoDao.register(nick_name, pwd, repwd, tel, email);
		if(flag==0){
			System.out.println("娉ㄥ唽澶辫触锛�");
		}else{
			System.out.println("娉ㄥ唽鎴愬姛锛�");
		}
		return "/AboutUs.jsp";
	}
}
