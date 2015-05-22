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
</head>
<body>
    <jsp:include page="head.jsp" />
	<div style="height:200px;background-color:#cccccc;padding-top:70px;padding-left:100px;margin-top: -20;">


		<div style="color:white;font-size:40px;font-weight:bolder;font-family:黑体;">专业的服务团队为您提供专业的服务</div>
		<div style="color:white;font-size:17px;font-weight:bold;">持有海外认证资质的房产经纪人、会计师、律师、贷款咨询师为您提供定制化的服务</div>


	</div>
	<div class="container">
		<div class="rows" style="margin-top:15px;">
		<form class="form-horizontal" role="form" action="/SearchService">			
			 <div class="form-group">

			 	 <div class="col-md-3" style="padding-top:10px;"><input type="text" class="form-control" name="brokerName" placeholder="经纪姓名"></div>
			 	 <div class="col-md-2" style="width:230px;padding-top:10px;"><input type="text" class="form-control" name="type" placeholder="类型"></div>
			 	 <div class="col-md-2" style="width:230px;padding-top:10px;"><input type="text" class="form-control" name="area" placeholder="区域"></div>
			 	 <div class="col-md-2" style="width:230px;padding-top:10px;"><input type="text" class="form-control" name="lang" placeholder="语言"></div>
			 	 <div class="col-md-1" ><button type="submit" class="btn btn-default" style="width:120px;background-color:red;color:white;">搜索</button></div>

			 	 <div class="col-md-2"></div>
             </div>
		</form>
		</div>
	</div>
	<div style="height:10px;background-color:#cccccc;"></div>
	<div class="container">
		<div class="row" style="margin-top:15px;">
			<div class="col-md-1" style="width:70px;"></div>
			<div class="col-md-6">

				<c:forEach items="${brokerInfoList}"  var="item">
				<div id="dd" class="row" style="border: 1px solid #ddd;padding-top:15px;padding-bottom:15px;margin-bottom:15px;">
					<div class="col-md-4" ><a href="/Service?brokerId=${item.id}"><img src="http://101.200.174.253:8080/all/${item.broker_img}" style="width:150px"></a></div>
					<div class="col-md-8" style="padding-left:0px;">
						<div style="font-size:25px;font-weight:bolder;font-family:黑体;margin-bottom:5px;">${item.broker_name}</div>
						<div ><img  src="/images/serviceteam/b2.PNG">&nbsp;<span style="font-weight:bold;">${item.office}</span></div>
						<div style="padding-left:30px;font-weight:bold;margin-top:5px;">${item.introduction}</div>
						<hr style="height:1px;border:none;border-top:2px dashed #666666;margin-top:5px;margin-bottom:5px;" />
						<div ><img  src="/images/serviceteam/b3.PNG">&nbsp;&nbsp;<span style="font-weight:bold;">${item.broker_region}</span></div>
						<hr style="height:1px;border:none;border-top:2px dashed #666666;margin-top:5px;margin-bottom:5px;" />
						<div style="margin-top:5px;"><img  src="/images/serviceteam/b4.PNG">&nbsp;&nbsp;<span style="font-weight:bold;">${item.broker_language}</span><img  src="/images/serviceteam/b1.PNG" style="margin-left:165px;"></div>
					</div>
				</div>
			</c:forEach>

			</div>
			<div class="col-md-4" style="margin-left:30px;width:410px;">
				<div style="height:160px;background-color:black;padding-top:60px;">
					<div style="color:white;text-align: center;">让我们推荐一个最合适</div>
					<div style="color:white;text-align: center;">您的房产经纪</div>
				</div>
					<div style="padding-top:20px;background-color:#d9d2e9;">
