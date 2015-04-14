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
							<span style="font-size:16px;font-family:����;color:black;target="_blank" href="#"">IDLand</span>
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
							<span style="font-size:16px;font-family:����;color:black;target="_blank" href="#"">�׸�����ۣ� </span>
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
							<span style="font-size:16px;font-family:����;color:black;target="_blank" href="#"">�������� </span>
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
							<span style="font-size:16px;font-family:����;color:black;target="_blank" href="#"">��ҵ��/ÿ�� </span>
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
							<span style="font-size:16px;font-family:����;color:black;target="_blank" href="#"">ӡ��˰</span>
							</div>
					</dd>
				</dl>
					</div>
					</div>
</div>
<!--��Ŀ����-->
<div style="margin-top:20px;background-color:white;">
	<div class="panel panel-default">
  		<div class="panel-heading">��Ŀ����</div>
  		<div class="panel-body">
  			<div>
  			 <!--  <hr> -->
				<h2>The Elements</h2>
				<p class="lead">���缶�Ľ���</p>
  			</div>
  			<div id="detail">
  			           ����Ѱ�Ұ��������ٷ����أ�����������Ұ�2013�ǰ���Ͱ�Ϊ�Ա���Ҷ�������������Ϲ�ͨ������������������������ڹ������ʱ�˽⽻��״̬��ֱ��������Ʒ�����ٽ����Ա��������������ٷ�����2013��Ұ��ܰ��������ҿͻ���������������ҵ��Ϣ����ʱ�����̻�����ʱǢ̸�����⣡
  			<p>
  			����Ѱ�Ұ��������ٷ����أ�����������
  			</div>
  			<div class="container">
 				<button type="button" class="btn">������ѯ</button>
  			
			</div>
  		</div>
  		 
  	</div>
