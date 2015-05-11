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
<body style="padding-top: 105px;">
 <jsp:include page="head.jsp" />
 <div class="container">
 <div class="row" style="padding-top:20px;">
 <div class="col-md-4"></div>
 <div class="col-md-5" style="padding-top:5px;">
 <table id="Result" cellspacing="0" cellpadding="0">            
                <tr>  
                    <th></th>
                    <th></th>
                </tr>                                                                                               
        </table>  
        <div id="Pagination" class="pagination"></div>
 </div>
 <!--<div class="col-md-1" style="margin-left:-50px;">
 <div class="btn-group">
    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" style="width:80px;margin-top:20px;margin-bottom:0px;background-color:#DBDBDB;">
      排序
      <span class="caret"></span>
    </button>
    <ul class="dropdown-menu">
      <li><a href="#">升序</a></li>
      <li><a href="#">降序</a></li>
    </ul>
  </div>
 </div>-->
 <div class="col-md-3" style="padding-top:10px;padding-left:30px;">
 <div class="btn-group">
  <button type="button" class="btn btn-warning" style="width:100px;"><a href="bingMap.jsp">地图找房</a></button>
  <button type="button" class="btn btn-warning" style="width:100px;"><a href="#">列表找房</a></button>
</div>
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
  <tr><th>
 <c:forEach items="${searchList}" var="item" begin="0" end="4" step="1" varStatus="var">
  <div class="panel panel-default">
  	<div class="panel-heading" style="background-color:rgb(21,63,101);"><span style="color:white">${item.project_name}</span></div>
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
                		 	<h4><b>完整的购房服务</b></h4>
                		 	<hr/>
                		 	<span>7*24小时全天候在线，全</span><br/>
                		 	<span>方位服务的专业代理服务。</span><br/>
                		 	<span>我们提供了基于您的满意付费房地产经纪人。</span>
                		 	<br/>
                		 	<br/>
                		 	<br/>
                		 	<img alt="image" class="img-responsive" src="pic/logo2.png">
                		 </div>
                		  <div class="col-xs-4">
                		     <h4><b>详情简介</b></h4>
                		     <hr/>
                		     <b>最多:</b><span class="right"><span>$</span>${item.maxPrice}</span><br/>
                		     <b>最少:</b><span class="right"><span>$</span>${item.minPrice}</span><br/>
                		     <b>面积(M2)</b>:<span class="right">${item.minArea}<span>-</span>${item.maxArea}</span><br/>
                		     <b>可售:</b><span class="right">${item.keshou}</span><br/>
                		     <b>返现:</b><span class="right"><span>$</span>${item.fanxian}</span><br/>
                		 </div>
            		 </div>
      			 </div>
     		 </div>
     </div>
  </div>
  </c:forEach>
  </th></tr></table>
  <!--end item1-->
 </div>
 </div>
</div>
   <jsp:include page="foot.jsp" />
   <script src="/js/jquery.pagination.js"></script>
   <script type="text/javascript">
         var pageIndex = 0;     //页面索引初始值   
         var pageSize = 15;     //每页显示条数初始化，修改显示条数，修改这里即可   
         $(function () {
              InitTable(0);    //Load事件，初始化表格数据，页面索引为0（第一页）
                //分页，PageCount是总条目数，这是必选参数，其它参数都是可选
                $("#Pagination").pagination(150,{
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
                    $.ajax({   
                        type: "POST",  
                        dataType: "json",  
                        url: '/json/welcome.json',      //提交到一般处理程序请求数据   
                        data: "pageIndex=" + (pageIndex) + "&pageSize=" + pageSize,          //提交两个参数：pageIndex(页面索引)，pageSize(显示条数)                   
                        success: function(data) {
                            $("#Result tr:gt(0)").remove();        //移除Id为Result的表格里的行，从第二行开始（这里根据页面布局不同页变）   
                            $("#Result").append(data);             //将返回的数据追加到表格   
                        }  
                    }); 
                }
            }); 
   </script>
</body>

</html>