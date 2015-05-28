package com.kate.app.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kate.app.model.User;

@Repository 
public class UserDao extends BaseDao {
	public List<User> listUser(){
		List<User> userList=new ArrayList<User>();
		try {
			String sql = "select t.nick_name,t.pwd,t.email,t.tel,t.role from user t where t.id=1";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
		    String nick_name=null;
		    String pwd=null;
		    String email=null;
		    String tel=null;
		    int role=0;
		    while(rs.next()){
		    	nick_name=rs.getString("nick_name");
		    	pwd=rs.getString("pwd");
		    	email=rs.getString("email");
		    	tel=rs.getString("tel");
		    	role=Integer.parseInt(rs.getString("role"));
		    	User user=new User(nick_name, pwd,email, tel, role);
		    	userList.add(user);
		    }
		    
		  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;
	} 
}
