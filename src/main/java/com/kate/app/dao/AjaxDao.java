package com.kate.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kate.app.model.BrokerInfo;
import com.kate.app.model.BuyInfo;
import com.kate.app.model.DeveloperInfo;
import com.kate.app.model.HouseInfo;
import com.kate.app.model.HouseProject;
import com.kate.app.model.InvestmentData;
import com.kate.app.model.MyInfo;
import com.kate.app.model.NewsInfo;


	@Repository 
	public class AjaxDao extends BaseDao{
		public List<InvestmentData> select(){
			List<InvestmentData> list = new ArrayList<InvestmentData>();
			try{
				String sql = " select * from investment_data";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					InvestmentData data = new InvestmentData();
					data.setId(rs.getInt("id"));
					data.setData_exam(rs.getString("data_exam"));
					data.setMiddle_price(rs.getInt("middle_price"));
					data.setMiddle_zu_price(rs.getInt("middle_zu_price"));
					data.setPrice_review(rs.getString("price_review"));
					data.setYear_increment_rate(rs.getInt("year_increment_rate"));
					data.setZu_house_rate(rs.getInt("zu_house_rate"));
					data.setZu_xuqiu(rs.getString("zu_xuqiu"));
					data.setHouse_pro_id(rs.getInt("house_pro_id"));
					list.add(data);
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return list;
		}
		
		
		public List<BrokerInfo> selectBrokerInfo(){
			List<BrokerInfo> list = new ArrayList<BrokerInfo>();
			try{
				String sql = " select * from broker_info";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					BrokerInfo data = new BrokerInfo();
					data.setId(rs.getInt("id"));
					data.setBroker_name(rs.getString("broker_name"));
					data.setBroker_language(rs.getString("broker_language"));
					data.setBroker_language(rs.getString("broker_region"));
					data.setBroker_img(rs.getString("broker_img"));
					list.add(data);
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return list;
		}
		
		
		
		public List<HouseInfo> selectHouseInfo(){    //���ҷ�����Ϣ
			List<HouseInfo> list = new ArrayList<HouseInfo>();
			try{
				String sql = " select * from house_info";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					HouseInfo house = new HouseInfo();
					house.setId(rs.getInt("id"));
					house.setHouse_name(rs.getString("house_name"));
					house.setHouse_img(rs.getString("house_img"));
					house.setHouse_detail_add(rs.getString("house_detail_add"));
					house.setHouse_price(rs.getString("house_price"));
					house.setHouse_room_num(rs.getInt("house_room_num"));
					house.setHouse_room_size(rs.getInt("house_room_size"));
					house.setHouse_bath_num(rs.getInt("house_bath_num"));
					house.setHouse_bath_size(rs.getInt("house_bath_size"));
					house.setHouse_price_area(rs.getInt("house_price_area"));
					house.setHouse_size_in(rs.getInt("house_size"));
					house.setHouse_city(rs.getString("house_city"));
					house.setHouse_type(rs.getString("house_type"));
					house.setHouse_toilet_num(rs.getInt("house_toilet_num"));
					house.setHouse_toilet_size(rs.getInt("house_toilet_size"));
					house.setHouse_project_id(rs.getInt("house_project_id"));
					list.add(house);
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return list;
		}
		public List<BuyInfo> selectBuyInfo(int proId){    //һ����Ŀ��Ӧһ��
			List<BuyInfo> list = new ArrayList<BuyInfo>();
			try{
				String sql = " select * from buy_info where house_pro_id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, proId);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()){
					BuyInfo data = new BuyInfo();
					data.setId(rs.getInt("id"));
					data.setFirst_money(rs.getInt("first_money"));
					data.setLawyer_fee(rs.getInt("lawyer_fee"));
					data.setReturn_money(rs.getInt("return_money"));
					data.setStamp_tax(rs.getInt("stamp_tax"));
					list.add(data);
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return list;
		}

		public List<HouseProject> selectHouseProject(){    //���ҷ�����Ϣ
			List<HouseProject> list = new ArrayList<HouseProject>();
			try{
				String sql = " select * from house_project";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					HouseProject projectInfo = new HouseProject();
					projectInfo.setId(rs.getInt("id"));
					projectInfo.setProject_name(rs.getString("project_name"));
					projectInfo.setProject_img(rs.getString("project_img"));
					projectInfo.setProject_nation(rs.getString("project_nation"));
					projectInfo.setProject_address(rs.getString("project_address"));
					projectInfo.setProject_area(rs.getString("project_area"));
					projectInfo.setProject_price_qi(rs.getInt("project_price_qi"));
					projectInfo.setProject_type(rs.getString("project_type"));
					projectInfo.setProject_sales_remain(rs.getInt("project_sales_remain"));
					projectInfo.setProject_finish_time(rs.getTimestamp("project_finish_time"));
					projectInfo.setProject_desc(rs.getString("project_desc"));
					projectInfo.setProject_city(rs.getString("project_city"));
					projectInfo.setProject_house_type(rs.getString("project_house_type"));
					projectInfo.setProject_high(rs.getInt("project_high"));
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
					list.add(projectInfo);
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return list;
		}
		
		/*
		 * ��ѯ�Ƽ���Ŀ
		 */
		
		public JSONArray selectRecomProject(){    
			JSONArray array = new JSONArray();
			
			try{
				String sql = " select * from recommend_project";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					JSONObject obj = new JSONObject();
					obj.put("id", rs.getInt("id"));
					int proId = rs.getInt("house_pro_id");
					if(proId==0){
						obj.put("project_name", "");
					}
					else{
						HouseProject project = findProById(proId);
						if(project==null){
							obj.put("project_name", "");
						}
						else{
							String proName = project.getProject_name()==null?"":project.getProject_name();
							obj.put("project_name", proName);
						}
					}
					int recmId = rs.getInt("recommend_id");
					if(recmId==0){
						obj.put("recommend_project_name", "");
					}
					else{
						HouseProject re_Project = findProById(recmId);
						if(re_Project==null){
							obj.put("recommend_project_name", "");
						}
						else{
							String reName = re_Project.getProject_name()==null?"":re_Project.getProject_name();
							obj.put("recommend_project_name", reName);
						}
					}
					/*obj.put("recommend_project_desc", pro.getProject_desc());*/
					array.add(obj);
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return array;
		}
		
		/*
		 * ��ѯ�ط������ص�
		 */
		public JSONArray selectArea(){    
			JSONArray array = new JSONArray();
			try{
				String sql = " select * from area_features";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					JSONObject obj = new JSONObject();
					obj.put("id", rs.getInt("id"));
					String area = rs.getString("area_character");
					obj.put("area_character", area==null?"":area);
					HouseProject project = findProById(rs.getInt("house_project_id"));
					if(project==null){
						obj.put("project_name", "");
					}
					else{
						String proName = project.getProject_name()==null?"":project.getProject_name();
						obj.put("project_name", proName);
					}
					array.add(obj);
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return array;
		}
		
		
		
		public DeveloperInfo selectDevInfo(int id){    //���ҿ�������Ϣ
			DeveloperInfo deve = new DeveloperInfo();
			try{
				String sql = " select * from developer_info where id =?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, id);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()){
					deve.setDeveloper_desc(rs.getString("developer_desc"));
					deve.setDeveloper_logo(rs.getString("developer_logo"));
					deve.setDeveloper_name(rs.getString("developer_name"));
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return deve;
		}
		
		/*
		 * ����������Ϣ
		 */
		
		public List<NewsInfo> selectNewsInfo(){    //���ҿ�������Ϣ
			List<NewsInfo> list = new ArrayList<NewsInfo>();
			try{
				String sql = " select * from news_info";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					NewsInfo info = new NewsInfo();
					info.setId(rs.getInt("id"));
					info.setDetail(rs.getString("detail"));
					info.setHouse_pro_id(rs.getInt("house_pro_id"));
					info.setNews_img(rs.getString("news_img"));
					info.setSource(rs.getString("source"));
					info.setTime(rs.getTimestamp("time"));
					info.setTitle(rs.getString("title"));
					list.add(info);
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return list;
		}
		
		
		
	       public int count(){
				int count = 0;
				try{
					String sql = " select count(*) from investment_data";
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					while(rs.next()){
						count = rs.getInt(1);
					}
				}catch (Exception e) {
		            e.printStackTrace();
		        }
				return count;
			}
	       
	       public int countBrokerInfo(){
				int count = 0;
				try{
					String sql = " select count(*) from broker_info";
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					while(rs.next()){
						count = rs.getInt(1);
					}
				}catch (Exception e) {
		            e.printStackTrace();
		        }
				return count;
			}
			
			public int countHouseInfo(){
				int count = 0;
				try{
					String sql = " select count(*) from house_info where house_project_id!=0";
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					while(rs.next()){
						count = rs.getInt(1);
					}
				}catch (Exception e) {
		            e.printStackTrace();
		        }
				return count;
			}
			
			public int countHouseProject(){
				int count = 0;
				try{
					String sql = " select count(*) from house_project";
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					while(rs.next()){
						count = rs.getInt(1);
					}
				}catch (Exception e) {
		            e.printStackTrace();
		        }
				return count;
			}
			
			public int countArea(){
				int count = 0;
				try{
					String sql = " select count(*) from area_features";
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					while(rs.next()){
						count = rs.getInt(1);
					}
				}catch (Exception e) {
		            e.printStackTrace();
		        }
				return count;
			}
			
			
			/*
			 * �����Ƽ���Ŀ����
			 */
			public int countRecomendProject(){
				int count = 0;
				try{
					String sql = " select count(*) from recommend_project";
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					while(rs.next()){
						count = rs.getInt(1);
					}
				}catch (Exception e) {
		            e.printStackTrace();
		        }
				return count;
			}
			
			
			public int countNewsInfo(){
				int count = 0;
				try{
					String sql = " select count(*) from news_info";
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					while(rs.next()){
						count = rs.getInt(1);
					}
				}catch (Exception e) {
		            e.printStackTrace();
		        }
				return count;
			}
			
			
		/*public HouseProject findProByName(String proName){    //ͨ�����Ʋ�����Ŀ��Ϣ
			HouseProject projectInfo = new HouseProject();
			try{
				String sql = " select * from house_project where project_name= ?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, proName);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()){
					projectInfo.setId(rs.getInt("id"));
					projectInfo.setProject_area(rs.getInt("project_area"));
					projectInfo.setDeveloper_id(rs.getInt("developer_id"));
					projectInfo.setProject_desc(rs.getString("project_desc"));
					projectInfo.setProject_address(rs.getString("project_address"));
					projectInfo.setProject_img(rs.getString("project_img"));
					projectInfo.setProject_city(rs.getString("project_city"));
					projectInfo.setProject_house_type(rs.getString("project_house_type"));
					projectInfo.setProject_lan(rs.getString("project_lan"));
					projectInfo.setProject_nation(rs.getString("project_nation"));
					projectInfo.setProject_price_avg(rs.getInt("project_price_avg"));
					projectInfo.setProject_type(rs.getString("project_type"));
					projectInfo.setProject_sales_remain(rs.getInt("project_sales_remain"));
					projectInfo.setProject_finish_time(rs.getTimestamp("project_finish_time"));
					projectInfo.setProject_high(rs.getInt("project_high"));
					projectInfo.setProject_peitao_img(rs.getString("project_peitao_img"));
					projectInfo.setProject_price(rs.getString("project_price"));
				}
				
			}catch (Exception e) {
	            e.printStackTrace();
	        }finally{
	        	con.close();
	        }
			return projectInfo;
		}*/
		
		public HouseProject findProById(int id){    //ͨ�����������Ŀ��Ϣ
			HouseProject projectInfo = new HouseProject();
			try{
				String sql = " select * from house_project where id= ?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, id);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()){
					projectInfo.setProject_name(rs.getString("project_name"));
					projectInfo.setProject_img(rs.getString("project_img"));
					projectInfo.setProject_nation(rs.getString("project_nation"));
					projectInfo.setProject_address(rs.getString("project_address"));
					projectInfo.setProject_area(rs.getString("project_area"));
					projectInfo.setProject_price_qi(rs.getInt("project_price_qi"));
					projectInfo.setProject_type(rs.getString("project_type"));
					projectInfo.setProject_sales_remain(rs.getInt("project_sales_remain"));
					projectInfo.setProject_finish_time(rs.getTimestamp("project_finish_time"));
					projectInfo.setProject_desc(rs.getString("project_desc"));
					projectInfo.setProject_city(rs.getString("project_city"));
					projectInfo.setProject_house_type(rs.getString("project_house_type"));
					projectInfo.setProject_high(rs.getInt("project_high"));
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
				}
				
			}catch (Exception e) {
	            e.printStackTrace();
	        }/*finally{
	        	con.close();
	        }*/
			return projectInfo;
		}
			

		public boolean addTouziData(int middle_price, int middle_zu_price, int price_review, int year_increment_rate, int zu_house_rate, String zu_xuqiu,String data_exam, int house_pro_id) throws SQLException{
			boolean flag = true;
			
			try{
				String sql = " insert into investment_data(year_increment_rate, middle_price, middle_zu_price, zu_house_rate, zu_xuqiu, price_review, data_exam, house_pro_id) values(?,?,?,?,?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, year_increment_rate);
				pstmt.setInt(2, middle_price);
				pstmt.setInt(3, middle_zu_price);
				pstmt.setInt(4, zu_house_rate);
				pstmt.setString(5, zu_xuqiu);
				pstmt.setInt(6, price_review);
				pstmt.setString(7, data_exam);
				pstmt.setInt(8, house_pro_id);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }/*finally{
	        	con.close();
	        }*/
			return flag;
	        
		}
		
		
		/*
		 * ���ӵط������ص�
		 */
		public boolean addArea(String area_character, int proId) throws SQLException{
			boolean flag = true;
			try{
				String sql = " insert into area_features(area_character, house_project_id) values(?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, area_character);
				pstmt.setInt(2, proId);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return flag;
		}
		/*
		 * �޸ĵط������ص�
		 */
		public boolean editArea(int id, String area_character, int proId) throws SQLException{
			boolean flag = true;
			try{
				String sql = " update area_features set area_character=?, house_project_id=? where id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, area_character);
				pstmt.setInt(2, proId);
				pstmt.setInt(3, id);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return flag;
		}
		
		/*
		 * ɾ���ط������ص�
		 */
		public boolean deleteArea(int id) throws SQLException{
			boolean flag = true;
			try{
					String sql = " delete from area_features where id= ?";
					PreparedStatement pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, id);
					int result = pstmt.executeUpdate();
					if(result == 0){
						flag = false;
					}
				}catch (Exception e) {
		            e.printStackTrace();
		        }/*finally{
		        	con.close();
		        }*/
				return flag;
		}
		
		
		
		/*
		 * �����Ƽ���Ŀ
		 */
		public boolean addRecoProject(int recomendId, int proId) throws SQLException{
			boolean flag = true;
			try{
				String sql = " insert into recommend_project(recommend_id, house_pro_id) values(?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, recomendId);
				pstmt.setInt(2, proId);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }/*finally{
	        	con.close();
	        }*/
			return flag;
	        
		}
		/*
		 * �޸��Ƽ���Ŀ
		 */
		public boolean editRecoProject(int id, int recomendId, int proId) throws SQLException{
			boolean flag = true;
			try{
				String sql = " update recommend_project set recommend_id=?, house_pro_id=? where id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, recomendId);
				pstmt.setInt(2, proId);
				pstmt.setInt(3, id);
				
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }/*finally{
	        	con.close();
	        }*/
			return flag;
	        
		}
		public boolean addNewsInfo(String title, String source, String time, String detail, String news_img, int house_pro_id) throws SQLException{
			boolean flag = true;
			String time_str = "";
			Timestamp ts = new Timestamp(System.currentTimeMillis()); 
			if(time==null||"".equals(time)){
				time = "2015-05-09";
			}
	        try {   
	        	time_str = time+" "+"00:00:00";
	            ts = Timestamp.valueOf(time_str);   
	            System.out.println(ts);   
	        } catch (Exception e) {   
	            e.printStackTrace();   
	        }  
			try{
				String sql = " insert into news_info(title, source, time, detail, news_img, house_pro_id) values(?,?,?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, title);
				pstmt.setString(2, source);
				pstmt.setString(3, time_str);
				pstmt.setString(4, detail);
				pstmt.setString(5, news_img);
				pstmt.setInt(6, house_pro_id);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return flag;
	        
		}
		
		public boolean editNewsInfo(int id, String title, String source, String time, String detail, String news_img, int house_pro_id) throws SQLException{
			boolean flag = true;
			String time_str = "";
			Timestamp ts = new Timestamp(System.currentTimeMillis()); 
			if(time==null||"".equals(time)){
				time = "2015-05-09";
			}
	        try {   
	        	time_str = time+" "+"00:00:00";
	            ts = Timestamp.valueOf(time_str);   
	            System.out.println(ts);   
	        } catch (Exception e) {   
	            e.printStackTrace();   
	        }  
			try{
				String sql = " update news_info set title=?, source=?, time=?, detail=?, news_img=?, house_pro_id=? where id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, title);
				pstmt.setString(2, source);
				pstmt.setString(3, time_str);
				pstmt.setString(4, detail);
				pstmt.setString(5, news_img);
				pstmt.setInt(6, house_pro_id);
				pstmt.setInt(7, id);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return flag;
	        
		}
		
		
		
		public boolean addHouseInfo(String house_type, int house_room_num, int house_toilet_num, int house_size, String house_price, String house_img, int house_pro_id) throws SQLException{
			boolean flag = true;
			
			try{
				String sql = " insert into house_info(house_type, house_room_num, house_toilet_num, house_size, house_price, house_img, house_project_id) values(?,?,?,?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, house_type);
				pstmt.setInt(2, house_room_num);
				pstmt.setInt(3, house_toilet_num);
				pstmt.setInt(4, house_size);
				pstmt.setString(5, house_price);
				pstmt.setString(6, house_img);
				pstmt.setInt(7, house_pro_id);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }/*finally{
	        	con.close();
	        }*/
			return flag;
	        
		}
		/*
		 * ���ӿ�������Ϣ
		 */
		public boolean addDeveInfo(String developer_name, String developer_logo, String developer_desc) throws SQLException{
			boolean flag = true;
			try{
				String sql = " insert into developer_info(developer_name, developer_logo, developer_desc) values(?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, developer_name);
				pstmt.setString(2, developer_logo);
				pstmt.setString(3, developer_desc);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }/*finally{
	        	con.close();
	        }*/
			return flag;
	        
		}
		
		
		/*
		 * ���ӿ�������Ϣ
		 */
		public boolean addBrokerInfo(String broker_name, String broker_language, String broker_region, String broker_img) throws SQLException{
			boolean flag = true;
			try{
				String sql = " insert into broker_info(broker_name, broker_language, broker_region, broker_img) values(?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, broker_name);
				pstmt.setString(2, broker_language);
				pstmt.setString(3, broker_region);
				pstmt.setString(4, broker_img);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }/*finally{
	        	con.close();
	        }*/
			return flag;
	        
		}
		
		
		
		public boolean editHouseInfo(int id, String house_type, int house_room_num, int house_toilet_num, int house_size, String house_price, String house_img, int house_pro_id) throws SQLException{
			boolean flag = true;
			try{
				String sql = " update house_info set house_type=?, house_room_num=?, house_toilet_num=?, house_size=?, house_price=?, house_img=?, house_project_id=? where id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, house_type);
				pstmt.setInt(2, house_room_num);
				pstmt.setInt(3, house_toilet_num);
				pstmt.setInt(4, house_size);
				pstmt.setString(5, house_price);
				pstmt.setString(6, house_img);
				pstmt.setInt(7, house_pro_id);
				pstmt.setInt(8, id);
				
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }/*finally{
	        	con.close();
	        }*/
			return flag;
	        
		}
		
		
		public boolean editTouziData(int id, int middle_price, int middle_zu_price, int price_review, int year_increment_rate, int zu_house_rate, String zu_xuqiu,String data_exam, int proId) throws SQLException{
			boolean flag = true;
			try{
				String sql = " update investment_data set year_increment_rate=?, middle_price=?, middle_zu_price=?, zu_house_rate=?, zu_xuqiu=?, price_review=?, data_exam=?, house_pro_id=? where id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, year_increment_rate);
				pstmt.setInt(2, middle_price);
				pstmt.setInt(3, middle_zu_price);
				pstmt.setInt(4, zu_house_rate);
				pstmt.setString(5, zu_xuqiu);
				pstmt.setInt(6, price_review);
				pstmt.setString(7, data_exam);
				pstmt.setInt(8, proId);
				pstmt.setInt(9, id);
				
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }/*finally{
	        	con.close();
	        }*/
			return flag;
	        
		}
		
		
		public boolean deleteTouziData(int id){     //ɾ��Ͷ������
			boolean flag = true;
			try{
				String sql = " delete from investment_data where id= ?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, id);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }/*finally{
	        	con.close();
	        }*/
			return flag;
	        
		}
		
		public boolean deleteBrokerInfo(int id){     //ɾ��Ͷ������
			boolean flag = true;
			try{
				String sql = " delete from broker_info where id= ?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, id);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }/*finally{
	        	con.close();
	        }*/
			return flag;
		}
		
		
		
		public boolean deleteHouseInfo(int id){    //ɾ��������Ϣ
			boolean flag = true;
			try{
				String sql = " delete from house_info where id= ?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, id);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }/*finally{
	        	con.close();
	        }*/
			return flag;
	        
		}
		
		public boolean deleteHouseProject(int id){    //ɾ����Ŀ��Ϣ
			boolean flag = true;
			try{
				String sql = " delete  from house_project where id= ?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, id);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }/*finally{
	        	con.close();
	        }*/
			return flag;
	        
		}
		
		/*
		 * �Ƽ���Ŀɾ��
		 */
		public boolean deleteRecomHouseProject(int id){    
			boolean flag = true;
			try{
				String sql = " delete from recommend_project where id= ?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, id);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }/*finally{
	        	con.close();
	        }*/
			return flag;
		}
		
		
		
		public boolean findById(int id){
			boolean flag = false;
			try{
				String sql = " select count(*) from investment_data where house_pro_id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, id);
				ResultSet rs = pstmt.executeQuery();
				if(rs.next()){
					flag = true;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }/*finally{
	        	con.close();
	        }*/
			
			return flag;
	        
		}
		
		
		
		
		
		public boolean addPro(String project_name, String project_lan, String project_desc, String project_nation, String project_address, String project_area, int project_sales_remain, String project_finish_time, String project_city, String project_house_type, String project_price,int deve_id) throws SQLException{
			boolean flag = true;
			String time = "";
			Timestamp ts = new Timestamp(System.currentTimeMillis()); 
			if(project_finish_time==null||"".equals(project_finish_time)){
				project_finish_time = "2015-05-09";
			}
			 
	        try {  
	        	time = project_finish_time+" "+"00:00:00";
	            ts = Timestamp.valueOf(time);   
	            
	        } catch (Exception e) {   
	            e.printStackTrace();   
	        }  
			
			try{
				String sql = " insert into house_project(project_name, project_lan, project_desc, project_nation,project_address, project_area, project_sales_remain, project_finish_time,  project_city, project_house_type, project_price, developer_id) values(?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, project_name);
				pstmt.setString(2, project_lan);
				pstmt.setString(3, project_desc);
				pstmt.setString(4, project_nation);
				pstmt.setString(5, project_address);
				pstmt.setString(6, project_area);
				pstmt.setInt(7, project_sales_remain);
				pstmt.setString(8, project_finish_time);
				pstmt.setString(9, project_city);
				pstmt.setString(10, project_house_type);
				pstmt.setString(11, project_price);
				pstmt.setInt(12, deve_id);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return flag;
	        
		}
		
		
		public boolean editPro(int proid, String project_name, String project_lan, String project_desc, String project_nation, String project_address, String project_area, int project_sales_remain, String project_finish_time, String project_city, String project_house_type, String project_price, int deveId) throws SQLException{
			boolean flag = true;
			String time = "";
			Timestamp ts = new Timestamp(System.currentTimeMillis()); 
			if(project_finish_time==null||"".equals(project_finish_time)){
				project_finish_time = "2015-05-09";
			}
	        try {   
	        	time = project_finish_time+" "+"00:00:00";
	            ts = Timestamp.valueOf(time);   
	            System.out.println(ts);   
	        } catch (Exception e) {   
	            e.printStackTrace();   
	        }  
			try{
				String sql = " update house_project set project_name=?, project_lan=?, project_desc=?, project_nation=?, project_address=?, project_area=?, project_sales_remain=?, project_finish_time=?, project_city=?, project_house_type=?, project_price=?, developer_id=? where id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, project_name);
				pstmt.setString(2, project_lan);
				pstmt.setString(3, project_desc);
				pstmt.setString(4, project_nation);
				pstmt.setString(5, project_address);
				pstmt.setString(6, project_area);
				pstmt.setInt(7, project_sales_remain);
				pstmt.setString(8, project_finish_time);
				pstmt.setString(9, project_city);
				pstmt.setString(10, project_house_type);
				pstmt.setString(11, project_price);
				pstmt.setInt(12, deveId);
				pstmt.setInt(13, proid);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return flag;
	        
		}
		/*
		 * �޸Ŀ�������Ϣ
		 */
		public boolean editDeveloperInfo(int deveId, String developer_name, String developer_logo, String developer_desc) throws SQLException{
			boolean flag = true;
			try{
				String sql = " update developer_info set developer_name=?, developer_logo=?, developer_desc=? where id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, developer_name);
				pstmt.setString(2, developer_logo);
				pstmt.setString(3, developer_desc);
				pstmt.setInt(4, deveId);
	
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return flag;  
		}
		
		
		
		/*
		 * �޸Ŀ�������Ϣ
		 */
		public boolean editBrokerInfo(int id, String broker_name, String broker_language, String broker_region, String broker_img) throws SQLException{
			boolean flag = true;
			try{
				String sql = " update broker_info set broker_name=?, broker_language=?, broker_region=?, broker_img=? where id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, broker_name);
				pstmt.setString(2, broker_language);
				pstmt.setString(3, broker_region);
				pstmt.setString(4, broker_img);
				pstmt.setInt(5, id);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return flag;  
		}
		
		
		
		public boolean deletePro(int proid) throws SQLException{
			boolean flag = true;
			try{
				String sql = " delete from house_project where id= ?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, proid);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return flag;
	        
		}
		
		
		public boolean deleteNewsInfo(int id) throws SQLException{
			boolean flag = true;
			try{
				String sql = " delete from news_info where id= ?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, id);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return flag;
	        
		}
		
		
		public int findProByName(String name) throws SQLException{   //ͨ�����Ʋ���id
			HouseProject projectInfo = new HouseProject();
			try{
				String sql = " select id from house_project where project_name= ?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, name);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()){
					projectInfo.setId(rs.getInt("id"));
				}
				
			}catch (Exception e) {
	            e.printStackTrace();
	        }/*finally{
	        	con.close();
	        }*/
			return projectInfo.getId();
	        
		}
		/*
		 * ͨ�����������Ʋ���id
		 */
		public int findDeveByName(String name) throws SQLException{   //ͨ�����Ʋ���id
			DeveloperInfo developerInfo = new DeveloperInfo();
			try{
				String sql = " select id from developer_info where developer_name= ?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, name);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()){
					developerInfo.setId(rs.getInt("id"));
				}
				
			}catch (Exception e) {
	            e.printStackTrace();
	        }/*finally{
	        	con.close();
	        }*/
			return developerInfo.getId();
	        
		}
		
		
		
}
