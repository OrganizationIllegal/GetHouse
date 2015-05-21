package com.kate.app.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kate.app.model.BingMapVo;
import com.kate.app.model.HouseProject;
@Repository 
public class BingMapDao extends BaseDao {
	public List<BingMapVo> listBingMap(){
		List<BingMapVo> bingMapList=new ArrayList<BingMapVo>();
		try {
			String sql = "select t.id,t.project_img,t.project_num,t.project_address,t.project_name,t.project_sales_remain,t.project_price_qi, MIN(h.house_size_in) as minarea,MAX(h.house_size_in) as maxarea ,h.house_type from house_project t LEFT JOIN house_info h on t.id=h.house_project_id group BY h.house_project_id";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
		    int id=0;
		    String project_address=null;
		    String project_img=null;
		    String project_num=null;
		    String project_name=null;
		    int project_sales_remain=0;
		    int project_price=0;//��Ҫ�Ķ�
		    int project_price_qi=0;
		    int maxarea=0;
		    int minarea=0;
		    String house_type=null;
		    while(rs.next()){
		    	id=rs.getInt("id");
		    	project_img=rs.getString("project_img");
		    	project_num=rs.getString("project_num");
		    	project_address=rs.getString("project_address");
		    	project_name=rs.getString("project_name");
		    	project_sales_remain=rs.getInt("project_sales_remain");
		    	maxarea=rs.getInt("maxarea");
		    	minarea=rs.getInt("minarea");
		    	project_price=rs.getInt("project_price_qi");//�˴���Ŀ�۸�Ŀǰ�������Ŀƽ��۸�
		    	project_price_qi=rs.getInt("project_price_qi");
		    	house_type=rs.getString("house_type");
		        BingMapVo bingMapVo=new BingMapVo(id,project_img,project_num,project_address, project_name, project_price,minarea, maxarea, project_sales_remain, project_price_qi,house_type);
		    	bingMapList.add(bingMapVo);
		    }
		    
		  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bingMapList;
	} 
	public List<BingMapVo> filterByHouseType(int type){
		String housetype=null;
		switch(type)
		{
		case 1:
			housetype="һ����";
			break;
		case 2:
			housetype="������";
			break;
		case 3:
			housetype="������";
			break;
		}
		List<BingMapVo> bingMapList=new ArrayList<BingMapVo>();
		try {
			String sql = "select t.id,t.project_img,t.project_num,t.project_address,t.project_name,t.project_sales_remain,t.project_price_qi, MIN(h.house_size_in) as minarea,MAX(h.house_size_in) as maxarea ,h.house_type from house_project t LEFT JOIN house_info h on t.id=h.house_project_id  where h.house_type='"+housetype+"' group BY h.house_project_id ";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
		    int id=0;
		    String project_img=null;
		    String project_num=null;
		    String project_address=null;
		    String project_name=null;
		    int project_sales_remain=0;
		    int project_price=0;//��Ҫ�Ķ�
		    int project_price_qi=0;
		    int maxarea=0;
		    int minarea=0;
		    String house_type=null;
		    while(rs.next()){
		    	id=rs.getInt("id");
		    	project_img=rs.getString("project_img");
		    	project_num=rs.getString("project_num");
		    	project_address=rs.getString("project_address");
		    	project_name=rs.getString("project_name");
		    	project_sales_remain=rs.getInt("project_sales_remain");
		    	maxarea=rs.getInt("maxarea");
		    	minarea=rs.getInt("minarea");
		    	project_price=rs.getInt("project_price_qi");//�˴���Ŀ�۸�Ŀǰ�������Ŀƽ��۸�
		    	project_price_qi=rs.getInt("project_price_qi");
		    	house_type=rs.getString("house_type");
		    	BingMapVo bingMapVo=new BingMapVo(id,project_img,project_num,project_address, project_name, project_price,minarea, maxarea, project_sales_remain, project_price_qi,house_type);
		    	bingMapList.add(bingMapVo);
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bingMapList;
	}
	public List<BingMapVo> orderByPrice(int order){
	    String orderstr=null;
		switch(order)
		{
		case 1:
			orderstr="asc";
			break;
		case 2:
			orderstr="desc";
			break;
		}
		List<BingMapVo> bingMapList=new ArrayList<BingMapVo>();
		try {
			String sql = "select t.id,t.project_img,t.project_num,t.project_address,t.project_name,t.project_sales_remain,t.project_price_qi, MIN(h.house_size_in) as minarea,MAX(h.house_size_in) as maxarea ,h.house_type from house_project t LEFT JOIN house_info h on t.id=h.house_project_id  group BY h.house_project_id order by t.project_price_qi "+orderstr;
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
		    int id=0;
		    String project_img=null;
		    String project_num=null;
		    String project_address=null;
		    String project_name=null;
		    int project_sales_remain=0;
		    int project_price=0;//��Ҫ�Ķ�
		    int project_price_qi=0;
		    int maxarea=0;
		    int minarea=0;
		    String house_type=null;
		    while(rs.next()){
		    	id=rs.getInt("id");
		    	project_img=rs.getString("project_img");
		    	project_num=rs.getString("project_num");
		    	project_address=rs.getString("project_address");
		    	project_name=rs.getString("project_name");
		    	project_sales_remain=rs.getInt("project_sales_remain");
		    	maxarea=rs.getInt("maxarea");
		    	minarea=rs.getInt("minarea");
		    	project_price=rs.getInt("project_price_qi");//�˴���Ŀ�۸�Ŀǰ�������Ŀƽ��۸�
		    	project_price_qi=rs.getInt("project_price_qi");
		    	house_type=rs.getString("house_type");
		    	BingMapVo bingMapVo=new BingMapVo(id,project_img,project_num,project_address, project_name, project_price,minarea, maxarea, project_sales_remain, project_price_qi,house_type);
		    	bingMapList.add(bingMapVo);
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bingMapList;
	}
	//经纬度及其相关信息
	public List<HouseProject> listMap(){
		List<HouseProject> coordinatesList=new ArrayList<HouseProject>();
		try {
			String sql = "SELECT * FROM `house_project` WHERE gps!=''";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
		    while(rs.next()){
		    	HouseProject coordinates=new HouseProject();
		    	coordinates.setId(rs.getInt("id"));
		    	coordinates.setGps(rs.getString("gps"));
		    	coordinates.setProject_name(rs.getString("project_name"));
		    	coordinates.setProject_img(rs.getString("project_img"));
		    	coordinates.setProject_price(rs.getString("project_price"));
		    	coordinates.setProject_num(rs.getString("project_num"));
		    	coordinatesList.add(coordinates);
		    }
		    
		  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return coordinatesList;
	} 
	
	public List<HouseProject> filterByHouseType2(int type){
		List<HouseProject> coordinatesList=new ArrayList<HouseProject>();
		try {
			String housetype=null;
			switch(type)
			{
			case 1:
				housetype="%1居室%";
				break;
			case 2:
				housetype="%2居室%";
				break;
			case 3:
				housetype="%3居室%";
				break;
			}
			String sql = "SELECT * FROM `house_project` WHERE gps!='' and project_house_type like '"+housetype+"'";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
		    	HouseProject coordinates=new HouseProject();
		    	coordinates.setId(rs.getInt("id"));
		    	coordinates.setGps(rs.getString("gps"));
		    	coordinates.setProject_name(rs.getString("project_name"));
		    	coordinates.setProject_img(rs.getString("project_img"));
		    	coordinates.setProject_price(rs.getString("project_price"));
		    	coordinates.setProject_num(rs.getString("project_num"));
		    	coordinatesList.add(coordinates);
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return coordinatesList;
	}
	public List<HouseProject> filterByKeyWord(String key){
		List<HouseProject> coordinatesList=new ArrayList<HouseProject>();
		try {
			String sql = "SELECT * FROM `house_project` WHERE gps!='' and project_address like '%"+key+"%'";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
		    	HouseProject coordinates=new HouseProject();
		    	coordinates.setId(rs.getInt("id"));
		    	coordinates.setGps(rs.getString("gps"));
		    	coordinates.setProject_name(rs.getString("project_name"));
		    	coordinates.setProject_img(rs.getString("project_img"));
		    	coordinates.setProject_price(rs.getString("project_price"));
		    	coordinates.setProject_num(rs.getString("project_num"));
		    	coordinatesList.add(coordinates);
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return coordinatesList;
	}
}
