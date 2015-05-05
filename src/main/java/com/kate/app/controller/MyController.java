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

import com.alibaba.fastjson.JSONArray;
import com.kate.app.model.AreaMiddle;
import com.kate.app.model.AreaZhikong;
import com.kate.app.model.AreaZujin;
import com.kate.app.model.FamilyIncome;
import com.kate.app.model.HoldingTaxVo;
import com.kate.app.model.HouseTaxData;
import com.kate.app.model.HouseTaxVo;
import com.kate.app.model.LatestSaleInfoVo;
import com.kate.app.model.NearSchoolFacility;
import com.kate.app.model.NearSchoolVo;
import com.kate.app.model.PeopleForeign;
import com.kate.app.model.PeopleInfo;
import com.kate.app.model.PeopleNation;
import com.kate.app.service.AreaFamilyService;
import com.kate.app.service.AreaFeatureService;
import com.kate.app.service.AreaTrendService;
import com.kate.app.service.HouseProjectService;
import com.kate.app.service.HouseTaxService;
import com.kate.app.service.LatestSaleInfoListService;
import com.kate.app.service.MyService;
import com.kate.app.service.PeopleInfoService;
import com.kate.app.service.SchoolNearService;

@Controller
public class MyController {
	@Autowired
	private MyService myService;
	@Autowired
	private HouseProjectService houseProjectService;
	@Autowired
	private AreaFamilyService areaFamilyService;
	@Autowired
	private AreaFeatureService areaFeatureService;
	@Autowired
	private AreaTrendService  areaTrendService;
	@Autowired
	private LatestSaleInfoListService  latestSaleInfoListService;
	@Autowired
	private SchoolNearService  schoolNearService;
	@Autowired
	private HouseTaxService  houseTaxService;
	@Autowired
	private PeopleInfoService peopleInfoService;
	@RequestMapping({ "/Index" })
	public String Index(HttpServletRequest req, HttpServletResponse resp){
		 getAreaFamily(req,resp);
		 getAreaFeature(req,resp);
		 getLatestSaleInfo(req,resp);
		 getAreaTrend(req,resp);
		 getSchoolAndNear(req,resp);
		 getHouseTax(req,resp);
		 getPeopleRegion(req,resp);
		 return "/index.jsp";
	}
	/**
	 * ��ȡ��ͥ�������
	 * @author wenruijie 
	 * @param req
	 * @param resp
	 * @return
	 */
	@RequestMapping({"/Index/AreaFamily"})
	public void  getAreaFamily(HttpServletRequest req, HttpServletResponse resp){
		//�������괦��
		Integer dulirate=new Integer(areaFamilyService.getdulirate());
		String dulirateStr=dulirate.toString();
		String dulirateVo=dulirateStr.substring(0, 2)+"."+dulirateStr.substring(2, 4);
		//�����ͥ����
		Integer youngfamilyrate=new Integer(areaFamilyService.getyoungfamilyrate());	
		String youngfamilystr=youngfamilyrate.toString();
		String youngfamilyVo=youngfamilystr.substring(0, 2)+"."+youngfamilystr.substring(2, 4);
		//�����ͥ
		Integer oldfamilyrate=new Integer(areaFamilyService.getoldfamilyrate());
		String oldfamilystr=oldfamilyrate.toString();
		String oldfamilyVo=oldfamilystr.substring(0, 2)+"."+oldfamilystr.substring(2, 4);
		
		req.setAttribute("dulirateVo", dulirateVo);
		req.setAttribute("youngfamilyVo", youngfamilyVo);
		req.setAttribute("oldfamilyVo", oldfamilyVo);
	}