</div>
<!--���ͼ�����-->
<div style="margin-top:20px;background-color:white;">
<div class="panel panel-default">
<div class="panel-heading" style="background-color:white;font-weight:bold;padding-left:35px;">���ͼ��۸�</div>
<div class="panel-body">
<div class="row" style="height:60px;background-color:#DEDEDE;margin:0px 20px;">
<div class="col-md-3" style="color:black;font-weight:900;font-size:23px;font-family:SimHei;padding-top: 15px;">Unit SUITE 202</div>
<div class="col-md-1">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">2</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">����</div>
</div>
<div class="col-md-1" style="margin-left:40px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">2</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">������</div>
</div>
<div class="col-md-1" style="margin-left:40px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">1901</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">���</div>
</div>
<div class="col-md-2" style="margin-left:40px;padding:0px 30px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">$500,000</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">����</div>
</div>
<div class="col-md-4" style="width:200px;margin-top:12px;">
<div class="dropdown">
<button type="button" class="btn dropdown-toggle" data-toggle="dropdown" style="background-color:#EEAD0E;width:180px;margin: 0 auto;color:white;"><span class="glyphicon glyphicon-chevron-down"></span>&nbsp;&nbsp;&nbsp;����鿴����ͼ</button>
</div>
</div>
</div>
<hr style="height:1px;border:none;border-top:1px solid #ffffff;margin-top:5px;margin-bottom:0px;" />	
<div class="row" style="height:60px;background-color:#DEDEDE;margin:0px 20px;">
<div class="col-md-3" style="color:black;font-weight:900;font-size:23px;font-family:SimHei;padding-top: 15px;">Unit SUITE 202</div>
<div class="col-md-1">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">2</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">����</div>
</div>
<div class="col-md-1" style="margin-left:40px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">2</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">������</div>
</div>
<div class="col-md-1" style="margin-left:40px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">1901</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">���</div>
</div>
<div class="col-md-2" style="margin-left:40px;padding:0px 30px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">$500,000</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">����</div>
</div>
<div class="col-md-4" style="width:200px;margin-top:12px;">
<div class="dropdown">
<button type="button" class="btn dropdown-toggle" data-toggle="dropdown" style="background-color:#EEAD0E;width:180px;margin: 0 auto;color:white;"><span class="glyphicon glyphicon-chevron-down"></span>&nbsp;&nbsp;&nbsp;����鿴����ͼ</button>
</div>
</div>
</div>	
<hr style="height:1px;border:none;border-top:1px solid #ffffff;margin-top:5px;margin-bottom:0px;" />	
<div class="row" style="height:60px;background-color:#DEDEDE;margin:0px 20px;">
<div class="col-md-3" style="color:black;font-weight:900;font-size:23px;font-family:SimHei;padding-top: 15px;">Unit SUITE 202</div>
<div class="col-md-1">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">2</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">����</div>
</div>
<div class="col-md-1" style="margin-left:40px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">2</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">������</div>
</div>
<div class="col-md-1" style="margin-left:40px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">1901</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">���</div>
</div>
<div class="col-md-2" style="margin-left:40px;padding:0px 30px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">$500,000</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">����</div>
</div>
<div class="col-md-4" style="width:200px;margin-top:12px;">
<div class="dropdown">
<button type="button" class="btn dropdown-toggle" data-toggle="dropdown" style="background-color:#EEAD0E;width:180px;margin: 0 auto;color:white;"><span class="glyphicon glyphicon-chevron-down"></span>&nbsp;&nbsp;&nbsp;����鿴����ͼ</button>
</div>
</div>
</div>	
<hr style="height:1px;border:none;border-top:1px solid #ffffff;margin-top:5px;margin-bottom:0px;" />	
<div class="row" style="height:60px;background-color:#DEDEDE;margin:0px 20px;">
<div class="col-md-3" style="color:black;font-weight:900;font-size:23px;font-family:SimHei;padding-top: 15px;">Unit SUITE 202</div>
<div class="col-md-1">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">2</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">����</div>
</div>
<div class="col-md-1" style="margin-left:40px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">2</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">������</div>
</div>
<div class="col-md-1" style="margin-left:40px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">1901</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">���</div>
</div>
<div class="col-md-2" style="margin-left:40px;padding:0px 30px;">
<div style="background-color:white;margin-top: 10px;text-align:center;border-radius:5px;font-weight:bold;">$500,000</div>
<div style="text-align:center;font-weight:bold;font-family:SimHei;">����</div>
</div>
<div class="col-md-4" style="width:200px;margin-top:12px;">
<div class="dropdown">
<button type="button" class="btn dropdown-toggle" data-toggle="dropdown" style="background-color:#EEAD0E;width:180px;margin: 0 auto;color:white;"><span class="glyphicon glyphicon-chevron-down"></span>&nbsp;&nbsp;&nbsp;����鿴����ͼ</button>
</div>
</div>
</div>
<div class="row">
<div class="col-md-2 col-md-offset-8" style="margin-top:10px;">
<button type="button" class="btn dropdown-toggle" data-toggle="dropdown" style="background-color:#EEAD0E;width:130px;margin-left:15px;color:white;"><span class="glyphicon glyphicon-chevron-right"></span>&nbsp;&nbsp;&nbsp;���¼۸�</button>
</div>
<div class="col-md-2" style="margin-top:10px;">
<button type="button" class="btn dropdown-toggle" data-toggle="dropdown" style="background-color:#EEAD0E;width:130px;margin-left:10px;color:white;"><span class="glyphicon glyphicon-chevron-right"></span>&nbsp;&nbsp;&nbsp;��������</button>
</div>
</div>	  
</div></div></div>
<!--ѧУ���ܱ�-->
<div style="margin-top:20px;background-color:white;">
	<div class="panel panel-default">
  		<div class="panel-heading">ѧУ���ܱ�</div>
  		<div class="panel-body">
  			<div class="item  col-xs-6 col-lg-6">
            <div class="thumbnail">
                <img class="group list-group-image" src="/pic/traffic.jpg" alt="" />
                <div class="caption">
                    <h4 class="group inner list-group-item-heading">
                        ����ѧУ</h4>
                    
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
	                        ��������</h4>
	                    
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
<!--�����ܹ���˰��-->
<div style="margin-top:20px;background-color:white;">
<ul class="nav nav-tabs" id="costTabs">
      <li class="active"><a href="#home" data-toggle="tab">Home</a></li>
      <li><a href="#profile" data-toggle="tab">Profile</a></li>
      <li class="navbar-text navbar-right">&nbsp;&nbsp;&nbsp;&nbsp;</li>
      <p class="navbar-text navbar-right"><b>���ܼ�50��ıҼ���</b></p>
      <!-- <div class="col-md-2 col-md-pull-5"><p><b>���ܼ�50��ıҼ���</b></p></div> -->
      <!-- <li class="pull-right"><p><b>���ܼ�50��ıҼ���</b></p></li> -->
      <!-- <li class="disabled"><a href="#profile" data-toggle="tab">Web Service</a></li> -->
      <!--<li class="navbar-right">&nbsp;&nbsp;&nbsp;&nbsp;</li> 
      <li class=""><p><b>���ܼ�50��ıҼ���</b></p></li>
      <li class="navbar-right">&nbsp;&nbsp;&nbsp;&nbsp;</li> -->
    </ul>
    
    <div class="tab-content">
      <div class="tab-pane active" id="home">
      	<div style="padding-top:10px;padding-bottom:10px;">
      		<div style="float:left;margin-right:20px;margin-left:20px;">
      			<p>�����ܹ���˰��</p>
      		</div>
      		<div>
      			<select id="MySelect">
				<option>Լ5���Ԫ</option>
				<option>Լ15���Ԫ</option>
				<option>Լ115���Ԫ</option>
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
      			<p>Ԥ��ÿ����гɱ�</p>
      		</div>
      		<div style="float:left;">
      			<select id="MySelect1">
				<option value='5'>Լ5���Ԫ</option>
				<option value='15'>Լ15���Ԫ</option>
				<option value='115'>Լ115���Ԫ</option>
				</select>
      		</div>
      		<div style="margin-left:20px;float:left;">
      			<p>˰�ѷ�Χ</p>
      		</div>
      		<div style="margin-left:20px;float:left;">
      			<p>Լ1���Ԫ</p>
      		</div>
      		<div style="margin-left:20px;float:left;">
      			<p>Լ7���Ԫ</p>
      		</div>
      	</div>
      	<div>
      		<div id="ChengBen_pie" style="height:200px">
      			</div>
      	</div>
      </div> 
      
  	</div>
