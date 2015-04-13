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
<div style="margin-top:20px;background-color:white;">
<div class="panel panel-default">
	  <div class="panel-heading">South Melbourne�����ͥ�������</div>
	  <div class="panel-body">
	  	<div id="zonefamily_pie" style="height:200px">
      	</div>
	  </div>
	</div>
</div>
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
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;">
     <div style="color:#FF7F00;font-weight:900;">1��</div>
     <div style="color:#000000;font-weight:900;">$409,000</div>
     </button>
      <button type="button" class="btn btn-inverse" style="height:100px;width:140px;">
     <div style="color:#FF7F00;font-weight:900;">2��</div>
     <div style="color:#000000;font-weight:900;">$409,000</div>
     </button>
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;">
     <div style="color:#FF7F00;font-weight:900;">3��</div>
     <div style="color:#000000;font-weight:900;">$409,000</div>
     </button>
 </div></div>
 <div class="col-md-6">
 <div class="btn-toolbar btn-group-lg" role="toolbar" aria-label="...">
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;">
     <div style="color:#27408B;font-weight:900;">1��</div>
     <div style="color:#000000;font-weight:900;">$409</div>
     </button>
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;">
     <div style="color:#27408B;font-weight:900;">2��</div>
     <div style="color:#000000;font-weight:900;">$409</div>
     </button>
     <button type="button" class="btn btn-inverse" style="height:100px;width:140px;">
     <div style="color:#27408B;font-weight:900;">3��</div>
     <div style="color:#000000;font-weight:900;">$409</div>
     </button>
 </div></div>
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
<!--���Ƿ���Ҫ����������end-->
</div>
</div>
 <jsp:include page="foot.jsp" /> 
 <script src="/js/familyStatus.js"></script>
 <script src="/js/trend.js"></script>
 <script src="/js/cost.js"></script>
</body>
</html>