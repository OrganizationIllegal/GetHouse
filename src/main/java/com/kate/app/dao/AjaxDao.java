package com.kate.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kate.app.model.HouseProject;
import com.kate.app.model.InvestmentDate;
import com.kate.app.model.MyInfo;


	@Repository 
	public class AjaxDao extends BaseDao{
		public JSONArray select(){
			JSONArray jsonArray = new JSONArray();
			List<InvestmentDate> list = new ArrayList<InvestmentDate>();
			try{
				String sql = " select * from investment_data";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					JSONObject json = new JSONObject();
					json.put("id", rs.getInt("id"));
					json.put("middle_price", rs.getInt("middle_price"));
					json.put("middle_zu_price", rs.getInt("middle_zu_price"));
					json.put("price_review", rs.getString("price_review"));
					json.put("year_increment_rate", rs.getInt("year_increment_rate"));
					json.put("zu_house_rate", rs.getInt("zu_house_rate"));
					json.put("zu_xuqiu", rs.getString("zu_xuqiu"));
					json.put("data_exam", rs.getString("data_exam"));
					jsonArray.add(json);
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return jsonArray;
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
			
			
		public boolean addTouziData(int middle_price, int middle_zu_price, int price_review, int year_increment_rate, int zu_house_rate, String zu_xuqiu,String data_exam) throws SQLException{
			boolean flag = true;
			
			try{
				String sql = " insert into investment_data(year_increment_rate, middle_price, middle_zu_price, zu_house_rate, zu_xuqiu, price_review, data_exam) values(?,?,?,?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, year_increment_rate);
				pstmt.setInt(2, middle_price);
				pstmt.setInt(3, middle_zu_price);
				pstmt.setInt(4, zu_house_rate);
				pstmt.setString(5, zu_xuqiu);
				pstmt.setInt(6, price_review);
				pstmt.setString(7, data_exam);
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
		
		public boolean editTouziData(int id, int middle_price, int middle_zu_price, int price_review, int year_increment_rate, int zu_house_rate, String zu_xuqiu,String data_exam) throws SQLException{
			boolean flag = true;
			try{
				String sql = " update investment_data set year_increment_rate=?, middle_price=?, middle_zu_price=?, zu_house_rate=?, zu_xuqiu=?, price_review=?, data_exam=? where id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, year_increment_rate);
				pstmt.setInt(2, middle_price);
				pstmt.setInt(3, middle_zu_price);
				pstmt.setInt(4, zu_house_rate);
				pstmt.setString(5, zu_xuqiu);
				pstmt.setInt(6, price_review);
				pstmt.setString(7, data_exam);
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
		
		public boolean deleteTouziData(int id){
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
		
		
		public boolean addPro(String name, String lan, String detail) throws SQLException{
			boolean flag = true;
			try{
				String sql = " insert into house_project(project_name, project_lan, project_desc) values(?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setString(2, lan);
				pstmt.setString(3, detail);
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
		
		
		public boolean editPro(int proid, String name, String lan, String detail) throws SQLException{
			boolean flag = true;
			try{
				String sql = " update house_project project_name=?, project_lan=?, project_desc=?,where house_pro_id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setString(2, lan);
				pstmt.setString(3, detail);
				pstmt.setInt(4, proid);
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
		
		public int findProByName(String name) throws SQLException{   //�����Ŀ��Ʋ���
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