</div>

<!--����ÿ�»������-->
<div style="margin-top:20px;background-color:#9FB6CD;height:400px;padding:30px 40px;">
<div class="row">
<div class="col-md-3">
<div style="color:white;font-weight:900;font-size:25px;font-family:SimHei;">����ÿ��</div>
<div style="color:white;font-weight:900;font-size:25px;font-family:SimHei;">�����Ƕ���</div>
</div>
<div class="col-md-9"></div>
</div>
<hr style="height:1px;border:none;border-top:1px solid #ffffff;margin-top:5px;margin-bottom:5px;opacity:0.5;" />
<div class="row">
<div class="col-md-3" style="margin-top:-30px;padding-left:40px;">
<div style="color:white;font-weight:900;font-size:100px;font-family:SimHei;">?</div>
</div>
<div class="col-md-3">
<div style="color:white;font-weight:900;font-size:16px;font-family:SimHei;">�����ܶ�</div>
<div class="input-group"> <input type="text" class="form-control" placeholder="$400,000" style="margin-top:8px;width:220px;"></div>
</div>
<div class="col-md-3" style="padding-left:0px;">
<div style="color:white;font-weight:900;font-size:16px;font-family:SimHei;">˰��</div>
<div class="input-group"> <input type="text" class="form-control" placeholder="2.48%" style="margin-top:8px;width:220px;"></div>
</div>
<div class="col-md-3" style="padding-left:0px;">
<div style="color:white;font-weight:900;font-size:16px;font-family:SimHei;">���ʽ</div>
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
<div style="color:white;font-weight:900;font-size:16px;font-family:SimHei;">�׸�����</div>
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
<div style="color:white;font-weight:900;font-size:16px;font-family:SimHei;">��������</div>
<div class="input-group" style="width:220px;">
<input type="text" class="form-control" placeholder="25��" style="margin-top:8px;width:190px;">
<div class="input-group-btn">
     <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" style="height:34px;margin-top:8px;background-color:#CDC5BF;width:30px;"><span class="caret"></span></button>
      <ul class="dropdown-menu" role="menu" style="margin-left:-191;width:220px;opacity:0.7;margin-top:-22px">
      <li><a href="#">20��</a></li>
      <li><a href="#">25��</a></li>
      <li><a href="#">30��</a></li>
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
<div style="color:white;font-weight:900;font-size:18px;font-family:SimHei;">������</div>
</div>
<div class="col-md-7" style="padding-right:0px;width: 425px;">
<input type="text" class="form-control" style="margin-top:13px;width:400px;">
</div>
<div class="col-md-1" style="margin-top: 18px;padding-left:0px;">
<div style="color:white;font-weight:900;font-size:18px;font-family:SimHei;">/��</div>
</div>
</div>
</div>
</div>
</div>

