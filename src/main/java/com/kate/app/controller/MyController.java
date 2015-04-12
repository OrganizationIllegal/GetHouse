package com.kate.app.controller;

import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.kate.app.model.BrokerInfo;
import com.kate.app.model.HouseInfo;
import com.kate.app.model.HouseProject;
import com.kate.app.service.HouseProjectService;
import com.kate.app.service.MyService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MyController {
	@Autowired
	private MyService myService;
	
	@Autowired
	private HouseProjectService houseProjectService;
	
	
	@RequestMapping({ "/", "/My" })
	public String test_controller(HttpServletRequest req, HttpServletResponse resp){
		JSONObject json = new JSONObject();
		String name = myService.test();
		//json.put("result", "Kate");
		req.setAttribute("result", name);
		/*try{
		writeJson(json.toJSONString(),resp);
		}catch(Exception e){
			e.printStackTrace();
		}*/
		//return "/My1.jsp";
		return "/bingMap.jsp";
	}
	
	@RequestMapping({ "/HouseProject" })
	public String getProjectInfo(HttpServletRequest req, HttpServletResponse resp){
		List<HouseProject> list = new ArrayList<HouseProject>();
		list = houseProjectService.getHouseProjectList();
		/*DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");  
		Timestamp time = new Timestamp(System.currentTimeMillis());
		for(int i=0; i<5; i++){
			HouseProject projectInfo = new HouseProject();
			projectInfo.setProject_area(100);
			projectInfo.setProject_detail_add("北京市朝阳区"+i);
			projectInfo.setProject_style("别墅"+i);
			projectInfo.setProject_img("http://image.baidu.com/i?ct=503316480&tn=baiduimagedetail&statnum=girl&ipn=d&z=0&s=0&ic=0&lm=-1&itg=0&cg=girl&word=%E7%BE%8E%E5%A5%B3&ie=utf-8&in=3354&cl=2&st=&pn=5&rn=1&di=&ln=31000&&fmq=1378374347070_R&se=&sme=0&tab=&face=&&is=0,-1&cs=0,0&adpicid=0&pi=14339958427&os=0&istype=&ist=&jit=&objurl=http%3A%2F%2Fd.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F023b5bb5c9ea15ceadb56f6fb5003af33a87b279.jpg"+i);
			projectInfo.setProject_name("北京房产"+i);
			projectInfo.setProject_price_avg(122211);
			projectInfo.setProject_sales_remain(90);
			projectInfo.setProject_finish_time(time);
			projectInfo.setProject_desc("Good House"+i);
			list.add(projectInfo);
		}*/
		req.setAttribute("HouseProjectList", list);
		return "/index.jsp";
	}
	
	@RequestMapping({ "/HouseInfo" })
	public String getHouseInfo(HttpServletRequest req, HttpServletResponse resp){
		List<HouseInfo> list = new ArrayList<HouseInfo>();
		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");  
		Timestamp time = new Timestamp(System.currentTimeMillis());
		for(int i=0; i<5; i++){
			HouseInfo houseInfo = new HouseInfo();
			houseInfo.setHouse_bath_num(12+i);
			houseInfo.setHouse_bath_size(29+i);
			houseInfo.setHouse_city("China"+i);
			houseInfo.setHouse_img("http://image.baidu.com/i?ct=503316480&tn=baiduimagedetail&statnum=girl&ipn=d&z=0&s=0&ic=0&lm=-1&itg=0&cg=girl&word=%E7%BE%8E%E5%A5%B3&ie=utf-8&in=3354&cl=2&st=&pn=5&rn=1&di=&ln=31000&&fmq=1378374347070_R&se=&sme=0&tab=&face=&&is=0,-1&cs=0,0&adpicid=0&pi=14339958427&os=0&istype=&ist=&jit=&objurl=http%3A%2F%2Fd.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F023b5bb5c9ea15ceadb56f6fb5003af33a87b279.jpg"+i);
			houseInfo.setHouse_detail_add("北京市丰台区"+i);
			houseInfo.setHouse_name("顺景园"+i);
			houseInfo.setHouse_price(209);
			houseInfo.setHouse_room_num(21+i);
			houseInfo.setHouse_room_size(211);
			houseInfo.setHouse_size(2111+i);
			houseInfo.setHouse_toilet_num(22+i);
			houseInfo.setHouse_toilet_size(2+i);
			houseInfo.setHouse_type("别墅");
			list.add(houseInfo);
		}
		req.setAttribute("HouseInfoList", list);
		return "/My1.jsp";
	}
	
	@RequestMapping({ "/BrokerInfo" })
	public String getBrokerInfo(HttpServletRequest req, HttpServletResponse resp){
		List<BrokerInfo> list = new ArrayList<BrokerInfo>();
		for(int i=0; i<5; i++){
			BrokerInfo brokerInfo = new BrokerInfo();
			brokerInfo.setBroker_name("哈哈"+i);
			brokerInfo.setBroker_language("Chinese"+i);
			brokerInfo.setBroker_region("北京"+i);
			brokerInfo.setBroker_img("http://image.baidu.com/i?ct=503316480&tn=baiduimagedetail&statnum=girl&ipn=d&z=0&s=0&ic=0&lm=-1&itg=0&cg=girl&word=%E7%BE%8E%E5%A5%B3&ie=utf-8&in=3354&cl=2&st=&pn=5&rn=1&di=&ln=31000&&fmq=1378374347070_R&se=&sme=0&tab=&face=&&is=0,-1&cs=0,0&adpicid=0&pi=14339958427&os=0&istype=&ist=&jit=&objurl=http%3A%2F%2Fd.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F023b5bb5c9ea15ceadb56f6fb5003af33a87b279.jpg"+i);
			list.add(brokerInfo);
		}
		req.setAttribute("BrokerInfoList", list);
		return "/My1.jsp";
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

