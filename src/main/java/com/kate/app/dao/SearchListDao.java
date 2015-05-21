package com.kate.app.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSONArray;
import com.kate.app.model.BrokerInfo;
import com.kate.app.model.SearchList;

@Repository 
public class SearchListDao extends BaseDao {
	public List<SearchList> listSearchList(){
		List<SearchList> searchInfoList=new ArrayList<SearchList>();
		try {
			String sql = "select t.id,t.project_img,t.project_num,t.project_name,t.project_sales_remain, MAX(h.house_price) as maxprice,MIN(h.house_price) as  minprice,MAX(h.house_size_in) as maxarea,Min(h.house_size_in) as minarea,b.return_money from house_project t JOIN house_info  h ON t.id=h.house_project_id  JOIN buy_info b on  b.house_pro_id=h.house_project_id GROUP BY h.house_project_id";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
		    int id=0;
		    String project_img=null;
		    String project_name=null;
		    int project_sales_remain=0;
		    int maxPrice=0;
		    int minprice=0;
		    int maxarea=0;
		    int minarea=0;
		    int return_money=0;
		    String project_num = "";
		    while(rs.next()){
		    	id=rs.getInt("id");
		    	
		    	project_img=rs.getString("project_img");
		    	project_name=rs.getString("project_name");
		    	project_sales_remain=rs.getInt("project_sales_remain");
		    	maxPrice=rs.getInt("maxprice");
		    	minprice=rs.getInt("minprice");
		    	maxarea=rs.getInt("maxarea");
		    	minarea=rs.getInt("minarea");
		    	return_money=rs.getInt("return_money");
		    	project_num = rs.getString("project_num");
		    	SearchList  searchList=new SearchList( id, project_num, project_img,project_name,maxPrice, minprice , maxarea,minarea, project_sales_remain, return_money );
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
	
	
}
