package com.kate.app.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSONArray;
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
					type=rs.getString("type")+"    "+"Լ"+price+"��Ԫ"+"\n"+rs.getString("description");
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
					type=rs.getString("type")+"    "+"Լ"+price+"��Ԫ"+"\n"+rs.getString("description");
					HouseTaxData holdingTaxVo=new HouseTaxData(type,price);
					holdingTaxVoList.add(holdingTaxVo);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return holdingTaxVoList;
	 }
	 //����˰�� List
	 public JSONArray listHouseTax(){
			JSONArray jsonArray=new JSONArray();
			try {
				String sql = "select t.id,t.type,t.price,t.description,t.house_pro_id,h.project_name from  house_tax t LEFT JOIN house_project h on t.house_pro_id=h.id;";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				jsonArray=ResultSetConverter.convert(rs);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return jsonArray;
		} 
	//����˰�� Add
	 public int InsertHouseTax(String type,int price,String description,int house_pro_id){
			int exeResult=0;
			try {
				String sql = "insert into house_tax(type,price,description,house_pro_id) values(?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, type);
				pstmt.setInt(2, price);
				pstmt.setString(3, description);
				pstmt.setInt(4, house_pro_id);
				exeResult = pstmt.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return exeResult;
		}  
	//����˰�� update
	 public int updateHouseTax(int id,String type,int price,String description,int house_pro_id){
			int exeResult=0;
			try {
				String sql = "update house_tax set type=?,price=?,description=? where id=? and house_pro_id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, type);
				pstmt.setInt(2, price);
				pstmt.setString(3, description);
				pstmt.setInt(4, id);
				pstmt.setInt(5, house_pro_id);
				exeResult = pstmt.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return exeResult;
		}
	//����˰�� delete
	 public int delHouseTax(int id){
			int exeResult=0;
			try {
				String sql = "delete from house_tax where id="+id;
				Statement stmt = con.createStatement();
				exeResult = stmt.executeUpdate(sql);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return exeResult;
		}
	//���гɱ� List
	 public JSONArray listHoldingCost(){
			JSONArray jsonArray=new JSONArray();
			try {
				String sql = "select t.id,t.type,t.price,t.description,t.house_pro_id,h.project_name from holding_finace t LEFT JOIN house_project h on t.house_pro_id=h.id";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				jsonArray=ResultSetConverter.convert(rs);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return jsonArray;
		} 
	//���гɱ� Add
	 public int InsertHoldingCost(String type,int price,String description,int house_pro_id){
			int exeResult=0;
			try {
				String sql = "insert into holding_finace(type,price,description,house_pro_id) values(?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, type);
				pstmt.setInt(2, price);
				pstmt.setString(3, description);
				pstmt.setInt(4, house_pro_id);
				exeResult = pstmt.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return exeResult;
		}  
	//���гɱ� update
	 public int updateHoldingCost(int id,String type,int price,String description,int house_pro_id){
			int exeResult=0;
			try {
				String sql = "update holding_finace set type=?,price=?,description=? where id=? and house_pro_id=?";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, type);
				pstmt.setInt(2, price);
				pstmt.setString(3, description);
				pstmt.setInt(4, id);
				pstmt.setInt(5, house_pro_id);
				exeResult = pstmt.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return exeResult;
		}
	//���гɱ� delete
	 public int delHoldingCost(int id){
			int exeResult=0;
			try {
				String sql = "delete from holding_finace where id="+id;
				Statement stmt = con.createStatement();
				exeResult = stmt.executeUpdate(sql);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return exeResult;
		}
}