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
                        <option value ="austrilia">澳大利亚</option>

                        <!-- <option value ="america">美洲</option>
                        <option value ="asia">亚洲</option>
                        <option value ="africa">非洲</option>
                        <option value ="europe">欧洲</option> -->
                        </select>
                        </div>
                        
                        <div style="float:left;cursor:hand;">
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
            <form role="form" action="/IndexSearch" method="get"  target="_blank">
                 <div class="row" style="margin-bottom:5px;">
                  <div class="col-lg-6">
                    <div class="input-group">
                      <input type="text" class="form-control" id="searchTerritory" name="searchcity">
                      <span class="input-group-btn">
                        <a class="btn btn-default" type="submit" id="search" target="blank"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></a>
                      </span>
                    </div><!-- /input-group -->
                  </div><!-- /.col-lg-6 -->

                </div><!-- /.row -->
                <div class="row">
                    <div class="input-group" class="col-lg-3">
                        <div style="margin-left:20px;float:left;">
                        <select id="territory" class="form-control input-sm" name="type">
                        <option value ="">房屋类型</option>
                        <option value ="公寓">公寓</option>
                        <option value ="别墅">别墅</option>
                        <option value ="联排别墅">联排别墅</option>
                        
                        </select>
                        </div>
                        <div style="margin-left:20px;float:left;">
                        <select id="territory" class="form-control input-sm" name="minimumprice">
                        <option value ="">最小价格</option>
                        <option value ="10000">$10,000</option>
                        <option value ="20000">$20,000</option>
                        <option value ="30000">$30,000</option>
                        <option value ="40000">$40,000</option>
                        </select>
                        </div>
                        <div style="margin-left:20px;float:left;">
                        <select id="territory" class="form-control input-sm" name="maximumprice">
                        <option value ="">最大价格</option>
                        <option value ="70000">$70,000</option>
                        <option value ="80000">$80,000</option>
                        <option value ="90000">$90,000</option>
                        <option value ="100000">$100,000</option>
                        </select>
                        
                        </div>
                        <div style="margin-left:100px;float:left;color:white;"><span class="more1 active" style=" "><em class="open"></em>更多</span></div>
                    </div>
                    
                </div>
                <div style="width:980px;height:450px;margin:20px auto 0 auto;display:none;backgroud:black;z-index:100;" class="highfilter">
					
						<div class="list-screen" style="background:white;">
							<div style="padding:10px 30px 10px 10px;">
								<div class="screen-term">
									<div class="selectNumberScreen">
										<div id="selectList" class="screenBox screenBackground">
											<dl class="listIndex">
												<dt>国家</dt>
												<dd>
													<label><a href="javascript:;" attrval="不限">不限</a></label>
													<label><input name="country" type="radio" value="澳大利亚" class="australia"/><a href="javascript:;" values2="99" values1="1" attrval="1-99" class="australia">澳大利亚</a></label>
													<label><input name="country" type="radio" value="加拿大" class="canada"/><a href="javascript:;" values2="300" values1="100" attrval="100-300" class="canada">加拿大</a></label>
												</dd>
											</dl>
											<dl class="listIndex" id="australiacity">
												<dt>城市</dt>
												<dd>
													<label><a href="javascript:;" attrval="不限">不限</a></label>
													<label><input name="city2" type="radio" value="墨尔本" /><a href="javascript:;" values2="99" values1="1" attrval="1-99">墨尔本(Melbourne)</a></label>
													<label><input name="city2" type="radio" value="悉尼" /><a href="javascript:;" values2="300" values1="100" attrval="100-300">悉尼(Sydney)</a></label>
													<label><input name="city2" type="radio" value="布里斯班" /><a href="javascript:;" values2="600" values1="300" attrval="300-600">布里斯班(Brisbane)</a></label>
													<label><input name="city2" type="radio" value="阿德莱德" /><a href="javascript:;" values2="1500" values1="600" attrval="5000以上">阿德莱德(Adelaide)</a></label>
													<label><input name="city2" type="radio" value="珀斯" /><a href="javascript:;" values2="1500" values1="600" attrval="5000以上">珀斯(Perth)</a></label>
												</dd>
											</dl>
											<dl class="listIndex more-none" id="canadiancity">
												<dt>城市</dt>
												<dd>
													<label><a href="javascript:;" attrval="不限">不限</a></label>
													<label><input name="city2" type="radio" value="多伦多" /><a href="javascript:;" values2="99" values1="1" attrval="1-99">多伦多(Toronto)</a></label>
													<label><input name="city2" type="radio" value="温哥华" /><a href="javascript:;" values2="300" values1="100" attrval="100-300">温哥华(Vancouver)</a></label>
													</dd>
											</dl>
											<!--
											<dl class="listIndex">
												<dt>价格</dt>
												<dd>
													<label><a href="javascript:;" attrval="不限">不限</a></label>
													<label><input name="radio2" type="radio" value="ab" /><a href="javascript:;" values2="99" values1="1" attrval="1-99">20万以下</a></label>
													<label><input name="radio2" type="radio" value="ab" /><a href="javascript:;" values2="300" values1="100" attrval="100-300">20万-50万 </a></label>
													<label><input name="radio2" type="radio" value="ab" /><a href="javascript:;" values2="600" values1="300" attrval="300-600">50万-100万</a></label>
													<label><input name="radio2" type="radio" value="ab" /><a href="javascript:;" values2="1500" values1="600" attrval="5000以上">100万-150万</a></label>
													<label><input name="radio2" type="radio" value="ab" /><a href="javascript:;" values2="1500" values1="600" attrval="5000以上">150万-200万</a></label>
													<label><input name="radio2" type="radio" value="ab" /><a href="javascript:;" values2="1500" values1="600" attrval="5000以上">200万以上</a></label>
												</dd>
											</dl>
											
											<dl class="listIndex">
											<dt>投资回报</dt>
												<dd>
													<label><a href="javascript:;" attrval="不限">不限</a></label>
													<label><input name="checkbox5" type="checkbox" value="ab" /><a href="javascript:;">3%以下</a></label>
													<label><input name="checkbox6" type="checkbox" value="ab" /><a href="javascript:;">3-5%</a> </label>
													<label><input name="checkbox7" type="checkbox" value="ab" /><a href="javascript:;">5-8%</a> </label>
													<label><input name="checkbox8" type="checkbox" value="ab" /><a href="javascript:;">8-10%</a></label>
													<label><input name="checkbox8" type="checkbox" value="ab" /><a href="javascript:;">10%以上</a></label>
												</dd> 
											</dl>
											-->
											<dl class="listIndex">
												<dt>用途</dt>
												<dd>
													<label><a href="javascript:;" attrval="不限">不限</a> </label>
													<label><input name="xinkaipan" type="checkbox" value="新开盘" /><a href="javascript:;">新开盘</a></label>
													<label><input name="huaren" type="checkbox" value="华人区" /><a href="javascript:;">华人区</a></label>
													<label><input name="remen" type="checkbox" value="热门项目" /><a href="javascript:;">热门项目</a></label>
													<label><input name="xuequ" type="checkbox" value="优秀学区" /><a href="javascript:;">优秀学区</a></label>
													<label><input name="baozu" type="checkbox" value="包租项目" /><a href="javascript:;">包租项目</a></label>
													<label><input name="daxue" type="checkbox" value="大学附近" /><a href="javascript:;">大学附近</a></label>
													<label><input name="center" type="checkbox" value="城市中心" /><a href="javascript:;">城市中心</a></label>
													<label><input name="traffic" type="checkbox" value="轨道交通" /><a href="javascript:;">轨道交通</a></label>
													<label><input name="xianfang" type="checkbox" value="现房项目" /><a href="javascript:;">现房项目</a></label>
													<label><input name="maidi" type="checkbox" value="买地建房" /><a href="javascript:;">买地建房</a></label>
												</dd>
											</dl>
											
										</div>
									</div>   
								</div>
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
 <div style="height:10px;"></div>
 <!--end空白-->
 <!--我们重新定义-->
 	<div class="row" style="background-color:rgba(21, 63, 101, 1);height:120px;margin-top:380px;margin-left:0px;margin-right:0px;">
 	<div class="col-md-3"></div>
 	<div class="col-md-6" style="padding-left:60px;">
 	<div>
 	<div style="color:white;font-size:38px;font-weight:bolder;font-family:黑体;position:absolute;filter:alpha(opacity=60);opacity:0.6;">我们</div>
 	<div style="color:white;font-size:8px;position:absolute;left:140px;margin-top:10px;">我们应用互联网思维和技术，为您提供更全、更多的海外项目信息，通过全方位服务，让您更方便、更快捷、更省钱的买到更合适的海外房产。</div>
 	<div style="color:white;font-size:30px;font-weight:bolder;font-family:黑体;position:absolute;filter:alpha(opacity=60);opacity:0.6;top:50px;border-top:2px solid white;">重新定义海外置业模式</div>
 	<div style="color:white;font-size:8px;position:absolute;left:390px;top:50px;">每天上百个新房源满足了越来越多的客户海外需求。</div>
 	</div>
 	</div>
 	<div class="col-md-3"></div>
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
<div class="row" style="margin-top:30px;">
<div class="col-md-1"></div>
<div class="col-md-10" style="padding-left:40px;">
<div style="font-size:18px;font-weight:bold;font-family:黑体;filter:alpha(opacity=80);opacity:0.8;">墨尔本</div>
<hr style="border-top:1px solid gray;margin-top:10px;width:905px;margin-left:0px;"/>
<div>
<c:forEach var="item" items="${projectList}">
  	 	<div class="col-md-4" style="padding-left:0px;">
  	     		<div><a href="/Index?proNum=${item.project_num}"><img alt="image" class="img-responsive" src="http://101.200.174.253:8080/all/${item.project_img }"></a></div>
  	     		<div style="background-color:black;padding-left:30px;filter:alpha(opacity=60);opacity:0.6;position:absolute;top:130px;width:290px;padding-top:5px;padding-bottom:5px;">
  	     		<div style="color:white;font-size:16px;font-weight:bold;"><span>${item.project_name}</span><span style="margin-left:30px;">${item.project_type}</span></div>
  	     		<div style="color:white;font-size:16px;font-weight:bold;">${item.project_price_qi}</div>
  	     		</div>
  	    </div>
  	 </c:forEach>
