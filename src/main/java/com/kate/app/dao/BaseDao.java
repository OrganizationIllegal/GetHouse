package com.kate.app.dao;


import java.sql.Connection;
import java.sql.DriverManager;




public class BaseDao {
	
	protected static String url = null;
	protected static String username = null;
	protected static String password = null;
	static {
		System.out.println("fffffffff");
		try{   
		    //����MySql��������   
		    Class.forName("com.mysql.jdbc.Driver") ;   
		}
		catch(ClassNotFoundException e){   
		    System.out.println("�Ҳ������������� ����������ʧ�ܣ�");   
		    e.printStackTrace() ;   
		}   
		try {
            url = "jdbc:mysql://localhost:3306/test";
            username = "root";
            password = "admin"; 
        } catch (Exception e) {
           
        }
	}
}
