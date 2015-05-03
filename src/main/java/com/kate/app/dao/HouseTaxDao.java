package com.kate.app.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kate.app.model.HoldingTaxVo;
import com.kate.app.model.HouseTaxData;
import com.kate.app.model.HouseTaxVo;
@Repository 
public class HouseTaxDao extends BaseDao {
	 public List<HouseTaxVo> getHouseTaxVo(){
		  List<HouseTaxVo> houseTaxVoList=new ArrayList<HouseTaxVo>();
		  int houseProId=1;
		  try {
				String sql = "select type,price,description from house_tax t where t.house_pro_id="+houseProId;
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				String type=null;
				int price=0;
				String description=null;
				while(rs.next()){
					type=rs.getString("type");
					price=rs.getInt("price");
					description=rs.getString("description");
					HouseTaxVo houseTaxVo=new HouseTaxVo(type,price,description) ;
					houseTaxVoList.add(houseTaxVo);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return houseTaxVoList;
	  }
	 public List<HoldingTaxVo> getHoldingTaxVo(){
		  List<HoldingTaxVo> holdingTaxVoList=new ArrayList<HoldingTaxVo>();
		  int houseProId=1;
		  try {
				String sql = "select type,price,description from holding_finace t where t.house_pro_id="+houseProId;
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				String type=null;
				int price=0;
				String description=null;
				while(rs.next()){
					type=rs.getString("type");
					price=rs.getInt("price");
					description=rs.getString("description");
					HoldingTaxVo holdingTaxVo=new HoldingTaxVo(type,price,description) ;
					holdingTaxVoList.add(holdingTaxVo);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return holdingTaxVoList;
	  }
	 public List<HouseTaxData> getHouseTaxData(){
		  List<HouseTaxData> holdingTaxVoList=new ArrayList<HouseTaxData>();
		  int houseProId=1;
		  try {
				String sql = "select type,price,description from house_tax t where t.house_pro_id="+houseProId;
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				String type=null;
				int price=0;
				String description=null;
				while(rs.next()){
					price=rs.getInt("price");
					type=rs.getString("type")+"    "+"约"+price+"澳元"+"\n"+rs.getString("description");
					HouseTaxData holdingTaxVo=new HouseTaxData(type,price);
					holdingTaxVoList.add(holdingTaxVo);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return holdingTaxVoList;
	  }
	 public List<HouseTaxData> getHoldingData(){
		 List<HouseTaxData> holdingTaxVoList=new ArrayList<HouseTaxData>();
		  int houseProId=1;
		  try {
				String sql = "select type,price,description from holding_finace t where t.house_pro_id="+houseProId;
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				String type=null;
				int price=0;
				String description=null;
				while(rs.next()){
					price=rs.getInt("price");
					type=rs.getString("type")+"    "+"约"+price+"澳元"+"\n"+rs.getString("description");
					HouseTaxData holdingTaxVo=new HouseTaxData(type,price);
					holdingTaxVoList.add(holdingTaxVo);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return holdingTaxVoList;
	 }

}
