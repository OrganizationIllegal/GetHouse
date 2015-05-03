package com.kate.app.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
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

}
