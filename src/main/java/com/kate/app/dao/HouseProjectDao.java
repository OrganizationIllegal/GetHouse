package com.kate.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kate.app.model.HouseProject;
import com.kate.app.model.MyInfo;
@Repository 
public class HouseProjectDao extends BaseDao{
	public List<HouseProject> HouseProjectDao(){
		List<HouseProject> list = new ArrayList<HouseProject>();
		try{
			//Connection con = DriverManager.getConnection(url, username, password);
			String sql = " select * from House_Project";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				HouseProject projectInfo = new HouseProject();
				projectInfo.setProject_area(rs.getInt("project_area"));
				projectInfo.setProject_desc(rs.getString("project_desc"));
				projectInfo.setProject_finish_time(rs.getTimestamp("project_finish_time"));
				projectInfo.setProject_img(rs.getString("project_img"));
				projectInfo.setProject_name(rs.getString("project_name"));
				projectInfo.setProject_nation(rs.getString("project_nation"));
				projectInfo.setProject_price_avg(rs.getInt("project_price_avg"));
				projectInfo.setProject_sales_remain(rs.getInt("project_sales_remain"));
				list.add(projectInfo);
			}
			
		}catch (Exception e) {
            
        }
		return list;
	}
}
