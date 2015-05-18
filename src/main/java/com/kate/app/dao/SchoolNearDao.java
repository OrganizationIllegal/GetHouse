package com.kate.app.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSONArray;
import com.kate.app.model.NearSchoolFacility;
import com.kate.app.model.NearSchoolVo;

@Repository 
public class SchoolNearDao extends BaseDao {
	public List<NearSchoolVo> getNearSchoolInfo(){
		List<NearSchoolVo> nearSchoolVoList=new ArrayList<NearSchoolVo>();
		int houseProId=1;
		try {
			String sql = " select school_type,school_name,school_rank,school_distance,traffic_num from school_and_near t where t.house_pro_id="+houseProId;
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			String school_type=null;
			String school_name=null;
			int school_rank=0;;
			int school_distance=0;
			int traffic_num=0;
			while(rs.next()){
				school_type=rs.getString("school_type");
				school_name=rs.getString("school_name");
				school_rank=rs.getInt("school_rank");
				school_distance=rs.getInt("school_distance");
				traffic_num=rs.getInt("traffic_num");
				NearSchoolVo nearSchoolVo=new NearSchoolVo(school_type,school_name,school_distance,school_rank,traffic_num);
				nearSchoolVoList.add(nearSchoolVo);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nearSchoolVoList;
	}
	public List<NearSchoolFacility> getNearSchoolFacilityInfo(){
		List<NearSchoolFacility> nearSchoolFacilityList=new ArrayList<NearSchoolFacility>();
		int houseProId=1;
		try {
			String sql = "select facility_type,facility_name,facility_distance,facility_rank,walk_num from school_near_facility t where t.house_pro_id="+houseProId;
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			String facility_type=null;
			String facility_name=null;
			int facility_distance=0;;
			int facility_rank=0;
			int walk_num=0;
			while(rs.next()){
				facility_type=rs.getString("facility_type");
				facility_name=rs.getString("facility_name");
				facility_distance=rs.getInt("facility_distance");
				facility_rank=rs.getInt("facility_rank");
				walk_num=rs.getInt("walk_num");
				NearSchoolFacility nearSchoolFacility=new NearSchoolFacility(facility_type,facility_name,facility_rank,facility_distance,walk_num);
				nearSchoolFacilityList.add(nearSchoolFacility);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nearSchoolFacilityList;
	}
	//ѧУ���ܱ�->����ѧУ  List
	 public JSONArray listNearSchool(){
			JSONArray jsonArray=new JSONArray();
			try {
				String sql = "select t.id,t.school_name,t.school_distance,h.project_name from near_school t JOIN house_project h on t.house_pro_id=h.id";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				jsonArray=ResultSetConverter.convert(rs);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return jsonArray;
		} 
	//ѧУ���ܱ�->����ѧУ  Add
	 public int InsertNearSchool(String school_name,int school_distance,int house_pro_id){
			int exeResult=0;
			try {
				String sql = "insert into near_school(school_name,school_distance,house_pro_id) values(?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, school_name);
				pstmt.setInt(2, school_distance);
				pstmt.setInt(3, house_pro_id);
				exeResult = pstmt.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return exeResult;
		}  
	//ѧУ���ܱ�->����ѧУ  update
	 public int updateNearSchool(int id,String school_name,int school_distance,int house_pro_id){
			int exeResult=0;
			try {
				String sql = "update near_school set school_name=?,school_distance=? where id=? and house_pro_id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, school_name);
				pstmt.setInt(2, school_distance);
				pstmt.setInt(3, id);
				pstmt.setInt(4, house_pro_id);
				exeResult = pstmt.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return exeResult;
		}
	//ѧУ���ܱ�->����ѧУ  delete
	 public int delNearSchool(int id){
			int exeResult=0;
			try {
				String sql = "delete from near_school where id="+id;
				Statement stmt = con.createStatement();
				exeResult = stmt.executeUpdate(sql);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return exeResult;
		}
	//ѧУ���ܱ�->��������  list
	 public JSONArray listNearFacility(){
			JSONArray jsonArray=new JSONArray();
			try {
				String sql = "select t.id,t.market_type,t.market_name,t.market_distance,t.house_pro_id,h.project_name from near_peitao t  JOIN house_project h on t.house_pro_id=h.id;";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				jsonArray=ResultSetConverter.convert(rs);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return jsonArray;
		} 
	//ѧУ���ܱ�->��������  add
	 public int InsertNearFacility(String market_type,String market_name,int market_distance,int house_pro_id){
			int exeResult=0;
			try {
				String sql = "insert into near_peitao(market_type,market_name,market_distance,house_pro_id) values(?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, market_type);
				pstmt.setString(2, market_name);
				pstmt.setInt(3, market_distance);
				pstmt.setInt(4, house_pro_id);
				exeResult = pstmt.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return exeResult;
		}  
	//ѧУ���ܱ�->��������  update
	 public int updateNearFacility(int id,String market_type,String market_name,int market_distance,int house_pro_id){
			int exeResult=0;
			try {
				String sql = "update near_peitao set market_type=?,market_name=?,market_distance=? where id=? and house_pro_id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, market_type);
				pstmt.setString(2, market_name);
				pstmt.setInt(3, market_distance);
				pstmt.setInt(4, id);
				pstmt.setInt(5, house_pro_id);
				exeResult = pstmt.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return exeResult;
		}
	//ѧУ���ܱ�->��������  delete
	 public int delNearFacility(int id){
			int exeResult=0;
			try {
				String sql = "delete from near_peitao where id="+id;
				Statement stmt = con.createStatement();
				exeResult = stmt.executeUpdate(sql);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return exeResult;
		}
}
	
