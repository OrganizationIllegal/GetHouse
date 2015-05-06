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
   <link href="/css/pagination.css" rel="stylesheet">
   <script src="/js/jquery.min.js"></script>
   <script src="/bootstrap/js/bootstrap.min.js"></script>
   <script src="/js/jquery.pagination.js"></script>
</head>
<body style="padding-top: 105px;">
 <jsp:include page="head.jsp" />
 <div class="container">
 <div class="row" style="padding-top:20px;">
 <div class="col-md-4"></div>
 <div class="col-md-5">
  <div id="example"></div>
  <ul class="pagination">
  <li><a href="#">&laquo;</a></li>
  <li><a href="#">1</a></li>
  <li><a href="#">2</a></li>
  <li><a href="#">3</a></li>
  <li><a href="#">4</a></li>
  <li><a href="#">5</a></li>
  <li><a href="#">6</a></li>
  <li><a href="#">7</a></li>
  <li><a href="#">8</a></li>
  <li><a href="#">9</a></li>
  <li><a href="#">10</a></li>
  <li><a href="#">&raquo;</a></li>
</ul> 
 </div>
 <!--<div class="col-md-1" style="margin-left:-50px;">
 <div class="btn-group">
    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" style="width:80px;margin-top:20px;margin-bottom:0px;background-color:#DBDBDB;">
      排序
      <span class="caret"></span>
    </button>
    <ul class="dropdown-menu">
      <li><a href="#">升序</a></li>
      <li><a href="#">降序</a></li>
    </ul>
  </div>
 </div>-->
 <div class="col-md-3" style="padding-top:10px;padding-left:30px;">
 <div class="btn-group">
  <button type="button" class="btn btn-warning" style="width:100px;"><a href="bingMap.jsp">地图找房</a></button>
  <button type="button" class="btn btn-warning" style="width:100px;"><a href="#">列表找房</a></button>
</div>
 </div>
 </div>
 <div class="row">
 <div class="col-md-2">
 <div style="color:#007fff;font-size:16px;font-weight:bold;margin-bottom:10px;">进一步搜索</div>
 <div style="font-weight:bold">房产</div>
 </div>
 <div class="col-md-10">
 <!--start item1-->
  <div class="panel panel-default">
  	<div class="panel-heading" style="background-color:rgb(21,63,101);"><span style="color:white">澳大利亚房产</span><span style="color:white">WON GSG JG DS GDSJIG</span></div>
  	 <div class="panel-body">
  	       <div id="item" >
           		  <div class="media">
           		      <div class="col-xs-5">
          			 	 <a class="pull-left" href="#" target="_parent">
              				<img alt="image" class="img-responsive" src="pic/house2.jpg">
           			  	 </a>
           			  </div>
           		 	  <div class="media-body fnt-smaller" style="padding:0 0 0 15px">
                		 <div class="col-xs-8">
                		 	<h4><b>完整的购房服务</b></h4>
                		 	<hr/>
                		 	<span>7*24小时全天候在线，全</span><br/>
                		 	<span>方位服务的专业代理服务。</span><br/>
                		 	<span>我们提供了基于您的满意付费房地产经纪人。</span>
                		 	<br/>
                		 	<br/>
                		 	<br/>
                		 	<img alt="image" class="img-responsive" src="pic/logo2.png">
                		 </div>
                		  <div class="col-xs-4">
                		     <h4><b>详情简介</b></h4>
                		     <hr/>
                		     <b>最多：</b><span class="right">$550,000</span><br/>
                		     <b>最少</b><span class="right">$299,000</span><br/>
                		     <b>面积(M2)</b>:<span class="right">58-119</span><br/>
                		     <b>可售:</b><span class="right">47</span><br/>
                		     <b>返现:</b><span class="right">$117</span><br/>
                		 </div>
            		 </div>
      			 </div>
     		 </div>
     </div>
  </div>
  <!--end item1-->
  <!--start item2-->
 <div class="panel panel-default">
  	<div class="panel-heading" style="background-color:rgb(21,63,101);"><span style="color:white">澳大利亚房产</span><span style="color:white">WON GSG JG DS GDSJIG</span></div>
  	 <div class="panel-body">
  	       <div id="item" >
           		  <div class="media">
           		      <div class="col-xs-5">
          			 	 <a class="pull-left" href="#" target="_parent">
              				<img alt="image" class="img-responsive" src="pic/house2.jpg">
           			  	 </a>
           			  </div>
           		 	  <div class="media-body fnt-smaller" style="padding:0 0 0 15px">
                		 <div class="col-xs-8">
                		 	<h4><b>完整的购房服务</b></h4>
                		 	<hr/>
                		 	<span>7*24小时全天候在线，全</span><br/>
                		 	<span>方位服务的专业代理服务。</span><br/>
                		 	<span>我们提供了基于您的满意付费房地产经纪人。</span>
                		 	<br/>
                		 	<br/>
                		 	<br/>
                		 	<img alt="image" class="img-responsive" src="pic/logo2.png">
                		 </div>
                		  <div class="col-xs-4">
                		     <h4><b>详情简介</b></h4>
                		     <hr/>
                		     <b>最多：</b><span class="right">$550,000</span><br/>
                		     <b>最少</b><span class="right">$299,000</span><br/>
                		     <b>面积(M2)</b>:<span class="right">58-119</span><br/>
                		     <b>可售:</b><span class="right">47</span><br/>
                		     <b>返现:</b><span class="right">$117</span><br/>
                		 </div>
            		 </div>
      			 </div>
     		 </div>
     </div>
  </div>
  <!--end item2-->
 </div>
 </div>
 <div class="row" style="padding-top:20px;">
 <div class="col-md-4"></div>
 <div class="col-md-5">
  <div id="example"></div>
  <ul class="pagination">
  <li><a href="#">&laquo;</a></li>
  <li><a href="#">1</a></li>
  <li><a href="#">2</a></li>
  <li><a href="#">3</a></li>
  <li><a href="#">4</a></li>
  <li><a href="#">5</a></li>
  <li><a href="#">6</a></li>
  <li><a href="#">7</a></li>
  <li><a href="#">8</a></li>
  <li><a href="#">9</a></li>
  <li><a href="#">10</a></li>
  <li><a href="#">&raquo;</a></li>
</ul> 
 </div>
 <!--<div class="col-md-1" style="margin-left:-50px;">
 <div class="btn-group">
    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" style="width:80px;margin-top:20px;margin-bottom:0px;background-color:#DBDBDB;">
      排序
      <span class="caret"></span>
    </button>
    <ul class="dropdown-menu">
      <li><a href="#">升序</a></li>
      <li><a href="#">降序</a></li>
    </ul>
  </div>
 </div>-->
 <div class="col-md-3" style="padding-top:10px;padding-left:30px;">
 <div class="btn-group">
  <button type="button" class="btn btn-warning" style="width:100px;"><a href="bingMap.jsp">地图找房</a></button>
  <button type="button" class="btn btn-warning" style="width:100px;"><a href="#">列表找房</a></button>
</div>
 </div>
 </div>
</div>
   <jsp:include page="foot.jsp" />
</body>

</html>