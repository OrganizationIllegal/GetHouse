package com.kate.app.dao;


import java.sql.Connection;
import java.sql.DriverManager;




public class BaseDao {
	
	protected static String url = null;
	protected static String username = null;
	protected static String password = null;
	protected static Connection con = null;
	static {
		try{   
		    //����MySql������   
		    Class.forName("com.mysql.jdbc.Driver") ;   
		}
		catch(ClassNotFoundException e){   
		    System.out.println("�Ҳ���������� ��������ʧ�ܣ�");   
		    e.printStackTrace() ;   
		}   
		try {
            url = "jdbc:mysql://101.200.174.253/gethouse";

            username = "dboperator2";
            password = "gethouse";
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
           System.out.print("DriverManager.getConnection faild");
           System.out.println(e.toString());
        }
	}
	
	
}
