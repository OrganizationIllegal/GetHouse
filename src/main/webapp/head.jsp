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
<body>
 <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="row" style="background-color:rgba(19, 51, 89, 1);padding-top:10px;padding-bottom: 5px;">
	  <div class="col-md-1"></div>
      <div class="col-md-6" >
      <span style="font-size:18px;color:yellow;style="text-align:bottom;font-family:SimHei;">�����(haitunhui.cn)</span>
      <span style="font-size:8px;color:white;font-family:SimHei;">�ɡ������ˡ������й���ҵ���乲ͬ����ġ������ƶ��������������ǻ��͹�����֯��</span>
      </div>
      <div class="col-md-2 col-md-offset-1" >
       <span class="glyphicon glyphicon-phone-alt" style="font-size:18px;color:yellow;"></span>
       <span style="font-size:18px;color:yellow;">400&nbsp;810&nbsp;9685</span>
       </div>     
       <div class="col-md-2" style="margin-left:-50px;">      
       		<div>
       			<span class="glyphicon glyphicon-user" style="color:white;"></span>
       			<a href="#" style="color:white;font-size:12px;font-family:SimHei;">��Ա��¼</a>
       			<span class="divider-vertical"></span>
       			<a href="#" style="color:yellow;font-size:12px;font-family:SimHei;">ע��</a>
       		</div>
       </div>
       </div>
   <div class="row"style="background-color:white;padding-top:25px;">
		<div class="col-md-1"></div>
		<div class="col-md-2">
		  <img src="images/logo.PNG" style="margin-top:-20px;"/>
		</div>
       <div class="col-md-7" >
      	<div class="navbar-header" id="headbar">
       			<a href="#">��ҳ</a>
       			<span class="divider-vertical" style="margin-left:20px;"></span>
       			<a href="#">���⹺��</a>
       			<span class="divider-vertical" style="margin-left:20px;"></span>
       			<a href="#">��������</a>
       			<span class="divider-vertical" style="margin-left:20px;"></span>
       			<a href="#">�������</a>
       			<span class="divider-vertical" style="margin-left:20px;"></span>
       			<a href="#">�����Ŷ�</a>
       			<span class="divider-vertical" style="margin-left:20px;"></span>
       			<a href="#">��ҵָ��</a>
       			<span class="divider-vertical" style="margin-left:20px;"></span>
       			<a href="#">��������</a>
       			<span class="divider-vertical" style="margin-left:20px;"></span>
       			<a href="#">��������</a>
       		</div>
       </div>  
       <div class="col-md-1" >	
       	<div>
       	<span class="glyphicon glyphicon-list-alt" style="color:#9C9C9C;"></span>
       		<a href="#"style="font-size:17px;color:#9C9C9C;font-weight:bold;">Blog</a>
       	</div>
       	</div>
       <div class="col-md-1"></div>
   </div>
</nav>
</body>
</html>