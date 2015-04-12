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
</head>
<body style="padding-top: 105px;" onload="getMap();">
 <jsp:include page="head.jsp" />
 <div class="container">
  <div class="row">
 <div class="col-md-4" style="padding-right:0px;">
  <div id="houselist" style="overflow-y:scroll;">
       <div id="title"  >
        <!-- <div class="btn-group btn-group-justified" role="group">
        <div class="btn-group" role="group">
           <button type="button" class="btn btn-inverse dropdown-toggle" data-toggle="dropdown">�������� <span class="caret"></span>
           </button>
            <ul class="dropdown-menu">
                <li><a href="#">һ����</a></li>
                <li><a href="#">������</a></li>
                <li><a href="#">������</a></li>
             </ul>
         </div>
          <button type="button" class="btn btn-inverse">�۸�ӵ͵���</button>
          <button type="button" class="btn btn-inverse ">�۸�Ӹߵ���</button>
       </div>-->
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
       <div id="list">
           <table>
            <tbody>
              <!--the first item sstart-->
               <tr style="colspan:2"><td>��Ŀ��ַ�����޲���Ȫ����</td></tr>
               <tr>
                <td><img src="images/house1.jpg"></td>
                <td width="10px"></td>
                <td>
                    <p><span>�Ĵ����Ƿ���</span></p>
                    <p><span><h6>��Ŀ�۸�</h6></span><span class="right"><h6>$550,000</h6></span> </p>
                    <p><span>��Ŀ���</span><span class="right">58-119</span></p>
                    <p><span>��������</span><span class="right">47</span></p>
                    <p><span>ƽ������</span><span class="right">$550,000</span></p>
                </td>
               </tr>
               <tr>
               <td class="xian" colspan="3"></td>
               </tr>
               <!--the first item end-->
               <!--the second item start-->
                <tr><td>��Ŀ��ַ�����޲���Ȫ����</td></tr>
               <tr>
                <td><img src="images/house1.jpg"></td>
                <td width="25px"></td>
                <td>
                    <p><span>�Ĵ����Ƿ���</span></p>
                    <p><span>��Ŀ�۸�</span><span class="right">$550,000</span> </p>
                    <p><span>��Ŀ���</span><span class="right">58-119</span></p>
                    <p><span>��������</span><span class="right">47</span></p>
                    <p><span>ƽ������</span><span class="right">$550,000</span></p>
                </td>
               </tr>
               <tr><td class="xian" colspan="3"></td></tr>
               <!--the second item end-->
           </tbody>
          </table>
       </div>
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
   <div id='myMap' style="position:relative; width:765px; height:600px;"></div>
  </div>    
   </div>
   </div>
   <jsp:include page="foot.jsp" />
</body>

</html>