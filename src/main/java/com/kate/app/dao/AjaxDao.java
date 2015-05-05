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


	@Repository 
	public class AjaxDao extends BaseDao{
		public boolean addhouseStyleData(String style, int roomnum, int toiletnum, int size, int price, String img) throws SQLException{
			boolean flag = true;
			try{
				String sql = " insert into house_info(house_type,house_room_num,house_toilet_num,house_size,house_price,house_img) values(?,?,?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, style);
				pstmt.setInt(2, roomnum);
				pstmt.setInt(3, toiletnum);
				pstmt.setInt(4, size);
				pstmt.setInt(5, price);
				pstmt.setString(6,img);
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
		
		public boolean edithouseStyleData(int id,String style, int roomnum, int toiletnum, int size, int price, String img) throws SQLException{
			boolean flag = true;
			try{
				String sql = " update house_info house_type=?, house_room_num=?, house_toilet_num=?, house_size=?, house_price=?, house_img=? where id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, id);
				pstmt.setString(2, style);
				pstmt.setInt(3, roomnum);
				pstmt.setInt(4, toiletnum);
				pstmt.setInt(5, size);
				pstmt.setInt(6, price);
				pstmt.setString(7,img);
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
		
		public boolean deletehouseStyleData(int id){
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
		
		public boolean findById(int id) throws SQLException{
			boolean flag = false;
			try{
				String sql = " select count(*) from house_info where id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, id);
				ResultSet rs = pstmt.executeQuery();
				if(rs.next()){
					flag = true;
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }finally{
	        	con.close();
	        }
			
			return flag;
	        
		}
		
}
