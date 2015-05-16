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
   <link href="/css/shaixuan.css" rel="stylesheet">
   <style type="text/css">
   dl{
	   margin-top:0!important;
	   margin-bottom:0px!important
   }
   .highfilter{
   		font-size:12px;
   }
   </style>
<style style="text/css">
     select{
        height: auto !important;
        padding: 0px 0px !important;
     }
     .btn{
     	padding:9px 12px !important;
     	width:auto !important;
		margin:auto auto !important;
		display:auto !important;
		margin-top:auto !important;
		margin-bottom:auto !important;
     }
</style>
</head>
<body style="padding-top: 105px;">
 <jsp:include page="head.jsp" />
 <div class="container">
 <!--搜索-->
 <div style="">
        <div class="col-lg-12" style="height:400px;background:url(pic/indexsearch1.jpg);background-repeat:no-repeat;background-size: contain;">
            <div style="padding-top:70px;" class="col-lg-10 col-lg-offset-1">
                <div class="row" style="margin-bottom:5px;">
                    <div class="input-group" class="col-lg-12">
                        <div style="margin-left:20px;float:left;">
                        <select id="territory">
                        <option value ="austrilia">澳洲</option>
                        <option value ="america">美洲</option>
                        <option value ="asia">亚洲</option>
                        <option value ="africa">非洲</option>
                        <option value ="europe">欧洲</option>
                        </select>
                        </div>
                        
                        <div style="float:left;">
                            <ul style="list-style-type:none;text-align:left;padding-left:10px;" id="cities">
                                <li style="float:left;padding-left:8px;"><a style="color:white">墨尔本</a></li>
                                <li style="float:left;padding-left:8px;"><a style="color:white">悉尼</a></li>
                                <li style="float:left;padding-left:8px;"><a style="color:white">布里斯班</a></li>
                                <li style="float:left;padding-left:8px;"><a style="color:white">阿德莱德</a></li>
                                <li style="float:left;padding-left:8px;"><a style="color:white">珀斯</a></li>
                            </ul>
                        </div>
                    </div>
        
            </div>
            <form role="form" action="/index01" method="post" >
                 <div class="row" style="margin-bottom:5px;">
                  <div class="col-lg-6">
                    <div class="input-group">
                      <input type="text" class="form-control" id="searchTerritory" name="searchcity">
                      <span class="input-group-btn">
                        <button class="btn btn-default" type="submit" id="search"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                      </span>
                    </div><!-- /input-group -->
                  </div><!-- /.col-lg-6 -->

                </div><!-- /.row -->
                <div class="row">
                    <div class="input-group" class="col-lg-3">
                        <div style="margin-left:20px;float:left;">
                        <select id="territory" class="form-control input-sm" name="type">
                        <option value ="">房屋类型</option>
                        <option value ="america">一居室</option>
                        <option value ="asia">二居室</option>
                        <option value ="africa">三居室</option>
                        <option value ="europe">四居室</option>
                        </select>
                        </div>
                        <div style="margin-left:20px;float:left;">
                        <select id="territory" class="form-control input-sm" name="minimumprice">
                        <option value ="">最小价格</option>
                        <option value ="10000">10,000</option>
                        <option value ="20000">20,000</option>
                        <option value ="30000">30,000</option>
                        <option value ="40000">40,000</option>
                        </select>
                        </div>
                        <div style="margin-left:20px;float:left;">
                        <select id="territory" class="form-control input-sm" name="maximumprice">
                        <option value ="">最大价格</option>
                        <option value ="70000">70,000</option>
                        <option value ="80000">80,000</option>
                        <option value ="90000">90,000</option>
                        <option value ="100000">100,000</option>
                        </select>
                        
                        </div>
                        <div style="margin-left:100px;float:left;color:white;"><span class="more1" style=" "><em class="open"></em>更多</span></div>
                    </div>
                    
                </div>
                <div style="width:980px;height:400px;margin:20px auto 0 auto;display:none;backgroud:black;z-index:100;" class="highfilter">
					
						<div class="list-screen" style="background:white;">
							<div style="padding:10px 30px 10px 10px;">
								<div class="screen-term">
									<div class="selectNumberScreen">
										<div id="selectList" class="screenBox screenBackground">
											<dl class="listIndex">
												<dt>酒店价格</dt>
												<dd>
													<label><a href="javascript:;" attrval="不限">不限</a></label>
													<label><input name="radio2" type="radio" value="ab" /><a href="javascript:;" values2="99" values1="1" attrval="1-99">100元以下</a></label>
													<label><input name="radio2" type="radio" value="ab" /><a href="javascript:;" values2="300" values1="100" attrval="100-300">100-300元 </a></label>
													<label><input name="radio2" type="radio" value="ab" /><a href="javascript:;" values2="600" values1="300" attrval="300-600">300-600元</a></label>
													<label><input name="radio2" type="radio" value="ab" /><a href="javascript:;" values2="1500" values1="600" attrval="5000以上">600-1500元</a></label>
													
												</dd>
											</dl>
											<dl class="listIndex">
												<dt>酒店星级</dt>
												<dd>
													<label><a href="javascript:;" attrval="不限">不限</a> </label>
													<label><input name="checkbox2" type="checkbox" value="ab" /><a href="javascript:;"> 五星/豪华</a></label>
													<label><input name="checkbox3" type="checkbox" value="ab" /><a href="javascript:;">四星/高档</a></label>
													<label><input name="checkbox4" type="checkbox" value="ab" /><a href="javascript:;">三星/舒适</a></label>
												</dd>
											</dl>
											<dl class="listIndex">
											<dt>主题风格</dt>
												<dd>
													<label><a href="javascript:;" attrval="不限">不限</a></label>
													<label><input name="checkbox5" type="checkbox" value="ab" /><a href="javascript:;">客栈</a></label>
													<label><input name="checkbox6" type="checkbox" value="ab" /><a href="javascript:;">精品酒店</a> </label>
													<label><input name="checkbox7" type="checkbox" value="ab" /><a href="javascript:;">情侣酒店</a> </label>
													<label><input name="checkbox8" type="checkbox" value="ab" /><a href="javascript:;">园林庭院</a></label>
													
												</dd> 
											</dl>
											<dl class="listIndex more-none" style="border:none">
											<dt>主题风格</dt>
											<dd>
												<label><a href="javascript:;" attrval="不限">不限</a></label>
												 
													<label><input name="checkbox9" type="checkbox" value="ab" /><a href="javascript:;">精品酒店2</a></label>
													<label><input name="checkbox10" type="checkbox" value="ab" /><a href="javascript:;">精品酒店3</a> </label> 
													<label><input name="checkbox11" type="checkbox" value="ab" /><a href="javascript:;">精品酒店4</a> </label>  
												
											</dl>
										</div>
									</div>   
								</div>
							</div>
						
							<div class="hasBeenSelected clearfix">
								<span id="time-num"><font>208</font>家酒店</span>
								<div style="float:right;" class="eliminateCriteria">【清空全部】</div>
								<dl>
									<dt>已选条件：</dt>
									<dd style="display:none" class="clearDd">
										<div class="clearList"></div>
									</dd>
								</dl>
							</div>
							
							
						
						</div>
					
					 <div style="clear:both"></div>
				</div>
            </form>
        </div>
            
    </div>
    
