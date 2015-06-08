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
   <link href="/css/pagination.css" rel="stylesheet">
   <script src="/js/jquery.min.js"></script>
   <script src="/bootstrap/js/bootstrap.min.js"></script>
   <script src="/js/jquery.pagination.js"></script>
</head>
<body style="padding-top: 50px;">
 <jsp:include page="head2.jsp" />
 <div class="container">
 <div class="row" style="padding-top:20px;">
 <div class="col-md-4">
 	<div class="btn-group">
 			 <button type="button" class="btn btn-warning" style="width:80px;"><a href="/BingMap">地图找房</a></button>
 			 <button type="button" class="btn btn-warning" style="width:80px;"><a href="#">列表找房</a></button>
	</div>
 </div>
 <div class="col-md-5"> 
        <div id="Pagination" class="pagination"  style="margin-top:5px;"></div>
 </div>
 <div class="col-md-1" style="margin-left:-50px;">
 <div class="btn-group">
    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" style="width:63px;height:32px;margin-top:20px;margin-bottom:0px;background-color:#DBDBDB;">
      排序
      <span class="caret"></span>
    </button>
    <ul class="dropdown-menu" style="width:80px">
      <li><a href="#" >升序</a></li>
      <li><a href="#" >降序</a></li>
    </ul>
  </div>
 </div>
 <div class="col-md-3" style="padding-top:10px;padding-left:30px;">
 <!--  <div class="btn-group">
  <button type="button" class="btn btn-warning" style="width:100px;"><a href="/BingMap">地图找房</a></button>
  <button type="button" class="btn btn-warning" style="width:100px;"><a href="#">列表找房</a></button>
</div>-->
 </div>
 </div>
 <div class="row">
 <div class="col-md-2">
 <div style="color:#007fff;font-size:16px;font-weight:bold;margin-bottom:10px;">进一步搜索</div>
 <div style="font-weight:bold">房产</div>
 </div>
 <div class="col-md-10">
 <!--start item1-->
 <table id="Result" cellspacing="0" cellpadding="0">
  <tr><th id="ee">
  <div class="panel panel-default" id="dd">
  
  </div>
  </th></tr></table>
  <!--end item1-->
 </div>
 
<div class="row" style="padding-top:20px;">
 <div class="col-md-4"></div>
 <div class="col-md-5"> 
        <div id="Pagination1" class="pagination"  style="margin-top:5px;"></div>
 </div>
 <div class="col-md-1" style="margin-left:-50px;">
 <!-- <div class="btn-group">
    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" style="width:80px;margin-top:20px;margin-bottom:0px;background-color:#DBDBDB;">
      排序
      <span class="caret"></span>
    </button>
    <ul class="dropdown-menu" style="width:80px">
      <li><a href="#" >升序</a></li>
      <li><a href="#" >降序</a></li>
    </ul>
  </div> -->
 </div>
 <div class="col-md-3" style="padding-top:10px;padding-left:30px;">
 <div class="btn-group">
  <!-- <button type="button" class="btn btn-warning" style="width:100px;"><a href="/BingMap">地图找房</a></button>
  <button type="button" class="btn btn-warning" style="width:100px;"><a href="#">列表找房</a></button> -->
</div>
 </div>
 </div>
 
 
 </div>