<!--Ͷ������-->
<div style="margin-top:20px;background-color:white;">
<div class="panel panel-default">
	  <div class="heading">South MelbourneͶ������<br>
	 <span id="detail"> Ͷ�����ݲο�2���ҷ���</span>
	  
	  </div>
	  <hr>
	  <div class="panel-body-info">
	  	<table id="MyTable" align="center">
	  	
    <tr> 
        <th>��������</td> 
        <th>��λ���۸�</td> 
        <th>��λ�����</td>
        <th>�ⷿ������</td>
        <th>��������</td>
        <th>�ֽ�ر�</td>
    </tr> 
    <tr class="table_tab1"> 
        <td>1.1%</td> 
        <td>$561K</td> 
        <td>S560��</td> 
        <td>5.0%</td> 
        <td>��
        </td> 
        <td>��129/��</td> 
    </tr> 
    <tr class="table_tab2"> 
        <td></td> 
        <td></td> 
        <td></td> 
        <td></td> 
        <td>ÿ��λ102̽��</td> 
        <td></td> 
    </tr> 
	  	</table>
      	</div>
	  </div>
	</div>

<!--��λ����Ԣ����-->
<div style="margin-top:20px;background-color:white;padding:40px 0px;">
<div class="row" style="height:200px;">
<div class="col-md-2"></div>
 <div class="col-md-2" style="padding-left:70px;padding-right:0px;">
 <div><img src="images/buy.png"></div>
 <div style="color:#FF7F00;font-weight:900;font-size:28px;">&nbsp;&nbsp;$561,000</div>
 </div>
 <div class="col-md-3" style="padding-left:50px;width:340px;">
 <div style="color:#000000;font-weight:900;font-size:16px;">South Melbourne��λ����Ԣ����</div>
 <div style="color:#333;font-size:8px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�۸�����������Ϊ2015.02.02</div>
 </div>
 <div class="col-md-4">
 <div><img src="images/rent.png"></div>
 <div style="color:#27408B;font-weight:900;font-size:25px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;560/��</div>
 </div>
</div>
<div class="row">
<div class="col-md-5 col-md-offset-1">
 <div class="btn-toolbar btn-group-lg" role="toolbar" aria-label="...">
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;float:left;">
     <div style="color:#FF7F00;font-weight:900;">1��</div>
     <div style="color:#000000;font-weight:900;">$409,000</div>
     </button>
      <button type="button" class="btn btn-inverse" style="height:100px;width:140px;float:left;">
     <div style="color:#FF7F00;font-weight:900;">2��</div>
     <div style="color:#000000;font-weight:900;">$409,000</div>
     </button>
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;float:left;">
     <div style="color:#FF7F00;font-weight:900;">3��</div>
     <div style="color:#000000;font-weight:900;">$409,000</div>
     </button>
 </div></div>
 <div class="col-md-6">
 <div class="btn-toolbar btn-group-lg" role="toolbar" aria-label="...">
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;float:left;">
     <div style="color:#27408B;font-weight:900;">1��</div>
     <div style="color:#000000;font-weight:900;">$409</div>
     </button>
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;float:left;">
     <div style="color:#27408B;font-weight:900;">2��</div>
     <div style="color:#000000;font-weight:900;">$409</div>
     </button>
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;float:left;">
     <div style="color:#27408B;font-weight:900;">3��</div>
     <div style="color:#000000;font-weight:900;">$409</div>
     </button>
 </div></div>
