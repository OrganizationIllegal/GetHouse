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
   <script type="text/javascript" src="http://ecn.dev.virtualearth.net/mapcontrol/mapcontrol.ashx?v=7.0"></script> 
   <script src="/js/bingMap.js"></script>
   <link href="/css/mapleft.css" rel="stylesheet">
</head>
<body style="padding-top: 120px;" onload="getMap();">
 <jsp:include page="head.jsp" />
 <div class="container">
  <div class="row">
 <div class="col-md-4">
 <!--beginning houselist-->
<div id="houselist"  style="overflow-y:scroll;" >
       <div id="title"  >
          <div class="btn-group btn-group-justified" role="group" aria-label="...">
  <div class="btn-group" role="group">
      <button type="button" class="btn btn-inverse dropdown-toggle" data-toggle="dropdown">�������� <span class="caret"></span>
           </button>
            <ul class="dropdown-menu">
                <li><a href="#">һ����</a></li>
                <li><a href="#">������</a></li>
                <li><a href="#">������</a></li>
             </ul>
  </div>
  <div class="btn-group" role="group">
     <button type="button" class="btn btn-inverse">�۸�ӵ͵���</button>
  </div>
  <div class="btn-group" role="group">
    <button type="button" class="btn btn-inverse ">�۸�Ӹߵ���</button>
  </div>
</div>
</div>
<!--endding title-->
<!--begin-->
   <div id="list"  class="brdr bgc-fff pad-10 box-shad btm-mrg-20 property-listing">
   <!--one item-->
   <div id="firsthouse" style="border:1px solid #E6E6FA;padding:0 5 10 5">
       <div>
          <h6>��Ŀ��ַ�����޲���Ȫ����</h6>
       </div>
      
       <div class="media">
            <a class="pull-left" href="#" target="_parent">
              <img alt="image" class="img-responsive" src="pic/house1.jpg">
            </a>
            <div class="clearfix visible-sm"></div>
            <div class="media-body fnt-smaller">
                <h6 class="media-heading">�Ĵ����Ƿ���</h6>
                <h6>��Ŀ�۸�<span class="right">$550,000</span></h6>
                <h6>��Ŀ���<span class="right">58-119</span></h6>
                <h6>��������<span class="right">47</span></h6>
                <h6>ƽ������<span class="right">$550,000</span></h6>
            </div>
       </div>
      </div>
      <!--end item-->
       <!--one item-->
   <div id="firsthouse" style="border:1px solid #E6E6FA;padding:0 5 10 5">
       <div>
          <h6>��Ŀ��ַ�����޲���Ȫ����</h6>
       </div>
      
       <div class="media">
            <a class="pull-left" href="#" target="_parent">
              <img alt="image" class="img-responsive" src="pic/house1.jpg">
            </a>
            <div class="clearfix visible-sm"></div>
            <div class="media-body fnt-smaller">
                <h6 class="media-heading">�Ĵ����Ƿ���</h6>
                <h6>��Ŀ�۸�<span class="right">$550,000</span></h6>
                <h6>��Ŀ���<span class="right">58-119</span></h6>
                <h6>��������<span class="right">47</span></h6>
                <h6>ƽ������<span class="right">$550,000</span></h6>
            </div>
       </div>
      </div>
      <!--end item-->
       <!--one item-->
   <div id="firsthouse" style="border:1px solid #E6E6FA;padding:0 5 10 5">
       <div>
          <h6>��Ŀ��ַ�����޲���Ȫ����</h6>
       </div>
      
       <div class="media">
            <a class="pull-left" href="#" target="_parent">
              <img alt="image" class="img-responsive" src="pic/house1.jpg">
            </a>
            <div class="clearfix visible-sm"></div>
            <div class="media-body fnt-smaller">
                 <h6 class="media-heading">�Ĵ����Ƿ���</h6>
                <h6>��Ŀ�۸�<span class="right">$550,000</span></h6>
                <h6>��Ŀ���<span class="right">58-119</span></h6>
                <h6>��������<span class="right">47</span></h6>
                <h6>ƽ������<span class="right">$550,000</span></h6>
            </div>
       </div>
      </div>
      <!--end item-->
           <!--one item-->
   <div id="firsthouse" style="border:1px solid #E6E6FA;padding:0 5 10 5">
       <div>
          <h6>��Ŀ��ַ�����޲���Ȫ����</h6>
       </div>
      
       <div class="media">
            <a class="pull-left" href="#" target="_parent">
              <img alt="image" class="img-responsive" src="pic/house1.jpg">
            </a>
            <div class="clearfix visible-sm"></div>
            <div class="media-body fnt-smaller">
                 <h6 class="media-heading">�Ĵ����Ƿ���</h6>
                <h6>��Ŀ�۸�<span class="right">$550,000</span></h6>
                <h6>��Ŀ���<span class="right">58-119</span></h6>
                <h6>��������<span class="right">47</span></h6>
                <h6>ƽ������<span class="right">$550,000</span></h6>
            </div>
       </div>
      </div>
      <!--end item-->
   </div>
<!--end-->
</div>

              
     
 </div>
<div class="col-md-8" style="padding-left:0px;">
 <nav class="navbar navbar-default" role="navigation" style="background-color: #9FB6CD;margin-bottom: 0px;min-height:30px;height:38px;">
      <div class="row" style="height:34px;">
      <div class="col-md-5">
      <form class="navbar-form navbar-left" role="search" id="form">
         <div class="form-group has-feedback">
            <!--<i class="glyphicon glyphicon-search form-control-feedback"></i>-->
            <input id="txtQuery" type="text" placeholder="Melbourneī����" class="form-control" style="width:235px;height:20px;">
         </div>
         <!--<button type="button" onclick="LoadSearchModule()">����</button>-->
         <a href="#" onclick="LoadSearchModule()">����</a>
      </form>    
      </div>
	<div class="col-md-6 col-md-offset-1" id="dropdown">
      <ul class="nav navbar-nav">
      	 <li class="divider-vertical"></li>
         <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="padding:8px 10px 15px 0px;">
               �������� 
               <b class="caret"></b>
            </a>
            <ul class="dropdown-menu">
               <li><a href="#">һ����</a></li>
               <li><a href="#">������</a></li>
               <li><a href="#">������</a></li>
            </ul>
         </li>
      </ul>
	   <ul class="nav navbar-nav">
	   <li class="divider-vertical"></li>
         <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="padding:8px 10px 15px 0px;">
               �۸�Χ 
               <b class="caret"></b>
            </a>
            <ul class="dropdown-menu">
               <li><a href="#">1000-2000</a></li>
               <li><a href="#">3000-4000</a></li>
               <li><a href="#">5000-6000</a></li>
            </ul>
         </li>
      </ul>
	   <ul class="nav navbar-nav">
	   <li class="divider-vertical"></li>
         <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="padding:8px 10px 15px 0px;">
               ����ʱ�� 
               <b class="caret"></b>
            </a>
            <ul class="dropdown-menu">
               <li><a href="#">���µ�</a></li>
               <li><a href="#">���µ�</a></li>
               <li><a href="#">���µ�</a></li>
            </ul>
         </li>
      </ul>
   </div>
   </div>
   </nav>
   <div id='myMap' style="position:relative; width:765px; height:750px;"></div>
  </div>    
   </div>
   </div>
   <jsp:include page="foot.jsp" />
</body>

</html>