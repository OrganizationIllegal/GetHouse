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
   <script src="http://echarts.baidu.com/build/dist/echarts-all.js"></script>
   <script type="text/javascript" src="http://ecn.dev.virtualearth.net/mapcontrol/mapcontrol.ashx?v=7.0"></script>
   <script src="/js/bingMap.js"></script>
   <link href="/css/List-Grid-View.css" rel="stylesheet">
   <script src="/echarts/echarts-all.js"></script>
</head>
<body style="padding-top: 105px;background-color:rgba(233, 243, 248, 1);" onload="getMap();">
<jsp:include page="head.jsp" />
<div class="container" style="">
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
<div style="margin-top:20px;background-color:white;">
<div class="panel panel-default">
	  <div class="panel-heading">South Melbourne区域家庭情况构成</div>
	  <div class="panel-body">
	  	<div id="zonefamily_pie" style="height:200px">
      	</div>
	  </div>
	</div>
</div>
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
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;">
     <div style="color:#FF7F00;font-weight:900;">1居</div>
     <div style="color:#000000;font-weight:900;">$409,000</div>
     </button>
      <button type="button" class="btn btn-inverse" style="height:100px;width:140px;">
     <div style="color:#FF7F00;font-weight:900;">2居</div>
     <div style="color:#000000;font-weight:900;">$409,000</div>
     </button>
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;">
     <div style="color:#FF7F00;font-weight:900;">3居</div>
     <div style="color:#000000;font-weight:900;">$409,000</div>
     </button>
 </div></div>
 <div class="col-md-6">
 <div class="btn-toolbar btn-group-lg" role="toolbar" aria-label="...">
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;">
     <div style="color:#27408B;font-weight:900;">1居</div>
     <div style="color:#000000;font-weight:900;">$409</div>
     </button>
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;">
     <div style="color:#27408B;font-weight:900;">2居</div>
     <div style="color:#000000;font-weight:900;">$409</div>
     </button>
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;">
     <div style="color:#27408B;font-weight:900;">3居</div>
     <div style="color:#000000;font-weight:900;">$409</div>
     </button>
 </div></div>
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
<!--你是否需要房产经纪人end-->
</div>
</div>
 <jsp:include page="foot.jsp" /> 
 <script src="/js/familyStatus.js"></script>
 <script src="/js/trend.js"></script>
 <script src="/js/cost.js"></script>
</body>
</html>