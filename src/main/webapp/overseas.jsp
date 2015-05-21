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
    <!-- 绘制圆形 -->
   <script type="text/javascript">
   $(function(){
    var can = document.getElementById("can");
    var ctx = can.getContext("2d");   
    ctx.beginPath(); 
    ctx.fillStyle="rgba(158, 158, 159, 1)";  
    ctx.arc(80,80,78,0,Math.PI*2); // context.arc(x,y,r,sAngle,eAngle,counterclockwise)
    ctx.fill();　　　　　　//使用ctx.fill();就是填充色；                 
})
$(function(){
    var can = document.getElementById("canleft");
    var ctx = can.getContext("2d");   
    ctx.beginPath(); 
    ctx.fillStyle="rgba(194, 15, 35, 1)";  
    ctx.arc(10,10,10,0,Math.PI*2); // context.arc(x,y,r,sAngle,eAngle,counterclockwise)
    ctx.fill();　　　　　　//使用ctx.fill();就是填充色；                 
})
$(function(){
    var can = document.getElementById("canright");
    var ctx = can.getContext("2d");   
    ctx.beginPath(); 
    ctx.fillStyle="rgba(194, 15, 35, 1)";  
    ctx.arc(10,10,10,0,Math.PI*2); // context.arc(x,y,r,sAngle,eAngle,counterclockwise)
    ctx.fill();　　　　　　//使用ctx.fill();就是填充色；                 
})
   </script>
   <!-- 弹出模态框 -->
   <script type="text/javascript">
   function pop(){
     $('#modal').modal('show');
   }
   </script>