</div>
</div>
<div class="col-md-1"></div>
</div>
<!--end 墨尔本-->
 <!--start 悉尼-->
<div class="row" style="margin-top:20px;">
<div class="col-md-1"></div>
<div class="col-md-10" style="padding-left:40px;">
<div style="font-size:18px;font-weight:bold;font-family:黑体;filter:alpha(opacity=80);opacity:0.8;">悉尼</div>
<hr style="border-top:1px solid gray;margin-top:10px;width:905px;margin-left:0px;"/>
<div>
<c:forEach var="item" items="${projectList2}">
  	 	<div class="col-md-4" style="padding-left:0px;">
  	     		<div><a href="/Index?proNum=${item.project_num}"><img alt="image" class="img-responsive" src="http://101.200.174.253:8080/all/${item.project_img }"></a></div>
  	     		<div style="background-color:black;padding-left:30px;filter:alpha(opacity=60);opacity:0.6;position:absolute;top:130px;width:290px;padding-top:5px;padding-bottom:5px;">
  	     		<div style="color:white;font-size:16px;font-weight:bold;"><span>${item.project_name}</span><span style="margin-left:30px;">${item.project_type}</span></div>
  	     		<div style="color:white;font-size:16px;font-weight:bold;">${item.project_price_qi}</div>
  	     		</div>
  	    </div>
  	 </c:forEach>
