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
import com.kate.app.model.SearchList;

@Controller
public class SearchListController {
	@Autowired
	private SearchListDao searchListDao;
	@Autowired
	private AjaxDao ajaxDao;
	
	//锟斤拷锟斤拷锟斤拷锟斤拷锟叫憋拷锟斤拷示
	@RequestMapping({"/SearchList"})
	public String search_controller(HttpServletRequest req, HttpServletResponse resp){
		List<SearchList> searchList=searchListDao.listSearchList();
		System.out.println();
		req.setAttribute("searchList",searchList);
		return "/searchList.jsp";
	}
	
	
	
	//锟斤拷锟斤拷锟斤拷锟斤拷锟叫憋拷锟斤拷示
		@RequestMapping({"/SearchListPage"})
		public void SearchListPage(HttpServletRequest req, HttpServletResponse resp){
			String pageIndex = req.getParameter("pageIndex");   //锟斤拷前页锟斤拷
			int pageNum  = pageIndex==null? 0 :Integer.parseInt(pageIndex);
			
			String pageSize_str  = req.getParameter("pageSize");  //每页锟斤拷锟斤拷锟斤拷锟�
			int pageSize  = pageSize_str==null? 0 :Integer.parseInt(pageSize_str);
			
			List<SearchList> searchList=searchListDao.listSearchList();
			
			int total = searchList.size();
			int pageEnd = pageNum * pageSize;
			int end = pageEnd < total ? pageEnd : total;
			
			int start = (pageNum-1) * pageSize;
			int pageStart = start == pageEnd ? 0 : start;
			
			JSONObject json = new JSONObject();
			JSONArray array = new JSONArray();
			if(pageStart <= end){
				List<SearchList> resultList=searchList.subList(start, end);
				for(SearchList item : resultList){
					JSONObject obj = new JSONObject();
					obj.put("id", item.getId());
					obj.put("Fanxian", item.getFanxian());
					obj.put("Keshou", item.getKeshou());
					obj.put("MaxArea", item.getMaxArea());
					obj.put("MaxPrice", item.getMaxPrice());
					obj.put("MinArea", item.getMinArea());
					obj.put("MinPrice", item.getMinPrice());
					obj.put("Project_img", item.getProject_img());
					obj.put("Project_name", item.getProject_name());
					obj.put("project_num", item.getProject_num());
					obj.put("project_address", item.getProject_address());
					obj.put("project_logo", item.getProject_logo());
					obj.put("developer_id_name", item.getDeveloper_id_name());
					obj.put("xinkaipan", item.getXinkaipan());
					obj.put("huaren", item.getHuaren());
					obj.put("remen", item.getRemen());
					obj.put("xuequ", item.getXuequ());
					obj.put("baozu", item.getBaozu());
					obj.put("daxue", item.getDaxue());
					obj.put("center", item.getCenter());
					obj.put("traffic", item.getTraffic());
					obj.put("xianfang", item.getXianfang());
					obj.put("maidi", item.getMaidi());
					obj.put("project_price_int_qi", item.getProject_price_int_qi());
					
					array.add(obj);
				}
				json.put("List", array);
				json.put("total", total);
			}
			else{
				json.put("List", "");
				json.put("total", total);
			}
			
			
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
