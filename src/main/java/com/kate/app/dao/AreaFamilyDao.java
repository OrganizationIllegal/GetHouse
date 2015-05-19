package com.kate.app.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSONArray;
import com.kate.app.model.AreaFamily;
@Repository 
public class AreaFamilyDao extends BaseDao {
	public AreaFamily getAreaFamily(int proId){
		AreaFamily data = new AreaFamily();
		try {
			String sql = " SELECT * from area_family where house_pro_id=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, proId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				data.setArea_code(rs.getString("area_code"));
				data.setArea_id(rs.getInt("area_id"));
				data.setData_souce(rs.getString("data_souce"));
				data.setFamily_one(rs.getString("family_one"));
				data.setFamily_one_rate(rs.getInt("family_one_rate"));
				data.setFamily_two(rs.getString("family_two"));
				data.setFamily_two_rate(rs.getInt("family_two_rate"));
				data.setFamily_three(rs.getString("family_three"));
				data.setFamily_three_rate(rs.getInt("family_three_rate"));
				data.setId(rs.getInt("id"));
				data.setUpdate_time(rs.getTimestamp("update_time"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	public int getdulirate(){
		int houseProId=1;
		int dulirate=0;
		try {
			String sql = " SELECT rate from area_family t where binary t.family_type='独立人士'  AND t.house_pro_id="+houseProId;
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				dulirate=rs.getInt("rate");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dulirate;
	}
	public int getyoungfamilyrate(){
		int houseProId=1;
		int youngfamilyrate=0;
		try {
			String sql = " SELECT rate from area_family t where binary t.family_type='青年家庭'  AND t.house_pro_id="+houseProId;
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				youngfamilyrate=rs.getInt("rate");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return youngfamilyrate;
	}
	public int getoldfamilyrate(){
		int houseProId=1;
		int oldfamilyrate=0;
		try {
			String sql = " SELECT rate from area_family t where binary t.family_type='老年家庭'  AND t.house_pro_id="+houseProId;
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				oldfamilyrate=rs.getInt("rate");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return oldfamilyrate;
	}
	//增
	public int InsertAreaFamily(String family_type,int rate,int house_pro_id){
		int exeResult=0;
		try {
			String sql = "insert into area_family(family_type,rate,house_pro_id) values("+"'"+family_type+"'"+","+rate+","+house_pro_id+") ";
			Statement stmt = con.createStatement();
			exeResult = stmt.executeUpdate(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exeResult;
		
	}
	//删
	public int delAreaFamily(int id){
		int exeResult=0;
		try {
			String sql = "delete from area_family where id="+id;
			Statement stmt = con.createStatement();
			exeResult = stmt.executeUpdate(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exeResult;
	}
	//查
	public JSONArray listAreaFamily(){
		JSONArray jsonArray=new JSONArray();
		try {
			String sql = " select t.id,t.family_type,t.rate,t.house_pro_id,h.project_name from area_family t LEFT JOIN house_project h on  t.house_pro_id=h.id";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			jsonArray=ResultSetConverter.convert(rs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonArray;
	} 
	//改
	public int updateAreaFamily(int id,String family_type,int rate,int house_pro_id){
		int exeResult=0;
		try {
			String sql = "update area_family set family_type=?,rate=? where id=? and house_pro_id=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, family_type);
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
	//根据项目名称查找项目id
	public int findProjectIdByName(String project_name){
		int project_id=0;
		try {
			String sql = "select t.id from house_project t where t.project_name="+"'"+project_name+"'";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				project_id=rs.getInt("id");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return project_id;
	}
	public int findLatestId(){
		int id=0;
		try {
			String sql = "SELECT LAST_INSERT_ID();";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				id=rs.getInt(0);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
	}
}
