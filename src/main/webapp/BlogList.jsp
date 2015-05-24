<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
   <title>HousePurchasing</title>
   <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">

   <script src="/js/jquery.min.js"></script>
   <script src="/bootstrap/js/bootstrap.min.js"></script>
   <script src="/js/jquery.bootpag.min.js"></script>
</head>
<body style="padding-top: 105px;">
 <jsp:include page="head.jsp" />
	<div class="container">
       <!-- <div class="row" style="height:30px;background-color:#4B0082;">
            <div class="col-lg-1"></div>
            <div class="col-lg-2" style="margin:0 auto;height:100%;line-height:30px;color:white;">博客   置业指导</div>
        </div>
        <div class="row" style="height:70px;border:1px solid #FFE4E1;">
            <div class="col-lg-1"></div>
            <div class="col-lg-2" style="font-size:24px;line-height:70px;height:100%;font-weight:bold;">博客</div>
        </div>-->
        <div class="row" style="margin-top:20px;">
            <div class="col-lg-1"></div>
            <div class="col-lg-7">
                <div class="row">
                    <div class="panel panel-default">
                      <div class="panel-heading" id="leftpanel">1-${pageCount}的${total}篇文章</div>
                      <div class="panel-body">
                        <ul class="media-list" id="mainlist">
                        <c:forEach items="${newsList}" var="item" varStatus="status">
                        	<c:if test="${status.index < 6}">
                        		<li class="media">
                             <div class="media-left">
                                <a href="/Detail?id=${item.id}&type=1">
                                  <img class="media-object" src="" alt="" width="180px" height="140px">
                                </a>
                              </div>
                              <div class="media-body">
                                <h4 class="media-heading">${item.news_title}</h4>
                                <p style="font-size:12px;">${item.news_fenlei}</p>
                                <p style="font-size:120x;">${item.news_abstract}</p>
                                <a href="/Detail?id=${item.id}&type=1">全文></a>
                              </div>
                          </li>
                        	</c:if>
                        	
                        </c:forEach>
                        </ul>
                       <div id="page-selection"></div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-lg-4">
            <div class="panel panel-default">
              <div class="panel-heading">置业</div>
              <div class="panel-body"> 
                <a href="/ZhiYeInfo" style="display:block;">置业指导</a><br>
                <a href="/BlogList">博客</a>
              </div>
            </div>
            <div class="panel panel-default">
              <div class="panel-heading">分类浏览</div>
              <div class="panel-body"> 

                <select id="type">
                    <option>请选择一个类别</option>
                    <c:forEach items="${fenleiList}" var="item">
                    	<option>${item}</option>
                    </c:forEach>

                </select>
              </div>
            </div>
            <div class="panel panel-default">
              <div class="panel-heading">最新博客文章</div>
              <div class="panel-body"> 
                <ul class="media-list">

                <c:forEach items="${newsList}" var="item" varStatus="status">
                		 <li class="media">
                             <div class="media-left">
                                <a href="/news_blog.jsp">
                                  <img class="media-object" src="" alt="" width="64px" height="58px">
                                </a>
                              </div>
                              <div class="media-body">
                                <h5 class="media-heading">${item.news_title}</h5>
                                <p style="font-size:12px;">${item.news_people}</p>
                                
                              </div>
                          </li>
                
                </c:forEach>
                         
                         

                        </ul>
              </div>
            </div>
            <div class="panel panel-default">
              <div class="panel-heading">置业指导</div>
              <div class="panel-body"> 
                <ul class="media-list">

                	 <c:forEach items="${lastestList}" var="item" varStatus="status">
                	 	 <li class="media">
                             <div class="media-left">
                                <a href="/news_blog.jsp">
                                  <img class="media-object" src="" alt=""  width="64px" height="58px">
                                </a>
                              </div>
                              <div class="media-body">
                                <h5 class="media-heading">${item.title}</h5>
                                <p style="font-size:12px;">${item.fenlei}</p>
                                
                              </div>
                          </li>
                	 </c:forEach>
                         
                        
                        </ul>
              </div>
            </div>
        </div>
        
    </div>
    <div class="row" style="height:200px;width:1140px;background-color:rgb(20,51,82);vertical-align:middle;text-align:center;position:relative;margin-left:1px">
        <div style="left:40%;top:40%;position:absolute;">
            <font style="font-size:20px;font-weight:bold;color:#FFFFFF;">为您提供最好的海外购房服务</font><br>
            <button class="buttton">注册</button>
        </div>
    </div>

    <!--<div class="row" style="height:20px;"></div>-->
   <jsp:include page="foot.jsp" />
   <script type="text/javascript">
	    // init bootpag
	    var category="";
   		$(function(){
  			$('#type').change(function(){ 
	  			category=$(this).children('option:selected').val();
				$.ajax({
                        type: "POST",  
                        dataType: "json",  
                        url: '/NewsBokeFenYe',      //提交到一般处理程序请求数据   
                        data: { pageIndex : 1,type:category},
                        success: function(data) {
                       
                            $("#leftpanel").text("1-"+data.pageCount+"的"+data.total+"篇文章");
                            
                        	var html = getHtml(data.List);
                        	$("#mainlist").html(html);
                        	$('#page-selection').bootpag({
                            	total: data.pageCount
						    });
                        }  
                    }); 
			
			});
	    });
	    
	    $('#page-selection').bootpag({
	        total: "${pageCount}"
	    }).on("page", function(event, num){
	    
	         $.ajax({   
                        type: "POST",  
                        dataType: "json",  
                        url: '/ZhiYeFenYe',      //提交到一般处理程序请求数据   
                        data: { pageIndex : num},
                        //data: "pageIndex=" + (pageIndex) + "&pageSize=" + pageSize,          //提交两个参数：pageIndex(页面索引)，pageSize(显示条数)                   
                        success: function(data) {
	                        count = data.total;
	                 		var html = getHtml(data.List);
	                        $("#mainlist").html(html);
                     }
                        
                  }); 
	    });
	    
	    
	    function getHtml(items){
                var html="";
                if(items!=null){
                	for(var j=0;j<items.length;j++){
                	    html+="<li class='media'><div class='media-left'><a href='#'>";
                	    html+="<img class='media-object' src='"+items[j].image+"' alt='' width='180px' height='140px'>";
 						html+="</a></div><div class='media-body'><h4 class='media-heading'>"+items[j].title;
 						html+="</h4><p style='font-size:12px;'>"+items[j].fenlei;
 						html+="</p><p style='font-size:120x;'>"+items[j].zhiye_abstract;
 						html+="<a href='/Detail?id=items[j].id&type=1'>全文></a></div></li>";
                	}
                }
                else{
                	html="";
                }
              	return html;
        }
	    
	    
	</script>
</body>

</html>