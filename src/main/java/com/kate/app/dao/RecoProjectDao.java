package com.kate.app.dao;

import java.sql.ResultSet;
import java.sql.Statement;


import org.springframework.stereotype.Repository;


import com.kate.app.model.HouseProject;
@Repository 
public class RecoProjectDao extends BaseDao{
	public String RecoProjectDao(){
		String projectdescription=null;
		int RecommendId=2;
		
		try{
			String sql = "select project_desc from house_project AS h,recommend_project AS r where h.id=r.recommend_id and h.id=2;";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				HouseProject houseproject = new HouseProject();
				houseproject.setProject_desc(rs.getString("project_desc"));
				projectdescription=houseproject.getProject_desc();
				
			}
			
		}catch (Exception e) {
            
        }
		return projectdescription;
		
	}

}