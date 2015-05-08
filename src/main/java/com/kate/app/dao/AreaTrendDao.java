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
  public List<AreaMiddle> getAreaMiddleTrend(){
	  List<AreaMiddle> areaMiddleTrendList=new ArrayList<AreaMiddle>();
	  int houseProId=1;
	  try {
			String sql = " select year,rate from area_middle t  where  t.house_pro_id="+houseProId+" ORDER BY t.year";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			String year=null;
			int rate=0;
			while(rs.next()){
				year=rs.getString("year");
				rate=rs.getInt("rate");
			    AreaMiddle areaMiddle=new AreaMiddle(year,rate) ;
				areaMiddleTrendList.add(areaMiddle);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return areaMiddleTrendList;
  }
  public List<AreaZujin> getAreaZujinTrend(){
	  List<AreaZujin> areaZujinTrendList=new ArrayList<AreaZujin>();
	  int houseProId=1;
	  try {
			String sql = " select year,rate from area_zujin t  where  t.house_project_id="+houseProId+" ORDER BY t.year";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			String year=null;
			int rate=0;
			while(rs.next()){
				year=rs.getString("year");
				rate=rs.getInt("rate");
				AreaZujin areaZujin=new AreaZujin(year,rate) ;
				areaZujinTrendList.add(areaZujin);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return areaZujinTrendList;
  }
  
  public List<AreaZhikong> getAreaZhikongTrend(){
	  List<AreaZhikong> areaZhikongeTrendList=new ArrayList<AreaZhikong>();
	  int houseProId=1;
	  try {
			String sql = " select year,rate from area_kongzhi t  where  t.house_pro_id="+houseProId+" ORDER BY t.year";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			String year=null;
			int rate=0;
			while(rs.next()){
				year=rs.getString("year");
				rate=rs.getInt("rate");
				AreaZhikong areaZhikong=new AreaZhikong(year,rate) ;
			    areaZhikongeTrendList.add(areaZhikong);
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
