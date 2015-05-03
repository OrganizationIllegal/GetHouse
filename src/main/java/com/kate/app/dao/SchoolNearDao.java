package com.kate.app.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

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
}
	