</div>
 
 <!--搜索end-->
 <!--空白-->
 <div style="height:20px;"></div>
 <!--end空白-->
 <!--我们重新定义-->
 <div style="background-color:rgba(21, 63, 101, 1);height:120px;margin-top:380px;padding-left:-20px;padding-right:-20px">
 	<div>
		<div class="col-md-offset-4 col-md-3">
		<!--<div style="background-position:center center;width:374px;background-image:url('/pic/jt.jpg');background-repeat:no-repeat;background-size: contain;height:90px;"></div>-->
		</div>
	</div>
 </div>

 
 <!--我们重新定义-->
 
 
 
 
 <!-- 轮播-->
<div>
<div id="myCarousel" class="carousel slide">
   <!-- 轮播（Carousel）指标 -->
   <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active" style="background-color:#8E8E8E"></li>
      <li data-target="#myCarousel" data-slide-to="1" style="background-color:#8E8E8E"></li>
      <li data-target="#myCarousel" data-slide-to="2" style="background-color:#8E8E8E"></li>
   </ol>   
   <!-- 轮播（Carousel）项目 -->
   <div class="carousel-inner">
      <div class="item active">
         <img src="pic/a.jpg" alt="First slide">
         <div class="carousel-caption"></div>
      </div>
      <div class="item">
         <img src="pic/a.jpg" alt="Second slide">
         <div class="carousel-caption"></div>
      </div>
      <div class="item">
         <img src="pic/a.jpg" alt="Third slide">
         <div class="carousel-caption"></div>
      </div>
   </div>
   </div>
   
   </div>
