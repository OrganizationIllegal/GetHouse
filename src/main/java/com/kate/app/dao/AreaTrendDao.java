package com.kate.app.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kate.app.model.AreaMiddle;
import com.kate.app.model.AreaZhikong;
import com.kate.app.model.AreaZujin;

@Repository 
public class AreaTrendDao extends BaseDao {
  public List<AreaMiddle> getAreaMiddleTrend(){
	  List<AreaMiddle> areaMiddleTrendList=new ArrayList<AreaMiddle>();
	  int houseProId=1;
	  try {
			String sql = " select year,rate from area_middle t  where  t.house_pro_id="+houseProId+" ORDER BY t.year";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			String year=null;
			int rate=0;
			while(rs.next()){
				year=rs.getString("year");
				rate=rs.getInt("rate");
			    AreaMiddle areaMiddle=new AreaMiddle(year,rate) ;
				areaMiddleTrendList.add(areaMiddle);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return areaMiddleTrendList;
  }
  public List<AreaZujin> getAreaZujinTrend(){
	  List<AreaZujin> areaZujinTrendList=new ArrayList<AreaZujin>();
	  int houseProId=1;
	  try {
			String sql = " select year,rate from area_zujin t  where  t.house_project_id="+houseProId+" ORDER BY t.year";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			String year=null;
			int rate=0;
			while(rs.next()){
				year=rs.getString("year");
				rate=rs.getInt("rate");
				AreaZujin areaZujin=new AreaZujin(year,rate) ;
				areaZujinTrendList.add(areaZujin);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return areaZujinTrendList;
  }
  
  public List<AreaZhikong> getAreaZhikongTrend(){
	  List<AreaZhikong> areaZhikongeTrendList=new ArrayList<AreaZhikong>();
	  int houseProId=1;
	  try {
			String sql = " select year,rate from area_zhikong t  where  t.house_pro_id="+houseProId+" ORDER BY t.year";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			String year=null;
			int rate=0;
			while(rs.next()){
				year=rs.getString("year");
				rate=rs.getInt("rate");
				AreaZhikong areaZhikong=new AreaZhikong(year,rate) ;
			    areaZhikongeTrendList.add(areaZhikong);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return areaZhikongeTrendList;
  }
	
}
