package com.kate.app.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSONArray;
@Repository 
public class AreaFeatureDao extends BaseDao{
	public List<String> getAreaFeature(){
		List<String> featureList=new ArrayList<String>();
		int houseProId=1;
		String afeature=null;
		try {
			String sql = " select area_character from area_features t  where  t.house_project_id="+houseProId;
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				afeature=rs.getString("area_character");
				featureList.add(afeature);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return featureList;
	}
	//地区特点  List
	public JSONArray listAreaFeature(){
		JSONArray jsonArray=new JSONArray();
		try {
			String sql = "select t.id,t.area_character,t.house_project_id,h.project_name from area_features t LEFT JOIN house_project h on t.house_project_id=h.id";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			jsonArray=ResultSetConverter.convert(rs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonArray;
	} 
	//地区特点  Add
	public int InsertAreaFeature(String area_character,int house_pro_id){
		int exeResult=0;
		try {
			String sql = "insert into area_features(area_character,house_project_id) values(?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, area_character);
			pstmt.setInt(2, house_pro_id);
			exeResult = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exeResult;
	}
	//地区特点  update
	public int updateAreaFeature(int id,String area_character,int house_pro_id){
		int exeResult=0;
		try {
			String sql = "update area_features set area_character=? where id=? and house_project_id=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, area_character);
			pstmt.setInt(2, id);
			pstmt.setInt(3, house_pro_id);
			exeResult = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exeResult;
	}
	//地区特点  delete
	public int delAreaFeature(int id){
		int exeResult=0;
		try {
			String sql = "delete from area_features where id="+id;
			Statement stmt = con.createStatement();
			exeResult = stmt.executeUpdate(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exeResult;
	}

}