</head>
<body style="text-align:center;padding-top: 105px;">
<jsp:include page="head.jsp" />
<div class="container">
		<div class="row" style="background-color:rgba(36, 58, 80, 1);padding-top:80px;">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<div><img src="/images/overseas/overseas1.PNG"></div>
				<div style="padding-top:15px;margin-bottom:80px;"><button type="button" class='btn btn-danger' onclick="pop()">开立账户</button></div>
			</div>
			<div class="col-md-3"></div>
		</div>
		<div class="row" style="padding-top:40px;padding-bottom:15px;">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<div style="font-size:25px;font-weight:bolder;font-family:黑体;">为您提供最好的海外购房服务</div>
				<div style="font-size:18px;font-family:黑体;">海房优选以互联网思维，打破信息不透明以全新的服务，</div>
				<div style="font-size:18px;font-family:黑体;">让您投资海外房产</div>
			</div>
			<div class="col-md-3"></div>
		</div>
		<div class="row" style="background-color:rgba(246, 245, 244, 1);padding-top:30px;">
			<div class="col-md-6" style="padding-top:130px;padding-left:100px;text-align:left">
				<div style="font-size:30px;font-weight:bold;font-family:黑体;filter:alpha(opacity=60);opacity:0.6;">海景房源</div>
				<div style="font-size:48px;font-weight:bolder;font-family:黑体;filter:alpha(opacity=80);opacity:0.8;">10000+公寓/别墅</div>
				<div style="font-size:18px;font-weight:bold;font-family:黑体;filter:alpha(opacity=50);opacity:0.5;">海房优选提供超过300个澳洲新房项目</div>
				<div style="font-size:18px;font-weight:bold;font-family:黑体;filter:alpha(opacity=50);opacity:0.5;padding-top:5px;">超过1000套真实在售房源</div>
				<div style="font-size:18px;font-weight:bold;font-family:黑体;filter:alpha(opacity=50);opacity:0.5;padding-top:5px;">每天实时更新最新房源</div>
			</div>
			<div class="col-md-6">
				<div><img src="/images/overseas/overseas2.PNG"></div>
			</div>
		</div>
		<div class="row" style="padding-top:50px;">
			<div class="col-md-6" style="padding-top:70px;">
				<div><img src="/images/overseas/overseas3.PNG"></div>
			</div>
			<div class="col-md-6" style="text-align:right;padding-right:100px;">
				<div style="font-size:28px;font-weight:bold;font-family:黑体;filter:alpha(opacity=80);opacity:0.8;">简单<span style="margin-left:10px;"></span>透明</div>
				<div style="font-size:16px;font-weight:bold;font-family:黑体;filter:alpha(opacity=60);opacity:0.6;padding-bottom:50px;">基于互联网的在线房屋数据，使您理简单更聪明的挑选房产</div>
				<div style="padding-right:50px;font-size:18px;font-weight:bold;font-family:黑体;filter:alpha(opacity=50);opacity:0.5;position:absolute;left:330px;">
					<div style="padding-top:10px;">项目介绍</div>
					<div style="padding-top:20px;">户型和价格</div>
					<div style="padding-top:40px;">项目位置</div>
					<div style="padding-top:60px;">配置及周边</div>
					<div style="padding-top:10px;">购房费用</div>
					<div style="padding-top:65px;">投资分析</div>
				</div>
				<img src="/images/overseas/overseas4.PNG" sytle="position:absolute;">
			</div>
		</div>
		<div class="row" style="background-color:rgba(246, 245, 244, 1);padding-top:80px;">
			<div class="col-md-1"></div>
			<div class="col-md-3" style="padding-top:40px;text-align:right;"><img src="/images/overseas/yuan1.PNG"></div>
			<div class="col-md-4">
				<div style="font-weight:bolder;font-size:23px;font-family:黑体;filter:alpha(opacity=80);opacity:0.8;">购买立即返还现金</div>
				<div style="padding-top:10px;position:absolute;left:115px;"><canvas id="can" width="160" height="160"></canvas></div>
				<div style="position:absolute;left:100px;top:70px;">
                    <div style="color:rgba(229, 0, 19, 1);font-weight:bolder;font-size:60px;text-align:center;">$17500</div>
				    <div style="font-size:18px;font-weight:bold;font-family:黑体;filter:alpha(opacity=50);opacity:0.5;">购房返利</div>
				</div>
			</div>
			<div class="col-md-3" style="padding-top:40px;text-align:left;"><img src="/images/overseas/yuan2.PNG"></div>
			<div class="col-md-1"></div>
		</div>
		<div class="row" style="background-color:rgba(246, 245, 244, 1);padding-bottom:50px;">
			<div class="col-md-2" style="width:130px;padding-right:0px;">
				<div style="text-align:right;"><canvas id="canleft" width="20" height="20"></canvas></div>
			</div>
			<div class="col-md-9" style="border-bottom:2px dotted rgba(194, 15, 35, 1);height:18px;"></div>
			<div class="col-md-1" style="padding-left:0px;">
				<div style="text-align:left;"><canvas id="canright" width="20" height="20"></canvas></div>
			</div>
		</div>
		<div class="row" style="background-color:rgba(246, 245, 244, 1);padding-bottom:80px;">
			<div style="font-size:18px;font-weight:bold;font-family:黑体;filter:alpha(opacity=50);opacity:0.5;">在海房优选购买澳洲新房</div>
			<div style="font-size:18px;font-weight:bold;font-family:黑体;filter:alpha(opacity=50);opacity:0.5;">最高可获得高达70%的佣金返还</div>
			<div style="font-size:10px;font-weight:bold;font-family:黑体;filter:alpha(opacity=50);opacity:0.5;padding-top:10px;">*以房价50万元澳币房产计算</div>
		</div>
		<div class="row" style="padding-top:50px;padding-bottom:20px;">
			<div class="col-md-1"></div>
			<div class="col-md-5" style="text-align:left;">
				<div style="font-size:10px;font-weight:bold;font-family:黑体;filter:alpha(opacity=50);opacity:0.5;padding-top:60px;">购房返利<span style="margin-left:5px;"></span>提高回报</div>
				<div style="font-size:25.8px;font-weight:bolder;font-family:黑体;filter:alpha(opacity=80);opacity:0.8;padding-top:20px;">高达70%的购房佣金返利意味着更好的投资回报</div>
				<div style="font-size:16px;font-weight:bold;font-family:黑体;filter:alpha(opacity=50);opacity:0.5;padding-top:40px;">基于互联网服务优势，减少了中间环节，提高效率的</div>
				<div style="font-size:16px;font-weight:bold;font-family:黑体;filter:alpha(opacity=50);opacity:0.5;">购房返利，这意味着你在同一套房产投资回报率的提升。</div>
			</div>
			<div class="col-md-6">
				<div><img src="/images/overseas/overseas5.PNG"></div>
				<div style="text-align:right;padding-right:80px;ont-size:8px;font-weight:bold;font-family:黑体;filter:alpha(opacity=50);opacity:0.5;padding-top:20px;">*以50万澳元房产，首付30%计算</div>
			</div>
		</div>
		<div class="row" style="background-color:rgba(246, 245, 244, 1);padding-top:50px;">
			<div style="font-size:11px;font-weight:bold;">我们做了一些更具革命</div>
			<div style="font-size:30px;font-weight:500px;padding-top:20px;">首先，雷德芬内置技术房屋买卖时使你</div>
			<div style="padding-top:80px;padding-bottom:50px;"><img src="/images/overseas/overseas6.PNG"></div>
		</div>
	</div>
