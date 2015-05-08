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
import com.kate.app.model.BuyInfo;
import com.kate.app.model.HouseInfo;
import com.kate.app.model.HouseProject;
import com.kate.app.model.InvestmentDate;
import com.kate.app.model.MyInfo;


	@Repository 
	public class AjaxDao extends BaseDao{
		public List<InvestmentDate> select(){
			List<InvestmentDate> list = new ArrayList<InvestmentDate>();
			try{
				String sql = " select * from investment_data";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					InvestmentDate data = new InvestmentDate();
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
		
		
		public List<HouseInfo> selectHouseInfo(){    //房屋信息
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
					house.setHouse_size(rs.getInt("house_size"));
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
		
		public List<BuyInfo> selectBuyInfo(){
			List<BuyInfo> list = new ArrayList<BuyInfo>();
			try{
				String sql = " select * from buy_info";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					BuyInfo data = new BuyInfo();
					data.setId(rs.getInt("id"));
					data.setFirst_money(rs.getInt("first_money"));
					/*data.setHouse_info_id(house_info_id)(rs.getInt("middle_price"));
					data.setMiddle_zu_price(rs.getInt("middle_zu_price"));
					data.setPrice_review(rs.getString("price_review"));
					data.setYear_increment_rate(rs.getInt("year_increment_rate"));
					data.setZu_house_rate(rs.getInt("zu_house_rate"));
					data.setZu_xuqiu(rs.getString("zu_xuqiu"));
					data.setHouse_pro_id(rs.getInt("house_pro_id"));*/
					list.add(data);
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return list;
		}
		
		
		
		public List<HouseProject> selectHouseProject(){    //项目信息
			List<HouseProject> list = new ArrayList<HouseProject>();
			try{
				String sql = " select * from house_project";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					HouseProject projectInfo = new HouseProject();
					projectInfo.setProject_name(rs.getString("project_name"));
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
					list.add(projectInfo);
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
			
			
		/*public HouseProject findProByName(String proName){    //ͨ����Ʋ�����Ŀ��Ϣ
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
		
		public HouseProject findProById(int id){    //ͨ����������Ŀ��Ϣ
			HouseProject projectInfo = new HouseProject();
			try{
				String sql = " select * from house_project where id= ?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, id);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()){
					projectInfo.setProject_name(rs.getString("project_name"));
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
		
		
		public boolean deleteTouziData(int id){     //ɾ��Ͷ�����
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
		
		public boolean deleteHouseInfo(int id){    //ɾ������Ϣ
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
		
		public boolean deleteHouseProject(int id){    //ɾ������Ϣ
			boolean flag = true;
			try{
				String sql = " delete from house_project where id= ?";
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
		
		
		public boolean addPro(String project_name, String project_lan, String project_desc, String project_nation, String project_address, String project_area, int project_sales_remain, String project_finish_time, String project_city, String project_price) throws SQLException{
			boolean flag = true;
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			try{
				Timestamp ts = new Timestamp(format.parse(project_finish_time).getTime());
			}catch(Exception e){
				e.printStackTrace();
			}
			
			try{
				String sql = " insert into house_project(project_name, project_lan, project_desc, project_nation,project_address, project_area, project_sales_remain, project_finish_time,  project_city, project_price ) values(?,?,?,?,?,?,?,?,?,?)";
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
				pstmt.setString(10, project_price);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }finally{
	        	con.close();
	        }
			return flag;
	        
		}
		
		
		public boolean editPro(int proid, String project_name, String project_lan, String project_desc, String project_nation, String project_address, String project_area, int project_sales_remain, String project_finish_time, String project_city, String project_price) throws SQLException{
			boolean flag = true;
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			try{
				Timestamp ts = new Timestamp(format.parse(project_finish_time).getTime());
			}catch(Exception e){
				e.printStackTrace();
			}
			try{
				String sql = " update house_project project_name=?, project_lan=?, project_desc=?, project_nation=?, project_address=?, project_area=?, project_sales_remain=?, project_finish_time=?, project_city=?, project_price=? where id=?";
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
				pstmt.setString(10, project_price);
				pstmt.setInt(11, proid);
				int result = pstmt.executeUpdate();
				if(result == 0){
					flag = false;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }finally{
	        	con.close();
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
	        }finally{
	        	con.close();
	        }
			return flag;
	        
		}
		
		public int findProByName(String name) throws SQLException{   //ͨ����Ʋ���id
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
		
		
		
}
