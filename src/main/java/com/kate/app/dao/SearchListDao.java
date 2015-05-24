package com.kate.app.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kate.app.model.BrokerInfo;
import com.kate.app.model.HouseProject;
import com.kate.app.model.SearchList;

@Repository 
public class SearchListDao extends BaseDao {
	public List<SearchList> listSearchList(){
		List<SearchList> searchInfoList=new ArrayList<SearchList>();
		try {
			String sql = "select t.id,t.project_num,t.project_name,t.project_img,t.project_lan_cn,t.project_high_price as maxPrice,t.project_min_price as minprice,t.max_area as maxarea,t.min_area as minarea,t.mianji,t.project_sales_remain,t.return_money from house_project t";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
		    int id=0;
		    String project_img=null;
		    String project_name=null;
		    int project_sales_remain=0;
		    String maxPrice=null;
		    String  minprice=null;
		    int maxarea=0;
		    int minarea=0;
		    String return_money=null;
		    String project_num = "";
		    String project_lan_cn=null;
		    String mianji=null;
		    while(rs.next()){
		    	id=rs.getInt("id");
		    	project_img=rs.getString("project_img");
		    	project_name=rs.getString("project_name");
		    	project_sales_remain=rs.getInt("project_sales_remain");
		    	maxPrice=rs.getString("maxprice");
		    	minprice=rs.getString("minprice");
		    	maxarea=rs.getInt("maxarea");
		    	minarea=rs.getInt("minarea");
		    	return_money=rs.getString("return_money");
		    	project_num = rs.getString("project_num");
		    	project_lan_cn=rs.getString("project_lan_cn");
		    	mianji=rs.getString("mianji");
		    	SearchList  searchList=new SearchList(id,project_num,project_img,project_name,maxPrice,minprice,maxarea,minarea,project_sales_remain,return_money,project_lan_cn,mianji);
		    	searchInfoList.add(searchList);
		    }
		    
		  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return searchInfoList;
	} 
	
	
	public List<BrokerInfo> searchSericeList(String name, String type, String area, String lang){
			List<BrokerInfo> brokerInfoList=new ArrayList<BrokerInfo>();
			try {
				String sql = "select * from broker_info where ";
				int i=0;
				if(name!=null && !"".equals(name)){
					sql+="broker_name like '%"+name+"%'";
					i=1;
				}
				if(type!=null &&!"".equals(type)){
					if(i==1){
						sql+="and broker_type like '%"+type+"%'";
					}
					else{
						sql+="broker_type like '%"+type+"%'";
						i=1;
					}
				}
				if(area!=null &&!"".equals(area)){
					if(i==1){
						sql+="and broker_region like '%"+area+"%'";
					}
					else{
						sql+="broker_region like '%"+area+"%'";
						i=1;
					}
				}
				if(lang!=null && !"".equals(lang)){
					if(i==1){
						sql+="and broker_language like '%"+lang+"%'";
					}
					else{
						sql+="broker_language like '%"+lang+"%'";
						i=1;
					}
				}
				if(i == 0){
					sql = "select * from broker_info";
				}
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
			    int id=0;
			    String broker_img=null;
			    String broker_language=null;
			    String broker_name=null;
			    String broker_region=null;
			    String office=null;
			    String introduction=null;
			    String broker_num=null;
			    int broker_experience=0;
			    String broker_type=null;
			    String broker_zizhi=null;
			    while(rs.next()){
			    	id=rs.getInt("id");
			    	broker_img=rs.getString("broker_img");
			    	broker_language=rs.getString("broker_language");
			    	broker_name=rs.getString("broker_name");
			    	broker_region=rs.getString("broker_region");
			    	office=rs.getString("office");
			    	introduction=rs.getString("introduction");
			    	broker_num=rs.getString("broker_num");
			    	broker_experience=rs.getInt("broker_experience");
			    	broker_type=rs.getString("broker_type");
			    	broker_zizhi=rs.getString("broker_zizhi");
			    	BrokerInfo brokerInfo=new BrokerInfo(id,broker_name,broker_language,broker_region, broker_img, office,introduction,broker_num,broker_experience,broker_type,broker_zizhi);
			    	brokerInfoList.add(brokerInfo);

//			    	BrokerInfo brokerInfo=new BrokerInfo(id,broker_name,broker_language,broker_region, broker_img, office,introduction);
//			    	brokerInfoList.add(brokerInfo);

			    }
			    
			  
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return brokerInfoList;
		} 
	

	
	public List<HouseProject> indexSericeList(String city, String type, String minimumprice, String maximumprice, String xinkaipan,String huaren,String remen,String xuequ,String baozu,String daxue,String center,String traffic,String xianfang,String maidi){
		List<HouseProject> houseProjectList=new ArrayList<HouseProject>();
		try {
			String sql = "select * from house_project where ";
			String sql1 = "select project_num from project_key where ";
			int i=0;
			int j=0;
			if(xinkaipan!=null && !"".equals(xinkaipan)){
				sql1+="xinkaipan like '%"+xinkaipan+"%'";
				sql+= "project_num in (" +sql1+ ") and ";
				if(city!=null && !"".equals(city)){
					sql+="project_city like '%"+city+"%'";
					j=1;
				}
				if(type!=null && !"".equals(type)){
					if(j==1){
						sql+="and project_type like '%"+type+"%'";
					}
					else{
						sql+="project_type like '%"+type+"%'";
						j=1;
					}
				}
				if(minimumprice!=null && !"".equals(minimumprice)){
					if(j==1){
						sql+="and project_min_price like '%"+minimumprice+"%'";
					}
					else{
						sql+="project_min_price like '%"+minimumprice+"%'";
						j=1;
					}
				}
				if(maximumprice!=null && !"".equals(maximumprice)){
					if(j==1){
						sql+="and project_high_price like '%"+maximumprice+"%'";
					}
					else{
						sql+="project_high_price like '%"+maximumprice+"%'";
						j=1;
					}
				}
				if(j==0){
					sql+= "project_num in (" +sql1+ ")";
				}
				i=1;
			}
			if(huaren!=null &&!"".equals(huaren)){
				if(i==1){
					sql1+="and huaren like '%"+type+"%'";
					
					if(city!=null && !"".equals(city)){
						sql+="project_city like '%"+city+"%'";
						j=1;
					}
					if(type!=null && !"".equals(type)){
						if(j==1){
							sql+="and project_type like '%"+type+"%'";
						}
						else{
							sql+="project_type like '%"+type+"%'";
							j=1;
						}
					}
					if(minimumprice!=null && !"".equals(minimumprice)){
						if(j==1){
							sql+="and project_min_price like '%"+minimumprice+"%'";
						}
						else{
							sql+="project_min_price like '%"+minimumprice+"%'";
							j=1;
						}
					}
					if(maximumprice!=null && !"".equals(maximumprice)){
						if(j==1){
							sql+="and project_high_price like '%"+maximumprice+"%'";
						}
						else{
							sql+="project_high_price like '%"+maximumprice+"%'";
							j=1;
						}
					}
					if(j==0){
						sql+= "project_num in (" +sql1+ ")";
					}
					
				}
				else{
					sql1+="huaren like '%"+huaren+"%'";
					if(city!=null && !"".equals(city)){
						sql+="project_city like '%"+city+"%'";
						j=1;
					}
					if(type!=null && !"".equals(type)){
						if(j==1){
							sql+="and project_type like '%"+type+"%'";
						}
						else{
							sql+="project_type like '%"+type+"%'";
							j=1;
						}
					}
					if(minimumprice!=null && !"".equals(minimumprice)){
						if(j==1){
							sql+="and project_min_price like '%"+minimumprice+"%'";
						}
						else{
							sql+="project_min_price like '%"+minimumprice+"%'";
							j=1;
						}
					}
					if(maximumprice!=null && !"".equals(maximumprice)){
						if(j==1){
							sql+="and project_high_price like '%"+maximumprice+"%'";
						}
						else{
							sql+="project_high_price like '%"+maximumprice+"%'";
							j=1;
						}
					}
					if(j==0){
						sql+= "project_num in (" +sql1+ ")";
					}
					i=1;
				}
			}
			
			if(remen!=null &&!"".equals(remen)){
				if(i==1){
					sql1+="and remen like '%"+remen+"%'";
					if(city!=null && !"".equals(city)){
						sql+="project_city like '%"+city+"%'";
						j=1;
					}
					if(type!=null && !"".equals(type)){
						if(j==1){
							sql+="and project_type like '%"+type+"%'";
						}
						else{
							sql+="project_type like '%"+type+"%'";
							j=1;
						}
					}
					if(minimumprice!=null && !"".equals(minimumprice)){
						if(j==1){
							sql+="and project_min_price like '%"+minimumprice+"%'";
						}
						else{
							sql+="project_min_price like '%"+minimumprice+"%'";
							j=1;
						}
					}
					if(maximumprice!=null && !"".equals(maximumprice)){
						if(j==1){
							sql+="and project_high_price like '%"+maximumprice+"%'";
						}
						else{
							sql+="project_high_price like '%"+maximumprice+"%'";
							j=1;
						}
					}
				
				}
				else{
					sql1+="remen like '%"+remen+"%'";
					if(city!=null && !"".equals(city)){
						sql+="project_city like '%"+city+"%'";
						j=1;
					}
					if(type!=null && !"".equals(type)){
						if(j==1){
							sql+="and project_type like '%"+type+"%'";
						}
						else{
							sql+="project_type like '%"+type+"%'";
							j=1;
						}
					}
					if(minimumprice!=null && !"".equals(minimumprice)){
						if(j==1){
							sql+="and project_min_price like '%"+minimumprice+"%'";
						}
						else{
							sql+="project_min_price like '%"+minimumprice+"%'";
							j=1;
						}
					}
					if(maximumprice!=null && !"".equals(maximumprice)){
						if(j==1){
							sql+="and project_high_price like '%"+maximumprice+"%'";
						}
						else{
							sql+="project_high_price like '%"+maximumprice+"%'";
							j=1;
						}
					}
					if(j==0){
						sql+= "project_num in (" +sql1+ ")";
					}
					i=1;
				}
			}
			if(xuequ!=null &&!"".equals(xuequ)){
				if(i==1){
					sql1+="and xuequ like '%"+xuequ+"%'";
					if(city!=null && !"".equals(city)){
						sql+="project_city like '%"+city+"%'";
						j=1;
					}
					if(type!=null && !"".equals(type)){
						if(j==1){
							sql+="and project_type like '%"+type+"%'";
						}
						else{
							sql+="project_type like '%"+type+"%'";
							j=1;
						}
					}
					if(minimumprice!=null && !"".equals(minimumprice)){
						if(j==1){
							sql+="and project_min_price like '%"+minimumprice+"%'";
						}
						else{
							sql+="project_min_price like '%"+minimumprice+"%'";
							j=1;
						}
					}
					if(maximumprice!=null && !"".equals(maximumprice)){
						if(j==1){
							sql+="and project_high_price like '%"+maximumprice+"%'";
						}
						else{
							sql+="project_high_price like '%"+maximumprice+"%'";
							j=1;
						}
					}
				}
				else{
					sql1+="xuequ like '%"+xuequ+"%'";
					if(city!=null && !"".equals(city)){
						sql+="project_city like '%"+city+"%'";
						j=1;
					}
					if(type!=null && !"".equals(type)){
						if(j==1){
							sql+="and project_type like '%"+type+"%'";
						}
						else{
							sql+="project_type like '%"+type+"%'";
							j=1;
						}
					}
					if(minimumprice!=null && !"".equals(minimumprice)){
						if(j==1){
							sql+="and project_min_price like '%"+minimumprice+"%'";
						}
						else{
							sql+="project_min_price like '%"+minimumprice+"%'";
							j=1;
						}
					}
					if(maximumprice!=null && !"".equals(maximumprice)){
						if(j==1){
							sql+="and project_high_price like '%"+maximumprice+"%'";
						}
						else{
							sql+="project_high_price like '%"+maximumprice+"%'";
							j=1;
						}
					}
					if(j==0){
						sql+= "project_num in (" +sql1+ ")";
					}
					i=1;
				}
			}
			if(baozu!=null &&!"".equals(baozu)){
				if(i==1){
					sql+="and baozu like '%"+baozu+"%'";
					if(city!=null && !"".equals(city)){
						sql+="project_city like '%"+city+"%'";
						j=1;
					}
					if(type!=null && !"".equals(type)){
						if(j==1){
							sql+="and project_type like '%"+type+"%'";
						}
						else{
							sql+="project_type like '%"+type+"%'";
							j=1;
						}
					}
					if(minimumprice!=null && !"".equals(minimumprice)){
						if(j==1){
							sql+="and project_min_price like '%"+minimumprice+"%'";
						}
						else{
							sql+="project_min_price like '%"+minimumprice+"%'";
							j=1;
						}
					}
					if(maximumprice!=null && !"".equals(maximumprice)){
						if(j==1){
							sql+="and project_high_price like '%"+maximumprice+"%'";
						}
						else{
							sql+="project_high_price like '%"+maximumprice+"%'";
							j=1;
						}
					}
				}
				else{
					sql1+="baozu like '%"+baozu+"%'";
					if(city!=null && !"".equals(city)){
						sql+="project_city like '%"+city+"%'";
						j=1;
					}
					if(type!=null && !"".equals(type)){
						if(j==1){
							sql+="and project_type like '%"+type+"%'";
						}
						else{
							sql+="project_type like '%"+type+"%'";
							j=1;
						}
					}
					if(minimumprice!=null && !"".equals(minimumprice)){
						if(j==1){
							sql+="and project_min_price like '%"+minimumprice+"%'";
						}
						else{
							sql+="project_min_price like '%"+minimumprice+"%'";
							j=1;
						}
					}
					if(maximumprice!=null && !"".equals(maximumprice)){
						if(j==1){
							sql+="and project_high_price like '%"+maximumprice+"%'";
						}
						else{
							sql+="project_high_price like '%"+maximumprice+"%'";
							j=1;
						}
					}
					if(j==0){
						sql+= "project_num in (" +sql1+ ")";
					}
					i=1;
				}
			}
			if(daxue!=null &&!"".equals(daxue)){
				if(i==1){
					sql1+="and daxue like '%"+daxue+"%'";
					if(city!=null && !"".equals(city)){
						sql+="project_city like '%"+city+"%'";
						j=1;
					}
					if(type!=null && !"".equals(type)){
						if(j==1){
							sql+="and project_type like '%"+type+"%'";
						}
						else{
							sql+="project_type like '%"+type+"%'";
							j=1;
						}
					}
					if(minimumprice!=null && !"".equals(minimumprice)){
						if(j==1){
							sql+="and project_min_price like '%"+minimumprice+"%'";
						}
						else{
							sql+="project_min_price like '%"+minimumprice+"%'";
							j=1;
						}
					}
					if(maximumprice!=null && !"".equals(maximumprice)){
						if(j==1){
							sql+="and project_high_price like '%"+maximumprice+"%'";
						}
						else{
							sql+="project_high_price like '%"+maximumprice+"%'";
							j=1;
						}
					}
				}
				else{
					sql1+="daxue like '%"+daxue+"%'";
					if(city!=null && !"".equals(city)){
						sql+="project_city like '%"+city+"%'";
						j=1;
					}
					if(type!=null && !"".equals(type)){
						if(j==1){
							sql+="and project_type like '%"+type+"%'";
						}
						else{
							sql+="project_type like '%"+type+"%'";
							j=1;
						}
					}
					if(minimumprice!=null && !"".equals(minimumprice)){
						if(j==1){
							sql+="and project_min_price like '%"+minimumprice+"%'";
						}
						else{
							sql+="project_min_price like '%"+minimumprice+"%'";
							j=1;
						}
					}
					if(maximumprice!=null && !"".equals(maximumprice)){
						if(j==1){
							sql+="and project_high_price like '%"+maximumprice+"%'";
						}
						else{
							sql+="project_high_price like '%"+maximumprice+"%'";
							j=1;
						}
					}
					if(j==0){
						sql+= "project_num in (" +sql1+ ")";
					}
					i=1;
				}
			}
			if(center!=null &&!"".equals(center)){
				if(i==1){
					sql1+="and center like '%"+center+"%'";
					if(city!=null && !"".equals(city)){
						sql+="project_city like '%"+city+"%'";
						j=1;
					}
					if(type!=null && !"".equals(type)){
						if(j==1){
							sql+="and project_type like '%"+type+"%'";
						}
						else{
							sql+="project_type like '%"+type+"%'";
							j=1;
						}
					}
					if(minimumprice!=null && !"".equals(minimumprice)){
						if(j==1){
							sql+="and project_min_price like '%"+minimumprice+"%'";
						}
						else{
							sql+="project_min_price like '%"+minimumprice+"%'";
							j=1;
						}
					}
					if(maximumprice!=null && !"".equals(maximumprice)){
						if(j==1){
							sql+="and project_high_price like '%"+maximumprice+"%'";
						}
						else{
							sql+="project_high_price like '%"+maximumprice+"%'";
							j=1;
						}
					}
				}
				else{
					sql1+="center like '%"+center+"%'";
					if(city!=null && !"".equals(city)){
						sql+="project_city like '%"+city+"%'";
						j=1;
					}
					if(type!=null && !"".equals(type)){
						if(j==1){
							sql+="and project_type like '%"+type+"%'";
						}
						else{
							sql+="project_type like '%"+type+"%'";
							j=1;
						}
					}
					if(minimumprice!=null && !"".equals(minimumprice)){
						if(j==1){
							sql+="and project_min_price like '%"+minimumprice+"%'";
						}
						else{
							sql+="project_min_price like '%"+minimumprice+"%'";
							j=1;
						}
					}
					if(maximumprice!=null && !"".equals(maximumprice)){
						if(j==1){
							sql+="and project_high_price like '%"+maximumprice+"%'";
						}
						else{
							sql+="project_high_price like '%"+maximumprice+"%'";
							j=1;
						}
					}
					if(j==0){
						sql+= "project_num in (" +sql1+ ")";
					}
					i=1;
				}
			}
			if(traffic!=null &&!"".equals(traffic)){
				if(i==1){
					sql1+="and traffic like '%"+traffic+"%'";
					if(city!=null && !"".equals(city)){
						sql+="project_city like '%"+city+"%'";
						j=1;
					}
					if(type!=null && !"".equals(type)){
						if(j==1){
							sql+="and project_type like '%"+type+"%'";
						}
						else{
							sql+="project_type like '%"+type+"%'";
							j=1;
						}
					}
					if(minimumprice!=null && !"".equals(minimumprice)){
						if(j==1){
							sql+="and project_min_price like '%"+minimumprice+"%'";
						}
						else{
							sql+="project_min_price like '%"+minimumprice+"%'";
							j=1;
						}
					}
					if(maximumprice!=null && !"".equals(maximumprice)){
						if(j==1){
							sql+="and project_high_price like '%"+maximumprice+"%'";
						}
						else{
							sql+="project_high_price like '%"+maximumprice+"%'";
							j=1;
						}
					}
				}
				else{
					sql1+="traffic like '%"+traffic+"%'";
					if(city!=null && !"".equals(city)){
						sql+="project_city like '%"+city+"%'";
						j=1;
					}
					if(type!=null && !"".equals(type)){
						if(j==1){
							sql+="and project_type like '%"+type+"%'";
						}
						else{
							sql+="project_type like '%"+type+"%'";
							j=1;
						}
					}
					if(minimumprice!=null && !"".equals(minimumprice)){
						if(j==1){
							sql+="and project_min_price like '%"+minimumprice+"%'";
						}
						else{
							sql+="project_min_price like '%"+minimumprice+"%'";
							j=1;
						}
					}
					if(maximumprice!=null && !"".equals(maximumprice)){
						if(j==1){
							sql+="and project_high_price like '%"+maximumprice+"%'";
						}
						else{
							sql+="project_high_price like '%"+maximumprice+"%'";
							j=1;
						}
					}
					if(j==0){
						sql+= "project_num in (" +sql1+ ")";
					}
					i=1;
				}
			}
			if(xianfang!=null &&!"".equals(xianfang)){
				if(i==1){
					sql1+="and xianfang like '%"+xianfang+"%'";
					if(city!=null && !"".equals(city)){
						sql+="project_city like '%"+city+"%'";
						j=1;
					}
					if(type!=null && !"".equals(type)){
						if(j==1){
							sql+="and project_type like '%"+type+"%'";
						}
						else{
							sql+="project_type like '%"+type+"%'";
							j=1;
						}
					}
					if(minimumprice!=null && !"".equals(minimumprice)){
						if(j==1){
							sql+="and project_min_price like '%"+minimumprice+"%'";
						}
						else{
							sql+="project_min_price like '%"+minimumprice+"%'";
							j=1;
						}
					}
					if(maximumprice!=null && !"".equals(maximumprice)){
						if(j==1){
							sql+="and project_high_price like '%"+maximumprice+"%'";
						}
						else{
							sql+="project_high_price like '%"+maximumprice+"%'";
							j=1;
						}
					}
				}
				else{
					sql1+="xianfang like '%"+xianfang+"%'";
					if(city!=null && !"".equals(city)){
						sql+="project_city like '%"+city+"%'";
						j=1;
					}
					if(type!=null && !"".equals(type)){
						if(j==1){
							sql+="and project_type like '%"+type+"%'";
						}
						else{
							sql+="project_type like '%"+type+"%'";
							j=1;
						}
					}
					if(minimumprice!=null && !"".equals(minimumprice)){
						if(j==1){
							sql+="and project_min_price like '%"+minimumprice+"%'";
						}
						else{
							sql+="project_min_price like '%"+minimumprice+"%'";
							j=1;
						}
					}
					if(maximumprice!=null && !"".equals(maximumprice)){
						if(j==1){
							sql+="and project_high_price like '%"+maximumprice+"%'";
						}
						else{
							sql+="project_high_price like '%"+maximumprice+"%'";
							j=1;
						}
					}
					if(j==0){
						sql+= "project_num in (" +sql1+ ")";
					}
					i=1;
				}
			}
			if(maidi!=null &&!"".equals(maidi)){
				if(i==1){
					sql1+="and maidi like '%"+maidi+"%'";
					if(city!=null && !"".equals(city)){
						sql+="project_city like '%"+city+"%'";
						j=1;
					}
					if(type!=null && !"".equals(type)){
						if(j==1){
							sql+="and project_type like '%"+type+"%'";
						}
						else{
							sql+="project_type like '%"+type+"%'";
							j=1;
						}
					}
					if(minimumprice!=null && !"".equals(minimumprice)){
						if(j==1){
							sql+="and project_min_price like '%"+minimumprice+"%'";
						}
						else{
							sql+="project_min_price like '%"+minimumprice+"%'";
							j=1;
						}
					}
					if(maximumprice!=null && !"".equals(maximumprice)){
						if(j==1){
							sql+="and project_high_price like '%"+maximumprice+"%'";
						}
						else{
							sql+="project_high_price like '%"+maximumprice+"%'";
							j=1;
						}
					}
				}
				else{
					sql1+="maidi like '%"+maidi+"%'";
					if(city!=null && !"".equals(city)){
						sql+="project_city like '%"+city+"%'";
						j=1;
					}
					if(type!=null && !"".equals(type)){
						if(j==1){
							sql+="and project_type like '%"+type+"%'";
						}
						else{
							sql+="project_type like '%"+type+"%'";
							j=1;
						}
					}
					if(minimumprice!=null && !"".equals(minimumprice)){
						if(j==1){
							sql+="and project_min_price like '%"+minimumprice+"%'";
						}
						else{
							sql+="project_min_price like '%"+minimumprice+"%'";
							j=1;
						}
					}
					if(maximumprice!=null && !"".equals(maximumprice)){
						if(j==1){
							sql+="and project_high_price like '%"+maximumprice+"%'";
						}
						else{
							sql+="project_high_price like '%"+maximumprice+"%'";
							j=1;
						}
					}
					if(j==0){
						sql+= "project_num in (" +sql1+ ")";
					}
					i=1;
				}
			}
			
			if(i == 0){
				sql = "select * from house_project where ";
				if(city!=null && !"".equals(city)){
					sql+="project_city like '%"+city+"%'";
					j=1;
				}
				if(type!=null && !"".equals(type)){
					if(j==1){
						sql+="and project_type like '%"+type+"%'";
					}
					else{
						sql+="project_type like '%"+type+"%'";
						j=1;
					}
				}
				if(minimumprice!=null && !"".equals(minimumprice)){
					if(j==1){
						sql+="and project_min_price like '%"+minimumprice+"%'";
					}
					else{
						sql+="project_min_price like '%"+minimumprice+"%'";
						j=1;
					}
				}
				if(maximumprice!=null && !"".equals(maximumprice)){
					if(j==1){
						sql+="and project_high_price like '%"+maximumprice+"%'";
					}
					else{
						sql+="project_high_price like '%"+maximumprice+"%'";
						j=1;
					}
				}
				if(j==0){
					sql = "select * from house_project";
				}
			}
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
		    while(rs.next()){
		    	HouseProject projectInfo = new HouseProject();
				projectInfo.setProject_name(rs.getString("project_name"));
				projectInfo.setProject_img(rs.getString("project_img"));
				projectInfo.setProject_nation(rs.getString("project_nation"));
				projectInfo.setProject_address(rs.getString("project_address"));
				projectInfo.setProject_area(rs.getString("project_area"));
				projectInfo.setProject_price_qi(rs.getString("project_price_qi"));
				projectInfo.setProject_type(rs.getString("project_type"));
				projectInfo.setProject_sales_remain(rs.getInt("project_sales_remain"));
				projectInfo.setProject_finish_time(rs.getTimestamp("project_finish_time"));
				projectInfo.setProject_desc(rs.getString("project_desc"));
				projectInfo.setProject_city(rs.getString("project_city"));
				projectInfo.setProject_house_type(rs.getString("project_house_type"));
				projectInfo.setProject_high(rs.getString("project_high"));
				projectInfo.setProject_price(rs.getString("project_price"));
				projectInfo.setProject_lan_cn(rs.getString("project_lan_cn"));
				projectInfo.setProject_lan_en(rs.getString("project_lan_en"));
				projectInfo.setProject_num(rs.getString("project_num"));
				projectInfo.setProject_vedio(rs.getString("project_vedio"));
				projectInfo.setProject_zhou(rs.getString("project_zhou"));
				projectInfo.setArea_qujian(rs.getString("area_qujian"));
				projectInfo.setGps(rs.getString("gps"));
				projectInfo.setReturn_money(rs.getString("return_money"));
				projectInfo.setDeveloper_id(rs.getInt("developer_id"));
				projectInfo.setProject_high_price(rs.getString("project_high_price"));
				projectInfo.setProject_min_price(rs.getString("project_min_price"));
				projectInfo.setArea_id(rs.getInt("area_id"));
				projectInfo.setMianji(rs.getString("mianji"));
				projectInfo.setRecommend_id_1(rs.getInt("recommend_id_1"));
				projectInfo.setRecommend_id_2(rs.getInt("recommend_id_2"));
				projectInfo.setRecommend_id_3(rs.getInt("recommend_id_3"));
				projectInfo.setWuyefei(rs.getString("wuyefei"));
				houseProjectList.add(projectInfo);

				}
		  
			}
			catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return houseProjectList;
	} 
}
