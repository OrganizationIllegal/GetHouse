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

   <link href="/css/index.css" rel="stylesheet">
</head>
<body>
 <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="row" style="background-color:rgba(19, 51, 89, 1);padding-top:10px;padding-bottom: 5px;">
	  <div class="col-md-1"></div>
      <div class="col-md-6" style="padding-right:0px;">
      <span style="font-size:18px;color:yellow;style="text-align:bottom;font-family:SimHei;">海豚会(haitunhui.cn)</span>
      <span style="font-size:8px;color:white;font-family:SimHei;">由《经理人》联合中国商业领袖共同发起的、基于移动互联网技术的智慧型公益组织。</span>
      </div>
      <div class="col-md-2 col-md-offset-1" >
       <span class="glyphicon glyphicon-phone-alt" style="font-size:18px;color:yellow;"></span>
       <span style="font-size:18px;color:yellow;">400&nbsp;810&nbsp;9685</span>
       </div>
       <c:set var="userName" value="张三"/> 
       <%
            
       		if(request.getSession().getAttribute("username")!=null){
       			String role = request.getSession().getAttribute("role").toString();
       %>   
     <%--   <c:choose>
       		<c:when test=" ${sessionScope.userName != null }"> --%>
       			<div class="col-md-2" style="margin-left:-50px;">      
	       		<div>
	       		<%-- <c:if test="${sessionScope.role==0}">
	       		dd</c:if> --%>
	       			<span class="glyphicon glyphicon-user" style="color:white;"></span>
	       			<a href="#" style="color:white;font-size:12px;font-family:SimHei;">欢迎<%
	       				if("0".equals(role)){
	       				
	       			%>管理员${sessionScope.username}
	       			<%
	       				}else{%>
	       				
	       					普通用户${sessionScope.username}<%
	       				}
	       				%></a>
	       			<span class="divider-vertical"></span>
	       			<a href="${pageContext.request.contextPath}/logout.jsp"  style="color:yellow;font-size:12px;font-family:SimHei;">退出</a>
	       		</div>
	       </div>
	       <%
       		}
	         else{
	       %>
       		<%-- </c:when>
       		<c:otherwise> --%>
       				<div class="col-md-2" style="margin-left:-50px;">      
	       		<div>
	       			<span class="glyphicon glyphicon-user" style="color:white;"></span>
	       			<a href="${pageContext.request.contextPath}/login.jsp" style="color:white;font-size:12px;font-family:SimHei;">会员登录</a>
	       			<span class="divider-vertical"></span>
	       			<a href="#" style="color:yellow;font-size:12px;font-family:SimHei;">注册</a>
	       		</div>
	       </div>
	       <%
	         }
	       %>
       		<%-- </c:otherwise>
       </c:choose>  --%>
      
       </div>
   <div class="row" style="background-color:white;padding-top:25px;">
		<div class="col-md-1" style="height:2px;"></div>
		<div class="col-md-2">
		  <!-- <img src="images/logo.PNG" style="margin-top:-20px;"/> -->
		  <img src="http://101.200.174.253:8080/images/logo.PNG" style="margin-top:-20px;"/>
		</div>
       <div class="col-md-7" >
      	<div class="navbar-header" id="headbar">
       			<a href="/index01">首页</a>
       			<span class="divider-vertical" style="margin-left:20px;"></span>
       			<a href="/SearchList">海外购房</a>
       			<span class="divider-vertical" style="margin-left:20px;"></span>
       			<a href="/ServiceTeam">服务团队</a>
       			<span class="divider-vertical" style="margin-left:20px;"></span>
       			<a href="/ZhiYeInfo">置业指导</a>
       			<!-- <span class="divider-vertical" style="margin-left:20px;"></span>
       			<a href="/overseas.jsp">海外新闻</a> -->
       			<span class="divider-vertical" style="margin-left:20px;"></span>
       			<a href="/BlogList">新闻博客</a>
       			<span class="divider-vertical" style="margin-left:20px;"></span>
       			<a href="/AboutUs.jsp">关于我们</a>
       		</div>
       </div>  
       <!-- <div class="col-md-1" >	
       	<div>
       	<span class="glyphicon glyphicon-list-alt" style="color:#9C9C9C;"></span>
       		<a href="#"style="font-size:17px;color:#9C9C9C;font-weight:bold;">Blog</a>
       	</div>
       	</div> -->
       <div class="col-md-2"></div>
   </div>
</nav>

</body>
</html>
