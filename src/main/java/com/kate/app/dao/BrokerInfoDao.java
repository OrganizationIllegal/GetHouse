package com.kate.app.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

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
		    	/*id=rs.getInt("id");
		    	broker_img=rs.getString("broker_img");
		    	broker_language=rs.getString("broker_language");
		    	broker_name=rs.getString("broker_name");
		    	broker_region=rs.getString("broker_region");
		    	office=rs.getString("office");
		    	introduction=rs.getString("introduction");

		    	BrokerInfo brokerInfo=new BrokerInfo(id,broker_name,broker_language,broker_region, broker_img, office,introduction);
		    	brokerInfoList.add(brokerInfo);*/

		    	//BrokerInfo brokerInfo=new BrokerInfo(id,broker_name,broker_language,broker_region, broker_img, office,introduction);
		    	//brokerInfoList.add(brokerInfo);

		    }
		    
		  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return brokerInfoList;
	} 
	//鍙戦�鐣欒█
	public int InsertMessage(String message_content,String message_time,int project_id,int viewed,int type,int userid){
		int exeResult=0;
		try {
			String sql = "insert into message(message_content,message_time,project_id,viewed,type,userid) values (?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, message_content);
			pstmt.setString(2, message_time);
			pstmt.setInt(3, project_id);
			pstmt.setInt(4, viewed);
			pstmt.setInt(5, type);
			pstmt.setInt(6, userid);
			exeResult = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exeResult;
		
	}
	
	
	
	public List<BrokerInfo> BrokerInfoList(int proId){
		List<BrokerInfo> brokerInfoList=new ArrayList<BrokerInfo>();
		try {
			String sql = "select * from broker_info where house_pro_id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, proId);
			ResultSet rs = pstmt.executeQuery();
			
		    while(rs.next()){
		    	BrokerInfo data = new BrokerInfo();
		    	data.setBroker_experience(rs.getInt("broker_experience"));
		    	data.setBroker_img(rs.getString("broker_img"));
		    	data.setBroker_language(rs.getString("broker_language"));
		    	data.setBroker_name(rs.getString("broker_name"));
		    	data.setBroker_num(rs.getString("broker_num"));
		    	data.setBroker_region(rs.getString("broker_region"));
		    	data.setBroker_type(rs.getString("broker_type"));
		    	data.setBroker_zizhi(rs.getString("broker_zizhi"));
		    	data.setId(rs.getInt("id"));
		    	data.setIntroduction(rs.getString("introduction"));
		    	data.setOffice(rs.getString("office"));
		    	brokerInfoList.add(data);
		    }
		    
		  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return brokerInfoList;
	} 
	
	
	
	
	
}
