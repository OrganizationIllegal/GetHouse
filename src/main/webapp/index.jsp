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
   <link href="css/style.css" rel="stylesheet" type="text/css" />
   <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
   <script src="/js/jquery.min.js"></script>
   <script src="/bootstrap/js/bootstrap.min.js"></script>
   <link href="/css/index.css" rel="stylesheet">  
   <script src="http://echarts.baidu.com/build/dist/echarts-all.js"></script>
   <script type="text/javascript" src="http://ecn.dev.virtualearth.net/mapcontrol/mapcontrol.ashx?v=7.0"></script>
   <script src="/js/bingMap.js"></script>
   <link href="/css/List-Grid-View.css" rel="stylesheet">
   <script src="/echarts/echarts-all.js"></script>
   <link href="./bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet">


<link href="/css/pgwslider.min.css" rel="stylesheet">
<link href="/css/video-js.css" rel="stylesheet" type="text/css">

<script type="text/javascript" src="js/jquery-1.5.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script src="js/video.js"></script>
<script>videojs.options.flash.swf = "/js/video-js.swf";</script>
</head>
<body style="padding-top: 105px;background-color:rgba(233, 243, 248, 1);" onload="getMap();">
<jsp:include page="head.jsp" />
<div class="container" style="">


<div class="ad_position" style="height:205px;background-color:white;">
	<ul class="nav nav-tabs">
      <li><a href="#home" >Home</a></li>
      <li><a href="#profile" >Profile</a></li>
      <li><a href="#messages" >Messages</a></li>
      <li><a href="#settings" >Settings</a></li>
    </ul>
    
    <div class="limit" >
		   <div style="float:left;width:527px;display:inline;">
					
					<table class="ad_left_big" width="527" border="0" cellpadding="0" cellspacing="0" style="margin-top: 0px;">
						<tr><td><img src="images/a.jpg" width="527" height="163" /></a></td></tr>
					<tr><td><video id="example_video_1" class="video-js vjs-default-skin" controls preload="none"  data-setup="{}"width="527" height="163" >
    							<source src="s.mp4" type='video/mp4'/>
    							<track kind="captions" src="demo.captions.vtt" srclang="en" label="English"></track><!-- Tracks need an ending tag thanks to IE9 -->
    							<track kind="subtitles" src="demo.captions.vtt" srclang="en" label="English"></track><!-- Tracks need an ending tag thanks to IE9 -->
									</video>
							</td>
					</tr>
					<tr><td><img src="images/c.jpg" width="527" height="163" /></a></td></tr>
					<tr><td><img src="images/d.jpg" width="527" height="163" /></a></td></tr>
					<tr><td><img src="images/e.jpg" width="527" height="163" /></a></td></tr>
					<tr><td><img src="images/f.jpg" width="527" height="163" /></a></td></tr>
					<tr><td><img src="images/g.jpg" width="527" height="163" /></a></td></tr>
					</table>  
				</div>
				<div class="ad_small_box">
			<div class="top_button off"></div>
			<div class="small_right_limit">
				<ul style="margin-top: 0px;">
		
					<li><img src="images/a.jpg" /></li>
					<li><img src="images/b.jpg" /></li>
					<li><img src="images/c.jpg" /></li>
					<li><img src="images/d.jpg" /></li>
					<li><img src="images/e.jpg" /></li>
					<li><img src="images/f.jpg" /></li>
					<li><img src="images/g.jpg" /></li>
				</ul>
				<div class="this_ad" style="top:0px;"><img src="images/this_ad.gif" width="136" height="47" /></div>                    
			</div>
			<div class="bottom_button"></div>            	
		</div>
				
				
    </div>


	
</div>






<div style="margin-top:20px;background-color:white;">
<div class="container"  >
<div class="col-md-2" >
				<dl class="fore1">
				<dd>
					<div>
						<span style="font-size:20px;color:black;target="_blank" href="#"">The Elements</span>
						</div>
						<div>
							<span style="font-size:16px;font-family:宋体;color:black;target="_blank" href="#"">IDLand</span>
							</div>
					</dd>
				</dl>
					</div>
				<div class="col-md-2"></div>
				
			<div class="col-md-2" >
				<dl class="fore1">
				<dd>
					<div>
						<span style="font-size:20px;color:black;target="_blank" href="#"">2011.03</span>
						</div>
						<div>
							<span style="font-size:16px;font-family:宋体;color:black;target="_blank" href="#"">首付金额（起价） </span>
							</div>
					</dd>
				</dl>
					</div>
					
					<div class="col-md-2" >
				<dl class="fore1">
				<dd>
					<div>
						<span style="font-size:20px;color:black;target="_blank" href="#"">$5.000</span>
						</div>
						<div>
							<span style="font-size:16px;font-family:宋体;color:black;target="_blank" href="#"">交房日期 </span>
							</div>
					</dd>
				</dl>
					</div>
			
					<div class="col-md-2" >
				<dl class="fore1">
				<dd>
					<div>
						<span style="font-size:20px;color:black;target="_blank" href="#"">$5.000</span>
						</div>
						<div>
							<span style="font-size:16px;font-family:宋体;color:black;target="_blank" href="#"">物业费/每月 </span>
							</div>
					</dd>
				</dl>
					</div>
					
					<div class="col-md-2" >
				<dl class="fore1">
				<dd>
					<div>
						<span style="font-size:20px;color:black;target="_blank" href="#"">$0.37</span>
						</div>
						<div>
							<span style="font-size:16px;font-family:宋体;color:black;target="_blank" href="#"">印花税</span>
							</div>
					</dd>
				</dl>
					</div>
					</div>
