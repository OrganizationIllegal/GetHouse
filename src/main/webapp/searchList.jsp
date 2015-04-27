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
   <script src="/bootstrap/js/bootstrap-paginator.min.js"></script>
</head>
<body style="padding-top: 105px;">
 <jsp:include page="head.jsp" />
 <div class="container">
 <div class="row" style="padding-top:20px;">
 <div class="col-md-3"></div>
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
 <div class="col-md-1" style="margin-left:-50px;">
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
 </div>
 <div class="col-md-3" style="padding-top:10px;padding-left:30px;">
 <div class="btn-group">
  <button type="button" class="btn btn-warning" style="width:100px;"><a href="bingMap.jsp">地图找房</a></button>
  <button type="button" class="btn btn-warning" style="width:100px;"><a href="#">列表找房</a></button>
</div>
 </div>
 </div>
</div>
<!-- 妯℃�妗�-->
   <jsp:include page="foot.jsp" />
</body>

</html>