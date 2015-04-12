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
   <script src="http://echarts.baidu.com/build/dist/echarts-all.js"></script>
   
</head>
<body style="padding-top: 105px;background-color:rgba(233, 243, 248, 1);">
<jsp:include page="head.jsp" />
<div class="container" style="">
<div style="margin-top:20px;background-color:white;">
<ul class="nav nav-tabs" id="MyTabs">
      <li><a href="#home" data-toggle="tab">Home</a></li>
      <li><a href="#profile" data-toggle="tab">Profile</a></li>
      <li class="navbar-text navbar-right">&nbsp;&nbsp;&nbsp;&nbsp;</li>
      <p class="navbar-text navbar-right"><b>���ܼ�50��ıҼ���</b></p>
      <!-- <div class="col-md-2 col-md-pull-5"><p><b>���ܼ�50��ıҼ���</b></p></div> -->
      <!-- <li class="pull-right"><p><b>���ܼ�50��ıҼ���</b></p></li> -->
      <!-- <li class="disabled"><a href="#profile" data-toggle="tab">Web Service</a></li> -->
      <!--<li class="navbar-right">&nbsp;&nbsp;&nbsp;&nbsp;</li> 
      <li class=""><p><b>���ܼ�50��ıҼ���</b></p></li>
      <li class="navbar-right">&nbsp;&nbsp;&nbsp;&nbsp;</li> -->
    </ul>
    
    <div class="tab-content">
      <div class="tab-pane active" id="home">
      	<div style="padding-top:10px;padding-bottom:10px;">
      		<div style="float:left;margin-right:20px;margin-left:20px;">
      			<p>�����ܹ���˰��</p>
      		</div>
      		<div>
      			<select id="MySelect">
				<option>Լ5���Ԫ</option>
				<option>Լ15���Ԫ</option>
				<option>Լ115���Ԫ</option>
				</select>
      		</div>
      	</div>
      	<div>
      		<div id="GouFang_pie" style="height:200px"></div>
      	</div>
      </div> 
      <div class="tab-pane" id="profile">
      	<div style="padding-top:10px;padding-bottom:10px;">
      		<div style="float:left;margin-right:20px;margin-left:20px;">
      			<p>Ԥ��ÿ����гɱ�</p>
      		</div>
      		<div style="float:left;">
      			<select id="MySelect1">
				<option value='5'>Լ5���Ԫ</option>
				<option value='15'>Լ15���Ԫ</option>
				<option value='115'>Լ115���Ԫ</option>
				</select>
      		</div>
      		<div style="margin-left:20px;float:left;">
      			<p>˰�ѷ�Χ</p>
      		</div>
      		<div style="margin-left:20px;float:left;">
      			<p>Լ1���Ԫ</p>
      		</div>
      		<div style="margin-left:20px;float:left;">
      			<p>Լ7���Ԫ</p>
      		</div>
      	</div>
      	<div>
      		<div id="ChengBen_pie" style="height:200px">
      			</div>
      	</div>
      </div> 
      
  	</div>
</div>
<div  style="margin-top:20px;background-color:white;">
 <ul class="nav nav-tabs nav-justified" id="MyTabs">
      <li><a href="#price" data-toggle="tab">South MelBourne������λ����������</a></li>
      <li><a href="#rent" data-toggle="tab">South MelBourne�����������</a></li>
      <li><a href="#emptypercent" data-toggle="tab">South MelBourne�������������</a></li>
     <!-- <p class="navbar-text navbar-right">Signed in as Mark Otto</p>-->
    </ul>
    
    <div class="tab-content">
      <div class="tab-pane active" id="price">
      	<div>
      		<div id="price_line" style="height:250px"></div>
      	</div>
      </div> 
      <div class="tab-pane" id="rent">
      	<div>
      		<div id="rent_line" style="height:250px">
      			</div>
      	</div>
      </div> 
      <div class="tab-pane" id="emptypercent">
      	<div>
      		<div id="emptypercent_line" style="height:250px">
      			</div>
      	</div>
      </div> 
  	</div>
</div>
<div style="margin-top:20px;background-color:white;">
<div class="panel panel-default">
	  <div class="panel-heading">South Melbourne�����ͥ�������</div>
	  <div class="panel-body">
	  	<div id="zonefamily_pie" style="height:200px">
      	</div>
	  </div>
	</div>
</div>
</div>
 <jsp:include page="foot.jsp" /> 
 <script src="/js/familyStatus.js"></script>
 <script src="/js/trend.js"></script>
 <script src="/js/cost.js"></script>
</body>
</html>