package com.kate.app.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSONArray;
import com.kate.app.model.AreaMiddle;
import com.kate.app.model.AreaZhikong;
import com.kate.app.model.AreaZujin;

@Repository 
public class AreaTrendDao extends BaseDao {
  public List<AreaMiddle> getAreaMiddleTrend(String project_type, int areaId){
	  List<AreaMiddle> areaMiddleTrendList=new ArrayList<AreaMiddle>();
	
	  try {
			String sql = " select * from area_middle where project_type=? and area_id=? order by heng";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, project_type);
			pstmt.setInt(2, areaId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				AreaMiddle data = new AreaMiddle();
				data.setArea_code(rs.getString("area_code"));
				data.setArea_code(rs.getString("area_code"));
				data.setHeng(rs.getString("heng"));
				data.setId(rs.getInt("id"));
				
				data.setView_shunxu(rs.getInt("view_shunxu"));
				data.setZong(rs.getInt("zong"));
				areaMiddleTrendList.add(data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return areaMiddleTrendList;
  }
  
  public List<AreaZujin> getAreaZujinTrend(String project_type, int areaId){
	  List<AreaZujin> areaZujinTrendList=new ArrayList<AreaZujin>();
	 
	  try {
			String sql = " select * from area_zujin where project_type=? and area_id=? order by heng";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, project_type);
			pstmt.setInt(2, areaId);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				AreaZujin data = new AreaZujin();
				data.setArea_code(rs.getString("area_code"));
				
				data.setHeng(rs.getString("heng"));
				data.setId(rs.getInt("id"));
				
				data.setView_shunxu(rs.getInt("view_shunxu"));
				data.setZong(rs.getInt("zong"));
				areaZujinTrendList.add(data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return areaZujinTrendList;
  }
  
  public List<AreaZhikong> getAreaZhikongTrend(String project_type, int areaId){
	  List<AreaZhikong> areaZhikongeTrendList=new ArrayList<AreaZhikong>();
	  
	  try {
			String sql = " select * from area_kongzhi where project_type=? and area_id=? order by heng"; 
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, project_type);
			pstmt.setInt(2, areaId);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				AreaZhikong data = new AreaZhikong();
				data.setArea_code(rs.getString("area_code"));
				
				data.setHeng(rs.getString("heng"));
				data.setId(rs.getInt("id"));
				
				data.setView_shunxu(rs.getInt("view_shunxu"));
				data.setZong(rs.getInt("zong"));
				areaZhikongeTrendList.add(data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return areaZhikongeTrendList;
  }
  
  
  
  
  
  
//中位数房价走势 List
  public JSONArray listAreaMiddle(){
		JSONArray jsonArray=new JSONArray();
		try {
			String sql = "select t.id,t.`year`,t.rate,t.house_pro_id,h.project_name from area_middle t LEFT JOIN house_project h on t.house_pro_id=h.id;";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			jsonArray=ResultSetConverter.convert(rs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonArray;
	} 
//中位数房价走势 Add
 public int InsertAreaMiddle(int year,int rate,int house_pro_id){
		int exeResult=0;
		try {
			String sql = "insert into area_middle(year,rate,house_pro_id) values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, year);
			pstmt.setInt(2, rate);
			pstmt.setInt(3, house_pro_id);
			exeResult = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exeResult;
	}  
 
//中位数房价走势 update
 public int updateAreaMiddle(int id,int year,int rate,int house_pro_id){
		int exeResult=0;
		try {
			String sql = "update area_middle set year=?,rate=? where id=? and house_pro_id=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, year);
			pstmt.setInt(2, rate);
			pstmt.setInt(3, id);
			pstmt.setInt(4, house_pro_id);
			exeResult = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exeResult;
	}
//中位数房价走势 delete
 public int delAreaMiddle(int id){
		int exeResult=0;
		try {
			String sql = "delete from area_middle where id="+id;
			Statement stmt = con.createStatement();
			exeResult = stmt.executeUpdate(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exeResult;
	}
 //区域租金走势List
 public JSONArray listAreaZujin(){
		JSONArray jsonArray=new JSONArray();
		try {
			String sql = "select t.id,t.`year`,t.rate,t.house_project_id,h.project_name from area_zujin t LEFT JOIN house_project h on t.house_project_id=h.id;";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			jsonArray=ResultSetConverter.convert(rs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonArray;
	} 
 //区域租金走势Add
 public int InsertAreaZujin(int year,int rate,int house_pro_id){
		int exeResult=0;
		try {
			String sql = "insert into area_zujin(year,rate,house_project_id) values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, year);
			pstmt.setInt(2, rate);
			pstmt.setInt(3, house_pro_id);
			exeResult = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exeResult;
	}  
 //区域租金走势update
 public int updateAreaZujin(int id,int year,int rate,int house_pro_id){
		int exeResult=0;
		try {
			String sql = "update area_zujin set year=?,rate=? where id=? and house_project_id=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, year);
			pstmt.setInt(2, rate);
			pstmt.setInt(3, id);
			pstmt.setInt(4, house_pro_id);
			exeResult = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exeResult;
	}
 //区域租金走势delete
 public int delAreaZujin(int id){
		int exeResult=0;
		try {
			String sql = "delete from area_zujin where id="+id;
			Statement stmt = con.createStatement();
			exeResult = stmt.executeUpdate(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exeResult;
	}
 //区域空置率 List
 public JSONArray listAreaZhikong(){
		JSONArray jsonArray=new JSONArray();
		try {
			String sql = "select t.id,t.year,t.rate,t.house_pro_id,h.project_name from area_kongzhi t LEFT JOIN house_project h on t.house_pro_id=h.id;";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			jsonArray=ResultSetConverter.convert(rs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonArray;
	} 
 //区域空置率 Add
 public int InsertAreaZhikong(int year,int rate,int house_pro_id){
		int exeResult=0;
		try {
			String sql = "insert into area_kongzhi(year,rate,house_pro_id) values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, year);
			pstmt.setInt(2, rate);
			pstmt.setInt(3, house_pro_id);
			exeResult = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exeResult;
	}  
 //区域空置率 update
 public int updateAreaZhikong(int id,int year,int rate,int house_pro_id){
		int exeResult=0;
		try {
			String sql = "update area_kongzhi set year=?,rate=? where id=? and house_pro_id=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, year);
			pstmt.setInt(2, rate);
			pstmt.setInt(3, id);
			pstmt.setInt(4, house_pro_id);
			exeResult = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exeResult;
	}
 //区域空置率 delete
 public int delAreaZhikong(int id){
		int exeResult=0;
		try {
			String sql = "delete from area_kongzhi where id="+id;
			Statement stmt = con.createStatement();
			exeResult = stmt.executeUpdate(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exeResult;
	}
}
