package com.kate.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kate.app.model.BuyInfo;
import com.kate.app.service.BuyInfoService;

@Controller
public class BuyInfoController {
	@Autowired
	private BuyInfoService buyInfoService;
	
	@RequestMapping({ "/", "/BuyInfo" })
	public String getBuyInfo(HttpServletRequest req,HttpServletResponse resp){
		int returnMoney=buyInfoService.getReturnMoney();
		System.out.println(returnMoney);
		//金额格式转换
		String str1=String.valueOf(returnMoney);
		str1 = new StringBuilder(str1).reverse().toString();     //先将字符串颠倒顺序
		String str2 = "";
		for(int i=0;i<str1.length();i++){
			if(i*3+3>str1.length()){
				str2 += str1.substring(i*3, str1.length());
				break;
			}
			str2 += str1.substring(i*3, i*3+3)+",";
		}
		if(str2.endsWith(",")){
			str2 = str2.substring(0, str2.length()-1);
		}
		//最后再将顺序反转过来
		String result="$"+new StringBuilder(str2).reverse().toString();
		req.setAttribute("returnmoney", result);
		return "index01.jsp";
	}

}