</div>
</div>
<div class="col-md-1"></div>
</div>
<!--end 悉尼-->
<!--last guo-->
<div class="row" style="text-align:center;margin-bottom:15px;">
			<div style="font-weight:bolder;font-size:23px;font-family:黑体;margin-top:50px;margin-bottom:10px;">新闻博客</div>
			<div style="font-weight:bold;font-size:15px;">From Toronto's real estate market to home staging tips</div>
			<div class="row" style="padding-top:30px;">
			<div class="col-md-1"></div>
			<div class="col-md-10" style="padding-left:55px;text-align:left;">
			<c:forEach var="item" items="${newsList}">
		  	 	    <div class="col-md-4" style="padding-left:0px;">
						<div ><a href="/Detail?id=${item.id}&type=1"><img src="http://101.200.174.253:8080/all/${item.news_image}" style="border:1px solid gray;width:290px;"></a></div>
						<div style="margin-top:15px;">${item.news_abstract}</div>
					</div>
  	 		</c:forEach>
  	 		</div>
			<div class="col-md-1"></div>
			</div>
		</div>
<!--last guo-->

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
		$(".canada").on("click",function(){
		    //通过判断按钮btn有没有active这个class名判断是否已经点击过
		    if($(this).attr("checked")==true){
				$("#australiacity").show();
				$("#canadiancity").hide();
		    }else{
			    
				$("#australiacity").hide();
				$("#canadiancity").show();
		    }
		});
		$(".australia").on("click",function(){
		    //通过判断按钮btn有没有active这个class名判断是否已经点击过
		    if($(this).attr("checked")==true){
				$("#australiacity").hide();
				$("#canadiancity").show();
		    }else{
			    
				$("#australiacity").show();
				$("#canadiancity").hide();
		    }
		});
		$("body").on("click",function(e){
			if(e.target.nodeName!="SPAN" && e.target.nodeName!="A" && e.target.nodeName!="INPUT"){
				$(".highfilter").hide();
				$(".more1").addClass("active");
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