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
             <li style="padding:5 10 ;">�����б�</li>
             <li>�۸�ӵ͵���</li>
             <li>�۸�Ӹߵ���</li>
          </ul>-->
         <!-- <p>
          <span class="left">��������</span>
          <span>�۸�ӵ͵���</span>
          <span class="right">�۸�Ӹߵ���</span>
          <p/>-->
          <table>
          <tr>
          <td  width="33%">��������</td>
          <td  width="33%">�۸�ӵ͵���</td>
          <td  width="33%">�۸�Ӹߵ���</td>
          </tr>
          </table>
          <!-- <div class="col-md-3" >
      	<ul class="navbar-header">
       			<a href="#">��ҳ</a>
       			<a>&nbsp|&nbsp</a>
       			<a href="#">���⹺��</a>
       			<a>&nbsp|&nbsp</a>
       			<a href="#">��������</a>
       			<a>&nbsp|&nbsp</a>
       		</ul>
       </div>-->
       </div>
       <div id="list">
           <table>
            <tbody>
              <!--the first item sstart-->
               <tr><td>��Ŀ��ַ�����޲���Ȫ����</td></tr>
               <tr>
                <td><img src="images/house1.jpg"></td>
                <td width="25px"></td>
                <td>
                    <p><span>�Ĵ����Ƿ���</span></p>
                    <p><span>��Ŀ�۸�</span><span>&nbsp&nbsp</span><span class="right">$550,000</span> </p>
                    <p><span>��Ŀ���</span><span>&nbsp&nbsp</span><span class="right">58-119</span></p>
                    <p><span>��������</span><span>&nbsp&nbsp</span><span class="right">47</span></p>
                    <p><span>ƽ������</span><span>&nbsp&nbsp</span><span class="right">$550,000</span></p>
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
         <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
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
         <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
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
   </nav>
   <div id='myMap' style="position:relative; width:700px; height:600px;"></div>
  </div>
     
   
   </div>
   </div>
   <jsp:include page="foot.jsp" />
</body>

</html>