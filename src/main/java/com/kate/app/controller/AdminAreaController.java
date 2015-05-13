package com.kate.app.controller;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kate.app.dao.AreaFeatureDao;
import com.kate.app.dao.AreaTrendDao;
import com.kate.app.dao.CoordinatesDao;
import com.kate.app.dao.HouseTaxDao;
import com.kate.app.dao.LatestSaleInfoListDao;
import com.kate.app.dao.RegionPeopleDao;
import com.kate.app.dao.SchoolNearDao;
import com.kate.app.service.AreaFamilyService;

@Controller
public class AdminAreaController {
	@Autowired
	private AreaFamilyService areaFamilyService;
	@Autowired
	private RegionPeopleDao regionPeopleDao;
	@Autowired
	private AreaFeatureDao areaFeatureDao;
	@Autowired
	private LatestSaleInfoListDao latestSaleInfoListDao;
	@Autowired
	private AreaTrendDao areaTrendDao;
	@Autowired
	private HouseTaxDao houseTaxDao;
	@Autowired
	private SchoolNearDao schoolNearDao;
	@Autowired
	private CoordinatesDao coordinatesDao;
	
	//管理员   区域家庭情况构成  列表
	@RequestMapping({"/Area/ListAreaFamily"})
	public void  listAreaFamily(HttpServletRequest req,HttpServletResponse resp){
		JSONObject json = new JSONObject();
		JSONArray jsonAreaFamily=areaFamilyService.listAreaFamily();
		json.put("total", jsonAreaFamily.size());
		json.put("rows", jsonAreaFamily);
		try{
			writeJson(json.toJSONString(),resp);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//管理员   区域家庭情况构成  增加
	@RequestMapping({"/Area/AddAreaFamily"})
	public void InsertAreaFamily(HttpServletRequest req,HttpServletResponse resp){
		JSONObject json = new JSONObject();
		boolean flag = false;
		String family_type=req.getParameter("family_type");
		int rate=Integer.parseInt(req.getParameter("rate"));
		String project_name=req.getParameter("project_name");
		int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		//如果ID为0，则表示项目名称没有找到
		if(house_pro_id==0){
			json.put("house_pro_id", house_pro_id);
		}
		else
		{
			int insertResult=areaFamilyService.InsertAreaFamily(family_type, rate, house_pro_id);
			if(insertResult!=0){
				flag=true;
			}
		}
		json.put("flag", flag);
		try{
			 PrintWriter out = resp.getWriter();
			 out.print(json);
			}catch(Exception e){
				e.printStackTrace();
		}
	}
	//管理员   区域家庭情况构成  删除
	@RequestMapping({"/Area/DelAreaFamily"})
	public void DelAreaFamily(HttpServletRequest req,HttpServletResponse resp){
		int id=Integer.parseInt(req.getParameter("id"));
		int result=areaFamilyService.delAreaFamily(id);
		boolean flag=false;
		if(result!=0){
			flag=true;
		}
		JSONObject json = new JSONObject();
		json.put("flag", flag);
		try{
			PrintWriter out = resp.getWriter();
		    out.print(json);
			}catch(Exception e){
				e.printStackTrace();
			}
	}
	//管理员   区域家庭情况构成   更新
	@RequestMapping({"/Area/UpdateAreaFamily"})
	public void UpdateAreaFamily(HttpServletRequest req,HttpServletResponse resp){
		JSONObject json = new JSONObject();
		boolean flag=false;
		int id=Integer.parseInt(req.getParameter("id"));
		String family_type=req.getParameter("family_type");
		int rate=Integer.parseInt(req.getParameter("rate"));
		String project_name=req.getParameter("project_name");
		int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		//如果ID为0，则表示项目名称没有找到
		if(house_pro_id==0){
			json.put("house_pro_id", house_pro_id);
		}
		else{
		int insertResult=areaFamilyService.updateAreaFamily(id, family_type, rate, house_pro_id);
		if(insertResult!=0){
			flag=true;
		}
		}
		json.put("flag", flag);
		try{
			 PrintWriter out = resp.getWriter();
			 out.print(json);
			}catch(Exception e){
				e.printStackTrace();
			}
	}
	//管理员 区域人口分布-->人口总数   列表
	@RequestMapping({"/Area/ListPeopleInfo"})
	public void listPeopleInfo(HttpServletRequest req,HttpServletResponse resp){
		JSONObject json = new JSONObject();
		JSONArray jsonPeopleInfo=regionPeopleDao.listPeopleInfo();
		json.put("total", jsonPeopleInfo.size());
		json.put("rows", jsonPeopleInfo);
		try{
			writeJson(json.toJSONString(),resp);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//管理员 区域人口分布-->人口总数   增加
	@RequestMapping({"/Area/AddPeopleInfo"})
	public void InsertPeopleInfo(HttpServletRequest req,HttpServletResponse resp){
		JSONObject json = new JSONObject();
		boolean flag = false;
		 String people_count=req.getParameter("people_count");
		 int area=Integer.parseInt(req.getParameter("area"));
		 int city=Integer.parseInt(req.getParameter("city"));
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
				json.put("house_pro_id", house_pro_id);
			}
		 else{
			 int insertResult=regionPeopleDao.InsertPeople(people_count, area, city, house_pro_id);
			 if(insertResult!=0){
				flag=true;
			 }
		 }
		 json.put("flag", flag);
		try{
			PrintWriter out = resp.getWriter();
		 	out.print(json);
			}catch(Exception e){
				e.printStackTrace();
			}
		 
	}
	//管理员 区域人口分布-->人口总数   更新
	@RequestMapping({"/Area/UpdatePeopleInfo"})
	public void UpdatePeopleInfo(HttpServletRequest req,HttpServletResponse resp){
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 int id=Integer.parseInt(req.getParameter("id"));
		 String people_count=req.getParameter("people_count");
		 int area=Integer.parseInt(req.getParameter("area"));
		 int city=Integer.parseInt(req.getParameter("city"));
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
				json.put("house_pro_id", house_pro_id);
			}
		 else{
			 int insertResult=regionPeopleDao.updateAreaFamily(id, people_count, area, city, house_pro_id);
			 if(insertResult!=0){
					flag=true;
			 }
		 }
		 json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			 	out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
			 
		 

	}
	//管理员 区域人口分布-->人口总数   删除
	@RequestMapping({"/Area/DelPeopleInfo"})
	public void DelPeopleInfo(HttpServletRequest req,HttpServletResponse resp){
		 int id=Integer.parseInt(req.getParameter("id"));
		 int insertResult=regionPeopleDao.DelPeopleInfo(id);
		 boolean flag=false;
			if(insertResult!=0){
				flag=true;
			}
			JSONObject json = new JSONObject();
			json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			    out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//管理员 区域人口分布-->出生国家   列表
	@RequestMapping({"/Area/ListPeopleNation"})
	public void listPeopleNation(HttpServletRequest req,HttpServletResponse resp){
		JSONObject json = new JSONObject();
		JSONArray jsonPeopleNation=regionPeopleDao.listPeopleNation();
		json.put("total", jsonPeopleNation.size());
		json.put("rows", jsonPeopleNation);
		try{
			writeJson(json.toJSONString(),resp);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//管理员 区域人口分布-->出生国家   增
	@RequestMapping({"/Area/AddPeopleNation"})
	public void InsertPeopleNation(HttpServletRequest req,HttpServletResponse resp){
		JSONObject json = new JSONObject();
		boolean flag = false;
		 String born_city=req.getParameter("born_city");
		 int area=Integer.parseInt(req.getParameter("area"));
		 int city=Integer.parseInt(req.getParameter("city"));
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
				json.put("house_pro_id", house_pro_id);
			}
		 else{
			 int insertResult=regionPeopleDao.InsertPeopleNation(born_city, area, city, house_pro_id);
			 if(insertResult!=0){
				flag=true;
			 }
		 }
		 json.put("flag", flag);
		try{
			PrintWriter out = resp.getWriter();
		 	out.print(json);
			}catch(Exception e){
				e.printStackTrace();
			}
	}
	//管理员 区域人口分布-->出生国家   更新
	@RequestMapping({"/Area/UpdatePeopleNation"})
	public void UpdatePeopleNation(HttpServletRequest req,HttpServletResponse resp){
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 int id=Integer.parseInt(req.getParameter("id"));
		 String born_city=req.getParameter("born_city");
		 int area=Integer.parseInt(req.getParameter("area"));
		 int city=Integer.parseInt(req.getParameter("city"));
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
				json.put("house_pro_id", house_pro_id);
			}
		 else{
			 int insertResult=regionPeopleDao.updatePeopleNation(id, born_city, area, city, house_pro_id);
			 if(insertResult!=0){
					flag=true;
			 }
		 }
		 json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			 	out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
			 
		 
	}
	//管理员 区域人口分布-->出生国家   删
	@RequestMapping({"/Area/DelPeopleNation"})
	public void DelPeopleNation(HttpServletRequest req,HttpServletResponse resp){
		 int id=Integer.parseInt(req.getParameter("id"));
		 int insertResult=regionPeopleDao.DelPeopleNation(id);
		 boolean flag=false;
			if(insertResult!=0){
				flag=true;
			}
			JSONObject json = new JSONObject();
			json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			    out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//管理员 区域人口分布-->海外出生 列表
	@RequestMapping({"/Area/ListPeopleForeign"})
	public void listPeopleForeign(HttpServletRequest req,HttpServletResponse resp){
		JSONObject json = new JSONObject();
		JSONArray jsonPeopleForeign=regionPeopleDao.listPeopleForeign();
		json.put("total", jsonPeopleForeign.size());
		json.put("rows", jsonPeopleForeign);
		try{
			writeJson(json.toJSONString(),resp);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
    //管理员 区域人口分布-->海外出生 新增
	@RequestMapping({"/Area/AddPeopleForeign"})
	public void InsertPeopleForeign(HttpServletRequest req,HttpServletResponse resp){
		 JSONObject json = new JSONObject();
			boolean flag = false;
		 String born_foreign=req.getParameter("born_foreign");
		 int area=Integer.parseInt(req.getParameter("area"));
		 int city=Integer.parseInt(req.getParameter("city"));
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
			 if(house_pro_id==0){
					json.put("house_pro_id", house_pro_id);
				}
			 else{
				 int insertResult=regionPeopleDao.InsertPeopleForeign(born_foreign, area, city, house_pro_id);
				 if(insertResult!=0){
					flag=true;
				 }
			 }
			 json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			 	out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
    //管理员 区域人口分布-->海外出生 更新
	@RequestMapping({"/Area/UpdatePeopleForeign"})
	public void UpdatePeopleForeign(HttpServletRequest req,HttpServletResponse resp){
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 int id=Integer.parseInt(req.getParameter("id"));
		 String born_foreign=req.getParameter("born_foreign");
		 int area=Integer.parseInt(req.getParameter("area"));
		 int city=Integer.parseInt(req.getParameter("city"));
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
				json.put("house_pro_id", house_pro_id);
			}
		 else{
			 int insertResult=regionPeopleDao.updatePeopleForeign(id, born_foreign, area, city, house_pro_id);
			 if(insertResult!=0){
					flag=true;
			 }
		 }
		 json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			 	out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
			 
	}
	//管理员 区域人口分布-->海外出生 删除
	@RequestMapping({"/Area/DelPeopleForeign"})
	public void DelPeopleForeign(HttpServletRequest req,HttpServletResponse resp){
		 int id=Integer.parseInt(req.getParameter("id"));
		 int insertResult=regionPeopleDao.DelPeopleForeign(id);
		 boolean flag=false;
			if(insertResult!=0){
				flag=true;
			}
			JSONObject json = new JSONObject();
			json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			    out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//管理员 区域人口分布-->海外出生 列表
	@RequestMapping({"/Area/ListFamilyIncome"})
	public void listFamilyIncome(HttpServletRequest req,HttpServletResponse resp){
		JSONObject json = new JSONObject();
		JSONArray jsonFamilyIncome=regionPeopleDao.listFamilyIncome();
		json.put("total", jsonFamilyIncome.size());
		json.put("rows", jsonFamilyIncome);
		try{
			writeJson(json.toJSONString(),resp);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//管理员 区域人口分布-->海外出生 新增
	@RequestMapping({"/Area/AddFamilyIncome"})
	public void InsertFamilyIncome(HttpServletRequest req,HttpServletResponse resp){
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 String family_income=req.getParameter("family_income");
		 int area=Integer.parseInt(req.getParameter("area"));
		 int city=Integer.parseInt(req.getParameter("city"));
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);

			 if(house_pro_id==0){
					json.put("house_pro_id", house_pro_id);
				}
			 else{
				 int insertResult=regionPeopleDao.InsertFamilyIncome(family_income, area, city, house_pro_id);
				 if(insertResult!=0){
					flag=true;
				 }
			 }
			 json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			 	out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
		//管理员 区域人口分布-->海外出生 更新 
	@RequestMapping({"/Area/UpdateFamilyIncome"})
	public void UpdateFamilyIncome(HttpServletRequest req,HttpServletResponse resp){
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 int id=Integer.parseInt(req.getParameter("id"));
		 String family_income=req.getParameter("family_income");
		 int area=Integer.parseInt(req.getParameter("area"));
		 int city=Integer.parseInt(req.getParameter("city"));
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
				json.put("house_pro_id", house_pro_id);
			}
		 else{
			 int insertResult=regionPeopleDao.updateFamilyIncome(id, family_income, area, city, house_pro_id);
			 if(insertResult!=0){
					flag=true;
			 }
		 }
		 json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			 	out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
		//管理员 区域人口分布-->海外出生 删除
	@RequestMapping({"/Area/DelFamilyIncome"})
	public void DelFamilyIncome(HttpServletRequest req,HttpServletResponse resp){
		 int id=Integer.parseInt(req.getParameter("id"));
		 int insertResult=regionPeopleDao.DelFamilyIncome(id);
		 boolean flag=false;
			if(insertResult!=0){
				flag=true;
			}
			JSONObject json = new JSONObject();
			json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			    out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//地区特点 List
	@RequestMapping({"/Area/ListAreaFeature"})
	public void listAreaFeature(HttpServletRequest req,HttpServletResponse resp){
		JSONObject json = new JSONObject();
		JSONArray jsonAreaFeature=areaFeatureDao.listAreaFeature();
		json.put("total", jsonAreaFeature.size());
		json.put("rows", jsonAreaFeature);
		try{
			writeJson(json.toJSONString(),resp);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//地区特点 Add
	@RequestMapping({"/Area/AddAreaFeature"})
	public void InsertAreaFeature(HttpServletRequest req,HttpServletResponse resp){
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 String area_character=req.getParameter("area_character");
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
			json.put("house_pro_id", house_pro_id);
		}
		 else{
			int insertResult=areaFeatureDao.InsertAreaFeature(area_character, house_pro_id);
			if(insertResult!=0){
				flag=true;
			 }
		}
		json.put("flag", flag);
		try{
			PrintWriter out = resp.getWriter();
			out.print(json);
			}catch(Exception e){
				e.printStackTrace();
		    }
	}
	//地区特点Update
	@RequestMapping({"/Area/UpdateAreaFeature"})
	public void UpdateAreaFeature(HttpServletRequest req,HttpServletResponse resp){
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 int id=Integer.parseInt(req.getParameter("id"));
		 String area_character=req.getParameter("area_character");
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
				json.put("house_pro_id", house_pro_id);
			}
		 else{
			 int insertResult=areaFeatureDao.updateAreaFeature(id, area_character, house_pro_id);
			 if(insertResult!=0){
					flag=true;
			 }
		 }
		 json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			 	out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//地区特点 del
	@RequestMapping({"/Area/DelAreaFeature"})
	public void DelAreaFeature(HttpServletRequest req,HttpServletResponse resp){
		 int id=Integer.parseInt(req.getParameter("id"));
		 int insertResult=areaFeatureDao.delAreaFeature(id);
		 boolean flag=false;
			if(insertResult!=0){
				flag=true;
			}
			JSONObject json = new JSONObject();
			json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			    out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//近期区域成交情况 list
	@RequestMapping({"/Area/ListSuccessInfo"})
	public void listSuccessInfo(HttpServletRequest req,HttpServletResponse resp){
		JSONObject json = new JSONObject();
		JSONArray jsonAreaFeature=latestSaleInfoListDao.listSuccessInfo();
		json.put("total", jsonAreaFeature.size());
		json.put("rows", jsonAreaFeature);
		try{
			writeJson(json.toJSONString(),resp);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//近期区域成交情况 Add
	@RequestMapping({"/Area/AddSuccessInfo"})
	public void InsertSuccessInfo(HttpServletRequest req,HttpServletResponse resp) throws ParseException{
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 String address=req.getParameter("address");
		 int price=Integer.parseInt(req.getParameter("price"));
		 String sales_type=req.getParameter("sales_type");
		 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		 Date sales_time=sdf.parse(req.getParameter("sales_time"));
		 int house_type=Integer.parseInt(req.getParameter("house_type"));
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
			json.put("house_pro_id", house_pro_id);
		}
		 else{
			int insertResult=latestSaleInfoListDao.InsertSuccessInfo(address, price, sales_type, sales_time, house_type, house_pro_id);
			if(insertResult!=0){
				flag=true;
			 }
		}
		json.put("flag", flag);
		try{
			PrintWriter out = resp.getWriter();
			out.print(json);
			}catch(Exception e){
				e.printStackTrace();
		    }
	}
	//近期区域成交情况 update
	@RequestMapping({"/Area/UpdateSuccessInfo"})
	public void UpdateSuccessInfo(HttpServletRequest req,HttpServletResponse resp) throws ParseException{
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 int id=Integer.parseInt(req.getParameter("id"));
		 String address=req.getParameter("address");
		 int price=Integer.parseInt(req.getParameter("price"));
		 String sales_type=req.getParameter("sales_type");
		 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		 Date sales_time=sdf.parse(req.getParameter("sales_time"));
		 int house_type=Integer.parseInt(req.getParameter("house_type"));
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
				json.put("house_pro_id", house_pro_id);
			}
		 else{
			 int insertResult=latestSaleInfoListDao.updateSuccessInfo(id, address, price, sales_type, sales_time, house_type, house_pro_id);
			 if(insertResult!=0){
					flag=true;
			 }
		 }
		 json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			 	out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//近期区域成交情况 delete
	@RequestMapping({"/Area/DeleteSuccessInfo"})
	public void DelSuccessInfo(HttpServletRequest req,HttpServletResponse resp){
		 int id=Integer.parseInt(req.getParameter("id"));
		 int insertResult=latestSaleInfoListDao.delSuccessInfo(id);
		 boolean flag=false;
			if(insertResult!=0){
				flag=true;
			}
			JSONObject json = new JSONObject();
			json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			    out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//中位数房价走势List
	@RequestMapping({"/Area/ListAreaMiddle"})
	public void listAreaMiddle(HttpServletRequest req,HttpServletResponse resp){
		JSONObject json = new JSONObject();
		JSONArray jsonAreaFeature=areaTrendDao.listAreaMiddle();
		json.put("total", jsonAreaFeature.size());
		json.put("rows", jsonAreaFeature);
		try{
			writeJson(json.toJSONString(),resp);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//中位数房价走势Add
	@RequestMapping({"/Area/AddAreaMiddle"})
	public void InsertAreaMiddle(HttpServletRequest req,HttpServletResponse resp) throws ParseException{
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 int year=Integer.parseInt(req.getParameter("year"));
		 int rate=Integer.parseInt(req.getParameter("rate"));
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
			json.put("house_pro_id", house_pro_id);
		}
		 else{
			int insertResult=areaTrendDao.InsertAreaMiddle(year, rate, house_pro_id);
			if(insertResult!=0){
				flag=true;
			 }
		}
		json.put("flag", flag);
		try{
			PrintWriter out = resp.getWriter();
			out.print(json);
			}catch(Exception e){
				e.printStackTrace();
		    }
	}
	//中位数房价走势update
	@RequestMapping({"/Area/UpdateAreaMiddle"})
	public void UpdateAreaMiddle(HttpServletRequest req,HttpServletResponse resp) throws ParseException{
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 int id=Integer.parseInt(req.getParameter("id"));
		 int year=Integer.parseInt(req.getParameter("year"));
		 int rate=Integer.parseInt(req.getParameter("rate"));
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
				json.put("house_pro_id", house_pro_id);
			}
		 else{
			 int insertResult=areaTrendDao.updateAreaMiddle(id, year, rate, house_pro_id);
			 if(insertResult!=0){
					flag=true;
			 }
		 }
		 json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			 	out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//中位数房价走势delete
	@RequestMapping({"/Area/DelAreaMiddle"})
	public void DelAreaMiddle(HttpServletRequest req,HttpServletResponse resp){
		 int id=Integer.parseInt(req.getParameter("id"));
		 int insertResult=areaTrendDao.delAreaMiddle(id);
		 boolean flag=false;
			if(insertResult!=0){
				flag=true;
			}
			JSONObject json = new JSONObject();
			json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			    out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//区域租金走势List
	@RequestMapping({"/Area/ListAreaZujin"})
	public void listAreaZujin(HttpServletRequest req,HttpServletResponse resp){
		JSONObject json = new JSONObject();
		JSONArray jsonAreaFeature=areaTrendDao.listAreaZujin();
		json.put("total", jsonAreaFeature.size());
		json.put("rows", jsonAreaFeature);
		try{
			writeJson(json.toJSONString(),resp);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//区域租金走势Add
	@RequestMapping({"/Area/AddAreaZujin"})
	public void InsertAreaZujin(HttpServletRequest req,HttpServletResponse resp) throws ParseException{
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 int year=Integer.parseInt(req.getParameter("year"));
		 int rate=Integer.parseInt(req.getParameter("rate"));
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
			json.put("house_pro_id", house_pro_id);
		}
		 else{
			int insertResult=areaTrendDao.InsertAreaZujin(year, rate, house_pro_id);
			if(insertResult!=0){
				flag=true;
			 }
		}
		json.put("flag", flag);
		try{
			PrintWriter out = resp.getWriter();
			out.print(json);
			}catch(Exception e){
				e.printStackTrace();
		    }
	}
	//区域租金走势update
	@RequestMapping({"/Area/UpdateAreaZujin"})
	public void UpdateAreaZujin(HttpServletRequest req,HttpServletResponse resp) throws ParseException{
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 int id=Integer.parseInt(req.getParameter("id"));
		 int year=Integer.parseInt(req.getParameter("year"));
		 int rate=Integer.parseInt(req.getParameter("rate"));
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
				json.put("house_pro_id", house_pro_id);
			}
		 else{
			 int insertResult=areaTrendDao.updateAreaZujin(id, year, rate, house_pro_id);
			 if(insertResult!=0){
					flag=true;
			 }
		 }
		 json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			 	out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//区域租金走势delete
	@RequestMapping({"/Area/DelAreaZujin"})
	public void DelAreaZujin(HttpServletRequest req,HttpServletResponse resp){
		 int id=Integer.parseInt(req.getParameter("id"));
		 int insertResult=areaTrendDao.delAreaZujin(id);
		 boolean flag=false;
			if(insertResult!=0){
				flag=true;
			}
			JSONObject json = new JSONObject();
			json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			    out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//区域空置率走势list
	@RequestMapping({"/Area/ListAreaZhikong"})
	public void listAreaZhikong(HttpServletRequest req,HttpServletResponse resp){
		JSONObject json = new JSONObject();
		JSONArray jsonAreaFeature=areaTrendDao.listAreaZhikong();
		json.put("total", jsonAreaFeature.size());
		json.put("rows", jsonAreaFeature);
		try{
			writeJson(json.toJSONString(),resp);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//区域空置率走势add
	@RequestMapping({"/Area/AddAreaZhikong"})
	public void InsertAreaZhikong(HttpServletRequest req,HttpServletResponse resp) throws ParseException{
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 int year=Integer.parseInt(req.getParameter("year"));
		 int rate=Integer.parseInt(req.getParameter("rate"));
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
			json.put("house_pro_id", house_pro_id);
		}
		 else{
			int insertResult=areaTrendDao.InsertAreaZhikong(year, rate, house_pro_id);
			if(insertResult!=0){
				flag=true;
			 }
		}
		json.put("flag", flag);
		try{
			PrintWriter out = resp.getWriter();
			out.print(json);
			}catch(Exception e){
				e.printStackTrace();
		    }
	}
	//区域空置率走势update
	@RequestMapping({"/Area/updateAreaZhikong"})
	public void UpdateAreaZhikong(HttpServletRequest req,HttpServletResponse resp) throws ParseException{
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 int id=Integer.parseInt(req.getParameter("id"));
		 int year=Integer.parseInt(req.getParameter("year"));
		 int rate=Integer.parseInt(req.getParameter("rate"));
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
				json.put("house_pro_id", house_pro_id);
			}
		 else{
			 int insertResult=areaTrendDao.updateAreaZhikong(id, year, rate, house_pro_id);
			 if(insertResult!=0){
					flag=true;
			 }
		 }
		 json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			 	out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//区域空置率走势delete
	@RequestMapping({"/Area/DelAreaZhikong"})
	public void DelAreaZhikong(HttpServletRequest req,HttpServletResponse resp){
		 int id=Integer.parseInt(req.getParameter("id"));
		 int insertResult=areaTrendDao.delAreaZhikong(id);
		 boolean flag=false;
			if(insertResult!=0){
				flag=true;
			}
			JSONObject json = new JSONObject();
			json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			    out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//购房税费List
	@RequestMapping({"/Area/ListHouseTax"})
	public void listAreaHouseTax(HttpServletRequest req,HttpServletResponse resp){
		JSONObject json = new JSONObject();
		JSONArray jsonAreaFeature=houseTaxDao.listHouseTax();
		json.put("total", jsonAreaFeature.size());
		json.put("rows", jsonAreaFeature);
		try{
			writeJson(json.toJSONString(),resp);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//购房税费Add
	@RequestMapping({"/Area/AddHouseTax"})
	public void InsertAreaHouseTax(HttpServletRequest req,HttpServletResponse resp) throws ParseException{
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 String type=req.getParameter("type");
		 int price=Integer.parseInt(req.getParameter("price"));
		 String description=req.getParameter("description");
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
			json.put("house_pro_id", house_pro_id);
		}
		 else{
			int insertResult=houseTaxDao.InsertHouseTax(type, price, description, house_pro_id);
			if(insertResult!=0){
				flag=true;
			 }
		}
		json.put("flag", flag);
		try{
			PrintWriter out = resp.getWriter();
			out.print(json);
			}catch(Exception e){
				e.printStackTrace();
		    }
	}
	//购房税费update
	@RequestMapping({"/Area/updateHouseTax"})
	public void UpdateHouseTax(HttpServletRequest req,HttpServletResponse resp) throws ParseException{
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 String type=req.getParameter("type");
		 int id=Integer.parseInt(req.getParameter("id"));
		 int price=Integer.parseInt(req.getParameter("price"));
		 String description=req.getParameter("description");
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
				json.put("house_pro_id", house_pro_id);
			}
		 else{
			 int insertResult=houseTaxDao.updateHouseTax(id, type, price, description, house_pro_id);
			 if(insertResult!=0){
					flag=true;
			 }
		 }
		 json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			 	out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//购房税费delete
	@RequestMapping({"/Area/DelHouseTax"})
	public void DelAreaHouseTax(HttpServletRequest req,HttpServletResponse resp){
		 int id=Integer.parseInt(req.getParameter("id"));
		 int insertResult=houseTaxDao.delHouseTax(id);
		 boolean flag=false;
			if(insertResult!=0){
				flag=true;
			}
			JSONObject json = new JSONObject();
			json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			    out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//持有成本List
	@RequestMapping({"/Area/ListHoldCost"})
	public void listAreaHoldCost(HttpServletRequest req,HttpServletResponse resp){
		JSONObject json = new JSONObject();
		JSONArray jsonAreaFeature=houseTaxDao.listHoldingCost();
		json.put("total", jsonAreaFeature.size());
		json.put("rows", jsonAreaFeature);
		try{
			writeJson(json.toJSONString(),resp);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//持有成本Add
	@RequestMapping({"/Area/AddHoldCost"})
	public void InsertAreaHoldCost(HttpServletRequest req,HttpServletResponse resp) throws ParseException{
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 String type=req.getParameter("type");
		 int price=Integer.parseInt(req.getParameter("price"));
		 String description=req.getParameter("description");
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
			json.put("house_pro_id", house_pro_id);
		}
		 else{
			int insertResult=houseTaxDao.InsertHoldingCost(type, price, description, house_pro_id);
			if(insertResult!=0){
				flag=true;
			 }
		}
		json.put("flag", flag);
		try{
			PrintWriter out = resp.getWriter();
			out.print(json);
			}catch(Exception e){
				e.printStackTrace();
		    }
	}
	//持有成本update
	@RequestMapping({"/Area/UpdateHoldCost"})
	public void UpdateHoldCost(HttpServletRequest req,HttpServletResponse resp) throws ParseException{
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 String type=req.getParameter("type");
		 int id=Integer.parseInt(req.getParameter("id"));
		 int price=Integer.parseInt(req.getParameter("price"));
		 String description=req.getParameter("description");
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
				json.put("house_pro_id", house_pro_id);
			}
		 else{
			 int insertResult=houseTaxDao.updateHoldingCost(id, type, price, description, house_pro_id);
			 if(insertResult!=0){
					flag=true;
			 }
		 }
		 json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			 	out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//持有成本delete
	@RequestMapping({"/Area/DelHoldCost"})
	public void DelAreaHoldCost(HttpServletRequest req,HttpServletResponse resp){
		 int id=Integer.parseInt(req.getParameter("id"));
		 int insertResult=houseTaxDao.delHoldingCost(id);
		 boolean flag=false;
			if(insertResult!=0){
				flag=true;
			}
			JSONObject json = new JSONObject();
			json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			    out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//附近学校List
	@RequestMapping({"/Area/ListNearSchool"})
	public void listAreaNearSchool(HttpServletRequest req,HttpServletResponse resp){
		JSONObject json = new JSONObject();
		JSONArray jsonAreaFeature=schoolNearDao.listNearSchool();
		json.put("total", jsonAreaFeature.size());
		json.put("rows", jsonAreaFeature);
		try{
			writeJson(json.toJSONString(),resp);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//附近学校Add
	@RequestMapping({"/Area/AddNearSchool"})
	public void InsertNearSchool(HttpServletRequest req,HttpServletResponse resp) throws ParseException{
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 String school_type=req.getParameter("school_type");
		 String school_name=req.getParameter("school_name");
		 int school_distance=Integer.parseInt(req.getParameter("school_distance"));
		 int school_rank=Integer.parseInt(req.getParameter("school_rank"));
		 int traffic_num=Integer.parseInt(req.getParameter("traffic_num"));
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
			json.put("house_pro_id", house_pro_id);
		}
		 else{
			int insertResult=schoolNearDao.InsertNearSchool(school_type, school_name, school_distance, school_rank, traffic_num, house_pro_id);
			if(insertResult!=0){
				flag=true;
			 }
			int id=areaFamilyService.findLatestid();
		}
		json.put("flag", flag);
		try{
			PrintWriter out = resp.getWriter();
			out.print(json);
			}catch(Exception e){
				e.printStackTrace();
		    }
	}
	//附近学校update
	@RequestMapping({"/Area/UpdateNearSchool"})
	public void UpdateNearSchool(HttpServletRequest req,HttpServletResponse resp) throws ParseException{
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 int id=Integer.parseInt(req.getParameter("id"));
		 String school_type=req.getParameter("school_type");
		 String school_name=req.getParameter("school_name");
		 int school_distance=Integer.parseInt(req.getParameter("school_distance"));
		 int school_rank=Integer.parseInt(req.getParameter("school_rank"));
		 int traffic_num=Integer.parseInt(req.getParameter("traffic_num"));
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
				json.put("house_pro_id", house_pro_id);
			}
		 else{
			 int insertResult=schoolNearDao.updateNearSchool(id, school_type, school_name, school_distance, school_rank,  traffic_num, house_pro_id);
			 if(insertResult!=0){
					flag=true;
			 }
		 }
		 json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			 	out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//附近学校delete
	@RequestMapping({"/Area/DelNearSchool"})
	public void DelNearSchool(HttpServletRequest req,HttpServletResponse resp){
		 int id=Integer.parseInt(req.getParameter("id"));
		 int insertResult=schoolNearDao.delNearSchool(id);
		 boolean flag=false;
			if(insertResult!=0){
				flag=true;
			}
			JSONObject json = new JSONObject();
			json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			    out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//附近配套List
	@RequestMapping({"/Area/ListNearFacility"})
	public void listAreaNearFacility(HttpServletRequest req,HttpServletResponse resp){
		JSONObject json = new JSONObject();
		JSONArray jsonAreaFeature=schoolNearDao.listNearFacility();
		json.put("total", jsonAreaFeature.size());
		json.put("rows", jsonAreaFeature);
		try{
			writeJson(json.toJSONString(),resp);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//附近配套Add
	@RequestMapping({"/Area/AddNearFacility"})
	public void InsertNearFacility(HttpServletRequest req,HttpServletResponse resp) throws ParseException{
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 String facility_type=req.getParameter("facility_type");
		 String facility_name=req.getParameter("facility_name");
		 int facility_distance=Integer.parseInt(req.getParameter("facility_distance"));
		 int facility_rank=Integer.parseInt(req.getParameter("facility_rank"));
		 int walk_num=Integer.parseInt(req.getParameter("walk_num"));
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
			json.put("house_pro_id", house_pro_id);
		}
		 else{
			int insertResult=schoolNearDao.InsertNearFacility(facility_type, facility_name, facility_distance, facility_rank, walk_num, house_pro_id);
			if(insertResult!=0){
				flag=true;
			 }
		}
		json.put("flag", flag);
		try{
			PrintWriter out = resp.getWriter();
			out.print(json);
			}catch(Exception e){
				e.printStackTrace();
		    }
	}
	//附近配套update
	@RequestMapping({"/Area/UpdateNearFacility"})
	public void UpdateFacility(HttpServletRequest req,HttpServletResponse resp) throws ParseException{
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 int id=Integer.parseInt(req.getParameter("id"));
		 String facility_type=req.getParameter("facility_type");
		 String facility_name=req.getParameter("facility_name");
		 int facility_distance=Integer.parseInt(req.getParameter("facility_distance"));
		 int facility_rank=Integer.parseInt(req.getParameter("facility_rank"));
		 int walk_num=Integer.parseInt(req.getParameter("walk_num"));
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
				json.put("house_pro_id", house_pro_id);
			}
		 else{
			 int insertResult=schoolNearDao.updateNearFacility(id, facility_type, facility_name, facility_distance, facility_rank, walk_num, house_pro_id);
			 if(insertResult!=0){
					flag=true;
			 }
		 }
		 json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			 	out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//附近配套delete
	@RequestMapping({"/Area/DelNearFacility"})
	public void DelNearFacility(HttpServletRequest req,HttpServletResponse resp){
		 int id=Integer.parseInt(req.getParameter("id"));
		 int insertResult=schoolNearDao.delNearFacility(id);
		 boolean flag=false;
			if(insertResult!=0){
				flag=true;
			}
			JSONObject json = new JSONObject();
			json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			    out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//经纬度 list
	@RequestMapping({"/Area/ListCoordinates"})
	public void listCoordinates(HttpServletRequest req,HttpServletResponse resp){
		JSONObject json = new JSONObject();
		JSONArray jsonAreaFeature=coordinatesDao.listCoordinates();
		json.put("total", jsonAreaFeature.size());
		json.put("rows", jsonAreaFeature);
		try{
			writeJson(json.toJSONString(),resp);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//经纬度 add
	@RequestMapping({"/Area/AddCoordinates"})
	public void InsertCoordinates(HttpServletRequest req,HttpServletResponse resp) throws ParseException{
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 float longitude=Float.parseFloat(req.getParameter("longitude"));
		 float latitude=Float.parseFloat(req.getParameter("latitude"));
		 String place=req.getParameter("place");
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
			json.put("house_pro_id", house_pro_id);
		}
		 else{
			int insertResult=coordinatesDao.InsertCoordinates(longitude, latitude, place, house_pro_id);
			if(insertResult!=0){
				flag=true;
			 }
		}
		json.put("flag", flag);
		try{
			PrintWriter out = resp.getWriter();
			out.print(json);
			}catch(Exception e){
				e.printStackTrace();
		    }
	}
	//经纬度 update
	@RequestMapping({"/Area/UpdateCoordinates"})
	public void UpdateCoordinates(HttpServletRequest req,HttpServletResponse resp) throws ParseException{
		 JSONObject json = new JSONObject();
		 boolean flag = false;
		 int id=Integer.parseInt(req.getParameter("id"));
		 float longitude=Float.parseFloat(req.getParameter("longitude"));
		 float latitude=Float.parseFloat(req.getParameter("latitude"));
		 String place=req.getParameter("place");
		 String project_name=req.getParameter("project_name");
		 int house_pro_id=areaFamilyService.findProjectIdByname(project_name);
		 if(house_pro_id==0){
				json.put("house_pro_id", house_pro_id);
			}
		 else{
			 int insertResult=coordinatesDao.updateCoordinates(id, longitude, latitude, place, house_pro_id);
			 if(insertResult!=0){
					flag=true;
			 }
		 }
		 json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			 	out.print(json);
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	//经纬度 delete
	@RequestMapping({"/Area/DeleteCoordinates"})
	public void DelCoordinates(HttpServletRequest req,HttpServletResponse resp){
		 int id=Integer.parseInt(req.getParameter("id"));
		 int insertResult=coordinatesDao.delCoordinates(id);
		 boolean flag=false;
			if(insertResult!=0){
				flag=true;
			}
			JSONObject json = new JSONObject();
			json.put("flag", flag);
			try{
				PrintWriter out = resp.getWriter();
			    out.print(json);
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
	public int findProjectIdByName(String project_name){
		int project_id=areaFamilyService.findProjectIdByname(project_name);
		return project_id;
	}
}
