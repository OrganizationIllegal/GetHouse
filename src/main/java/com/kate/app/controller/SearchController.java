package com.kate.app.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kate.app.dao.AjaxDao;
import com.kate.app.dao.SearchListDao;
import com.kate.app.dao.UserDao;
import com.kate.app.model.BrokerInfo;
import com.kate.app.model.HouseProject;
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
	
	//服务团队搜索
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
	
	
	//首页搜索
		@RequestMapping({"/IndexSearch"})
		public String IndexSearch(HttpServletRequest req, HttpServletResponse resp){
			String searchcity = req.getParameter("searchcity");
			String type = req.getParameter("type");
			String minimumprice = req.getParameter("minimumprice");
			String maximumprice = req.getParameter("maximumprice");
			String city2 = req.getParameter("city2");
			String xinkaipan = req.getParameter("xinkaipan");
			String huaren = req.getParameter("huaren");
			String remen = req.getParameter("remen");
			String xuequ = req.getParameter("xuequ");
			String baozu = req.getParameter("baozu");
			String daxue = req.getParameter("daxue");
			String center = req.getParameter("center");
			String traffic = req.getParameter("traffic");
			String xianfang = req.getParameter("xianfang");
			String maidi = req.getParameter("maidi");
			String city = null;
			if(city2!=null && !"".equals(city2)){
				city = city2;
			}
			else{
				city = searchcity;
			}
			
			
			
			List<HouseProject> list = searchListDao.indexSericeList(city, type, minimumprice, maximumprice, xinkaipan, huaren, remen, xuequ, baozu, daxue, center, traffic, xianfang, maidi);
			
			List<SearchList> searchList = new ArrayList<SearchList>();
			for(HouseProject item : list){
				int id=item.getId();
		    	String project_img=item.getProject_img();
		    	String project_name=item.getProject_name();
		    	int project_sales_remain=item.getProject_sales_remain();
		    	String maxPrice=item.getProject_high_price();
		    	String minprice=item.getProject_min_price();
		    	int maxarea=item.getMax_area();
		    	int minarea=item.getMin_area();
		    	String return_money=item.getReturn_money();
		    	String project_num =item.getProject_num();
		    	String project_lan_cn=item.getProject_lan_cn();
		    	String mianji=item.getMianji();
		    	SearchList data=new SearchList(id,project_num,project_img,project_name,maxPrice,minprice,maxarea,minarea,project_sales_remain,return_money,project_lan_cn,mianji);
		    	searchList.add(data);
			}
			
			req.setAttribute("searchList",searchList);
			return "/searchList01.jsp";
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
