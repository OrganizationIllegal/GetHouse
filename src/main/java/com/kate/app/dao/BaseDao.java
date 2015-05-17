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
		    //加载MySql的驱动类   
		    Class.forName("com.mysql.jdbc.Driver") ;   
		}
		catch(ClassNotFoundException e){   
		    System.out.println("找不到驱动程序类 ，加载驱动失败！");   
		    e.printStackTrace() ;   
		}   
		try {
            url = "jdbc:mysql://101.200.174.253/gethouse";
<<<<<<< HEAD
            username = "dboperator2";
            password = "gethouse";
=======
            username = "root";
            password = "gethouse2015";
>>>>>>> 66f097a98aebc8214fa790214879ba3ab7bda7cc
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
           System.out.print("DriverManager.getConnection faild");
           System.out.println(e.toString());
        }
	}
	
	
}