</div>
</div>
<!--trend-->
<div  style="margin-top:20px;background-color:white;">
 <ul class="nav nav-tabs nav-justified" id="trendTabs">
      <li class="active"><a href="#price" data-toggle="tab">South MelBourne������λ����������</a></li>
      <li><a href="#rent" data-toggle="tab">South MelBourne�����������</a></li>
      <li><a href="#emptypercent" data-toggle="tab">South MelBourne�������������</a></li>
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


<!--�����ͥ�������list-->
<div style="margin-top:20px;background-color:white;">
	<div class="panel panel-default">
	  <div class="panel-heading">South Melbourne�����ͥ�������<div class="pull-right"><font size="1">������Դ��PGData �������ʱ�䣺11/02/15</font></div></div>
	  <table class="table table-striped">
    	<thead>
    		<tr class="row">
    		<th>��ַ</th>
    		<th>�۸�</th>
    		<th>��λ</th>
    		<th>��������</th>
    		<th>����ʱ��</th>
    		</tr>
    	</thead>
    	<tbody>
    		<tr class="row">
    			<td>1712/83 Whiteman St</td>
    			<td>$407,000</td>
    			<td>2</td>
    			<td>��ͨ����</td>
    			<td>11/04/15</td>
    		</tr>
    		<tr class="row">
    			<td>1712/83 Whiteman St</td>
    			<td>$407,000</td>
    			<td>2</td>
    			<td>��ͨ����</td>
    			<td>11/04/15</td>
    		</tr>
    		<tr class="row">
    			<td>1712/83 Whiteman St</td>
    			<td>$407,000</td>
    			<td>2</td>
    			<td>��ͨ����</td>
    			<td>11/04/15</td>
    		</tr>	
    		<tr class="row">
    			<td>1712/83 Whiteman St</td>
    			<td>$407,000</td>
    			<td>2</td>
    			<td>��ͨ����</td>
    			<td>11/04/15</td>
    		</tr>
    		<tr class="row">
    			<td>1712/83 Whiteman St</td>
    			<td>$407,000</td>
    			<td>2</td>
    			<td>��ͨ����</td>
    			<td>11/04/15</td>
    		</tr>
    		<tr class="row">
    			<td>1712/83 Whiteman St</td>
    			<td>$407,000</td>
    			<td>2</td>
    			<td>��ͨ����</td>
    			<td>11/04/15</td>
    		</tr>
    	</tbody>
  	  </table>
	</div>
</div>

<!--�����ص�start-->
<div style="margin-top:20px;">
  <div class="panel panel-default">
  	<div class="panel-heading" style="background-color:white;">Sourth Melbourne �����ص�</div>
  	 <div class="panel-body">
  	     	<div class="col-xs-6">
  	     		<ol>
  	     			<li>ƽ��������VIC���� NO.25</li>
  	     			<li>ƽ�������VIC���� NO.25</li>
  	     			<li>����������Сѧ</li>
  	     			<li>����������Сѧ</li>
  	     			<li>����������Сѧ</li>
  	     		</ol>
  	     	</div>
  	     	<div class="col-xs-6">
  	     		<ol start="6">
  	     			<li>ƽ��������VIC���� NO.25</li>
  	     			<li>ƽ�������VIC���� NO.25</li>
  	     			<li>����������Сѧ</li>
  	     			<li>����������Сѧ</li>
  	     			<li>����������Сѧ</li>
  	     		</ol>
  	     	</div>
     </div>
  </div>
