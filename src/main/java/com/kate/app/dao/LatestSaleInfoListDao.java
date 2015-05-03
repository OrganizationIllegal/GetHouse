package com.kate.app.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kate.app.model.LatestSaleInfoVo;

@Repository 
public class LatestSaleInfoListDao extends BaseDao {
	public List<LatestSaleInfoVo> getLatestSaleInfo(){
		List<LatestSaleInfoVo> latestSaleList=new ArrayList<LatestSaleInfoVo>();
		int houseProId=1;
		try {
			String sql = " select address,price,sales_type,sales_time,chuang_num from sucess_info t where  t.house_pro_id="+houseProId;
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			String address=null;
			int price=0;
			String sales_type=null;
			String sales_time=null;
			int chuang_num=0;
			while(rs.next()){
				address=rs.getString("address");
				price=rs.getInt("price");
				sales_type=rs.getString("sales_type");
				sales_time=rs.getString("sales_time").substring(0, 10);
				chuang_num=rs.getInt("chuang_num");
				LatestSaleInfoVo latestSaleInfoVo=new LatestSaleInfoVo(address,price,chuang_num,sales_type,sales_time);
				latestSaleList.add(latestSaleInfoVo);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return latestSaleList;
	}

}
