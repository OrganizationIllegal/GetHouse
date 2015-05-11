<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Tree Index</title>
     <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
     <link href="/bootstrap/css/bootstrap-table.css" rel="stylesheet">
     <link href="/bootstrap/css/bootstrap-editable.css" rel="stylesheet">
     <link href="/bootstrap/css/examples.css" rel="stylesheet">
     <script src="/js/jquery.min.js"></script>
     <script src="/bootstrap/js/bootstrap.min.js"></script>
     <script src="/bootstrap/js/bootstrap-table.js"></script>
     <script src="/bootstrap/js/bootstrap-editable.js"></script>
     <script src="/bootstrap/js/bootstrap-table-export.js"></script>
     <script src="/bootstrap/js/bootstrap-table-editable.js"></script>
     <script src="/bootstrap/js/tableExport.js"></script>
     <script src="/bootstrap/js/jquery.base64.js"></script>
</head>

<script>
$(function(){
    $('.tree li:has(ul)').addClass('parent_li').find(' > span').attr('title', 'Collapse this branch');
    $('.tree li.parent_li > span').on('click', function (e) {
        var children = $(this).parent('li.parent_li').find(' > ul > li');
        if (children.is(":visible")) {
            children.hide('fast');
            $(this).attr('title', 'Expand this branch').find(' > i').addClass('icon-plus-sign').removeClass('icon-minus-sign');
        } else {
            children.show('fast');
            $(this).attr('title', 'Collapse this branch').find(' > i').addClass('icon-minus-sign').removeClass('icon-plus-sign');
        }
        e.stopPropagation();
    });
});
</script>




<script>

function show1()
{
	document.getElementById("gl1").style.display='block';
	document.getElementById("gl2").style.display='none';
}


function show2()
{
	document.getElementById("gl2").style.display='block';
	document.getElementById("gl1").style.display='none';
}
</script>

</head>
<body>

<div>
<div class="col-md-2">
<div class="tree">
    <ul>
        <li>
            <span><i class="icon-calendar"></i>前台</span>
            <ul>
                <li>
                	<span class="badge badge-success"><input type="button" name="Submit2" value="地图搜索"  onclick="show1();"/></span>
                    
                </li>
              
              	<li>
                	<span class="badge badge-success"><input type="button" name="Submit2" value="列表搜索"  onclick="show2();"/></span>
                    
                </li>
              </ul>
         </li>
       
        <li>
            <span><i class="icon-calendar"></i>后台</span>
            <ul>
                <li>
                	<span class="badge badge-success"><input type="button" name="Submit2" value="户型及价格"  onclick="show();"/></span>
                    
                </li>
              
              	<li>
                	<span class="badge badge-success"><input type="button" name="Submit2" value="投资"  onclick="show();"/></span>
                    
                </li>
              </ul>
         </li>
       
       
       
    </ul>
   </div>
</div>

	<div class="col-md-10">
		<div id="gl1" style="display:none">
			<jsp:include page="houseTypeList.jsp"/>
    	</div>
		
		<div id="gl2" style="display:none">
			<jsp:include page="searchList.jsp"/>
    	</div>
		
		
		
		
		
		</div>









</div>
</body>
</html>