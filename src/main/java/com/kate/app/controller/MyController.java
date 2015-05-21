package com.kate.app.controller;

import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONArray;
import com.kate.app.dao.AjaxDao;
import com.kate.app.dao.InvestDataDao;
import com.kate.app.dao.MiddlePriceDao;
import com.kate.app.dao.RecoProjectDao;
import com.kate.app.dao.UtilDao;
import com.kate.app.model.AreaFamily;
import com.kate.app.model.AreaInfo;
import com.kate.app.model.AreaMiddle;
import com.kate.app.model.AreaPeopleInfo;
import com.kate.app.model.AreaZhikong;
import com.kate.app.model.AreaZujin;
import com.kate.app.model.BuyInfo;
import com.kate.app.model.DeveloperInfo;
import com.kate.app.model.FamilyIncome;
import com.kate.app.model.HoldingTaxVo;
import com.kate.app.model.HouseInfo;
import com.kate.app.model.HouseProject;
import com.kate.app.model.HouseTaxData;
import com.kate.app.model.HouseTaxVo;
import com.kate.app.model.InvestmentData;
import com.kate.app.model.LatestSaleInfoVo;
import com.kate.app.model.MiddlePrice;
import com.kate.app.model.NearPeiTao;
import com.kate.app.model.NearSchool;
import com.kate.app.model.NewsInfo;
import com.kate.app.model.PeopleForeign;
import com.kate.app.model.PeopleInfo;
import com.kate.app.model.PeopleNation;
import com.kate.app.model.ProjectImage;
import com.kate.app.model.RecoProject;
import com.kate.app.service.AreaFamilyService;
import com.kate.app.service.AreaFeatureService;
import com.kate.app.service.AreaInfoService;
import com.kate.app.service.AreaTrendService;
import com.kate.app.service.BuyInfoService;
import com.kate.app.service.HouseInfoService;
import com.kate.app.service.HouseProjectService;
import com.kate.app.service.HouseTaxService;
import com.kate.app.service.LatestSaleInfoListService;
import com.kate.app.service.MyService;
import com.kate.app.service.NewsInfoService;
import com.kate.app.service.PeopleInfoService;
import com.kate.app.service.RecoProjectSerivice;
import com.kate.app.service.SchoolNearService;

@Controller
public class MyController {
	@Autowired
	private MyService myService;
	@Autowired
	private MiddlePriceDao middlePriceDao;
	@Autowired
	private InvestDataDao investDataDao;
	@Autowired
	private RecoProjectDao recoProjectDao;
	@Autowired
	private AjaxDao ajaxDao;
	@Autowired
	private UtilDao utilDao;
	@Autowired
	private NewsInfoService newsInfoService;
	
	@Autowired
	private HouseProjectService houseProjectService;
	@Autowired
	private AreaFamilyService areaFamilyService;
	@Autowired
	private AreaFeatureService areaFeatureService;
	@Autowired
	private AreaTrendService  areaTrendService;
	@Autowired
	private AreaInfoService  areaInfoService;
	@Autowired
	private LatestSaleInfoListService  latestSaleInfoListService;
	@Autowired
	private SchoolNearService  schoolNearService;
	@Autowired
	private HouseTaxService  houseTaxService;
	@Autowired
	private PeopleInfoService peopleInfoService;
	@Autowired
	private HouseInfoService houseInfoService;
	@Autowired
	private BuyInfoService buyInfoService;
	@Autowired
	private RecoProjectSerivice recoprojectserivice;
	@RequestMapping({ "/Index" })
	public String Index(HttpServletRequest req, HttpServletResponse resp){
		String proNum = req.getParameter("proNum");
		//String areaNum = req.getParameter("areaNum");
		int proId = 0;
		int areaId = 0;
		String project_type ="";
		String area_name ="";
		AreaInfo areaInfo = new AreaInfo();
		if(proNum!=null && !"".equals(proNum)){
			proId = utilDao.getHouseProId(proNum);
			
		}
		HouseProject project = houseProjectService.getHouseProject(proId);
		if(project!=null){
			areaId = project.getArea_id();
			project_type = project.getProject_type();
			areaInfo = areaInfoService.getAreaInfo(areaId);
			if(areaInfo!=null){
				area_name = areaInfo.getArea_name();
			}
		}
		
		/*if(areaNum!=null && !"".equals(areaNum)){
			areaId = utilDao.getAreaId(areaNum);
		}*/
		
		  ProjectImage(req,resp,proId);
		 /*ProjectPeitaoImage(req,resp,proId);
		 TheElement(req,resp,proId);
		 
		 getAreaFeature(req,resp,areaId);    //区域特点
		 getSchoolAndNear(req,resp,proId);   //学校及周边
		 
		 ProjectDetail(req,resp,proId);
		 getBuyInfo(req,resp,proId);
		 ProjectInfo(req,resp,proId);
		 getHouseInfo(req,resp,proId);    //户型及价格
		 MiddlePriceInfo(req,resp,proId,areaId);
		 GetNewsInfo(req,resp,proId);
		 InvestData(req,resp,proId);
		 RecommendProject(req,resp,proId);
		
		 
		 getAreaFamily(req,resp,proId);
		 getAreaTrend(req,resp,project_type,areaId);
		
		 getHouseTax(req,resp,proId);
		 getPeopleRegion(req,resp,proId);
		 req.setAttribute("area_name", area_name);
		 /*getAreaFamily(req,resp);
		 getAreaFeature(req,resp);
		 getLatestSaleInfo(req,resp);
		 getPeopleRegion(req,resp);
		 getHouseInfo(req,resp);
		 getBuyInfo(req,resp);
		 getProjectdescription(req,resp);*/
		 return "/index.jsp";
	}
	
	
	
	/*
	 * 
	 */
	
	@RequestMapping({"/Index/ProjectImage"})
	public void  ProjectImage(HttpServletRequest req, HttpServletResponse resp,int proId){
		List<ProjectImage> list = houseProjectService.getHouseProjectImage(proId);
		List<ProjectImage> imageList = new ArrayList<ProjectImage>();
		List<ProjectImage> vedioList = new ArrayList<ProjectImage>();
		for(ProjectImage image : list){
			if(image.getImage_type().equals("图片")){
				imageList.add(image);
			}
			else{
				vedioList.add(image);
			}
		}
		//System.out.println(list.get(0).getImage_name());
		req.setAttribute("imageList", imageList);
		req.setAttribute("vedioList", vedioList);
	}
	
	
	/*
	 * 
	 */
	
	
/*推荐项目
public void getProjectdescription(HttpServletRequest req, HttpServletResponse resp){
	String projectdescription=recoprojectserivice.getProjectdescription();
	req.setAttribute("projectdescription",projectdescription);
}
	*/
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

