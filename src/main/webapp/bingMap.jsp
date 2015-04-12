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
   <style type="text/css">
.xian{ border-bottom-width: 1px;
       border-bottom-style: solid;
       border-bottom-color: rgb(204, 204, 204);
       height:1px;}
 .right{
      float:right;
 }
 .left{
 float:left;
 }

 .title{
 width:23%;
 height:auto;
 background:rgb(204,204,204);
 padding:5px 10px 5px 10px ;
 }
 #title{
 border-radius:4px;
 border-top-right-radius:4px;
 border-top-left-radius:4px;
 }
 .navbar-header a{color:LightSlateGray;}
	   .navbar-header a:visited{color:blue;text-decoration:none;}
</style>
</head>
<body style="padding-top: 120px;" onload="getMap();">
 <jsp:include page="head.jsp" />
 <div class="container">
  <div class="row">
 <div class="col-md-4">
  <div id="houselist" >
       <div id="title" style="background:rgb(204,204,204);height:30px;">
          <!--<ul class="nav navbar-nav">
             <li style="padding:5 10 ;">房屋列表</li>
             <li>价格从低到高</li>
             <li>价格从高到低</li>
          </ul>-->
         <!-- <p>
          <span class="left">房屋类型</span>
          <span>价格从低到高</span>
          <span class="right">价格从高到低</span>
          <p/>-->
          <table>
          <tr>
          <td  width="33%">房屋类型</td>
          <td  width="33%">价格从低到高</td>
          <td  width="33%">价格从高到低</td>
          </tr>
          </table>
          <!-- <div class="col-md-3" >
      	<ul class="navbar-header">
       			<a href="#">首页</a>
       			<a>&nbsp|&nbsp</a>
       			<a href="#">海外购房</a>
       			<a>&nbsp|&nbsp</a>
       			<a href="#">购房返现</a>
       			<a>&nbsp|&nbsp</a>
       		</ul>
       </div>-->
       </div>
       <div id="list">
           <table>
            <tbody>
              <!--the first item sstart-->
               <tr><td>项目地址：澳洲产阳泉开来</td></tr>
               <tr>
                <td><img src="images/house1.jpg"></td>
                <td width="25px"></td>
                <td>
                    <p><span>澳大利亚房产</span></p>
                    <p><span>项目价格</span><span>&nbsp&nbsp</span><span class="right">$550,000</span> </p>
                    <p><span>项目面积</span><span>&nbsp&nbsp</span><span class="right">58-119</span></p>
                    <p><span>可售套数</span><span>&nbsp&nbsp</span><span class="right">47</span></p>
                    <p><span>平均单价</span><span>&nbsp&nbsp</span><span class="right">$550,000</span></p>
                </td>
               </tr>
               <tr>
               <td class="xian" colspan="3"></td>
               </tr>
               <!--the first item end-->
               <!--the second item start-->
                <tr><td>项目地址：澳洲产阳泉开来</td></tr>
               <tr>
                <td><img src="images/house1.jpg"></td>
                <td width="25px"></td>
                <td>
                    <p><span>澳大利亚房产</span></p>
                    <p><span>项目价格</span><span class="right">$550,000</span> </p>
                    <p><span>项目面积</span><span class="right">58-119</span></p>
                    <p><span>可售套数</span><span class="right">47</span></p>
                    <p><span>平均单价</span><span class="right">$550,000</span></p>
                </td>
               </tr>
               <tr><td class="xian" colspan="3"></td></tr>
               <!--the second item end-->
           </tbody>
          </table>
       </div>
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