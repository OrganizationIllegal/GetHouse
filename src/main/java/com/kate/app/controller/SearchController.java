package com.kate.app.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kate.app.dao.AjaxDao;
import com.kate.app.dao.SearchListDao;
import com.kate.app.dao.UserDao;
import com.kate.app.model.BrokerInfo;
import com.kate.app.model.SearchList;
import com.kate.app.model.User;

@Controller
public class SearchController {
	@Autowired
	private SearchListDao searchListDao;
	@Autowired
	private AjaxDao ajaxDao;
	@Autowired
	private UserDao userDao;
	
	//锟斤拷锟斤拷锟斤拷锟斤拷锟叫憋拷锟斤拷示
	@RequestMapping({"/SearchService"})
	public String SearchService(HttpServletRequest req, HttpServletResponse resp){
		String brokerName = req.getParameter("brokerName");
		String type = req.getParameter("type");
		String area = req.getParameter("area");
		String lang = req.getParameter("lang");
		
		List<BrokerInfo> brokerInfoList = searchListDao.searchSericeList(brokerName, type, area, lang);
		List<User> userList=userDao.listUser();
		req.setAttribute("brokerInfoList",brokerInfoList);
		req.setAttribute("userList", userList);
		return "/serviceTeam.jsp";
		/*JSONObject json = new JSONObject();
		JSONArray array = new JSONArray();
		
			
			for(BrokerInfo item : brokerInfoList){
				JSONObject obj = new JSONObject();
				
				obj.put("id", item.getId());
				obj.put("broker_img", item.getBroker_img());
				obj.put("broker_language", item.getBroker_language());
				obj.put("broker_name", item.getBroker_name());
				obj.put("broker_region", item.getBroker_region());
				obj.put("office", item.getOffice());
				obj.put("introduction", item.getIntroduction());
				obj.put("broker_num", item.getBroker_num());
				obj.put("broker_experience", item.getBroker_experience());
				obj.put("broker_type", item.getBroker_type());
				obj.put("broker_zizhi", item.getBroker_zizhi());
				array.add(obj);
			}
			json.put("List", array);
			//json.put("total", total);
*/			/*try{
				writeJson(json.toJSONString(),resp);
			}catch(Exception e){
				e.printStackTrace();
			}*/
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
