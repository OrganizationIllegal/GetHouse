package com.kate.app.dao;

import java.sql.ResultSet;
import java.sql.Statement;


import org.springframework.stereotype.Repository;


import com.kate.app.model.HouseProject;
@Repository 
public class RecoProjectDao extends BaseDao{
	public String getRecoProjectDao(){
		String projectdescription=null;
		int RecommendId=2;
		System.out.println("qqqqqqqqqq");
		HouseProject houseproject = new HouseProject();
		try{
			System.out.println("fffflllllll");
			String sql = "select project_desc from house_project AS a,recommend_project AS b where a.id=b.recommend_id AND a.id=2";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("ffff"+sql);
			while(rs.next()){
				houseproject.setProject_desc(rs.getString("project_desc"));
				projectdescription=houseproject.getProject_desc();
				System.out.println("ffff"+projectdescription);
			}
			
		}catch (Exception e) {
            
        }
		return projectdescription;
		
	}

}