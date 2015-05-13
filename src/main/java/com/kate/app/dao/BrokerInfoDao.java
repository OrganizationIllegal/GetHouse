package com.kate.app.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kate.app.model.BingMapVo;
import com.kate.app.model.BrokerInfo;

@Repository 
public class BrokerInfoDao extends BaseDao {
	public List<BrokerInfo> listBrokerInfo(){
		List<BrokerInfo> brokerInfoList=new ArrayList<BrokerInfo>();
		try {
			String sql = "select t.id,t.broker_img,t.broker_language,t.broker_name,t.broker_region,t.office,t.introduction from broker_info t";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
		    int id=0;
		    String broker_img=null;
		    String broker_language=null;
		    String broker_name=null;
		    String broker_region=null;
		    String office=null;
		    String introduction=null;
		    while(rs.next()){
		    	id=rs.getInt("id");
		    	broker_img=rs.getString("broker_img");
		    	broker_language=rs.getString("broker_language");
		    	broker_name=rs.getString("broker_name");
		    	broker_region=rs.getString("broker_region");
		    	office=rs.getString("office");
		    	introduction=rs.getString("introduction");
		    	BrokerInfo brokerInfo=new BrokerInfo(id,broker_name,broker_language,broker_region, broker_img, office,introduction);
		    	brokerInfoList.add(brokerInfo);
		    }
		    
		  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return brokerInfoList;
	} 
}
