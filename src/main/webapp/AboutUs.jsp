<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
   <script src="/js/jquery.min.js"></script>
   <script src="/bootstrap/js/bootstrap.min.js"></script>
   <link href="/css/index.css" rel="stylesheet">
    <script type="text/javascript">
     $(function(){
        var can = document.getElementById("circle1");
        var can2 = document.getElementById("circle2");
        var ctx = can.getContext("2d");   
        var ctx2 = can2.getContext("2d");   
        var img = new Image();
        var img2 = new Image();
        img.onload = function (){
             ctx.drawImage(img, 0, 0, 100, 100);
             }
        img2.onload = function (){
             ctx2.drawImage(img2, 0, 0, 100, 100);
             }
        img.src = "/images/jingjiren.PNG";
        img2.src = "/images/f.jpg";
        ctx.beginPath(); 
        ctx2.beginPath(); 
        ctx.arc(50,50,50,0,Math.PI*2);
        ctx2.arc(50,50,50,0,Math.PI*2); 
        ctx.clip(); 
         ctx2.clip();          
})
    </script>  
</head>
<body style="padding-top: 120px;">
<jsp:include page="head.jsp" />
<div class="container">
<!--start我们革命性的改变了-->
	<!--<div class="row" style="width:1140px">
		<img  src="../images/aa.JPG">
	</div>-->
<!--end我们革命性的改变了-->
<!--start海房优选-->
	<div class="row" >
	<div>
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="col-md-1"></div>
			<div class="col-md-2" style="font-size:13px;font-family:楷体;text-align:center;border-color:grey;border-right-style:solid;border-right-width:1px;">海房优选</div>
			<div class="col-md-2" style="font-size:13px;font-family:楷体;text-align:center;border-color:grey;border-right-style:solid;border-right-width:1px;">我们的故事</div>
			<div class="col-md-2" style="font-size:13px;font-family:楷体;text-align:center;border-color:grey;border-right-style:solid;border-right-width:1px;">我们的团队</div>
			<div class="col-md-2" style="font-size:13px;font-family:楷体;text-align:center;border-color:grey;border-right-style:solid;border-right-width:1px;">新闻报道</div>
			<div class="col-md-2" style="font-size:13px;font-family:楷体;text-align:center;border-color:grey;border-right-style:solid;border-right-width:1px;">联系方式</div>
			<div class="col-md-1"></div>
		</div>
		<div class="col-md-2"></div>
	 </div>
	</div>
	<div style="margin:0">
		<hr style="margin:0;border:1px solid grey "></hr>
	</div>
<!--end海房优选-->
<!--start当前落后的购房服务 -->
<div class="row" style="margin:40px 20px;text-align:center" >
		<div><span  style="font-size:13px;font-family:楷体;text-align:center;">当前落后的购房服务</span></div>
		<div><span  style="font-size:20px;text-align:center;">大量的中间环节造成国内低效不透明的购房过程</span></div>
		<!--start画圆圈 -->
		<div id="circles">
		   <div id="touzizhe"  class="col-md-2" >
		   		<div><canvas id="circle1" width="100" height="100"></canvas></div>
		   		<div>font-size:13px;font-family:楷体;">投资者</div>
		   </div>
		     <div id="jignjiren2"  class="col-md-2" >
		   		<div><canvas id="circle2" width="100" height="100"  ></canvas></div>
		   		<div>font-size:13px;font-family:楷体;">国内经纪人</div>
		   </div>
		</div>
		<!--end画圆圈 -->
</div>
<!--end当前落后的购房服务 -->
</div>
<!--<jsp:include page="foot.jsp" />-->
</body>

</html>