<!-- 开立账户模态框start-->
<div class="modal fade" id="modal" tabindex="-1" role="dialog" 
   aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content" style="margin-left:100px;height:495px;width:400px;">
         <div class="modal-header" style="background-color:#EEEEE0;">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title">
               开立账户
            </h4>
         </div>
         <div class="modal-body" style="padding-top:30px;background-color:#EEEEE0;">
            <form class="form-horizontal" role="form" action="/UserInfo/AddAccount" method="post">
   <div class="form-group" style="margin-bottom:0px;">
      <div class="col-sm-10 col-sm-offset-1">
         <input type="text" class="form-control" name="nick_name" 
            placeholder="姓名">
      </div>
      <div class="col-sm-1"></div>
   </div>
   <div class="form-group" style="margin-bottom:0px;">
      <div class="col-sm-10 col-sm-offset-1">
         <input type="text" class="form-control" name="pwd" 
            placeholder="登录密码">
      </div>
      <div class="col-sm-1"></div>
   </div>
   <div class="form-group" style="margin-bottom:0px;">
      <div class="col-sm-10 col-sm-offset-1">
         <input type="text" class="form-control" name="tel" 
            placeholder="电话号码">
      </div>
      <div class="col-sm-1"></div>
   </div>
   <div class="form-group">
      <div class="col-sm-10 col-sm-offset-1">
         <input type="text" class="form-control" name="email"
            placeholder="电子邮箱">
      </div>
      <div class="col-sm-1"></div>
   </div>
   <div class="form-group">
      <div class="col-sm-10 col-sm-offset-1">
       <input type="text" class="form-control" name="account"
            placeholder="开立账户">      
      </div>
      <div class="col-sm-1"></div>
   </div>
   <div class="form-group" style="margin-bottom:0px;">
      <div class="col-sm-10 col-sm-offset-1">
         <textarea type="text" rows="5" cols="20" class="form-control" name="msg" 
            placeholder="留言"></textarea>
            
      </div>
      <div class="col-sm-1"></div>
   </div>
   <div class="form-group">
      <div class="col-sm-offset-1 col-sm-10">
         <button type="submit" class="btn btn-default">发送</button>
      </div>
      <div class="col-sm-1"></div>
   </div>
</form>

         </div>
   
      </div>
</div>
</div>
<!-- 开立账户模态框end -->
 <jsp:include page="foot.jsp" />
</body>
</html>