</div>
<!--项目详情-->
<div style="margin-top:20px;background-color:white;">
	<div class="panel panel-default">
  		<div class="panel-heading">项目详情</div>
  		<div class="panel-body">
  			<div>
  			 <!--  <hr> -->
				<h2>The Elements</h2>
				<p class="lead">世界级的建筑</p>
  			</div>
  			<div id="detail">
  			           正在寻找阿里旺旺官方下载？阿里旺旺买家版2013是阿里巴巴为淘宝买家度身定做的免费网上沟通软件，阿里旺旺还可以让您在购物后随时了解交易状态。直接搜索商品。快速进入淘宝网。阿里旺旺官方下载2013买家版能帮您轻松找客户，发布、管理商业信息；及时把握商机，随时洽谈做生意！
  			<p>
  			正在寻找阿里旺旺官方下载？阿里旺旺买
  			</div>
  			<div class="container">
 				<button type="button" class="btn">详情咨询</button>
  			
			</div>
  		</div>
  		 
  	</div>
</div>
<!--户型及户型-->
<div style="margin-top:20px;background-color:white;">
<div class="panel panel-default">
<div class="panel-heading" style="background-color:white;font-weight:bold;padding-left:35px;">户型及价格</div>
<div class="panel-body">
<div class="row" style="height:60px;background-color:#DEDEDE;margin:0px 20px;">
<div class="col-md-3" style="color:black;font-weight:900;font-size:23px;font-family:SimHei;padding-top: 15px;">Unit SUITE 202</div>
<div class="col-md-1">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">2</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">卧室</div>
</div>
<div class="col-md-1" style="margin-left:40px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">2</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">卫生间</div>
</div>
<div class="col-md-1" style="margin-left:40px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">1901</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">面积</div>
</div>
<div class="col-md-2" style="margin-left:40px;padding:0px 30px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">$500,000</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">房价</div>
</div>
<div class="col-md-4" style="width:200px;margin-top:12px;">
<div class="dropdown">
<button type="button" class="btn dropdown-toggle" data-toggle="dropdown" style="background-color:#EEAD0E;width:180px;margin: 0 auto;color:white;"><span class="glyphicon glyphicon-chevron-down"></span>&nbsp;&nbsp;&nbsp;点击查看户型图</button>
</div>
</div>
</div>
<hr style="height:1px;border:none;border-top:1px solid #ffffff;margin-top:5px;margin-bottom:0px;" />	
<div class="row" style="height:60px;background-color:#DEDEDE;margin:0px 20px;">
<div class="col-md-3" style="color:black;font-weight:900;font-size:23px;font-family:SimHei;padding-top: 15px;">Unit SUITE 202</div>
<div class="col-md-1">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">2</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">卧室</div>
</div>
<div class="col-md-1" style="margin-left:40px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">2</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">卫生间</div>
</div>
<div class="col-md-1" style="margin-left:40px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">1901</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">面积</div>
</div>
<div class="col-md-2" style="margin-left:40px;padding:0px 30px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">$500,000</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">房价</div>
</div>
<div class="col-md-4" style="width:200px;margin-top:12px;">
<div class="dropdown">
<button type="button" class="btn dropdown-toggle" data-toggle="dropdown" style="background-color:#EEAD0E;width:180px;margin: 0 auto;color:white;"><span class="glyphicon glyphicon-chevron-down"></span>&nbsp;&nbsp;&nbsp;点击查看户型图</button>
</div>
</div>
</div>	
<hr style="height:1px;border:none;border-top:1px solid #ffffff;margin-top:5px;margin-bottom:0px;" />	
<div class="row" style="height:60px;background-color:#DEDEDE;margin:0px 20px;">
<div class="col-md-3" style="color:black;font-weight:900;font-size:23px;font-family:SimHei;padding-top: 15px;">Unit SUITE 202</div>
<div class="col-md-1">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">2</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">卧室</div>
</div>
<div class="col-md-1" style="margin-left:40px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">2</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">卫生间</div>
</div>
<div class="col-md-1" style="margin-left:40px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">1901</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">面积</div>
</div>
<div class="col-md-2" style="margin-left:40px;padding:0px 30px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">$500,000</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">房价</div>
</div>
<div class="col-md-4" style="width:200px;margin-top:12px;">
<div class="dropdown">
<button type="button" class="btn dropdown-toggle" data-toggle="dropdown" style="background-color:#EEAD0E;width:180px;margin: 0 auto;color:white;"><span class="glyphicon glyphicon-chevron-down"></span>&nbsp;&nbsp;&nbsp;点击查看户型图</button>
</div>
</div>
</div>	
<hr style="height:1px;border:none;border-top:1px solid #ffffff;margin-top:5px;margin-bottom:0px;" />	
<div class="row" style="height:60px;background-color:#DEDEDE;margin:0px 20px;">
<div class="col-md-3" style="color:black;font-weight:900;font-size:23px;font-family:SimHei;padding-top: 15px;">Unit SUITE 202</div>
<div class="col-md-1">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">2</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">卧室</div>
</div>
<div class="col-md-1" style="margin-left:40px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">2</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">卫生间</div>
</div>
<div class="col-md-1" style="margin-left:40px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">1901</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">面积</div>
</div>
<div class="col-md-2" style="margin-left:40px;padding:0px 30px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">$500,000</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">房价</div>
</div>
<div class="col-md-4" style="width:200px;margin-top:12px;">
<div class="dropdown">
<button type="button" class="btn dropdown-toggle" data-toggle="dropdown" style="background-color:#EEAD0E;width:180px;margin: 0 auto;color:white;"><span class="glyphicon glyphicon-chevron-down"></span>&nbsp;&nbsp;&nbsp;点击查看户型图</button>
</div>
</div>
</div>
<div class="row">
<div class="col-md-2 col-md-offset-8" style="margin-top:10px;">
<button type="button" class="btn dropdown-toggle" data-toggle="dropdown" style="background-color:#EEAD0E;width:130px;margin-left:15px;color:white;"><span class="glyphicon glyphicon-chevron-right"></span>&nbsp;&nbsp;&nbsp;最新价格</button>
</div>
<div class="col-md-2" style="margin-top:10px;">
<button type="button" class="btn dropdown-toggle" data-toggle="dropdown" style="background-color:#EEAD0E;width:130px;margin-left:10px;color:white;"><span class="glyphicon glyphicon-chevron-right"></span>&nbsp;&nbsp;&nbsp;完整户型</button>
</div>
</div>	  
</div></div></div>
<!--学校及周边-->
<div style="margin-top:20px;background-color:white;">
	<div class="panel panel-default">
  		<div class="panel-heading">学校及周边</div>
  		<div class="panel-body">
  			<div class="item  col-xs-6 col-lg-6">
            <div class="thumbnail">
                <img class="group list-group-image" src="/pic/traffic.jpg" alt="" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        附近学校</h4>
                    
                    <ul class="list-group">
					  <li class="list-group-item"><span class="badge">1.4km</span>Cras justo odio</li>
					  <li class="list-group-item"><span class="badge">3.3km</span>Dapibus ac facilisis in</li>
					  <li class="list-group-item"><span class="badge">1.1km</span>Morbi leo risus</li>
					  <li class="list-group-item"><span class="badge">4.1km</span>Porta ac consectetur ac</li>
					</ul>
                </div>
            </div>
	     </div>
	     <div class="item  col-xs-6 col-lg-6">
	            <div class="thumbnail">
	                <img class="group list-group-image" src="/pic/onfoot.jpg" alt="" />
	                <div class="caption">
	                    <h4 class="group inner list-group-item-heading">
	                        附近配套</h4>
	                    
	                    <ul class="list-group">
						  <li class="list-group-item"><span class="badge">1.4km</span>Cras justo odio</li>
						  <li class="list-group-item"><span class="badge">3.3km</span>Dapibus ac facilisis in</li>
						  <li class="list-group-item"><span class="badge">1.1km</span>Morbi leo risus</li>
						  <li class="list-group-item"><span class="badge">2.1km</span>Vestibulum at eros</li>
						</ul>
	                </div>
	            </div>
	     </div>
		</div>
  		 
  	</div>