	/**
	 * �����ص�
	 * @author wenruijie 
	 */
	@RequestMapping({"/Index/AreaFeature"})
	public void getAreaFeature(HttpServletRequest req, HttpServletResponse resp){
		List<String> featureList=areaFeatureService.getAreaFeature();
		req.setAttribute("featureList", featureList);

	}
	/**
	 * ��������ɽ����
	 * @author wenruijie
	 */
	@RequestMapping({"/Index/LatestSaleInfo"})
	public void getLatestSaleInfo(HttpServletRequest req, HttpServletResponse resp){
		List<LatestSaleInfoVo> latestSaleInfoVolist=latestSaleInfoListService.getLatestSaleInfo();
		req.setAttribute("latestSaleInfoVolist", latestSaleInfoVolist);
	}
	/**
	 * ������λ����������
	 * @author wenruijie
	 * @param req
	 * @param resp
	 * @return
	 */
	@RequestMapping({"/Index/AreaTrend"})
	public void getAreaTrend(HttpServletRequest req, HttpServletResponse resp){
		//������λ����������
		List<AreaMiddle> areaMiddleList=new ArrayList<AreaMiddle>();
		areaMiddleList=areaTrendService.getAreaMiddleTrend();
		List<String> areaMiddleYeatList=new ArrayList<String>();
		List<Integer> areaMiddleRateList=new ArrayList<Integer>();
		for(AreaMiddle areaMiddle:areaMiddleList){
			String year=areaMiddle.getYear();
			int rate=areaMiddle.getRate();
			if(year!=null && rate>=0){
				areaMiddleYeatList.add(year);
				areaMiddleRateList.add(rate);
			}
		}
		req.setAttribute("areaMiddleYeatList", areaMiddleYeatList);
		req.setAttribute("areaMiddleRateList", areaMiddleRateList);
		//�����������
		List<AreaZujin> areaZujinList=new ArrayList<AreaZujin>();
		areaZujinList=areaTrendService.getAreaZujinTrend();
		List<String> areaZujinYeatList=new ArrayList<String>();
		List<Integer> areaZujinRateList=new ArrayList<Integer>();
		for(AreaZujin areaZujin:areaZujinList){
			String year=areaZujin.getYear();
			int rate=areaZujin.getRate();
			if(year!=null && rate>=0){
				areaZujinYeatList.add(year);
				areaZujinRateList.add(rate);
			}
		}
		req.setAttribute("areaZujinYeatList", areaZujinYeatList);
		req.setAttribute("areaZujinRateList", areaZujinRateList);
		//�������������
		List<AreaZhikong> areaZhikongList=new ArrayList<AreaZhikong>();
		areaZhikongList=areaTrendService.getAreaZhikongTrend();
		List<String> areaZhikongYeatList=new ArrayList<String>();
		List<Integer> areaZhikongRateList=new ArrayList<Integer>();
		for(AreaZhikong areaZhikong:areaZhikongList){
			String year=areaZhikong.getYear();
			int rate=areaZhikong.getRate()/1000;
			if(year!=null && rate>=0){
				areaZhikongYeatList.add(year);
				areaZhikongRateList.add(rate);
			}
		}
		req.setAttribute("areaZhikongYeatList", areaZhikongYeatList);
		req.setAttribute("areaZhikongRateList", areaZhikongRateList);
	}
/**
 * ѧУ������
 * @param req
 * @param resp
 */
public void getSchoolAndNear(HttpServletRequest req, HttpServletResponse resp){
	List<NearSchoolVo> nearSchoolList=schoolNearService.getNearSchoolInfo();
	req.setAttribute("nearSchoolList", nearSchoolList);
	List<NearSchoolFacility> nearSchoolFacility=schoolNearService.getNearSchoolFacilityInfo();
	req.setAttribute("nearSchoolFacility", nearSchoolFacility);
}
/**	
 * ����˰�Ѻͳ��гɱ�
 * @param req
 * @param resp
 */
@RequestMapping({"/Index/HouseTax"})
public void getHouseTax(HttpServletRequest req, HttpServletResponse resp){
	 List<HouseTaxVo> houseTaxVoList=houseTaxService.getHouseTaxVo();
	 List<String> houseTaxStr=new ArrayList<String>();
	 int houseTaxSum=0;
	 List<HoldingTaxVo> holdingTaxVoList=houseTaxService.getHoldingTaxVo();
	 List<String> holdingTaxStr=new ArrayList<String>();
	 int holdingTaxSunm=0;
	 for(HouseTaxVo houseTaxVo:houseTaxVoList){
		 String type=houseTaxVo.getType();
		 int price=houseTaxVo.getPrice();
		 String desc=houseTaxVo.getDescription();
		 houseTaxSum=houseTaxSum+price;
		 String ahouseStr=type+"    "+"Լ"+price+"��Ԫ"+"\n"+desc;
		 houseTaxStr.add(ahouseStr);
	 }
	 req.setAttribute("houseTaxStr", JSONArray.toJSON(houseTaxStr));
	 req.setAttribute("houseTaxSum",houseTaxSum);
	 
	 for(HoldingTaxVo holdingTaxVo:holdingTaxVoList){
		 String type=holdingTaxVo.getType();
		 int price=holdingTaxVo.getPrice();
		 String desc=holdingTaxVo.getDescription();
		 holdingTaxSunm=holdingTaxSunm+price;
		 String aholdingStr=type+"    "+"Լ"+price+"��Ԫ"+"\n"+desc;
		 holdingTaxStr.add(aholdingStr);
	 }
	 req.setAttribute("holdingTaxStr", JSONArray.toJSON(holdingTaxStr));
	 req.setAttribute("holdingTaxSunm",JSONArray.toJSON(holdingTaxSunm));
	 List<HouseTaxData> housetaxdata=houseTaxService.getHouseTaxData();
	 List<HouseTaxData> holdingdata=houseTaxService.getHoldingData();
	 req.setAttribute("housetaxdata",  JSONArray.toJSON(housetaxdata));
	 req.setAttribute("holdingdata", JSONArray.toJSON(holdingdata));
}	
/**	
 * �����˿ڷֲ�
 */
@RequestMapping({"/Index/PeopleRegion"})
public void getPeopleRegion(HttpServletRequest req, HttpServletResponse resp){
	//�˿�����
	List<PeopleInfo> peopleInfoList=peopleInfoService.getPeopleInfo();
	req.setAttribute("peopleInfoList",peopleInfoList);
	//��������
	List<PeopleNation> peopleNationList=peopleInfoService.getPeopleNation();
	req.setAttribute("peopleNationList",peopleNationList);
	//�������
	List<PeopleForeign> peopleForeignList=peopleInfoService.getPeopleForeign();
	req.setAttribute("peopleForeignList",peopleForeignList);
	req.setAttribute("peopleForeignNum",peopleForeignList.size());
	//ƽ����ͥ����
	List<FamilyIncome> familyIncomeList=peopleInfoService.getFamilyIncome();
	req.setAttribute("familyIncomeList",familyIncomeList);
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

