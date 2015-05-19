package com.kate.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kate.app.model.HouseProject;
import com.kate.app.model.InvestmentData;
import com.kate.app.model.MyInfo;
import com.kate.app.model.NewsInfo;


	@Repository 
	public class InvestDataDao extends BaseDao{
		public InvestmentData getInvestmentDate(int proId){
			InvestmentData invest = new InvestmentData();
			try{
				String sql = " select * from investment_data where house_pro_id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, proId);
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next()){
					invest.setArea_id(rs.getInt("area_id"));
					invest.setId(rs.getInt("id"));
					invest.setData_exam(rs.getString("data_exam"));
					invest.setMiddle_price(rs.getInt("middle_price"));
					invest.setMiddle_zu_price(rs.getInt("middle_zu_price"));
					invest.setPrice_review(rs.getString("price_review"));
					invest.setYear_increment_rate(rs.getInt("year_increment_rate"));
					invest.setZu_house_rate(rs.getInt("zu_house_rate"));
					invest.setZu_xuqiu(rs.getString("zu_xuqiu"));
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return invest;
	        
		}
}
