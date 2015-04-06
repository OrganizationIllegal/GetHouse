package com.kate.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.kate.app.model.MyInfo;


	@Repository 
	public class testD extends BaseDao{
		public String test(){
			//Statement stmt = con.createStatement() ;
			System.out.println("qqqqqqqqqq");
			MyInfo myInfo = new MyInfo();
			try{
				Connection con = DriverManager.getConnection(url, username, password);
				String sql = " select * from MyInfo";
				System.out.println(sql+"qqqqqqqqqq");
		        Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				
				while(rs.next()){
					myInfo.setName(rs.getString("name"));
					myInfo.setAge(rs.getInt("age"));
					System.out.println(myInfo.getAge());
		            
				}
				
			}catch (Exception e) {
	            
	        }
			
			return myInfo.getName();
	        
		}
}
