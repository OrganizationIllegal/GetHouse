<%@ page language="java" import="java.util.*" pageEncoding="gb2312" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>   
<head>
<base href="<%=basePath%>">
<title>serchList</title>
<link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="/js/jquery.min.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
<script src="/bootstrap/js/bootstrap-paginator.min.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
<link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="/css/mapleft.css" rel="stylesheet">
<!--lize-->
<link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet"> 
<link rel="stylesheet" href="/bootstrap/css/bootstrap-slider.min.css">
<script type="text/javascript" src="/js/jquery-1.11.2.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
<script src="/bootstrap/js/bootstrap-slider.min.js" type="text/javascript"></script>
 <style style="text/css">
      .slider-handle{
        width: 5px;
        height:20px;
        
      }
      .slider.slider-horizontal .slider-tick, .slider.slider-horizontal .slider-handle{
        margin-left: 0px;
      }
    </style>
     <script type="text/javascript">
      
      $(document).ready(function(){
          // alert("nihao");
          $('#ex1').slider({
              formatter: function(value) {
                // alert("nihao");
                if(value>=100000 && value<1000000){
                	value=value/1000+'K';
                }
                else{
                	value=value/1000000+'M';
                }
                return 'Current value: ' + value;
            }
          });
          $('#ex2').slider({
              formatter: function(value) {
                // alert("nihao");
                if(value>=100000 && value<1000000){
                  value=value/1000+'K';
                }
                else{
                  value=value/1000000+'M';
                }
                return 'Current value: ' + value;
            }
          });
          $('#ex3').slider({
              formatter: function(value) {
                // alert("nihao");
                if(value>=100000 && value<1000000){
                  value=value/1000+'K';
                }
                else{
                  value=value/1000000+'M';
                }
                return 'Current value: ' + value;
            }
          });
          $('#ex4').slider({
              formatter: function(value) {
                // alert("nihao");
                if(value>=100000 && value<1000000){
                  value=value/1000+'K';
                }
                else{
                  value=value/1000000+'M';
                }
                return 'Current value: ' + value;
            }
          });
          $("#page").page({ 
          remote: {
              url: '/BootstrapPage/GetData',  //�����ַ
              callback: function (result) {
                  //�ص�����resultΪ���ص����
              }
        },
    });
          // alert("nihao");
      });
      
    </script>
<!--lize-->
</head>
<body style="padding-top: 105px;">
 <jsp:include page="head.jsp" />
    <div class="container">
      <div class="row">
        <div class="col-md-3">
          <div class="side-content">
            <div style="height:200px;">
              <div style="margin-bottom:4px;"><b><a href="#" >��һ������</a></b></br></div>
              <b>����</b>
              <hr style="margin-top:4px;margin-bottom:4px;width:65%">
              <b>�۸�</b>  <font style="color:#FF5500;float:right;margin-right:20%">100K-2M+</font>
              <div style="">
                <input id="ex1" data-slider-id='ex1Slider' type="text" data-slider-min="100000" data-slider-max="2000000" data-slider-step="100000" data-slider-value="100000" style="height:16;" size="10"/>
              </div>
              <br/>
              <b>$/m2</b>  <font style="color:#FF5500;float:right;margin-right:20%">0-20,000+</font>
              <div width="70%">
                <input id="ex2" data-slider-id='ex1Slider' type="text" data-slider-min="100000" data-slider-max="2000000" data-slider-step="100000" data-slider-value="100000"/>
              </div>
              <br/>
              <b>����</b>  <font style="color:#FF5500;float:right;margin-right:20%">0-10+</font>
              <div width="70%">
                <input id="ex3" data-slider-id='ex1Slider' type="text" data-slider-min="100000" data-slider-max="2000000" data-slider-step="100000" data-slider-value="100000"/>
              </div>
              <br/>
              <b>ԡ��</b>  <font style="color:#FF5500;float:right;margin-right:20%">0-10+</font>
              <div width="70%">
                <input id="ex4" data-slider-id='ex1Slider' type="text" data-slider-min="100000" data-slider-max="2000000" data-slider-step="100000" data-slider-value="100000"/>
              </div>
              <div style="text-align:right;">
                <button type="button" class="btn btn-default" style="margin-right:45%">����</button>
              </div>
            </div>
            
          </div>
        </div>
        <div class="col-md-9">
          <div class="demo-content">
            <div class="col-md-5">
  <div id="example"></div>
  <ul class="pagination">
  <li><a href="#">&laquo;</a></li>
  <li><a href="#">1</a></li>
  <li><a href="#">2</a></li>
  <li><a href="#">3</a></li>
  <li><a href="#">4</a></li>
  <li><a href="#">5</a></li>
  <li><a href="#">6</a></li>
  <li><a href="#">7</a></li>
  <li><a href="#">8</a></li>
  <li><a href="#">9</a></li>
  <li><a href="#">10</a></li>
  <li><a href="#">&raquo;</a></li>
