<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="css/style.css" rel="stylesheet" type="text/css" />
   <link href="css/style_project.css" rel="stylesheet" type="text/css" />
   <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
   <script src="/js/jquery.min.js"></script>
   <script src="/bootstrap/js/bootstrap.min.js"></script>
   <link href="/css/index.css" rel="stylesheet">  
   <script src="http://echarts.baidu.com/build/dist/echarts-all.js" charset="GBK"></script>
   <script type="text/javascript" src="http://ecn.dev.virtualearth.net/mapcontrol/mapcontrol.ashx?v=7.0&mkt=zh-cn"></script>
   <script src="/js/bingMap.js"></script>
   <link href="/css/List-Grid-View.css" rel="stylesheet">
   <script src="/echarts/echarts-all.js"></script>
   <link href="./bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet">


<link href="/css/pgwslider.min.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.5.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/script_p.js"></script>
</head>
  
  <body>
    <div>
    <h2>户型及价格</h2><hr>
    房屋类型：<input type="text" name="style" id="style"></input>
    卧室数量：<input type="text" name="roomnum" id="roomnum"></input>
    卫生间数量：<input type="text" name="toiletnum" id="toiletnum"></input>
    房屋面积：<input type="text" name="size" id="size"></input><p>
    房屋价格：<input type="text" name="price" id="price"></input>
    房屋图片路径：<input type="text" name="img" id="img"></input>
    <p>
    <input type="button" value="增加" onclick="add()">
    <input type="button" value="删除" onclick="deleteInfo()">
    <input type="button" value="修改" onclick="edit()">
    <input type="button" value="查询" onclick="find()">
    </div>
    
    <!--<div>
    <h2>项目详情</h2><hr>
    项目名称：<input type="text" name="proName" id="proName"></input>
    项目一句话：<input type="text" name="lan" id="lan"></input><p>
    项目的详细信息：<p>
    <textarea rows="3" cols="20" name="detail" id="detail"></textarea>
    
    <p>
    <p>
    <input type="button" value="增加" onclick="addPro()">
    <input type="button" value="删除" onclick="deleteInfoPro()">
    <input type="button" value="修改" onclick="editPro()">
    <input type="button" value="查询" onclick="findPro()">
    </div>-->
  </body>
</html>
<script>



 function add(){
var style = $("#style").val();
var roomnum = $("#roomnum").val();
var toiletnum = $("#toiletnum").val();
var size = $("#size").val();
var price = $("#price").val();
var img = $("#img").val();
 if(style=="" || roomnum=="" || toiletnum=="" || size=="" || price=="" || img=="" ){
	alert("信息不能为空")
 }
 else{
	 	$.ajax({
	 	    type: "POST",
	 		data: {style:style,roomnum:roomnum,toiletnum:toiletnum,size:size,price:price,img:img},
	 		dateType: "json",
	 		url: "/houseStyle/addData",
	 		
	 		success:function(data){
	 			alert(data)
	 		},
	 		error:function(){
	 			alert("error")
	 		}
	 	});
	 }
 }
 function deleteInfo(){
 	alert("add");
 }
 function edit(){
 	if(style=="" || roomnum=="" || toiletnum=="" || size=="" || price=="" || img=="" ){
	alert("信息不能为空")
 }
 else{
	 	$.ajax({
	 	    type: "POST",
	 		data: {style:style,roomnum:roomnum,toiletnum:toiletnum,size:size,price:price,img:img},
	 		dateType: "json",
	 		url: "/houseStyle/editData",
	 		
	 		success:function(data){
	 			alert("修改成功")
	 		},
	 		error:function(){
	 			alert("error")
	 		}
	 	});
	 }
 }
 function find(){
 	alert("add");
 }
 
</script>