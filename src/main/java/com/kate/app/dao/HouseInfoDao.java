package com.kate.app.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kate.app.model.HouseInfo;
import com.kate.app.model.HouseProject;
@Repository 
public class HouseInfoDao extends BaseDao{
	public List<HouseInfo> HouseInfoDao(String proNum){
		List<HouseInfo> list=new ArrayList<HouseInfo>();
		try{
			//String sql = " select house_type,house_room_num,house_toilet_num,house_size,house_price,house_img from house_info where house_type like '60%'" ;
			String sql = " select house_type,house_room_num,house_toilet_num,house_size_in,house_price,house_img from house_info where project_num=? ";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, proNum);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				HouseInfo houseInfo = new HouseInfo();
				houseInfo.setHouse_type(rs.getString("house_type"));
				houseInfo.setHouse_room_num(rs.getInt("house_room_num"));
				houseInfo.setHouse_toilet_num(rs.getInt("house_toilet_num"));

				houseInfo.setHouse_size_in(rs.getInt("house_size_in"));

				houseInfo.setHouse_price(rs.getString("house_price"));
				houseInfo.setHouse_img(rs.getString("house_img"));
				list.add(houseInfo);
			}
			
		}catch (Exception e) {
            
        }
		return list;
	}

}