<!-- 轮播-->
 
 
 <!--why-->

 <div style="background-color:rgba(234, 234, 234, 1)">
		
		
		<div class="row" >
				<div class="col-md-4 col-md-offset-4" style="Margin-top:40px;">
					<span style="font-size:20px;color:Black;">Why work with TheRedpln</span>
			</div>
		
		<div class="col-md-4">
			</div>
 		</div>
    
    <div class="row">
    	<div class="col-md-8 col-md-offset-2" style="Margin-top:40px;Margin-bottom:40px;">
    		<img src="pic/sss.jpg" >
    		</div>
    		
    	<div clss="col-md-2" style="Margin-bottom:40px;">
    		</div>
    	
    	</div>
    </div>
 <!--why-->
 
 
 <!--郭瑞-->
 <div class="row" style="padding-top:50px;padding-bottom:50px;text-align:center;">
			<div style="font-weight:bolder;font-size:23px;font-family:黑体;">购买立即返还现金</div>
			<div><img src="/images/fanxian.PNG"></div>
			<div style="font-size:18px;font-weight:bold;font-family:黑体;filter:alpha(opacity=80);opacity:0.8;">在海房优选购买澳洲新房</div>
			<div style="font-size:18px;font-weight:bold;font-family:黑体;filter:alpha(opacity=80);opacity:0.8;">最高可获得高达70%的佣金返还</div>
			<div style="font-size:10px;font-weight:bold;font-family:黑体;filter:alpha(opacity=80);opacity:0.8;padding-top:10px;">*以房价50万元澳币房产计算</div>
		</div>
<!--郭瑞-->
 <!--start 墨尔本-->
<div id="Molbourne">
<div id="left" class="col-xs-2">
</div>
<div style="margin-top:20px;" class="col-xs-8">
  <div class="panel panel-default">
  	<div class="panel-heading" style="background-color:white;">墨尔本</div>
  	 <div class="panel-body">
  	       <div class="col-xs-4" >
  	     		<img alt="image" class="img-responsive" src="pic/house2.jpg">
  	     	</div>
  	     	<div class="col-xs-4">
  	     		<img alt="image" class="img-responsive" src="pic/house2.jpg">
  	     	</div>
  	     	<div class="col-xs-4">
  	     		<img alt="image" class="img-responsive" src="pic/house2.jpg">
  	     	</div>
     </div>
  </div>
</div>
<div id="right" class="col-xs-2">
</div>
</div>
<!--end 墨尔本-->

<!--last-->
<div>
  	<div class="row">
  		<div class="col-md-4 col-md-offset-5" >
  			<div style="font-weight:bolder;font-size:23px;font-family:黑体;">最新博客</div>
  			</div>
  		
  		<div class="col-md-3"></div>
  		
  		
  		</div>
  		
  	<div class="row">
  		<div class="col-md-6 col-md-offset-4" style="Margin-top:10px;">
  			<span style="font-size:20px;color:Black;">From Toronto's real estate market to home staging tips</span>
  			</div>
  		
  		<div class="col-md-2"></div>
  		
  		</div>
  		
  	<div class="row" style="margin-top:40px;margin-bottom:40px;">
  		<div class="col-md-2 col-md-offset-2">
  			
  			<div>
  				<img src="pic/last.jpg">
  				<span></span>
  				
  				</div>
  		</div>
  		
  		<div class="col-md-2 col-md-offset-1">
  				<div>
  				<img src="pic/last.jpg">
  				<span> </span>
  				
  				</div>
  		</div>
  		
  		<div class="col-md-2 col-md-offset-1">
  				<div>
  				<img src="pic/last.jpg">
  				<span> </span>
  				
  				</div>
  		</div>
  		
  		</div>





    </div>
<!--last-->

</div>
<!-- 妯℃�妗�-->
   <jsp:include page="foot.jsp" />
   <script type="text/javascript" src="js/houseinfosearch.js"></script>
   
   <script>
   	$(function(){
   		
		$(".more1").on("click",function(){
		    //通过判断按钮btn有没有active这个class名判断是否已经点击过
		    if($(this).hasClass("active")){
			    $(this).addClass("more_bg");
				$(this).find("em").eq(0).addClass("more_bg");
				$(".highfilter").show();
			    $(this).removeClass("active");
		    }else{
			    $(this).removeClass("more_bg");
				$(this).find("em").eq(0).removeClass("more_bg");
				$(".highfilter").hide();
			    $(this).addClass("active");
		    }
		});
   	});
   	
   </script>
   <script src="/js/shaixuan.js" type="text/javascript"></script>
   <script type="text/javascript">
   		$("#search").click(function(){
   			
   		});
   </script>
</body>

</html>