<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
   <title>HouseSale</title>
   <link href="css/style.css" rel="stylesheet" type="text/css" />
   <link href="css/style_project.css" rel="stylesheet" type="text/css" />
   <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
   <script src="/js/jquery.min.js"></script>
   <script src="/bootstrap/js/bootstrap.min.js"></script>
   <link href="/css/index.css" rel="stylesheet">  
   <script src="http://echarts.baidu.com/build/dist/echarts-all.js" charset="GBK"></script>
   <script type="text/javascript" src="http://ecn.dev.virtualearth.net/mapcontrol/mapcontrol.ashx?v=7.0"></script>
   <!--<script type="text/javascript" src="http://ecn.dev.virtualearth.net/mapcontrol/mapcontrol.ashx?v=7.0"></script>-->
   <script src="/js/bingMap.js"></script>
   <link href="/css/List-Grid-View.css" rel="stylesheet">
   <script src="/echarts/echarts-all.js"></script>
   <link href="./bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet">


<link href="/css/pgwslider.min.css" rel="stylesheet">
<link href="/css/video-js.css" rel="stylesheet" type="text/css">

<script type="text/javascript" src="js/jquery-1.5.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/script_p.js"></script>
<script src="js/video.js"></script>
<script>videojs.options.flash.swf = "/js/video-js.swf";</script>


<body style="padding-top: 150px;">
<jsp:include page="head.jsp" />
	<div class="container">
		<div class="row" style="background-color:rgba(245, 244, 244, 1);padding-top:20px;padding-bottom:10px;">
			<div class="col-md-2" > 
				<img src="pic/1a.png">
			</div>
				
			<div class="col-md-7" style="padding-top:20px;">
				<div><span style="font-size:20px">李斯</span></div>
				
				<div><img src="pic/4a.png"><span>房产经济人</span></div>
					
				<div style="float:left">
				<button type="button" class="btn btn-info btn-lg" style="background-color:rgba(199, 39, 63, 1);width:200px;height:40px;color:white;"><span>直接联系</span></button>
				</div>
				
				</div>
			<div class="col-md-3">
				<div margin-bottom:20px;">
					<div class="row" style="background-color:rgba(16, 50, 80, 1);" >
						<div>
						<span style="font-size:15px;color:white;">房产经验 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<img src="pic/9a.png"></span>
						</div>
						</div>
						
					<div class="row" style="background-color:rgba(16, 50, 80, 1);">
						<div>
						<span style="font-size:25px;color:white;">8</span>
						</div>
					</div>
					</div>
					
				<div margin-top:10px;">
				<div style="padding-top:20px;">
					<div class="row" style="background-color:rgba(199, 39, 63, 1); >
						<span style="font-size:10px;color:white;">语言 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<img src="pic/10a.png"></span>
						</div>
						
					<div class="row" style="background-color:rgba(199, 39, 63, 1); >
						<span style="font-size:10px;color:white;">中文 &nbsp 英语</span>
						</div>
					</div>
					</div>
				</div>
				
			
			
		</div>
		
		<div class="row">
			<div class="col-md-2" style="padding-top:10px;">
				<div>
					<span style="font-size:20px;color:black;">服务区域</span>
					</div>
				
			<div style="font-size:10px;background-color:rgba(245, 244, 244, 1);margin-bottom:10px;">
				 <img src="pic/3a.png">
				 <span>Southyarra</span>
				</div>
				
			<div style="font-size:10px;background-color:rgba(245, 244, 244, 1);">
				 <img src="pic/3a.png">
				 <span>Bulswisk</span>
				</div>
						
						
						
			</div>
			
			<div class="col-md-7">
				<div style="padding-top:10px;"> 
						<span style="font-size:22px;color:black;">擅长类型<img src="pic/8a.png"></span>
				</div>
				
					<div>
						<span style="font-size:15px;color:black;"><img src="pic/5a.png">独立别墅</span>
						&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
						<span style="font-size:15px;color:black;"><img src="pic/6a.png">联排别墅</span>
						&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
						<span style="font-size:15px;color:black;"><img src="pic/7a.png">城市公寓</span>
						</div>
						
					<div style="padding-top:20px;">
						<span style="font-size:22px;color:black;">专业资质<img src="pic/8a.png"></span> 
						
						</div>
					
					<div>
						<span style="font-size:15px;color:black;">房产经纪人资格</span>
						&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
						<span style="font-size:15px;color:black;">209478654</span>
						</div>
					
					<div style="padding-top:10px;"> 
						<span style="font-size:22px;color:black;">自我描述<img src="pic/8a.png"></span>
				</div>
					
					<div style="padding-top:10px;"> 
						<span style="font-size:16px;color:black;">8年专业房产经验澳洲注册经济人8年专业房产经验,澳洲注册经济人业房产经验，澳洲注册经济人房产经纪人。</span>
				</div>
				
				<div> 
						<img src="pic/2a.png">
				</div>
			 </div>
				
			<div class="col-md-3" style="background-color:rgba(83, 81, 65, 1); margin-top:15px;">
				<div class="row" style="margin-top:45px;width:80%; margin-left:10%;margin-right:10%; background-color:rgba(83, 81, 65, 1);" >
			
		
			<div >
			<span style="font-size:20px;color:white">让我们推荐一个最适合您的房产经纪</span>
			</div>
			
			
			</div>
		
		
		<div class="row" style="margin-top:20px;background-color:rgba(245, 244, 244, 1);"> 
		<div style="padding-left:5px;padding-right:5px;">
	<div class="form-group" style="margin-bottom:0px;">
      <div class="col-sm-10 col-sm-offset-1">
         <input type="text" class="form-control" id="firstname" 
            placeholder="姓名">
      </div>
      <div class="col-sm-1"></div>
   </div>
   
   <div class="form-group" style="margin-bottom:0px;">
      <div class="col-sm-10 col-sm-offset-1">
         <input type="text" class="form-control" id="firstname" 
            placeholder="邮件">
      </div>
      <div class="col-sm-1"></div>
   </div>
   
   <div class="form-group" style="margin-bottom:0px;">
      <div class="col-sm-10 col-sm-offset-1">
         <input type="text" class="form-control" id="firstname" 
            placeholder="电话">
      </div>
      <div class="col-sm-1"></div>
   </div>

		 <div class="form-group" style="margin-bottom:0px;">
      <div class="col-sm-10 col-sm-offset-1">
         <textarea type="text" rows="5" cols="20" class="form-control" id="lastname" 
            placeholder="留言"></textarea>
            
      </div>
      <div class="col-sm-1"></div>
   </div>
   
   <div class="form-group">
      <div class="col-sm-offset-1 col-sm-10" >
      &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    <button type="submit"style="background-color:red;margin-top:5px;">提交</button>
      </div>
      <div class="col-sm-1"></div>
   </div>
				</div>
			
			
			
			
			
			
			
			</div>
		</div>
	</div>
</div>


<jsp:include page="foot.jsp" /> 
	</body>
</html>