</div>
<!--估计总购房税费-->
<div style="margin-top:20px;background-color:white;">
<ul class="nav nav-tabs" id="costTabs">
      <li class="active"><a href="#home" data-toggle="tab">Home</a></li>
      <li><a href="#profile" data-toggle="tab">Profile</a></li>
      <li class="navbar-text navbar-right">&nbsp;&nbsp;&nbsp;&nbsp;</li>
      <p class="navbar-text navbar-right"><b>以总价50万澳币计算</b></p>
      <!-- <div class="col-md-2 col-md-pull-5"><p><b>以总价50万澳币计算</b></p></div> -->
      <!-- <li class="pull-right"><p><b>以总价50万澳币计算</b></p></li> -->
      <!-- <li class="disabled"><a href="#profile" data-toggle="tab">Web Service</a></li> -->
      <!--<li class="navbar-right">&nbsp;&nbsp;&nbsp;&nbsp;</li> 
      <li class=""><p><b>以总价50万澳币计算</b></p></li>
      <li class="navbar-right">&nbsp;&nbsp;&nbsp;&nbsp;</li> -->
    </ul>
    
    <div class="tab-content">
      <div class="tab-pane active" id="home">
      	<div style="padding-top:10px;padding-bottom:10px;">
      		<div style="float:left;margin-right:20px;margin-left:20px;">
      			<p>估计总购房税费</p>
      		</div>
      		<div>
      			<select id="MySelect">
				<option>约5万澳元</option>
				<option>约15万澳元</option>
				<option>约115万澳元</option>
				</select>
      		</div>
      	</div>
      	<div>
      		<div id="GouFang_pie" style="height:200px"></div>
      	</div>
      </div> 
      <div class="tab-pane" id="profile">
      	<div style="padding-top:10px;padding-bottom:10px;">
      		<div style="float:left;margin-right:20px;margin-left:20px;">
      			<p>预估每年持有成本</p>
      		</div>
      		<div style="float:left;">
      			<select id="MySelect1">
				<option value='5'>约5万澳元</option>
				<option value='15'>约15万澳元</option>
				<option value='115'>约115万澳元</option>
				</select>
      		</div>
      		<div style="margin-left:20px;float:left;">
      			<p>税费范围</p>
      		</div>
      		<div style="margin-left:20px;float:left;">
      			<p>约1万澳元</p>
      		</div>
      		<div style="margin-left:20px;float:left;">
      			<p>约7万澳元</p>
      		</div>
      	</div>
      	<div>
      		<div id="ChengBen_pie" style="height:200px">
      			</div>
      	</div>
      </div> 
      
  	</div>
