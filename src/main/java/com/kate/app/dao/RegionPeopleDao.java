package com.kate.app.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kate.app.model.FamilyIncome;
import com.kate.app.model.PeopleForeign;
import com.kate.app.model.PeopleInfo;
import com.kate.app.model.PeopleNation;
@Repository 
public class RegionPeopleDao extends BaseDao {
	public List<PeopleInfo> getPeopleInfo(){
		List<PeopleInfo> peopleInfoList=new ArrayList<PeopleInfo>();
		int houseProId=1;
		try {
			String sql = "select people_count,area,city from people_info t where t.house_pro_id="+houseProId;
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			String people_count=null;
			int area=0;
			int city=0;
			while(rs.next()){
				people_count=rs.getString("people_count");
				area=rs.getInt("area");
				city=rs.getInt("city");
				PeopleInfo peopleInfo=new PeopleInfo(people_count,area,city);
				peopleInfoList.add(peopleInfo);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return peopleInfoList;
	}
	public List<PeopleNation> getPeopleNation(){
		List<PeopleNation> peopleNationList=new ArrayList<PeopleNation>();
		int houseProId=1;
		try {
			String sql = "select born_city,area,city from born_nation t where t.house_pro_id="+houseProId;
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			String born_city=null;
			float area=0;
			float city=0;
			while(rs.next()){
				born_city=rs.getString("born_city");
				area=rs.getInt("area")/100;
				city=rs.getInt("city")/100;
				PeopleNation peopleNation=new PeopleNation(born_city,area,city);
				peopleNationList.add(peopleNation);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return peopleNationList;
	}
	public List<PeopleForeign> getPeopleForeign(){
		List<PeopleForeign> peopleForeignList=new ArrayList<PeopleForeign>();
		int houseProId=1;
		try {
			String sql = "select t.bron_foreign,t.area,t.city from born_foreigns t where t.house_pro_id="+houseProId;
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			String bron_foreign=null;
			float area=0;
			float city=0;
			while(rs.next()){
				bron_foreign=rs.getString("bron_foreign");
				area=rs.getInt("area")/100;
				city=rs.getInt("city")/100;
				PeopleForeign peopleForeign=new PeopleForeign(bron_foreign,area,city);
				peopleForeignList.add(peopleForeign);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return peopleForeignList;
	}
	public List<FamilyIncome> getFamilyIncome(){
		List<FamilyIncome> familyIncomeList=new ArrayList<FamilyIncome>();
		int houseProId=1;
		try {
			String sql = "select t.family_income,t.area,t.city from family_income t where t.house_pro_id="+houseProId;
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			String family_income=null;
			float area=0;
			float city=0;
			while(rs.next()){
				family_income=rs.getString("family_income");
				area=rs.getInt("area")/100;
				city=rs.getInt("city")/100;
				FamilyIncome familyIncome=new FamilyIncome(family_income,area,city);
				familyIncomeList.add(familyIncome);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return familyIncomeList;
	}
	
}