</ul> 
 </div>
 <div class="col-md-1" style="margin-left:-50px;">
 <div class="btn-group">
    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" style="width:80px;margin-top:20px;margin-bottom:0px;background-color:#DBDBDB;">
      ����
      <span class="caret"></span>
    </button>
    <ul class="dropdown-menu">
      <li><a href="#">����</a></li>
      <li><a href="#">����</a></li>
    </ul>
  </div>
 </div>
 <div class="col-md-3" style="padding-top:10px;padding-left:30px;">
 <div class="btn-group">
  <button type="button" class="btn btn-warning" style="width:100px;"><a href="bingMap.jsp">��ͼ�ҷ�</a></button>
  <button type="button" class="btn btn-warning" style="width:100px;"><a href="#">�б��ҷ�</a></button>
</div>
 </div>
          <!--start �����б�-->
<div id="SearchList">
<!--start�м䲿��-->
<div style="margin-top:20px;" class="col-xs-12">
<!--start��һ��item-->
  <div class="panel panel-default">
  	<div class="panel-heading" style="background-color:rgb(21,63,101);"><span style="color:white">�Ĵ����Ƿ���</span><span style="color:white">WON GSG JG DS GDSJIG</span></div>
  	 <div class="panel-body">
  	       <div id="item" >
           		  <div class="media">
           		      <div class="col-xs-5">
          			 	 <a class="pull-left" href="#" target="_parent">
              				<img alt="image" class="img-responsive" src="pic/house2.jpg">
           			  	 </a>
           			  </div>
           		 	  <div class="media-body fnt-smaller" style="padding:0 0 0 15px">
                		 <div class="col-xs-8">
                		 	<h4><b>����Ĺ�������</b></h4>
                		 	<hr/>
                		 	<span>7*24Сʱȫ������ߣ�ȫ</span><br/>
                		 	<span>��λ�����רҵ�������</span><br/>
                		 	<span>�����ṩ�˻���������⸶�ѷ��ز���ˡ�</span>
                		 	<br/>
                		 	<br/>
                		 	<br/>
                		 	<img alt="image" class="img-responsive" src="pic/logo2.png">
                		 </div>
                		  <div class="col-xs-4">
                		     <h4><b>����</b></h4>
                		     <hr/>
                		     <b>��ࣺ</b><span class="right">$550,000</span><br/>
                		     <b>���٣�</b><span class="right">$299,000</span><br/>
                		     <b>���(M2)</b>:<span class="right">58-119</span><br/>
                		     <b>����:</b><span class="right">47</span><br/>
                		     <b>����:</b><span class="right">$117</span><br/>
                		 </div>
            		 </div>
      			 </div>
     		 </div>
     </div>
  </div>
  <!--end��һ��Ԫ��-->
  <!--start�ڶ���item-->
  <div class="panel panel-default">
  	<div class="panel-heading" style="background-color:rgb(21,63,101);"><span style="color:white">�Ĵ����Ƿ���</span><span style="color:white">WON GSG JG DS GDSJIG</span></div>
  	 <div class="panel-body">
  	       <div id="item" >
           		  <div class="media">
           		      <div class="col-xs-5">
          			 	 <a class="pull-left" href="#" target="_parent">
              				<img alt="image" class="img-responsive" src="pic/house2.jpg">
           			  	 </a>
           			  </div>
           		 	  <div class="media-body fnt-smaller" style="padding:0 0 0 15px">
                		 <div class="col-xs-8">
                		 	<h4><b>����Ĺ�������</b></h4>
                		 	<hr/>
                		 	<span>7*24Сʱȫ������ߣ�ȫ</span><br/>
                		 	<span>��λ�����רҵ�������</span><br/>
                		 	<span>�����ṩ�˻���������⸶�ѷ��ز���ˡ�</span>
                		 	<br/>
                		 	<br/>
                		 	<br/>
                		 	<img alt="image" class="img-responsive" src="pic/logo2.png">
                		 </div>
                		  <div class="col-xs-4">
                		     <h4><b>����</b></h4>
                		     <hr/>
                		     <b>��ࣺ</b><span class="right">$550,000</span><br/>
                		     <b>���٣�</b><span class="right">$299,000</span><br/>
                		     <b>���(M2)</b>:<span class="right">58-119</span><br/>
                		     <b>����:</b><span class="right">47</span><br/>
                		     <b>����:</b><span class="right">$117</span><br/>
                		 </div>
            		 </div>
      			 </div>
     		 </div>
     </div>
  </div>
  <!--end�ڶ���Ԫ��-->
<div>
<!--end�м䲿��-->
<div>
<!--end �����б�-->
          </div>
        </div>
  </div>

   
   


<jsp:include page="foot.jsp" />
</body>
</html>