</div>

<!--贷款每月还款多少-->
<div style="margin-top:20px;background-color:#9FB6CD;height:400px;padding:30px 40px;">
<div class="row">
<div class="col-md-3">
<div style="color:white;font-weight:900;font-size:25px;font-family:SimHei;">贷款每月</div>
<div style="color:white;font-weight:900;font-size:25px;font-family:SimHei;">还款是多少</div>
</div>
<div class="col-md-9"></div>
</div>
<hr style="height:1px;border:none;border-top:1px solid #ffffff;margin-top:5px;margin-bottom:5px;opacity:0.5;" />
<div class="row">
<div class="col-md-3" style="margin-top:-30px;padding-left:40px;">
<div style="color:white;font-weight:900;font-size:100px;font-family:SimHei;">?</div>
</div>
<div class="col-md-3">
<div style="color:white;font-weight:900;font-size:16px;font-family:SimHei;">房款总额</div>
<div class="input-group"> <input type="text" class="form-control" placeholder="$400,000" style="margin-top:8px;width:220px;"></div>
</div>
<div class="col-md-3" style="padding-left:0px;">
<div style="color:white;font-weight:900;font-size:16px;font-family:SimHei;">税率</div>
<div class="input-group"> <input type="text" class="form-control" placeholder="2.48%" style="margin-top:8px;width:220px;"></div>
</div>
<div class="col-md-3" style="padding-left:0px;">
<div style="color:white;font-weight:900;font-size:16px;font-family:SimHei;">贷款方式</div>
<div class="input-group" style="width:220px;">
<input type="text" class="form-control" placeholder="2.48%" style="margin-top:8px;width:190px;">
<div class="input-group-btn">
     <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" style="height:34px;margin-top:8px;background-color:#CDC5BF;width:30px;"><span class="caret"></span></button>
     <ul class="dropdown-menu" role="menu" style="margin-left:-191;width:220px;opacity:0.7;margin-top:-22px">
      <li><a href="#">2%</a></li>
      <li><a href="#">2.48%</a></li>
      <li><a href="#">3%</a></li>
   </ul>
</div>
</div>
</div>
</div>
<div class="row"  >
<div class="col-md-3 col-md-offset-3" style="margin-top:-20px;">
<div style="color:white;font-weight:900;font-size:16px;font-family:SimHei;">首付比例</div>
<div class="input-group" style="width:220px;">
<input type="text" class="form-control" placeholder="20%" style="margin-top:8px;width:190px;">
<div class="input-group-btn">
     <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" style="height:34px;margin-top:8px;background-color:#CDC5BF;width:30px;"><span class="caret"></span></button>
     <ul class="dropdown-menu" role="menu" style="margin-left:-191;width:220px;opacity:0.7;margin-top:-22px">
      <li><a href="#">20%</a></li>
      <li><a href="#">25%</a></li>
      <li><a href="#">30%</a></li>
   </ul>
