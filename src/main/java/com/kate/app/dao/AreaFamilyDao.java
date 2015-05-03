package com.kate.app.dao;

import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.stereotype.Repository;
@Repository 
public class AreaFamilyDao extends BaseDao {
	public int getdulirate(){
		int houseProId=1;
		int dulirate=0;
		try {
			String sql = " SELECT rate from area_family t where  t.family_type='独立人士'  AND t.house_pro_id="+houseProId;
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
			String sql = " SELECT rate from area_family t where  t.family_type='青年家庭'  AND t.house_pro_id="+houseProId;
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
			String sql = " SELECT rate from area_family t where  t.family_type='老年家庭'  AND t.house_pro_id="+houseProId;
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
}
