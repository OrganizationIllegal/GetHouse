package com.kate.app.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kate.app.model.BuyInfo;
import com.kate.app.model.HouseProject;
@Repository 
public class BuyInfoDao extends BaseDao{
	public int BuyInfoDao(){
		int returnMoney=0;
		int houseId=1;
		try{
			String sql = " select return_money from Buy_Info where house_info_id="+houseId;
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				BuyInfo buyInfo = new BuyInfo();
				buyInfo.setReturn_money(rs.getInt("return_money"));
				returnMoney=buyInfo.getReturn_money();
			}
		}catch (Exception e) {
            
        }
		return returnMoney;
		
	}

}
