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
import com.kate.app.model.MyInfo;
import com.kate.app.model.NewsInfo;


	@Repository 
	public class NewsInfoDao extends BaseDao{
		public List<NewsInfo> getNewsInfo(int proId){
			List <NewsInfo> newsList = new ArrayList<NewsInfo>();
			try{
				String sql = " select * from news_info where house_pro_id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, proId);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()){
					NewsInfo newsInfo = new NewsInfo();
					newsInfo.setId(rs.getInt("id"));
					newsInfo.setTitle(rs.getString("title"));
					newsInfo.setSource(rs.getString("source"));
					newsInfo.setTime(rs.getTimestamp("time"));
					newsInfo.setDetail(rs.getString("detail"));
					newsInfo.setNews_img(rs.getString("news_img"));
					newsInfo.setNews_num(rs.getString("news_num"));
					newsList.add(newsInfo);
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return newsList;
	        
		}
}
