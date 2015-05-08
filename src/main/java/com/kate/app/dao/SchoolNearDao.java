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
	
