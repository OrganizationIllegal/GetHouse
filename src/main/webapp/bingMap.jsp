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
      <button type="button" class="btn btn-inverse dropdown-toggle" data-toggle="dropdown">房屋类型 <span class="caret"></span>
           </button>
            <ul class="dropdown-menu">
                <li><a href="#">一居室</a></li>
                <li><a href="#">两居室</a></li>
                <li><a href="#">海景房</a></li>
             </ul>
  </div>
  <div class="btn-group" role="group">
     <button type="button" class="btn btn-inverse">价格从低到高</button>
  </div>
  <div class="btn-group" role="group">
    <button type="button" class="btn btn-inverse ">价格从高到低</button>
  </div>
</div>
</div>
<!--endding title-->
<!--begin-->
   <div id="list"  class="brdr bgc-fff pad-10 box-shad btm-mrg-20 property-listing">
   <!--one item-->
   <div id="firsthouse" style="border:1px solid #E6E6FA;padding:0 5 10 5">
       <div>
          <h6>项目地址：澳洲产阳泉开来</h6>
       </div>
      
       <div class="media">
            <a class="pull-left" href="#" target="_parent">
              <img alt="image" class="img-responsive" src="pic/house1.jpg">
            </a>
            <div class="clearfix visible-sm"></div>
            <div class="media-body fnt-smaller">
                <h6 class="media-heading">澳大利亚房产</h6>
                <h6>项目价格<span class="right">$550,000</span></h6>
                <h6>项目面积<span class="right">58-119</span></h6>
                <h6>可售套数<span class="right">47</span></h6>
                <h6>平均单价<span class="right">$550,000</span></h6>
            </div>
       </div>
      </div>
      <!--end item-->
       <!--one item-->
   <div id="firsthouse" style="border:1px solid #E6E6FA;padding:0 5 10 5">
       <div>
          <h6>项目地址：澳洲产阳泉开来</h6>
       </div>
      
       <div class="media">
            <a class="pull-left" href="#" target="_parent">
              <img alt="image" class="img-responsive" src="pic/house1.jpg">
            </a>
            <div class="clearfix visible-sm"></div>
            <div class="media-body fnt-smaller">
                <h6 class="media-heading">澳大利亚房产</h6>
                <h6>项目价格<span class="right">$550,000</span></h6>
                <h6>项目面积<span class="right">58-119</span></h6>
                <h6>可售套数<span class="right">47</span></h6>
                <h6>平均单价<span class="right">$550,000</span></h6>
            </div>
       </div>
      </div>
      <!--end item-->
       <!--one item-->
   <div id="firsthouse" style="border:1px solid #E6E6FA;padding:0 5 10 5">
       <div>
          <h6>项目地址：澳洲产阳泉开来</h6>
       </div>
      
       <div class="media">
            <a class="pull-left" href="#" target="_parent">
              <img alt="image" class="img-responsive" src="pic/house1.jpg">
            </a>
            <div class="clearfix visible-sm"></div>
            <div class="media-body fnt-smaller">
                 <h6 class="media-heading">澳大利亚房产</h6>
                <h6>项目价格<span class="right">$550,000</span></h6>
                <h6>项目面积<span class="right">58-119</span></h6>
                <h6>可售套数<span class="right">47</span></h6>
                <h6>平均单价<span class="right">$550,000</span></h6>
            </div>
       </div>
      </div>
      <!--end item-->
           <!--one item-->
   <div id="firsthouse" style="border:1px solid #E6E6FA;padding:0 5 10 5">
       <div>
          <h6>项目地址：澳洲产阳泉开来</h6>
       </div>
      
       <div class="media">
            <a class="pull-left" href="#" target="_parent">
              <img alt="image" class="img-responsive" src="pic/house1.jpg">
            </a>
            <div class="clearfix visible-sm"></div>
            <div class="media-body fnt-smaller">
                 <h6 class="media-heading">澳大利亚房产</h6>
                <h6>项目价格<span class="right">$550,000</span></h6>
                <h6>项目面积<span class="right">58-119</span></h6>
                <h6>可售套数<span class="right">47</span></h6>
                <h6>平均单价<span class="right">$550,000</span></h6>
            </div>
       </div>
      </div>
      <!--end item-->
   </div>
<!--end-->
</div>

              
     
 </div>
<div class="col-md-8">
 <nav class="navbar navbar-default" role="navigation">
      <div>
      <form class="navbar-form navbar-left" role="search">
         <div class="form-group">
            <input id="txtQuery" type="text" class="form-control" placeholder="coffee in Seattle">
         </div>
         <button type="button" class="btn btn-default" onclick="LoadSearchModule()">Search</button>
      </form>    
      </div>
	<div class="collapse navbar-collapse" id="myCollapse">
      <ul class="nav navbar-nav">
         <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
               房屋类型 
               <b class="caret"></b>
            </a>
            <ul class="dropdown-menu">
               <li><a href="#">一居室</a></li>
               <li><a href="#">两居室</a></li>
               <li><a href="#">海景房</a></li>
            </ul>
         </li>
      </ul>
	   <ul class="nav navbar-nav">
         <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
               价格范围 
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
         <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
               交房时间 
               <b class="caret"></b>
            </a>
            <ul class="dropdown-menu">
               <li><a href="#">四月底</a></li>
               <li><a href="#">五月底</a></li>
               <li><a href="#">六月底</a></li>
            </ul>
         </li>
      </ul>
   </div>
   </nav>
   <div id='myMap' style="position:relative; width:700px; height:600px;"></div>
  </div>
     
   
   </div>
   </div>
   <jsp:include page="foot.jsp" />
</body>

</html>