</div>
   <jsp:include page="foot1.jsp" />
   <script src="/js/jquery.pagination.js"></script>
   <script type="text/javascript">
         var pageIndex = 0;     //页面索引初始值   
         var pageSize = 5;     //每页显示条数初始化，修改显示条数，修改这里即可  
         var total = 100;
         $(function () {
              total = InitTable(0);    //Load事件，初始化表格数据，页面索引为0（第一页）
                //分页，PageCount是总条目数，这是必选参数，其它参数都是可选
                $("#Pagination").pagination(total,{
                    callback: PageCallback,  //PageCallback() 为翻页调用次函数。
                    prev_text: "« 上一页",
                    next_text: "下一页 »",
                    items_per_page:pageSize,
                    num_edge_entries: 1,       //两侧首尾分页条目数
                    num_display_entries: 5,    //连续分页主体部分分页条目数
                    current_page: pageIndex,   //当前页索引
                });
                //翻页调用   
                function PageCallback(index, jq) {    
                   
                    InitTable(index);  
                }  
                //请求数据   
                function InitTable(pageIndex) { 
                	pageIndex = pageIndex+1;   
                	var count = 0;            
                    $.ajax({   
                        type: "POST",  
                        async: false,
                        dataType: "json",  
                        url: '/SearchListPage',      //提交到一般处理程序请求数据   
                        data: { pageIndex : pageIndex, pageSize : pageSize},
                        //data: "pageIndex=" + (pageIndex) + "&pageSize=" + pageSize,          //提交两个参数：pageIndex(页面索引)，pageSize(显示条数)                   
                        success: function(data) {
                        count = data.total;
                        var html = getHtml(data.List);
                        //alert(html)
                       		//$("#Result tr:gt(0)").remove();        //移除Id为Result的表格里的行，从第二行开始（这里根据页面布局不同页变）   
                            $("#dd").html(html);             //将返回的数据追加到表格  
                            
                        }  
                    }); 
                    return count;
                }
                
                function aa(){
                    alert("ppppp")
                }
                
                function getHtml(items){
                var html="";
                if(items!=null){
                	for(var j=0;j<items.length;j++){
                		  html+="<div class='panel panel-default'><div class='panel-heading' style='background-color:rgb(21,63,101);'>";
                 	        html+="<span style='color:white;font-family:微软雅黑;font-size:14px'>"+items[j].Project_name+"</span><span style='color:white;font-family:微软雅黑;font-size:12px;margin-left:20px'>"+items[j].project_address+"</span></div>";
  						html+="<div class='panel-body'><div id='item'><div class='media'><div class='col-xs-5'>";
  						html+="<a class='pull-left' href='/Index?proNum="+items[j].project_num+"'"+" target='_parent'>";
  						html+="<img  style='height:196px' src='http://101.200.174.253:8080/all/"+items[j].Project_img+"'></a></div>";
  						html+="<div class=media-body fnt-smaller' style='padding:0 0 0 15px'><div class='col-xs-8'>";
   	                    html+="<span style='font-family:微软雅黑;font-size:14px;font-weight:bolder'>"+items[j].Project_name+"</span><hr style='margin-top:8px;margin-bottom:8px'/>";
   	       				html+="<span  style='font-family:微软雅黑;font-size:12px'><span>7*24小时全天候在线，全</span><br/><span style='font-family:微软雅黑;font-size:12px'>方位服务的专业代理服务。</span><br/><span style='font-family:微软雅黑;font-size:12px'>我们提供了基于您的满意付费房地产经纪人。</span></span>";
   	       				//html+="<div class='row' style='margin-top:20px'><div class='col-md-2' style='padding-left:0px;padding-right:0px;' ><div style ='border:solid 1px rgb(254,254,241);font-family:微软雅黑;font-size:12px;opacity:50%;padding-left:3px;padding-right:3px'>热门项目</div></div><div class='col-md-1'></div><div class='col-md-2' style='padding-left:0px;padding-right:0px;' ><div  style ='border:solid 1px rgb(247, 254, 246);font-family:微软雅黑;font-size:12px;opacity:50%;padding-left:3px;padding-right:3px''>优秀学区</div></div><div class='col-md-1'></div><div class='col-md-2' style='padding-left:0px;padding-right:0px;' ><div style ='border:solid 1px rgb(253,249,255);font-family:微软雅黑;font-size:12px;opacity:50%;padding-left:3px;padding-right:3px'>包租项目</div ></div><div class='col-md-1'></div><div class='col-md-2' style='padding-left:0px;padding-right:0px;' ><div style ='border:solid 1px rgb(247,254,246);font-family:微软雅黑;font-size:12px;opacity:50%;padding-left:8px;padding-right:8px'>华人区</div></div></div>";
   	       			    if(items[j].xinkaipan!=null){
	       					//html+="<div class='row' style='margin-top:20px'><div class='col-md-2' style='padding-left:0px;padding-right:0px;' ><div style ='border:solid 1px rgb(254,254,241);font-family:微软雅黑;font-size:12px;opacity:50%;padding-left:3px;padding-right:3px'>xinrenm</div></div></div>";
   	       			  		//html+="<span>"+items[j].xinkaipan+"</span>";
   	       			  html+="<div class='row' style='margin-top:20px'><div class='col-md-2' style='padding-left:0px;padding-right:0px;' ><div style ='border:solid 1px rgb(254,254,241);font-family:微软雅黑;font-size:12px;opacity:50%;padding-left:3px;padding-right:3px'>"+items[j].xinkaipan+"</div></div></div>";
   	       			    }
   	       				//html+="<div class='row' style='margin-top:20px'><img alt='image' class='img-responsive' style='width:121px;height:50px;margin-top:8px' src='http://101.200.174.253:8080/all/"+items[j].project_logo+"'></div></div>";
   	       				if(items[j].developer_id_name!=null)
   	       				{
   	       					html+="<div class='row' style='margin-top:20px;font-family:微软雅黑;color:rgb(170,16,25);font-style:italic'>"+items[j].developer_id_name+"</div></div>";
   	       				}
   	       				else{
   	       				html+="<div class='row' style='margin-top:20px'></div></div>";
   	       				}
   	       				html+="<div class='col-xs-4' style='margin-top:20px'><hr style='margin-top:8px;margin-bottom:8px'/>";
            		  		html+="<span style='font-family:微软雅黑;font-weight:bolder;font-size:14px'>最多:</span><span style='float:right;font-family:微软雅黑;font-size:14px'><span>$</span>"+items[j].MaxPrice+"</span><br/>";
            		      	html+="<span style='font-family:微软雅黑;font-weight:bolder;font-size:14px'>最少:</span><span style='float:right;font-family:微软雅黑;font-size:14px'><span>$</span>"+items[j].MinPrice+"</span><br/>";
            		      	html+="<span style='font-family:微软雅黑;font-weight:bolder;font-size:14px'>面积(M2):</span><span style='float:right;font-family:微软雅黑;font-size:14px'>"+items[j].MinArea+"<span>-</span>"+items[j].MaxArea+"</span><br/>";
            		      	html+="<span style='font-family:微软雅黑;font-weight:bolder;font-size:14px'>起价:</span><span style='float:right;font-family:微软雅黑;font-size:14px'>"+items[j].project_price_int_qi+"</span><br/>";
             			    html+="<span style='font-family:微软雅黑;font-weight:bolder;font-size:14px'>返现:</span><span style='float:right;font-family:微软雅黑;font-size:14px'>"+items[j].Fanxian+"</span><br/>";
             			    html+="</div></div></div></div></div></div>";
                	}
                }
                else{
                	html="";
                }
                    
                	
                	return html;
                }
            }); 
   </script>
   <script type="text/javascript">
         var pageIndex = 0;     //页面索引初始值   
         var pageSize = 5;     //每页显示条数初始化，修改显示条数，修改这里即可  
         var total = 100;
         $(function () {
              total = InitTable(0);    //Load事件，初始化表格数据，页面索引为0（第一页）
                //分页，PageCount是总条目数，这是必选参数，其它参数都是可选
                $("#Pagination1").pagination(total,{
                    callback: PageCallback,  //PageCallback() 为翻页调用次函数。
                    prev_text: "« 上一页",
                    next_text: "下一页 »",
                    items_per_page:pageSize,
                    num_edge_entries: 1,       //两侧首尾分页条目数
                    num_display_entries: 5,    //连续分页主体部分分页条目数
                    current_page: pageIndex,   //当前页索引
                });
                //翻页调用   
                function PageCallback(index, jq) {    
                   
                    InitTable(index);  
                }  
                //请求数据   
                function InitTable(pageIndex) { 
                	pageIndex = pageIndex+1;   
                	var count = 0;            
                    $.ajax({   
                        type: "POST",  
                        async: false,
                        dataType: "json",  
                        url: '/SearchListPage',      //提交到一般处理程序请求数据   
                        data: { pageIndex : pageIndex, pageSize : pageSize},
                        //data: "pageIndex=" + (pageIndex) + "&pageSize=" + pageSize,          //提交两个参数：pageIndex(页面索引)，pageSize(显示条数)                   
                        success: function(data) {
                        count = data.total;
                        var html = getHtml(data.List);
                        //alert(html)
                       		//$("#Result tr:gt(0)").remove();        //移除Id为Result的表格里的行，从第二行开始（这里根据页面布局不同页变）   
                            $("#dd").html(html);             //将返回的数据追加到表格  
                            
                        }  
                    }); 
                    return count;
                }
                
                function aa(){
                    alert("ppppp")
                }
                
                function getHtml(items){
                var html="";
                if(items!=null){
                	
                	for(var j=0;j<items.length;j++){
                		  html+="<div class='panel panel-default'><div class='panel-heading' style='background-color:rgb(21,63,101);'>";
               	        html+="<span style='color:white;font-family:微软雅黑;font-size:14px'>"+items[j].Project_name+"</span><span style='color:white;font-family:微软雅黑;font-size:12px;margin-left:20px'>"+items[j].project_address+"</span></div>";
						html+="<div class='panel-body'><div id='item'><div class='media'><div class='col-xs-5'>";
						html+="<a class='pull-left' href='/Index?proNum="+items[j].project_num+"'"+" target='_parent'>";
						html+="<img  style='height:196px' src='http://101.200.174.253:8080/all/"+items[j].Project_img+"'></a></div>";
						html+="<div class=media-body fnt-smaller' style='padding:0 0 0 15px'><div class='col-xs-8'>";
 	                    html+="<span style='font-family:微软雅黑;font-size:14px;font-weight:bolder'>"+items[j].Project_name+"</span><hr style='margin-top:8px;margin-bottom:8px'/>";
 	       				html+="<span  style='font-family:微软雅黑;font-size:12px'><span>7*24小时全天候在线，全</span><br/><span style='font-family:微软雅黑;font-size:12px'>方位服务的专业代理服务。</span><br/><span style='font-family:微软雅黑;font-size:12px'>我们提供了基于您的满意付费房地产经纪人。</span></span>";
 	       				//html+="<div class='row' style='margin-top:20px'><div class='col-md-1'></div><div class='col-md-2' style='padding-left:0px;padding-right:0px;' ><div  style ='border:solid 1px rgb(247, 254, 246);font-family:微软雅黑;font-size:12px;opacity:50%;padding-left:3px;padding-right:3px''>优秀学区</div></div><div class='col-md-1'></div><div class='col-md-2' style='padding-left:0px;padding-right:0px;' ><div style ='border:solid 1px rgb(253,249,255);font-family:微软雅黑;font-size:12px;opacity:50%;padding-left:3px;padding-right:3px'>包租项目</div ></div><div class='col-md-1'></div><div class='col-md-2' style='padding-left:0px;padding-right:0px;' ><div style ='border:solid 1px rgb(247,254,246);font-family:微软雅黑;font-size:12px;opacity:50%;padding-left:8px;padding-right:8px'>华人区</div></div></div>";
 	       				if(items[j].xinkaipan!=null){
 	       					//html+="<span>"+items[j].xinkaipan+"</span>";
 	       					html+="<div class='row' style='margin-top:20px'><div class='col-md-2' style='padding-left:0px;padding-right:0px;' ><div style ='border:solid 1px rgb(254,254,241);font-family:微软雅黑;font-size:12px;opacity:50%;padding-left:3px;padding-right:3px'>"+items[j].xinkaipan+"</div></div></div>";
 	       					//html+="<div class='row' style='margin-top:20px'><div class='col-md-2' style='padding-left:0px;padding-right:0px;' ><div style ='border:solid 1px rgb(254,254,241);font-family:微软雅黑;font-size:12px;opacity:50%;padding-left:3px;padding-right:3px'>xinrenm</div></div></div>";
 	       				}
 	       				//html+="<div class='row' style='margin-top:20px'><img alt='image' class='img-responsive' style='width:121px;height:50px;margin-top:8px' src='http://101.200.174.253:8080/all/"+items[j].project_logo+"'></div></div>";
 	       				if(items[j].developer_id_name!=null)
 	       				{
 	       					html+="<div class='row' style='margin-top:20px;font-family:微软雅黑;color:rgb(170,16,25);font-style:italic'>"+items[j].developer_id_name+"</div></div>";
 	       				}
 	       				else{
 	       				html+="<div class='row' style='margin-top:20px'></div></div>";
 	       				}
 	       				html+="<div class='col-xs-4' style='margin-top:20px'><hr style='margin-top:8px;margin-bottom:8px'/>";
          		  		html+="<span style='font-family:微软雅黑;font-weight:bolder;font-size:14px'>最多:</span><span style='float:right;font-family:微软雅黑;font-size:14px'><span>$</span>"+items[j].MaxPrice+"</span><br/>";
          		      	html+="<span style='font-family:微软雅黑;font-weight:bolder;font-size:14px'>最少:</span><span style='float:right;font-family:微软雅黑;font-size:14px'><span>$</span>"+items[j].MinPrice+"</span><br/>";
          		      	html+="<span style='font-family:微软雅黑;font-weight:bolder;font-size:14px'>面积(M2):</span><span style='float:right;font-family:微软雅黑;font-size:14px'>"+items[j].MinArea+"<span>-</span>"+items[j].MaxArea+"</span><br/>";
          		      	html+="<span style='font-family:微软雅黑;font-weight:bolder;font-size:14px'>起价:</span><span style='float:right;font-family:微软雅黑;font-size:14px'>"+items[j].project_price_int_qi+"</span><br/>";
           			    html+="<span style='font-family:微软雅黑;font-weight:bolder;font-size:14px'>返现:</span><span style='float:right;font-family:微软雅黑;font-size:14px'>"+items[j].Fanxian+"</span><br/>";
           			    html+="</div></div></div></div></div></div>";
               			   
                	}
                }
                else{
                	html="";
                }
                    
                	
                	return html;
                }
            }); 
   </script>
</body>

</html>