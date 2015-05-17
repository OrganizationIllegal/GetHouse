package com.kate.app.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSONArray;
import com.kate.app.model.AreaInfo;
@Repository 
public class AreaInfoDao extends BaseDao {
	public AreaInfo getAreaInfo(int id){
		AreaInfo areaInfo = new AreaInfo();
		try {
			String sql = " SELECT * from area_info where id=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				areaInfo.setArea_city(rs.getString("area_city"));
				areaInfo.setArea_name(rs.getString("area_name"));
				areaInfo.setArea_nation(rs.getString("area_nation"));
				areaInfo.setArea_num(rs.getString("area_num"));
				areaInfo.setArea_zhou(rs.getString("area_zhou"));
				areaInfo.setHouse_pro_id(rs.getInt("house_pro_id"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return areaInfo;
	}
	
}
