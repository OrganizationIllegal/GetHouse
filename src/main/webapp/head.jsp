<%@ page language="java" import="java.util.*" pageEncoding="gb2312" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
   <title>HouseSale</title>
   <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
   <script src="/js/jquery.min.js"></script>
   <script src="/bootstrap/js/bootstrap.min.js"></script>
   <link href="/css/index.css" rel="stylesheet">
</head>
<body style="padding-top: 120px;">
 <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="row" style="background-color:rgba(19, 51, 89, 1);">
	  <div class="col-md-1"></div>
      <div class="col-md-6" >
      <span style="font-size:20px;color:yellow;style="text-align:bottom;">海豚会(haitunhui,cn)</span>
      <span style="font-size:15px;color:white;">由经理人联合中国商业领袖共同发起</span>
      </div>
      <div class="col-md-2" >
       <span class="glyphicon glyphicon-phone-alt" style="font-size:20px;color:yellow;"></span>
       <span style="font-size:20px;color:yellow;">400-810-9685</span>
       </div>     
       <div class="col-md-2">      
       		<ul class="navbar-header">
       			<a class="glyphicon glyphicon-user" style="font-size:20px;color:white;"></a>
       			<a href="#" style="color:white;">会员登录</a>
       			<a style="color:white;">&nbsp|&nbsp</a>
       			<a href="#" style="color:yellow;">注册</a>
       		</ul>
       </div>
       <div class="col-md-1"></div>
       </div>
   <div class="row"style="background-color:white;padding-top:30px;">
		<div class="col-md-1"></div>
		<div class="col-md-2">
		  <span style="font-size:20px;color:black;style="text-align:bottom;">胜意行</span>
		</div>
       <div class="col-md-6" >
      	<ul class="navbar-header">
       			<a href="#">首页</a>
       			<a>&nbsp|&nbsp</a>
       			<a href="#">海外购房</a>
       			<a>&nbsp|&nbsp</a>
       			<a href="#">购房返现</a>
       			<a>&nbsp|&nbsp</a>
       			<a href="#">海外贷款</a>
       			<a>&nbsp|&nbsp</a>
       			<a href="#">服务团队</a>
       			<a>&nbsp|&nbsp</a>
       			<a href="#">置业指导</a>
       			<a>&nbsp|&nbsp</a>
       			<a href="#">海外新闻</a>
       			<a>&nbsp|&nbsp</a>
       			<a href="#">关于我们</a>
       		</ul>
       </div>  
       <div class="col-md-2" >	
       	<ul class="navbar-header">
       	<a class="glyphicon glyphicon-list-alt" style="font-size:20px;color:LightSlateGray ;"></a>
       		<a href="#"style="font-size:20px;color:LightSlateGray ;">Blog</a>
       	</ul>
       	</div>
       <div class="col-md-1"></div>
   </div>
</nav>
</body>
</html>