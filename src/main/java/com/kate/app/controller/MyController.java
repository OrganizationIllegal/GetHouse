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
		 ProjectPeitaoImage(req,resp,proId);
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
			if(image.getImage_type()==0){
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
	
	@RequestMapping({"/Index/ProjectPeitaoImage"})
	public void  ProjectPeitaoImage(HttpServletRequest req, HttpServletResponse resp,int proId){
		List<ProjectImage> list = houseProjectService.HousePeitaoImageDao(proId);
		//System.out.println(list.get(0).getImage_name());
		req.setAttribute("ProjectPeitaoImage", list);
	}
	
	/*
	 * 项目基本信息
	 */
	
	@RequestMapping({"/Index/ProjectInfo"})    
	public void  ProjectInfo(HttpServletRequest req, HttpServletResponse resp,int proId){
		int developerId = 0;
		HouseProject pro = houseProjectService.getHouseProject(proId);
		String timeResule = null;
		
		if(pro!=null){
			developerId = pro.getDeveloper_id();
			Timestamp time = pro.getProject_finish_time();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			if(time!=null){
				timeResule = df.format(time);
			} 
		}
		DeveloperInfo developerInfo = houseProjectService.getDeveloperInfo(developerId);
		req.setAttribute("timeResule", timeResule);
		req.setAttribute("HouseProject", pro);
		req.setAttribute("DeveloperInfo", developerInfo);
	}
	
	
	/*
	 * 项目详细信息
	 */
	
	@RequestMapping({"/Index/ProjectDetail"})    
	public void  ProjectDetail(HttpServletRequest req, HttpServletResponse resp,int proId){
		
		HouseProject pro = houseProjectService.getHouseProject(proId);
		//System.out.println(list.get(0).getImage_name());
		req.setAttribute("HouseProject", pro);
	}
	
	/*
	 * 中位数房价
	 */
	
	@RequestMapping({"/Index/MiddlePriceInfo"})    
	public void  MiddlePriceInfo(HttpServletRequest req, HttpServletResponse resp,int proId,int areaId){
		HouseProject pro = houseProjectService.getHouseProject(proId);
		AreaInfo areaInfo = new AreaInfo();
		MiddlePrice middlePrice = new MiddlePrice();
		String areaName = "";
		String proType = "";
		if(pro!=null){
			proType = pro.getProject_type();
		}
		middlePrice = middlePriceDao.getMiddlePrice(proType, areaId);
		
		req.setAttribute("areaName", areaName);
		req.setAttribute("proType", proType);
		req.setAttribute("middlePrice", middlePrice);
	}
	
	
	/*
	 * 项目详细信息
	 */
	
	@RequestMapping({"/Index/GetNewsInfo"})    
	public void  GetNewsInfo(HttpServletRequest req, HttpServletResponse resp,int proId){
 		List<NewsInfo> newsList = newsInfoService.getNewsInfoDaoList(proId);
		NewsInfo newsInfo_one = new NewsInfo();
		NewsInfo newsInfo_two = new NewsInfo();
		NewsInfo newsInfo_three = new NewsInfo();
		String timeResuleOne = null;
		String timeResuletwo = null;
		String timeResuleThree = null;
		if(newsList.size()>=3){
			newsInfo_one = newsList.get(0);
			
			Timestamp time = newsInfo_one.getTime();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			if(time!=null){
				timeResuleOne = df.format(time);
			}
			
			newsInfo_two = newsList.get(1);
			System.out.println(newsInfo_two.getTime());
			Timestamp timetwo = newsInfo_two.getTime();
			SimpleDateFormat dftwo = new SimpleDateFormat("yyyy-MM-dd");
			if(time!=null){
				timeResuletwo = dftwo.format(timetwo);
			}
			
			newsInfo_three = newsList.get(2);
			System.out.println(newsInfo_three .getTitle());
			Timestamp timeThree = newsInfo_three.getTime();
			SimpleDateFormat dfThree = new SimpleDateFormat("yyyy-MM-dd");
			if(time!=null){
				timeResuleThree = dfThree.format(timeThree);
			}
		}
		req.setAttribute("newsInfo_one", newsInfo_one);
		req.setAttribute("timeResuleOne", timeResuleOne);
		req.setAttribute("newsInfo_two", newsInfo_two);
		req.setAttribute("timeResuletwo", timeResuletwo);
		req.setAttribute("newsInfo_three", newsInfo_three);
		req.setAttribute("timeResuleThree", timeResuleThree);
	}
	
	/*
	 * 投资数据信息
	 */
	
	@RequestMapping({"/Index/InvestData"})
	public void  InvestData(HttpServletRequest req, HttpServletResponse resp,int proId){
 		InvestmentData data = investDataDao.getInvestmentDate(proId);
 		int areaId = 0;
 		String areaName = "";
 		AreaInfo areaInfo = new AreaInfo();
 		if(data!=null){
 			areaId = data.getArea_id();
 			if(areaId!=0){
 				areaInfo = areaInfoService.getAreaInfo(areaId);
 				if(areaInfo!=null){
 					areaName = areaInfo.getArea_name();
 				}
 			}
 		}
		 
		req.setAttribute("areaName", areaName);
		req.setAttribute("data", data);
		
	}
	
	/*
	 * 推荐项目详细信息
	 */
	
	@RequestMapping({"/Index/RecommendProject"})    
	public void  RecommendProject(HttpServletRequest req, HttpServletResponse resp, int proId){
		RecoProject data = recoProjectDao.getRecoProjectDao(proId);
		HouseProject project = houseProjectService.getHouseProject(proId);
		HouseProject hp1 = new HouseProject();
		HouseProject hp2 = new HouseProject();
		HouseProject hp3 = new HouseProject();
		if(data!=null){
			hp1 = houseProjectService.getHouseProject(data.getRecommend_id_1());
			String desc1 = hp1.getProject_desc();
			hp1.setProject_desc(desc1.substring(0, 20)+"...");
			hp2 = houseProjectService.getHouseProject(data.getRecommend_id_2());
			String desc2 = hp2.getProject_desc();
			hp2.setProject_desc(desc2.substring(0, 20)+"...");
			hp3 = houseProjectService.getHouseProject(data.getRecommend_id_3());
			String desc3 = hp3.getProject_desc();
			hp3.setProject_desc(desc3.substring(0, 20)+"...");
		}
		else if(project!=null){
			hp1 = houseProjectService.getHouseProject(project.getRecommend_id_1());
			String desc1 = hp1.getProject_desc();
			hp1.setProject_desc(desc1.substring(0, 20)+"...");
			hp2 = houseProjectService.getHouseProject(project.getRecommend_id_2());
			String desc2 = hp2.getProject_desc();
			hp2.setProject_desc(desc2.substring(0, 20)+"...");
			hp3 = houseProjectService.getHouseProject(project.getRecommend_id_3());
			String desc3 = hp3.getProject_desc();
			hp3.setProject_desc(desc3.substring(0, 20)+"...");
		}
		//HouseProject pro = houseProjectService.getHouseProject(proId);
		//System.out.println(list.get(0).getImage_name());
		req.setAttribute("RecommendProject1", hp1);
		req.setAttribute("RecommendProject2", hp2);
		req.setAttribute("RecommendProject3", hp3);
	}

	
	/*
	 * 推荐项目详细信息
	 */
	
	@RequestMapping({"/Index/TheElement"})    
	public void  TheElement(HttpServletRequest req, HttpServletResponse resp, int proId){
		HouseProject project = houseProjectService.getHouseProject(proId);
        String timeResule = null;
		
		if(project!=null){
			Timestamp time = project.getProject_finish_time();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			if(time!=null){
				timeResule = df.format(time);
			} 
		}
		BuyInfo buyInfo = ajaxDao.getBuyInfo(proId);
		int stamp_tax = 0;
		if(buyInfo!=null){
			stamp_tax = buyInfo.getStamp_tax();
		}
		req.setAttribute("project", project);
		req.setAttribute("stamp_tax", stamp_tax);
		req.setAttribute("timeResule", timeResule);
		
	}
	
	
	
	
	/**
	 * 获取家庭情况构成
	 * @author wenruijie 
	 * @param req
	 * @param resp
	 * @return
	 */
	@RequestMapping({"/Index/AreaFamily"})
	public void  getAreaFamily(HttpServletRequest req, HttpServletResponse resp,int proId){
		//独立青年处理
		AreaFamily data = areaFamilyService.getAreaFamily(proId);
		Integer dulirate = 0;
		String dulirateStr = "";
		String dulirateVo = "";
		String youngfamilystr= "";
		String youngfamilyVo= "";
		String oldfamilystr= "";
		String oldfamilyVo= "";
		Integer youngfamilyrate = 0;
		Integer oldfamilyrate = 0;
		if(data!=null){
			 dulirate = data.getFamily_one_rate();
			 dulirateStr=dulirate.toString();
			 dulirateVo=dulirateStr;
			youngfamilyrate = data.getFamily_two_rate();
			 youngfamilystr=youngfamilyrate.toString();
			 youngfamilyVo=youngfamilystr;
			oldfamilyrate = data.getFamily_three_rate();
			 oldfamilystr=oldfamilyrate.toString();
			 oldfamilyVo=oldfamilystr;
		}
		
		
		
		req.setAttribute("dulirateVo", dulirateVo);
		req.setAttribute("youngfamilyVo", youngfamilyVo);
		req.setAttribute("oldfamilyVo", oldfamilyVo);
	}

	/**
	 * 地区特点
	 * @author wenruijie 
	 */
	@RequestMapping({"/Index/AreaFeature"})
	public void getAreaFeature(HttpServletRequest req, HttpServletResponse resp,int areaId){
		List<String> featureList=areaFeatureService.getAreaFeature(areaId);
		req.setAttribute("featureList", featureList);

	}
	/**
	 * 近期区域成交情况
	 * @author wenruijie
	 */
	@RequestMapping({"/Index/LatestSaleInfo"})
	public void getLatestSaleInfo(HttpServletRequest req, HttpServletResponse resp){
		List<LatestSaleInfoVo> latestSaleInfoVolist=latestSaleInfoListService.getLatestSaleInfo();
		req.setAttribute("latestSaleInfoVolist", latestSaleInfoVolist);
	}
	/**
	 * 区域中位数房价走势
	 * @author wenruijie
	 * @param req
	 * @param resp
	 * @return
	 */
	@RequestMapping({"/Index/AreaTrend"})
	public void getAreaTrend(HttpServletRequest req, HttpServletResponse resp,String project_type,int areaId){
		//区域中位数房价走势
		List<AreaMiddle> areaMiddleList=new ArrayList<AreaMiddle>();
		areaMiddleList=areaTrendService.getAreaMiddleTrend(project_type,areaId);
		List<String> areaMiddleYeatList=new ArrayList<String>();
		List<Integer> areaMiddleRateList=new ArrayList<Integer>();
		for(AreaMiddle areaMiddle:areaMiddleList){
			String year=areaMiddle.getHeng();
			int rate=areaMiddle.getZong();
			if(year!=null && rate>=0){
				areaMiddleYeatList.add(year);
				areaMiddleRateList.add(rate);
			}
		}
		req.setAttribute("areaMiddleYeatList", areaMiddleYeatList);
		req.setAttribute("areaMiddleRateList", areaMiddleRateList);
		//区域租金走势
		List<AreaZujin> areaZujinList=new ArrayList<AreaZujin>();
		areaZujinList=areaTrendService.getAreaZujinTrend(project_type,areaId);
		List<String> areaZujinYeatList=new ArrayList<String>();
		List<Integer> areaZujinRateList=new ArrayList<Integer>();
		for(AreaZujin areaZujin:areaZujinList){
			String year=areaZujin.getHeng();
			int rate=areaZujin.getZong();
			if(year!=null && rate>=0){
				areaZujinYeatList.add(year);
				areaZujinRateList.add(rate);
			}
		}
		req.setAttribute("areaZujinYeatList", areaZujinYeatList);
		req.setAttribute("areaZujinRateList", areaZujinRateList);
		//区域空置率走势
		List<AreaZhikong> areaZhikongList=new ArrayList<AreaZhikong>();
		areaZhikongList=areaTrendService.getAreaZhikongTrend(project_type,areaId);
		List<String> areaZhikongYeatList=new ArrayList<String>();
		List<Integer> areaZhikongRateList=new ArrayList<Integer>();
		for(AreaZhikong areaZhikong:areaZhikongList){
			String year=areaZhikong.getHeng();
			int rate=areaZhikong.getZong()/1000;
			if(year!=null && rate>=0){
				areaZhikongYeatList.add(year);
				areaZhikongRateList.add(rate);
			}
		}
		req.setAttribute("areaZhikongYeatList", areaZhikongYeatList);
		req.setAttribute("areaZhikongRateList", areaZhikongRateList);
	}
/**
 * 学校及附近
 * @param req
 * @param resp
 */
public void getSchoolAndNear(HttpServletRequest req, HttpServletResponse resp,int proId){
	List<NearSchool> nearSchoolList=schoolNearService.getNearSchoolInfo(proId);
	req.setAttribute("nearSchoolList", nearSchoolList);
	List<NearPeiTao> nearSchoolFacility=schoolNearService.getNearSchoolFacilityInfo(proId);
	req.setAttribute("nearSchoolFacility", nearSchoolFacility);
}
/**	
 * 购房税费和持有成本
 * @param req
 * @param resp
 */
@RequestMapping({"/Index/HouseTax"})
public void getHouseTax(HttpServletRequest req, HttpServletResponse resp,int proId){
	 List<HouseTaxVo> houseTaxVoList=houseTaxService.getHouseTaxVo(proId);
	 List<String> houseTaxStr=new ArrayList<String>();
	 int houseTaxSum=0;
	 List<HoldingTaxVo> holdingTaxVoList=houseTaxService.getHoldingTaxVo(proId);
	 List<String> holdingTaxStr=new ArrayList<String>();
	 int holdingTaxSunm=0;
	 for(HouseTaxVo houseTaxVo:houseTaxVoList){
		 String type=houseTaxVo.getType();
		 int price=houseTaxVo.getPrice();
		 String desc=houseTaxVo.getDescription();
		 houseTaxSum=houseTaxSum+price;
		 String ahouseStr=type+"    "+"约"+price+"澳元"+"\n"+desc;
		 houseTaxStr.add(ahouseStr);
	 }
	 req.setAttribute("houseTaxStr", JSONArray.toJSON(houseTaxStr));
	 req.setAttribute("houseTaxSum",houseTaxSum);
	 
	 for(HoldingTaxVo holdingTaxVo:holdingTaxVoList){
		 String type=holdingTaxVo.getType();
		 int price=holdingTaxVo.getPrice();
		 String desc=holdingTaxVo.getDescription();
		 holdingTaxSunm=holdingTaxSunm+price;
		 String aholdingStr=type+"    "+"约"+price+"澳元"+"\n"+desc;
		 holdingTaxStr.add(aholdingStr);
	 }
	 req.setAttribute("holdingTaxStr", JSONArray.toJSON(holdingTaxStr));
	 req.setAttribute("holdingTaxSunm",JSONArray.toJSON(holdingTaxSunm));
	 
	 List<HouseTaxData> housetaxdata=houseTaxService.getHouseTaxData(proId);
	 List<HouseTaxData> holdingdata=houseTaxService.getHoldingData(proId);
	 req.setAttribute("housetaxdata",  JSONArray.toJSON(housetaxdata));
	 System.out.println(JSONArray.toJSON(holdingdata)+"dddd"+housetaxdata);
	 req.setAttribute("holdingdata", JSONArray.toJSON(holdingdata));
}	
/**	
 * 区域人口分布
 */
@RequestMapping({"/Index/PeopleRegion"})
public void getPeopleRegion(HttpServletRequest req, HttpServletResponse resp,int proId){
	List<AreaPeopleInfo> list=peopleInfoService.getAreaPeopleInfo(proId);
	req.setAttribute("list",list);
	//人口总数
	List<PeopleInfo> peopleInfoList=peopleInfoService.getPeopleInfo();
	req.setAttribute("peopleInfoList",peopleInfoList);
	//出生国家
	List<PeopleNation> peopleNationList=peopleInfoService.getPeopleNation();
	req.setAttribute("peopleNationList",peopleNationList);
	//海外出生
	List<PeopleForeign> peopleForeignList=peopleInfoService.getPeopleForeign();
	req.setAttribute("peopleForeignList",peopleForeignList);
	req.setAttribute("peopleForeignNum",peopleForeignList.size());
	//平均家庭收入
	List<FamilyIncome> familyIncomeList=peopleInfoService.getFamilyIncome();
	req.setAttribute("familyIncomeList",familyIncomeList);
}

/*户型及价格*/
@RequestMapping({"/Index/HouseInfo"})
public void getHouseInfo(HttpServletRequest req, HttpServletResponse resp,int proId){
	List<HouseInfo> houseInfoList=houseInfoService.getHouseInfoList(proId);
	req.setAttribute("HouseInfoList", houseInfoList);
}

//价格区间
@RequestMapping({"/Index/BuyInfo"})
public void getBuyInfo(HttpServletRequest req, HttpServletResponse resp,int proId){
	String priceQuJian = "";
	String returnPrice=buyInfoService.getReturnMoney(proId);
	HouseProject pro = houseProjectService.getHouseProject(proId);
	if(pro!=null){
		priceQuJian = houseProjectService.getHouseProject(proId).getProject_price();
	}
	else{
		priceQuJian = "0";
	}
	req.setAttribute("returnPrice", returnPrice);
	req.setAttribute("priceQuJian", priceQuJian);
}
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

