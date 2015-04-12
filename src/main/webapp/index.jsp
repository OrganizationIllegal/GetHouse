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
   <script type="text/javascript" src="http://ecn.dev.virtualearth.net/mapcontrol/mapcontrol.ashx?v=7.0"></script>
   <script src="/js/bingMap.js"></script>
</head>
<body style="padding-top: 105px;background-color:rgba(233, 243, 248, 1);" onload="getMap();">
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
<div style="margin-top:20px;background-color:white;">
<div class="panel panel-default">
	  <div class="panel-heading">��Ŀλ��</div>
	  <div class="panel-body">
	  	<div id="zonefamily_pie" style="height:370px">
	  	<div class="row">
	  	<div class="col-md-6">
	  	<div id='myMap' style="position:relative; width:550px; height:370px;"></div>
	  	</div>
	  	<div class="col-md-6"></div>
	  	 <div><img src="images/streetside.png"></div>
	  	</div>
      	</div>
	  </div>
	</div>
</div>
<div style="margin-top:20px;background-color:white;padding:40px 0px;">
<div class="row" style="height:200px;">
<div class="col-md-2"></div>
 <div class="col-md-2" style="padding-left:70px;padding-right:0px;">
 <div><img src="images/buy.png"></div>
 <div style="color:#FF7F00;font-weight:900;font-size:28px;">&nbsp;&nbsp;$561,000</div>
 </div>
 <div class="col-md-3" style="padding-left:50px;width:340px;">
 <div style="color:#000000;font-weight:900;font-size:16px;">South Melbourne��λ����Ԣ����</div>
 <div style="color:#333;font-size:8px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�۸�����������Ϊ2015.02.02</div>
 </div>
 <div class="col-md-4">
 <div><img src="images/rent.png"></div>
 <div style="color:#27408B;font-weight:900;font-size:25px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;560/��</div>
 </div>
</div>
<div class="row">
<div class="col-md-5 col-md-offset-1">
 <div class="btn-toolbar btn-group-lg" role="toolbar" aria-label="...">
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;">
     <div style="color:#FF7F00;font-weight:900;">1��</div>
     <div style="color:#000000;font-weight:900;">$409,000</div>
     </button>
      <button type="button" class="btn btn-inverse" style="height:100px;width:140px;">
     <div style="color:#FF7F00;font-weight:900;">2��</div>
     <div style="color:#000000;font-weight:900;">$409,000</div>
     </button>
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;">
     <div style="color:#FF7F00;font-weight:900;">3��</div>
     <div style="color:#000000;font-weight:900;">$409,000</div>
     </button>
 </div></div>
 <div class="col-md-6">
 <div class="btn-toolbar btn-group-lg" role="toolbar" aria-label="...">
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;">
     <div style="color:#27408B;font-weight:900;">1��</div>
     <div style="color:#000000;font-weight:900;">$409</div>
     </button>
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;">
     <div style="color:#27408B;font-weight:900;">2��</div>
     <div style="color:#000000;font-weight:900;">$409</div>
     </button>
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;">
     <div style="color:#27408B;font-weight:900;">3��</div>
     <div style="color:#000000;font-weight:900;">$409</div>
     </button>
 </div></div>
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