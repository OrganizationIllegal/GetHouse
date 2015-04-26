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
 <!-- 绘制圆形 -->
   <script type="text/javascript">
$(function(){
    var can = document.getElementById("can");
    var ctx = can.getContext("2d");   
    ctx.beginPath(); 
    ctx.fillStyle="#CDC9C9";  
    ctx.arc(75,75,60,0,Math.PI*2); // context.arc(x,y,r,sAngle,eAngle,counterclockwise)
    ctx.fill();　　　　　　//使用ctx.fill();就是填充色；                 
})
$(function(){
    var can = document.getElementById("canleft");
    var ctx = can.getContext("2d");   
    ctx.beginPath(); 
    ctx.fillStyle="#A52A2A";  
    ctx.arc(20,20,10,0,Math.PI*2); // context.arc(x,y,r,sAngle,eAngle,counterclockwise)
    ctx.fill();　　　　　　//使用ctx.fill();就是填充色；                 
})
$(function(){
    var can = document.getElementById("canright");
    var ctx = can.getContext("2d");   
    ctx.beginPath(); 
    ctx.fillStyle="#A52A2A";  
    ctx.arc(20,20,10,0,Math.PI*2); // context.arc(x,y,r,sAngle,eAngle,counterclockwise)
    ctx.fill();　　　　　　//使用ctx.fill();就是填充色；                 
})
</script>
</head>
<body style="padding-top: 105px;">
 <jsp:include page="head.jsp" />
 <div class="container">
 <div class="row" style="padding-top:50px;">
 <div class="col-md-5"></div>
 <div class="col-md-2">
 <div style="color:#000000;font-weight:900;font-size:20px;text-align:center;font-family:SimHei;margin-bottom: 10px;">购买立即返还现金</div>
 <div style="position:absolute;z-index:-1"><canvas id="can" width="150" height="150"></canvas></div>
 <div style="width:150;height:150;padding-top:40px;">
 <div style="color:#A52A2A;font-weight:bolder;font-size:45px;text-align:center;font-family:SimHei;">${returnmoney}</div>
 <div style="color:#000000;font-size:15px;text-align:center;font-family:SimHei;">买卖返还现金</div>
 </div>
 </div>
 <div class="col-md-5"></div>
 </div>
 <div class="row">
 <div class="col-md-2"></div>
 <div class="col-md-8" style="margin-top:-30px;height:60px;">
 <canvas id="canleft" width="40" height="40"></canvas>
 <hr style=" height:2px;border:none;border-top:2px dotted #185598;position:relative;left:25;top:-30;" />
 <div style="position:relative;left:760;top:-80;"><canvas id="canright" width="40" height="40"></canvas></div>
 </div>
 <div class="col-md-2"></div>
 </div>
 <div class="row" style="padding-bottom: 80px;">
 <div class="col-md-4"></div>
  <div class="col-md-4">酒驾女司机遇交警拍照取证赶忙摆POSE&nbsp;3月24日讯&nbsp;3月21日下午15时许，济南历下交警在浆水泉路巡逻酒后驾驶黑色奔驰轿车沿浆水泉路由南向北行驶，
  </div>
 <div class="col-md-4"></div>
 </div>
</div>
<!-- 妯℃�妗�-->
   <jsp:include page="foot.jsp" />
</body>

</html>