</div>
</div>
</div>
<div class="col-md-3" style="margin-top:-20px;">
<div style="color:white;font-weight:900;font-size:16px;font-family:SimHei;">贷款年限</div>
<div class="input-group" style="width:220px;">
<input type="text" class="form-control" placeholder="25年" style="margin-top:8px;width:190px;">
<div class="input-group-btn">
     <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" style="height:34px;margin-top:8px;background-color:#CDC5BF;width:30px;"><span class="caret"></span></button>
      <ul class="dropdown-menu" role="menu" style="margin-left:-191;width:220px;opacity:0.7;margin-top:-22px">
      <li><a href="#">20年</a></li>
      <li><a href="#">25年</a></li>
      <li><a href="#">30年</a></li>
   </ul>
</div>
</div>
</div>
<div class="col-md-3"></div>
</div>
<div class="row" style="margin-top:50px;">
<div class="col-md-9 col-md-offset-3" style="margin-top:-20px;background-color:#4682B4;height:60px;margin-left:288px;width:755px;">
<div class="row">
<div class="col-md-2 col-md-offset-2" style="margin-top: 18px;padding-left:0px;">
<div style="color:white;font-weight:900;font-size:18px;font-family:SimHei;">还款金额</div>
</div>
<div class="col-md-7" style="padding-right:0px;width: 425px;">
<input type="text" class="form-control" style="margin-top:13px;width:400px;">
</div>
<div class="col-md-1" style="margin-top: 18px;padding-left:0px;">
<div style="color:white;font-weight:900;font-size:18px;font-family:SimHei;">/月</div>
</div>
</div>
</div>
</div>
</div>

<!--投资数据-->
<div style="margin-top:20px;background-color:white;">
<div class="panel panel-default">
	  <div class="heading">South Melbourne投资数据<br>
	 <span id="detail"> 投资数据参考2卧室房产</span>
	  
	  </div>
	  <hr>
	  <div class="panel-body-info">
	  	<table id="MyTable" align="center">
	  	
    <tr> 
        <th>年增长率</td> 
        <th>中位数价格</td> 
        <th>中位数租金</td>
        <th>租房空置率</td>
        <th>租赁需求</td>
        <th>现金回报</td>
    </tr> 
    <tr class="table_tab1"> 
        <td>1.1%</td> 
        <td>$561K</td> 
        <td>S560周</td> 
        <td>5.0%</td> 
        <td>低
        </td> 
        <td>￥129/月</td> 
    </tr> 
    <tr class="table_tab2"> 
        <td></td> 
        <td></td> 
        <td></td> 
        <td></td> 
        <td>每单位102探访</td> 
        <td></td> 
    </tr> 
	  	</table>
      	</div>
	  </div>
	</div>

<!--中位数公寓房价-->
<div style="margin-top:20px;background-color:white;padding:40px 0px;">
<div class="row" style="height:200px;">
<div class="col-md-2"></div>
 <div class="col-md-2" style="padding-left:70px;padding-right:0px;">
 <div><img src="images/buy.png"></div>
 <div style="color:#FF7F00;font-weight:900;font-size:28px;">&nbsp;&nbsp;$561,000</div>
 </div>
 <div class="col-md-3" style="padding-left:50px;width:340px;">
 <div style="color:#000000;font-weight:900;font-size:16px;">South Melbourne中位数公寓房价</div>
 <div style="color:#333;font-size:8px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;价格最后更新日期为2015.02.02</div>
 </div>
 <div class="col-md-4">
 <div><img src="images/rent.png"></div>
 <div style="color:#27408B;font-weight:900;font-size:25px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;560/周</div>
 </div>
</div>
<div class="row">
<div class="col-md-5 col-md-offset-1">
 <div class="btn-toolbar btn-group-lg" role="toolbar" aria-label="...">
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;float:left;">
     <div style="color:#FF7F00;font-weight:900;">1居</div>
     <div style="color:#000000;font-weight:900;">$409,000</div>
     </button>
      <button type="button" class="btn btn-inverse" style="height:100px;width:140px;float:left;">
     <div style="color:#FF7F00;font-weight:900;">2居</div>
     <div style="color:#000000;font-weight:900;">$409,000</div>
     </button>
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;float:left;">
     <div style="color:#FF7F00;font-weight:900;">3居</div>
     <div style="color:#000000;font-weight:900;">$409,000</div>
     </button>
 </div></div>
 <div class="col-md-6">
 <div class="btn-toolbar btn-group-lg" role="toolbar" aria-label="...">
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;float:left;">
     <div style="color:#27408B;font-weight:900;">1居</div>
     <div style="color:#000000;font-weight:900;">$409</div>
     </button>
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;float:left;">
     <div style="color:#27408B;font-weight:900;">2居</div>
     <div style="color:#000000;font-weight:900;">$409</div>
     </button>
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;float:left;">
     <div style="color:#27408B;font-weight:900;">3居</div>
     <div style="color:#000000;font-weight:900;">$409</div>
     </button>
 </div></div>
