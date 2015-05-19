package com.kate.app.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSONArray;
import com.kate.app.model.NearPeiTao;
import com.kate.app.model.NearSchool;
import com.kate.app.model.NearSchoolFacility;

@Repository 
public class SchoolNearDao extends BaseDao {
	public List<NearSchool> getNearSchoolInfo(int proId){
		List<NearSchool> list=new ArrayList<NearSchool>();
		try {
			String sql = " select * from near_school where house_pro_id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, proId);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				NearSchool data = new NearSchool();
				data.setId(rs.getInt("id"));
				data.setSchool_name(rs.getString("school_name"));
				data.setSchool_distance(rs.getInt("school_distance"));
				list.add(data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public List<NearPeiTao> getNearSchoolFacilityInfo(int proId){
		List<NearPeiTao> list=new ArrayList<NearPeiTao>();
		
		try {
			String sql = "select * from near_peitao where house_pro_id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, proId);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				NearPeiTao data = new NearPeiTao();
				data.setId(rs.getInt("id"));
				data.setMarket_distance(rs.getInt("market_distance"));
				data.setMarket_name(rs.getString("market_name"));
				data.setMarket_type(rs.getString("market_type"));
				list.add(data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	//学校和周边->附近学校  List
	 public JSONArray listNearSchool(){
			JSONArray jsonArray=new JSONArray();
			try {
				String sql = "select t.id,t.school_type,t.school_name,t.school_distance,t.school_rank,t.traffic_num,t.house_pro_id,h.project_name from school_and_near t LEFT JOIN house_project h on t.house_pro_id=h.id";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				jsonArray=ResultSetConverter.convert(rs);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return jsonArray;
		} 
	//学校和周边->附近学校  Add
	 public int InsertNearSchool(String school_type,String school_name,int school_distance,int school_rank,int traffic_num,int house_pro_id){
			int exeResult=0;
			try {
				String sql = "insert into school_and_near(school_type,school_name,school_distance,school_rank,traffic_num,house_pro_id) values(?,?,?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, school_type);
				pstmt.setString(2, school_name);
				pstmt.setInt(3, school_distance);
				pstmt.setInt(4, school_rank);
				pstmt.setInt(5, traffic_num);
				pstmt.setInt(6, house_pro_id);
				exeResult = pstmt.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return exeResult;
		}  
	//学校和周边->附近学校  update
	 public int updateNearSchool(int id,String school_type,String school_name,int school_distance,int school_rank,int traffic_num,int house_pro_id){
			int exeResult=0;
			try {
				String sql = "update school_and_near set school_type=?,school_name=?,school_distance=?,school_rank=?,traffic_num=? where id=? and house_pro_id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, school_type);
				pstmt.setString(2, school_name);
				pstmt.setInt(3, school_distance);
				pstmt.setInt(4, school_rank);
				pstmt.setInt(5, traffic_num);
				pstmt.setInt(6, id);
				pstmt.setInt(7, house_pro_id);
				exeResult = pstmt.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return exeResult;
		}
	//学校和周边->附近学校  delete
	 public int delNearSchool(int id){
			int exeResult=0;
			try {
				String sql = "delete from school_and_near where id="+id;
				Statement stmt = con.createStatement();
				exeResult = stmt.executeUpdate(sql);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return exeResult;
		}
	//学校和周边->附近配套  list
	 public JSONArray listNearFacility(){
			JSONArray jsonArray=new JSONArray();
			try {
				String sql = "select t.id,t.facility_type,t.facility_name,t.facility_distance,t.facility_rank,t.walk_num,t.house_pro_id,h.project_name from school_near_facility t LEFT JOIN house_project h on t.house_pro_id=h.id;";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				jsonArray=ResultSetConverter.convert(rs);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return jsonArray;
		} 
	//学校和周边->附近配套  add
	 public int InsertNearFacility(String facility_type,String facility_name,int facility_distance,int facility_rank,int walk_num,int house_pro_id){
			int exeResult=0;
			try {
				String sql = "insert into school_near_facility(facility_type,facility_name,facility_distance,facility_rank,walk_num,house_pro_id) values(?,?,?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, facility_type);
				pstmt.setString(2, facility_name);
				pstmt.setInt(3, facility_distance);
				pstmt.setInt(4, facility_rank);
				pstmt.setInt(5, walk_num);
				pstmt.setInt(6, house_pro_id);
				exeResult = pstmt.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return exeResult;
		}  
	//学校和周边->附近配套  update
	 public int updateNearFacility(int id,String facility_type,String facility_name,int facility_distance,int facility_rank,int walk_num,int house_pro_id){
			int exeResult=0;
			try {
				String sql = "update school_near_facility set facility_type=?,facility_name=?,facility_distance=?,facility_rank=?,walk_num=? where id=? and house_pro_id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, facility_type);
				pstmt.setString(2, facility_name);
				pstmt.setInt(3, facility_distance);
				pstmt.setInt(4, facility_rank);
				pstmt.setInt(5, walk_num);
				pstmt.setInt(6, id);
				pstmt.setInt(7, house_pro_id);
				exeResult = pstmt.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return exeResult;
		}
	//学校和周边->附近配套  delete
	 public int delNearFacility(int id){
			int exeResult=0;
			try {
				String sql = "delete from school_near_facility where id="+id;
				Statement stmt = con.createStatement();
				exeResult = stmt.executeUpdate(sql);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return exeResult;
		}
}
	
