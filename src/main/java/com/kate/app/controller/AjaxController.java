package com.kate.app.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.kate.app.service.AjaxService;

@Controller
public class AjaxController {
	
	@Autowired
	private AjaxService ajaxService;
	
	@RequestMapping({ "/houseStyle/addData" })
	public void addData(HttpServletRequest req, HttpServletResponse resp) throws Exception{
		String style = req.getParameter("style");
		int roomnum  = Integer.parseInt(req.getParameter("roomnum"));
		int toiletnum  = Integer.parseInt(req.getParameter("toiletnum"));
		int size  = Integer.parseInt(req.getParameter("size"));
		int price  = Integer.parseInt(req.getParameter("price"));
		String img  = req.getParameter("img");
		boolean flag = false;
		JSONObject json = new JSONObject();
		flag =ajaxService.addhouseStyleData(style, roomnum, toiletnum, size, price, img);
		json.put("data", flag);
		try{
		writeJson(json.toJSONString(),resp);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@RequestMapping({ "/houseStyle/editData" })
	public void editData(HttpServletRequest req, HttpServletResponse resp) throws Exception{
		int id=Integer.parseInt(req.getParameter("id"));
		String style = req.getParameter("style");
		int roomnum  = Integer.parseInt(req.getParameter("roomnum"));
		int toiletnum  = Integer.parseInt(req.getParameter("toiletnum"));
		int size  = Integer.parseInt(req.getParameter("size"));
		int price  = Integer.parseInt(req.getParameter("price"));
		String img  = req.getParameter("img");
		
		boolean flag = ajaxService.edithouseStyleData(id, style, roomnum, toiletnum, size, price, img);
		JSONObject json = new JSONObject();
		json.put("data", flag);
		try{
		    writeJson(json.toJSONString(),resp);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping({ "/houseStyle/deleteData" })
	public void deleteData(HttpServletRequest req, HttpServletResponse resp) throws Exception{
		int id = Integer.parseInt(req.getParameter("id"));
		boolean flag = ajaxService.deletehouseStyleData(id);
		JSONObject json = new JSONObject();
		json.put("data", flag);
		try{
		writeJson(json.toJSONString(),resp);
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
	

	public void writeJson(String json, HttpServletResponse response)throws Exception{
	    response.setContentType("text/html");
	    response.setCharacterEncoding("UTF-8");
	    PrintWriter out = response.getWriter();
	    if(StringUtils.isNotEmpty(json)){
	        out.println(json);
	    }
	    out.flush();
	    out.close();
	}
	
}