<form class="form-horizontal" role="form" action="/ServiceTeam/MessageSubmit" method="post">
 <c:forEach items="${userList}"  var="item">
   <div class="form-group">
      <div class="col-sm-10 col-sm-offset-1">

         <input type="text" class="form-control" name="name" 
            placeholder=${item.nick_name}>

      </div>
      <div class="col-sm-1"></div>
   </div>
   <div class="form-group" >
      <div class="col-sm-10 col-sm-offset-1">

         <input type="text" class="form-control" name="email" 
            placeholder=${item.email}>



      </div>
      <div class="col-sm-1"></div>
   </div>
   <div class="form-group" >
      <div class="col-sm-10 col-sm-offset-1">

         <input type="text" class="form-control" name="tel" 
            placeholder=${item.tel}>


      </div>
      <div class="col-sm-1"></div>
   </div>
   <div class="form-group" >
      <div class="col-sm-10 col-sm-offset-1">

         <textarea type="text" rows="5" cols="20" class="form-control" name="message_content"  placeholder="留言"></textarea>
            
      </div>
      <div class="col-sm-1"></div>
   </div>
   <div class="form-group" style="padding-bottom:40px;">
   	   <div class="col-sm-7"></div>
      <div class="col-sm-5">
         <button type="submit" class="btn btn-default" style="width:105px;background-color:red;color:white;" type="submit" id="submit">提交</button>

      </div>
     
   </div>
 </c:forEach>
</form></div>
<div style="margin-top:10px;"><img src="/images/book.PNG" style="width:380px;height:200px;"></div>				
			</div>
			<div class="col-md-1"></div>
		</div>
	</div>
 <jsp:include page="foot.jsp" /> 
</body>
</html>



<script type="text/javascript">
         var pageIndex = 0;     //页面索引初始值   
         var pageSize = 1;     //每页显示条数初始化，修改显示条数，修改这里即可  
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
                        dataType: "json",  
                        url: '/brokerinfoPage',      //提交到一般处理程序请求数据   
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
                	    html+="<div class='col-md-4'><a href='/Service?brokerId=" + ${items[j].id} + "'><img src='/images/jingjiren.PNG'></a></div>";
                	    html+="<div class='col-md-8' style='padding-left:0px;'>";
 						html+="<div style='font-size:25px;font-weight:bolder;font-family:黑体;margin-bottom:5px;'>"+${item.broker_name}+"</div>";
 						html+="<div ><img  src='/images/serviceteam/b2.PNG'>&nbsp;<span style='font-weight:bold;'>"+${item.office}+"</span></div>";
 						html+="<div style='padding-left:30px;font-weight:bold;margin-top:5px;'>"+${item.introduction}+"</div>";
 						html+="<hr style='height:1px;border:none;border-top:2px dashed #666666;margin-top:5px;margin-bottom:5px;' />";
  	                    html+="<div ><img  src='/images/serviceteam/b3.PNG'>&nbsp;&nbsp;<span style='font-weight:bold;'>${item.broker_region}</span></div>";
  	       				html+="<hr style='height:1px;border:none;border-top:2px dashed #666666;margin-top:5px;margin-bottom:5px;' />";
  	       				html+="<div style='margin-top:5px;'><img  src='/images/serviceteam/b4.PNG'>&nbsp;&nbsp;<span style='font-weight:bold;'>${item.broker_language}</span><img  src='/images/serviceteam/b1.PNG' style='margin-left:165px;'></div>";
  	       				html+="<div class='col-xs-4'><h4><b>详情简介</b></h4><hr/>";
           		  		html+="<b>最多:</b><span class='right'><span>$</span>"+items[j].MaxPrice+"</span><br/>";
           		      	html+="<b>最少:</b><span class='right'><span>$</span>"+items[j].MinPrice+"</span><br/>";
           		      	html+="<b>面积(M2)</b>:<span class='right'>"+items[j].MinArea+"<span>-</span>"+items[j].MaxArea+"</span><br/>";
           		      	html+="<b>可售:</b><span class='right'>"+items[j].Keshou+"</span><br/>";
            			html+="<b>返现:</b><span class='right'><span>$</span>"+items[j].Fanxian+"</span><br/>";
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
   
   
   
   