</div>
</div>
<!--trend-->
<div  style="margin-top:20px;background-color:white;">
 <ul class="nav nav-tabs nav-justified" id="trendTabs">
      <li class="active"><a href="#price" data-toggle="tab">South MelBourne区域中位数房价走势</a></li>
      <li><a href="#rent" data-toggle="tab">South MelBourne区域租金走势</a></li>
      <li><a href="#emptypercent" data-toggle="tab">South MelBourne区域空置率走势</a></li>
     <!-- <p class="navbar-text navbar-right">Signed in as Mark Otto</p>-->
    </ul>
    
    <div class="tab-content">
      <div class="tab-pane active" id="price">
      	<div>
      		<div id="price_line" style="height:250px"></div>
      	</div>
      </div> 
      <div class="tab-pane" id="rent">
      	<div>
      		<div id="rent_line" style="height:250px">
      			</div>
      	</div>
      </div> 
      <div class="tab-pane" id="emptypercent">
      	<div>
      		<div id="emptypercent_line" style="height:250px">
      			</div>
      	</div>
      </div> 
  	</div>
</div>


<!--区域家庭情况构成list-->
<div style="margin-top:20px;background-color:white;">
	<div class="panel panel-default">
	  <div class="panel-heading">South Melbourne区域家庭情况构成<div class="pull-right"><font size="1">数据来源：PGData 最近更新时间：11/02/15</font></div></div>
	  <table class="table table-striped">
    	<thead>
    		<tr class="row">
    		<th>地址</th>
    		<th>价格</th>
    		<th>床位</th>
    		<th>销售类型</th>
    		<th>销售时间</th>
    		</tr>
    	</thead>
    	<tbody>
    		<tr class="row">
    			<td>1712/83 Whiteman St</td>
    			<td>$407,000</td>
    			<td>2</td>
    			<td>普通销售</td>
    			<td>11/04/15</td>
    		</tr>
    		<tr class="row">
    			<td>1712/83 Whiteman St</td>
    			<td>$407,000</td>
    			<td>2</td>
    			<td>普通销售</td>
    			<td>11/04/15</td>
    		</tr>
    		<tr class="row">
    			<td>1712/83 Whiteman St</td>
    			<td>$407,000</td>
    			<td>2</td>
    			<td>普通销售</td>
    			<td>11/04/15</td>
    		</tr>	
    		<tr class="row">
    			<td>1712/83 Whiteman St</td>
    			<td>$407,000</td>
    			<td>2</td>
    			<td>普通销售</td>
    			<td>11/04/15</td>
    		</tr>
    		<tr class="row">
    			<td>1712/83 Whiteman St</td>
    			<td>$407,000</td>
    			<td>2</td>
    			<td>普通销售</td>
    			<td>11/04/15</td>
    		</tr>
    		<tr class="row">
    			<td>1712/83 Whiteman St</td>
    			<td>$407,000</td>
    			<td>2</td>
    			<td>普通销售</td>
    			<td>11/04/15</td>
    		</tr>
    	</tbody>
  	  </table>
	</div>
</div>

<!--地区特点start-->
<div style="margin-top:20px;">
  <div class="panel panel-default">
  	<div class="panel-heading" style="background-color:white;">Sourth Melbourne 地区特点</div>
  	 <div class="panel-body">
  	     	<div class="col-xs-6">
  	     		<ol>
  	     			<li>平均房价在VIC排名 NO.25</li>
  	     			<li>平均租金在VIC排名 NO.25</li>
  	     			<li>本区有优秀小学</li>
  	     			<li>本区有优秀小学</li>
  	     			<li>本区有优秀小学</li>
  	     		</ol>
  	     	</div>
  	     	<div class="col-xs-6">
  	     		<ol start="6">
  	     			<li>平均房价在VIC排名 NO.25</li>
  	     			<li>平均租金在VIC排名 NO.25</li>
  	     			<li>本区有优秀小学</li>
  	     			<li>本区有优秀小学</li>
  	     			<li>本区有优秀小学</li>
  	     		</ol>
  	     	</div>
     </div>
  </div>