<div>
<!--�����ص�end-->
<!--�˿ڷֲ�-->
<div style="margin-top:20px;background-color:white;">
<div class="panel panel-default">
	  <div class="panel-heading">South Melbourne�����˿ڷֲ�<div class="pull-right"><font size="1">������Դ��PGData �������ʱ�䣺11/02/15</font></div></div>
	  <table class="table table-striped">
    	<thead>
    		<tr class="row">
    		<th>�˿�����</th>
    		<th>����</th>
    		<th>����</th>
    		</tr>
    	</thead>
    	<tbody>
    		<tr class="row">
    			<td>407,000</td>
    			<td>�й�</td>
    			<td>����</td>
    		</tr>
    		<tr class="row">
    			<td>407,000</td>
                <td>�й�</td>
                <td>����</td>
    		</tr>
    		<tr class="row">
    			<td>407,000</td>
                <td>�й�</td>
                <td>����</td>
    		</tr>	
    		<tr class="row">
    			<td>407,000</td>
                <td>�й�</td>
                <td>����</td>
    		</tr>
    		<tr class="row">
    			<td>407,000</td>
                <td>�й�</td>
                <td>����</td>
    		</tr>
    		<tr class="row">
    			<td>407,000</td>
                <td>�й�</td>
                <td>����</td>
    		</tr>
    	</tbody>
  	  </table>
	</div>
</div>
<!--�˿ڷֲ�end>
<!--���ű���-->
<div style="margin-top:20px;background-color:white;">
	<div class="panel panel-default" id="MyPanel">
	<div class="heading1"><strong>���ű���</strong><br></div>
	<div class="panel-body">
  		<div class="row">
          <div class="news_position">
                <div class="scroll" id="left">
                     <img src="/images/news.jpg" alt="" width=350px height=255px>
                </div>
                <div class="caption_my" style="height:98px;">
		         <h3 id="title_news" style="font-weight: bold; font-size:20px;">���ű��⣺������Ϣ</h3>
		         <p>������Դ������   &nbsp;&nbsp;&nbsp;&nbsp;ʱ�䣺2015</p>
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
		         <h3 style="font-weight: bold; font-size:20px;">���ű������ű���</h3>
		         <p style="font-weight: bold; font-size:20px;">���ű������ű���</p>
		        </div>
		   </div>
		   <div class="news_position">
		      <div class="scroll" id="right">
                     <img src="/images/news.jpg" alt="" width=350px height=255px>
                </div>
                <div class="caption_my" style="height:98px;">
		         <h3 class="title_news" style="font-weight: bold; font-size:20px;">���ű��⣺������Ϣ</h3>
		         <p>������Դ������   &nbsp;&nbsp;&nbsp;&nbsp;ʱ�䣺2015</p>
		        </div>
		   </div>
		   
   </div>
</div>
  		</div>
  		 
  	</div>
</div>
<!--�����ͥ�������pie-->
<div style="margin-top:20px;background-color:white;">
<div class="panel panel-default">
	  <div class="panel-heading">South Melbourne�����ͥ�������</div>
	  <div class="panel-body">
	  	<div id="zonefamily_pie" style="height:200px">
      	</div>
	  </div>
	</div>
</div>

<!--��Ŀλ��-->
<div style="margin-top:20px;background-color:white;">
<div class="panel panel-default">
	  <div class="panel-heading">��Ŀλ��</div>
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




