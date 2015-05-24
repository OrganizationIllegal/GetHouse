<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
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
   <script type="text/javascript" src="http://ecn.dev.virtualearth.net/mapcontrol/mapcontrol.ashx?v=7.0&mkt=zh-cn"></script> 
   <script src="/js/bingMap.js"></script>

   <link href="/css/mapleft.css" rel="stylesheet">
 <script>
 function order(){
 }
 $(function(){
 	 $('#orderasc').click(function () {
 	       alert("kaslajsl")
             $.ajax({
	 	    type: "POST",
	 		data: { order : 1},
	 		dateType: "json",
	 		url: "/BingMap/OrderByPrice",
	 		
	 		success:function(data){
	 			alert("鍒犻櫎鎴愬姛")
	 			window.location.reload();
	 		},
	 		error:function(){
	 			alert("error")
	 		}
        });
        });
 
 })
</script>
</head>
<body style="padding-top: 105px;" onload="getMap();">
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
                <li><a href="/BingMap/FileterType?house_type=1">公寓</a></li>
                <li><a href="/BingMap/FileterType?house_type=2">别墅</a></li>
                <li><a href="/BingMap/FileterType?house_type=3">联排别墅</a></li>
             </ul>
  </div>
  <div class="btn-group" role="group">
     <button type="button" class="btn btn-inverse"><a href="/BingMap/OrderByPrice?order=1">价格从低到高</a></button>
  </div>
  <div class="btn-group" role="group">
    <button type="button" class="btn btn-inverse "><a href="/BingMap/OrderByPrice?order=2">价格从高到低</a></button>
  </div>
</div>
</div>
    
<!--begin-->
   <div id="list"  class="brdr bgc-fff pad-10 box-shad btm-mrg-20 property-listing">
   <!--one item-->
   <c:forEach var="item" items="${bingMapList}"> 
   <div id="firsthouse" style="border:1px solid #E6E6FA;padding:0 5 10 5">
       <div>
          <h6>项目地址：${item.project_address}</h6>
       </div>
      
       <div class="media">
            <a class="pull-left" href="/Index?proNum=${item.project_num}" target="_parent">
              <!-- <img alt="image" class="img-responsive" src="pic/house1.jpg">  -->
              <img alt="image" class="img-responsive" src="${item.project_img}" width="100" > 
            </a>
            <div class="clearfix visible-sm"></div>
            <div class="media-body fnt-smaller">
                <h6 class="media-heading">${item.project_name}</h6>
                <h6>项目价格<span class="right">${item.project_min_price}<span>-</span>${item.project_high_price}</span></h6>
                <h6>项目面积<span class="right">${item.minArea}-${item.maxArea}<span>${item.mianji}</span></h6>
                <h6>可售套数<span class="right">${item.keshou}</span></h6>
                <h6>平均单价<span class="right"><span>$</span>${item.average_price}</span></h6>
                <h6>房屋类型<span class="right">${item.house_type}</span></h6>
            </div>
       </div>
      </div>
     </c:forEach> 
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
            <input id="keyWord" name="keyword" type="text" placeholder="Melbourne墨尔本" class="form-control" style="width:235px;height:20px;">
         </div>
         <!--<button type="button" onclick="LoadSearchModule()">搜索</button>-->
         <a href="#" onclick="addPushpinsearch()">搜索</a>
      </form>    
      </div>
	<div class="col-md-6 col-md-offset-1" id="dropdown">
      <ul class="nav navbar-nav">
      	<!-- <li class="divider-vertical"></li>-->
         <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="padding:8px 10px 15px 0px;">
               房屋类型 
               <b class="caret"></b>
            </a>
            <ul class="dropdown-menu">
               <li><a href="#" onclick="addPushpin1()">一居室</a></li>
               <li><a href="#" onclick="addPushpin2()">两居室</a></li>
               <li><a href="#" onclick="addPushpin3()">三居室</a></li>
               <li><a href="#" onclick="addPushpin4()">四居室</a></li>
            </ul>
         </li>
      </ul>
	   <!--<ul class="nav navbar-nav">
	   <li class="divider-vertical"></li>
         <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="padding:8px 10px 15px 0px;">
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
	   <li class="divider-vertical"></li>
         <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="padding:8px 10px 15px 0px;">
               交房时间 
               <b class="caret"></b>
            </a>
            <ul class="dropdown-menu">
               <li><a href="#">四月底</a></li>
               <li><a href="#">五月底</a></li>
               <li><a href="#">六月底</a></li>
            </ul>
         </li>
      </ul>-->
   </div>
   </div>
   </nav>


   <div id='myMap' style="position:relative; width:765px; height:750px;"></div>
  </div>    
   </div>
   </div>
   <!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" 
   aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content" style="margin-left:-300px;height:600px;width:1210px;">
         <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" id="myModalLabel">
               Bing Maps
            </h4>
         </div>
         <div class="modal-body">
            <div id='popMap' style="position:relative; width:1170px; height:500px;"></div>
         </div>
   
      </div>
</div>
</div>
<!-- 模态框 -->
   <jsp:include page="foot.jsp" />
</body>

</html>