<div>
<!--地区特点end-->
<!--人口分布-->
<div style="margin-top:20px;background-color:white;">
<div class="panel panel-default">
	  <div class="panel-heading">South Melbourne区域人口分布<div class="pull-right"><font size="1">数据来源：PGData 最近更新时间：11/02/15</font></div></div>
	  <table class="table table-striped">
    	<thead>
    		<tr class="row">
    		<th>人口总数</th>
    		<th>区域</th>
    		<th>城市</th>
    		</tr>
    	</thead>
    	<tbody>
    		<tr class="row">
    			<td>407,000</td>
    			<td>中国</td>
    			<td>北京</td>
    		</tr>
    		<tr class="row">
    			<td>407,000</td>
                <td>中国</td>
                <td>北京</td>
    		</tr>
    		<tr class="row">
    			<td>407,000</td>
                <td>中国</td>
                <td>北京</td>
    		</tr>	
    		<tr class="row">
    			<td>407,000</td>
                <td>中国</td>
                <td>北京</td>
    		</tr>
    		<tr class="row">
    			<td>407,000</td>
                <td>中国</td>
                <td>北京</td>
    		</tr>
    		<tr class="row">
    			<td>407,000</td>
                <td>中国</td>
                <td>北京</td>
    		</tr>
    	</tbody>
  	  </table>
	</div>
</div>
<!--人口分布end>
<!--新闻报道-->
<div style="margin-top:20px;background-color:white;">
	<div class="panel panel-default" id="MyPanel">
	<div class="heading1"><strong>新闻报道</strong><br></div>
	<div class="panel-body">
  		<div class="row">
          <div class="news_position">
                <div class="scroll" id="left">
                     <img src="/images/news.jpg" alt="" width=350px height=255px>
                </div>
                <div class="caption_my" style="height:98px;">
		         <h3 id="title_news" style="font-weight: bold; font-size:20px;">新闻标题：北京信息</h3>
		         <p>新闻来源：北京   &nbsp;&nbsp;&nbsp;&nbsp;时间：2015</p>
		        </div>
           </div>
		   <div class="news_position" id="MyNews">
		      	<div class="info">
                     <div class="news_action" style="display:none;">
	                     <ul class="list" id="list_scroll">
							  <li >Cras justo odio</li>
							  <li >span Dapibus ac facilisis in</li>
							  <li >Morbi leo risus</li>
							  <li >Vestibulum at eros</li>
						</ul>
                    
                     </div>
                </div>
                <div class="caption_my" style="height:98px;">
		         <h3 style="font-weight: bold; font-size:20px;">新闻标题新闻标题</h3>
		         <p style="font-weight: bold; font-size:20px;">新闻标题新闻标题</p>
		        </div>
		   </div>
		   <div class="news_position">
		      <div class="scroll" id="right">
                     <img src="/images/news.jpg" alt="" width=350px height=255px>
                </div>
                <div class="caption_my" style="height:98px;">
		         <h3 class="title_news" style="font-weight: bold; font-size:20px;">新闻标题：北京信息</h3>
		         <p>新闻来源：北京   &nbsp;&nbsp;&nbsp;&nbsp;时间：2015</p>
		        </div>
		   </div>
		   
   </div>
</div>
  		</div>
  		 
  	</div>
</div>
<!--区域家庭情况构成pie-->
<div style="margin-top:20px;background-color:white;">
<div class="panel panel-default">
	  <div class="panel-heading">South Melbourne区域家庭情况构成</div>
	  <div class="panel-body">
	  	<div id="zonefamily_pie" style="height:200px">
      	</div>
	  </div>
	</div>
</div>

<!--项目位置-->
<div style="margin-top:20px;background-color:white;">
<div class="panel panel-default">
	  <div class="panel-heading">项目位置</div>
	  <div class="panel-body">
	  	<div id="zonefamily_pie" style="height:370px">
	  	<div class="row">
	  	<div class="col-md-6">
	  	<div id='myMap' style="position:relative; width:550px; height:370px;"></div>
	  	</div>
	  	<div class="col-md-6"></div>
	  	 <div><img src="images/streetside.png"></div>
	  	</div>
      	</div>
	  </div>
	</div>
</div>