<!--���Ƿ���Ҫ����������start-->
<div style="margin-top:20px;background-color:rgba(177, 220, 245, 1);" >
<div class="row">
    <!--��� start-->
	<div class="col-xs-3" >
	  <div  class="col-xs-9">
	   <div id="wenzi" style="margin:20 0 20 20">
	     <span style="color:white;"><h3><strong>���Ƿ���Ҫ</strong></h3></span>
	     <span style="color:white"><h3><strong>����������</strong></h3></span>
	  	 <!--<img alt="image" class="img-responsive" src="pic/as.png">-->
	   </div>
	   </div>
	   <div class="col-xs-3" style="margin:20 0">
	       <img alt="image"  src="pic/wenhao.png">
	   </div>
 	</div>
 	 <!--��� end-->
 	 <!--�м�start��-->
 	<div class="col-xs-1" >
 		<div style="float:right;width: 1px;height: 563px; background: white;margin:20 0"></div>
 	</div>
 	 <!--�м�end��-->
 	
 	 <!--�ұ� start-->
 	<div class="col-xs-8">
 	      <!--�б� start-->
 		 <div id="list"  class="brdr bgc-fff pad-10 box-shad btm-mrg-20 property-listing" style="margin:20 20 20 5">
 		    <!--��һ��Ԫ��start-->
 		 	 <div id="firstitem" style="border:1px solid #E6E6FA;padding:20 20;background-color:white;margin:10 10;">
           		  <div class="media">
          			  <a class="pull-left" href="#" target="_parent">
              				<img alt="image" class="img-responsive" src="pic/yangkun2.jpg">
           			  </a>
           		 	  <div class="clearfix visible-sm"></div>
           		 	  <div class="media-body fnt-smaller" style="padding:0 0 0 15px">
                		  <h4 class="media-heading"><b>������</b></h4>
                		  <h6>��ҵ���飺8��</h6>
                		  <h6>���ԣ���ͨ�������Ӣ��</h6>
                		  <h6>����Sourth Melbourne</h6>
                		  <img alt="image" class="img-responsive" src="pic/houseicon.JPG">
            		 </div>
      			 </div>
     		 </div>
     		 <!--��һ��Ԫ��end-->
     		 <!--�ڶ���Ԫ��start-->
     		  <div id="firstitem" style="border:1px solid #E6E6FA;padding:20 20;background-color:white;margin:10 10;">
           		  <div class="media">
          			  <a class="pull-left" href="#" target="_parent">
              				<img alt="image" class="img-responsive" src="pic/yangkun2.jpg">
           			  </a>
           		 	  <div class="clearfix visible-sm"></div>
           		 	  <div class="media-body fnt-smaller" style="padding:0 0 0 15px">
                		  <h4 class="media-heading"><b>������</b></h4>
                		  <h6>��ҵ���飺8��</h6>
                		  <h6>���ԣ���ͨ�������Ӣ��</h6>
                		  <h6>����Sourth Melbourne</h6>
                		  <img alt="image" class="img-responsive" src="pic/houseicon.JPG">
            		 </div>
      			 </div>
     		 </div>
     		 <!--�ڶ���Ԫ��end-->
     		 <!--������Ԫ��start-->
     		  <div id="firstitem" style="border:1px solid #E6E6FA;padding:20 20;background-color:white;margin:10 10;">
           		  <div class="media">
          			  <a class="pull-left" href="#" target="_parent">
              				<img alt="image" class="img-responsive" src="pic/yangkun2.jpg">
           			  </a>
           		 	  <div class="clearfix visible-sm"></div>
           		 	  <div class="media-body fnt-smaller" style="padding:0 0 0 15px">
                		  <h4 class="media-heading"><b>������</b></h4>
                		  <h6>��ҵ���飺8��</h6>
                		  <h6>���ԣ���ͨ�������Ӣ��</h6>
                		  <h6>����Sourth Melbourne</h6>
                		  <img alt="image" class="img-responsive" src="pic/houseicon.JPG">
            		 </div>
      			 </div>
     		 </div>
     		 <!--������Ԫ��end-->
 		 </div>
 		  <!--�б� end-->
 	</div>
 	 <!--�ұ�end-->
 </div>	
</div>



<!--���ű���-->
<div style="margin-top:20px;background-color:white;">
	<div class="panel panel-default" id="MyPanel">
	<div class="heading1"><strong>�Ƽ���Ŀ</strong><br></div>
	<div class="panel-body">
  		<div class="row">
          <div class="news_position">
                <div class="scroll" id="left">
                     <img src="/images/pic.jpg" alt="" width=350px height=255px>
                </div>
                <div class="caption_my" style="height:98px;">
		         <p class="desc"><a href="#">Lorem ipsum dolor sit amet</a> </p>
		         <p class="desc">����������������������������������������</p>
		          
		        </div>
           </div>
		   <div class="news_position">
                <div class="scroll" id="left">
                     <img src="/images/pic.jpg" alt="" width=350px height=255px>
                </div>
                <div class="caption_my" style="height:98px;">
		         <p class="desc"><a href="#">Lorem ipsum dolor sit amet</a> </p>
		         <p class="desc">����������������������������������������</p>
		          
		        </div>
           </div>
		   <div class="news_position">
		      <div class="scroll" id="right">
                     <img src="/images/pic.jpg" alt="" width=350px height=255px>
                </div>
                <div class="caption_my" style="height:98px;">
		         <p class="desc"><a href="#">Lorem ipsum dolor sit amet</a> </p>
		         <p class="desc">����������������������������������������</p>
		          
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