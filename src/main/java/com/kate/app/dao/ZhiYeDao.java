package com.kate.app.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kate.app.model.NewsBoke;
import com.kate.app.model.ZhiYeZhiDao;


	@Repository 
	public class ZhiYeDao extends BaseDao{
		public List<ZhiYeZhiDao> selectZhiYe(){
			List<ZhiYeZhiDao> list = new ArrayList<ZhiYeZhiDao>();
			try{
				String sql = " select * from zhiye_zhidao order by fabu_time desc";   // 按照时间排序最新
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					ZhiYeZhiDao zhiye = new ZhiYeZhiDao();
					zhiye.setZhiye_abstract(rs.getString("zhiye_abstract"));
					zhiye.setDetail(rs.getString("detail"));
					zhiye.setFabu_people(rs.getString("fabu_people"));
					zhiye.setFabu_time(rs.getTimestamp("fabu_time"));
					zhiye.setFenlei(rs.getString("fenlei"));
					zhiye.setId(rs.getInt("id"));
					zhiye.setImage(rs.getString("image"));
					zhiye.setZhiye_num(rs.getString("zhiye_num"));
					zhiye.setTitle(rs.getString("title"));
					list.add(zhiye);
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return list;
		}
		
		public ZhiYeZhiDao selectZhiYeById(int id){
			ZhiYeZhiDao zhiye = new ZhiYeZhiDao();
			try{
				String sql = " select * from zhiye_zhidao where id =?";   // 按照时间排序最新
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, id);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()){
					
					zhiye.setZhiye_abstract(rs.getString("zhiye_abstract"));
					zhiye.setDetail(rs.getString("detail"));
					zhiye.setFabu_people(rs.getString("fabu_people"));
					zhiye.setFabu_time(rs.getTimestamp("fabu_time"));
					zhiye.setFenlei(rs.getString("fenlei"));
					
					zhiye.setImage(rs.getString("image"));
					zhiye.setZhiye_num(rs.getString("zhiye_num"));
					zhiye.setTitle(rs.getString("title"));
					
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return zhiye;
		}
		
		public int countZhiYe(){    //统计总数
			int count = 0;
			try{
				String sql = " select count(*) from zhiye_zhidao";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					count = rs.getInt(1);
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return count;
			
		}
		
		public List<String> zhiYeFenlei(){
			List<String> list = new ArrayList<String>();
			try{
				String sql = " select distinct fenlei from zhiye_zhidao";   // 按照时间排序最新
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					String fenlei = new String();
					fenlei = rs.getString("fenlei");
					list.add(fenlei);
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return list;
		}
		
		public List<ZhiYeZhiDao> selectZhiYeByFenlei(String fenLei){
			List<ZhiYeZhiDao> list = new ArrayList<ZhiYeZhiDao>();
			try{
				String sql = " select * from zhiye_zhidao where fenlei=?";   // 按照时间排序最新
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, fenLei);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()){
					ZhiYeZhiDao zhiye = new ZhiYeZhiDao();
					zhiye.setZhiye_abstract(rs.getString("zhiye_abstract"));
					zhiye.setDetail(rs.getString("detail"));
					zhiye.setFabu_people(rs.getString("fabu_people"));
					zhiye.setFabu_time(rs.getTimestamp("fabu_time"));
					zhiye.setId(rs.getInt("id"));
					zhiye.setImage(rs.getString("image"));
					zhiye.setZhiye_num(rs.getString("zhiye_num"));
					zhiye.setTitle(rs.getString("title"));
					list.add(zhiye);
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return list;
		}
		
		public List<NewsBoke> selectNewsBoke(){
			List<NewsBoke> list = new ArrayList<NewsBoke>();
			try{
				String sql = " select * from news_boke order by news_time desc";   // 按照时间排序最新
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					NewsBoke data = new NewsBoke();
					data.setId(rs.getInt("id"));
					data.setNews_abstract(rs.getString("news_abstract"));
					data.setNews_detail(rs.getString("news_detail"));
					data.setNews_fenlei(rs.getString("news_fenlei"));
					data.setNews_image(rs.getString("news_image"));
					data.setNews_num(rs.getString("news_num"));
					data.setNews_people(rs.getString("news_people"));
					data.setNews_time(rs.getTimestamp("news_time"));
					data.setNews_title(rs.getString("news_title"));
					list.add(data);
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return list;
		}
		
		public NewsBoke selectNewsBokeById(int id){
			NewsBoke data = new NewsBoke();
			try{
				String sql = " select * from news_boke where id =?";   // 按照时间排序最新
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, id);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()){
					
					data.setNews_abstract(rs.getString("news_abstract"));
					data.setNews_detail(rs.getString("news_detail"));
					data.setNews_fenlei(rs.getString("news_fenlei"));
					data.setNews_image(rs.getString("news_image"));
					data.setNews_num(rs.getString("news_num"));
					data.setNews_people(rs.getString("news_people"));
					data.setNews_time(rs.getTimestamp("news_time"));
					data.setNews_title(rs.getString("news_title"));
				
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return data;
		}
		
	
		
		public int countNewsBoke(){    //统计总数
			int count = 0;
			try{
				String sql = " select count(*) from news_boke";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					count = rs.getInt(1);
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return count;
			
		}
		
		public List<String> newsBokeFenlei(){
			List<String> list = new ArrayList<String>();
			try{
				String sql = " select distinct news_fenlei from news_boke";   // 按照时间排序最新
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					String fenlei = new String();
					fenlei = rs.getString("news_fenlei");
					list.add(fenlei);
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return list;
		}
		
		public List<NewsBoke> selectNewsBokeByFenlei(String fenLei){
			List<NewsBoke> list = new ArrayList<NewsBoke>();
			try{
				String sql = " select * from news_boke where news_fenlei=?";   // 按照时间排序最新
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, fenLei);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()){
					NewsBoke data = new NewsBoke();
					data.setId(rs.getInt("id"));
					data.setNews_abstract(rs.getString("news_abstract"));
					data.setNews_detail(rs.getString("news_detail"));
					data.setNews_image(rs.getString("news_image"));
					data.setNews_num(rs.getString("news_num"));
					data.setNews_people(rs.getString("news_people"));
					data.setNews_time(rs.getTimestamp("news_time"));
					data.setNews_title(rs.getString("news_title"));
					list.add(data);
				}
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			return list;
		}
}