<!--你是否需要房产经纪人start-->
<div style="margin-top:20px;background-color:rgba(177, 220, 245, 1);" >
<div class="row">
    <!--左边 start-->
	<div class="col-xs-3" >
	  <div  class="col-xs-9">
	   <div id="wenzi" style="margin:20 0 20 20">
	     <span style="color:white;"><h3><strong>你是否需要</strong></h3></span>
	     <span style="color:white"><h3><strong>房产经纪人</strong></h3></span>
	  	 <!--<img alt="image" class="img-responsive" src="pic/as.png">-->
	   </div>
	   </div>
	   <div class="col-xs-3" style="margin:20 0">
	       <img alt="image"  src="pic/wenhao.png">
	   </div>
 	</div>
 	 <!--左边 end-->
 	 <!--中间start线-->
 	<div class="col-xs-1" >
 		<div style="float:right;width: 1px;height: 563px; background: white;margin:20 0"></div>
 	</div>
 	 <!--中间end线-->
 	
 	 <!--右边 start-->
 	<div class="col-xs-8">
 	      <!--列表 start-->
 		 <div id="list"  class="brdr bgc-fff pad-10 box-shad btm-mrg-20 property-listing" style="margin:20 20 20 5">
 		    <!--第一个元素start-->
 		 	 <div id="firstitem" style="border:1px solid #E6E6FA;padding:20 20;background-color:white;margin:10 10;">
           		  <div class="media">
          			  <a class="pull-left" href="#" target="_parent">
              				<img alt="image" class="img-responsive" src="pic/yangkun2.jpg">
           			  </a>
           		 	  <div class="clearfix visible-sm"></div>
           		 	  <div class="media-body fnt-smaller" style="padding:0 0 0 15px">
                		  <h4 class="media-heading"><b>李先生</b></h4>
                		  <h6>从业经验：8年</h6>
                		  <h6>语言：普通话、粤语、英文</h6>
                		  <h6>区域：Sourth Melbourne</h6>
                		  <img alt="image" class="img-responsive" src="pic/houseicon.JPG">
            		 </div>
      			 </div>
     		 </div>
     		 <!--第一个元素end-->
     		 <!--第二个元素start-->
     		  <div id="firstitem" style="border:1px solid #E6E6FA;padding:20 20;background-color:white;margin:10 10;">
           		  <div class="media">
          			  <a class="pull-left" href="#" target="_parent">
              				<img alt="image" class="img-responsive" src="pic/yangkun2.jpg">
           			  </a>
           		 	  <div class="clearfix visible-sm"></div>
           		 	  <div class="media-body fnt-smaller" style="padding:0 0 0 15px">
                		  <h4 class="media-heading"><b>李先生</b></h4>
                		  <h6>从业经验：8年</h6>
                		  <h6>语言：普通话、粤语、英文</h6>
                		  <h6>区域：Sourth Melbourne</h6>
                		  <img alt="image" class="img-responsive" src="pic/houseicon.JPG">
            		 </div>
      			 </div>
     		 </div>
     		 <!--第二个元素end-->
     		 <!--第三个元素start-->
     		  <div id="firstitem" style="border:1px solid #E6E6FA;padding:20 20;background-color:white;margin:10 10;">
           		  <div class="media">
          			  <a class="pull-left" href="#" target="_parent">
              				<img alt="image" class="img-responsive" src="pic/yangkun2.jpg">
           			  </a>
           		 	  <div class="clearfix visible-sm"></div>
           		 	  <div class="media-body fnt-smaller" style="padding:0 0 0 15px">
                		  <h4 class="media-heading"><b>李先生</b></h4>
                		  <h6>从业经验：8年</h6>
                		  <h6>语言：普通话、粤语、英文</h6>
                		  <h6>区域：Sourth Melbourne</h6>
                		  <img alt="image" class="img-responsive" src="pic/houseicon.JPG">
            		 </div>
      			 </div>
     		 </div>
     		 <!--第三个元素end-->
 		 </div>
 		  <!--列表 end-->
 	</div>
 	 <!--右边end-->
 </div>	
</div>



<!--新闻报道-->
<div style="margin-top:20px;background-color:white;">
	<div class="panel panel-default" id="MyPanel">
	<div class="heading1"><strong>推荐项目</strong><br></div>
	<div class="panel-body">
  		<div class="row">
          <div class="news_position">
                <div class="scroll" id="left">
                     <img src="/images/pic.jpg" alt="" width=350px height=255px>
                </div>
                <div class="caption_my" style="height:98px;">
		         <p class="desc"><a href="#">Lorem ipsum dolor sit amet</a> </p>
		         <p class="desc">房屋描述房屋描述房屋描述房屋描述房屋描述</p>
		          
		        </div>
           </div>
		   <div class="news_position">
                <div class="scroll" id="left">
                     <img src="/images/pic.jpg" alt="" width=350px height=255px>
                </div>
                <div class="caption_my" style="height:98px;">
		         <p class="desc"><a href="#">Lorem ipsum dolor sit amet</a> </p>
		         <p class="desc">房屋描述房屋描述房屋描述房屋描述房屋描述</p>
		          
		        </div>
           </div>
		   <div class="news_position">
		      <div class="scroll" id="right">
                     <img src="/images/pic.jpg" alt="" width=350px height=255px>
                </div>
                <div class="caption_my" style="height:98px;">
		         <p class="desc"><a href="#">Lorem ipsum dolor sit amet</a> </p>
		         <p class="desc">房屋描述房屋描述房屋描述房屋描述房屋描述</p>
		          
		        </div>
		   </div>
		   
   </div>
</div>
  		</div>
  		 
  	</div>
</div>




</div>
</div>
 <jsp:include page="foot.jsp" /> 
 <script src="/js/familyStatus.js"></script>
 <script src="/js/trend.js"></script>
 <script src="/js/cost.js"></script>
 <script src="/js/news.js"></script>
</body>
</html>