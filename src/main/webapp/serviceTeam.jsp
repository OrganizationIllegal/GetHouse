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
		<div style="color:white;font-size:40px;font-weight:bolder;font-family:����;">רҵ�ķ����Ŷ�Ϊ���ṩרҵ�ķ���</div>
		<div style="color:white;font-size:17px;font-weight:bold;">���к�����֤���ʵķ��������ˡ����ʦ����ʦ��������ѯʦΪ���ṩ���ƻ��ķ���</div>
	</div>
	<div class="container">
		<div class="rows" style="margin-top:15px;">
		<form class="form-horizontal" role="form">			
			 <div class="form-group">
			 	 <div class="col-md-3" style="padding-top:10px;"><input type="text" class="form-control" id="lastname" placeholder="��������"></div>
			 	 <div class="col-md-2" style="width:230px;padding-top:10px;"><input type="text" class="form-control" id="lastname" placeholder="����"></div>
			 	 <div class="col-md-2" style="width:230px;padding-top:10px;"><input type="text" class="form-control" id="lastname" placeholder="����"></div>
			 	 <div class="col-md-2" style="width:230px;padding-top:10px;"><input type="text" class="form-control" id="lastname" placeholder="����"></div>
			 	 <div class="col-md-1" ><button type="submit" class="btn btn-default" style="width:120px;background-color:red;color:white;">����</button></div>
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
				<div class="row" style="border: 1px solid #ddd;padding-top:15px;padding-bottom:15px;margin-bottom:15px;">
					<div class="col-md-4"><img src="/images/jingjiren.PNG"></div>
					<div class="col-md-8" style="padding-left:0px;">
						<div style="font-size:25px;font-weight:bolder;font-family:����;margin-bottom:5px;">${item.broker_name}</div>
						<div ><span class="glyphicon glyphicon-home"></span>&nbsp;&nbsp;<span style="font-weight:bold;">${item.office}</span></div>
						<div style="padding-left:20px;font-weight:bold;margin-top:5px;">${item.introduction}</div>
						<hr style="height:1px;border:none;border-top:2px dashed #666666;margin-top:5px;margin-bottom:5px;" />
						<div ><span class="glyphicon glyphicon-tree-conifer" style="color:red;"></span>&nbsp;&nbsp;<span style="font-weight:bold;">${item.broker_region}</span></div>
						<hr style="height:1px;border:none;border-top:2px dashed #666666;margin-top:5px;margin-bottom:5px;" />
						<div style="margin-top:5px;"><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;<span style="font-weight:bold;">${item.broker_language}</span><span class="glyphicon glyphicon-home" style="margin-left:120px;color:#9fc5e8;"></span>&nbsp;<span class="glyphicon glyphicon-home" style="color:#9fc5e8;"></span><span class="glyphicon glyphicon-home" style="color:#9fc5e8;"></span>&nbsp;<span class="glyphicon glyphicon-home" style="color:#9fc5e8;"></span></div>
					</div>
				</div>
			</c:forEach>	
				
				
			</div>
			<div class="col-md-4" style="margin-left:30px;width:410px;">
				<div style="height:160px;background-color:black;padding-top:60px;">
					<div style="color:white;text-align: center;">�������Ƽ�һ�������</div>
					<div style="color:white;text-align: center;">���ķ�������</div>
				</div>
					<div style="padding-top:20px;background-color:#d9d2e9;">
					 <form class="form-horizontal" role="form">
   <div class="form-group">
      <div class="col-sm-10 col-sm-offset-1">
         <input type="text" class="form-control" id="name" 
            placeholder="����">
      </div>
      <div class="col-sm-1"></div>
   </div>
   <div class="form-group" >
      <div class="col-sm-10 col-sm-offset-1">
         <input type="text" class="form-control" id="lastname" 
            placeholder="����">
      </div>
      <div class="col-sm-1"></div>
   </div>
   <div class="form-group" >
      <div class="col-sm-10 col-sm-offset-1">
         <input type="text" class="form-control" id="lastname" 
            placeholder="�绰">
      </div>
      <div class="col-sm-1"></div>
   </div>
   <div class="form-group" >
      <div class="col-sm-10 col-sm-offset-1">
         <textarea type="text" rows="5" cols="20" class="form-control" id="lastname" 
            placeholder="����"></textarea>
            
      </div>
      <div class="col-sm-1"></div>
   </div>
   <div class="form-group" style="padding-bottom:40px;">
   	   <div class="col-sm-7"></div>
      <div class="col-sm-5">
         <button type="submit" class="btn btn-default" style="width:105px;background-color:red;color:white;">�ύ</button>
      </div>
     
   </div>
</form></div>
<div style="margin-top:10px;"><img src="/images/book.PNG" style="width:380px;height:200px;"></div>				
			</div>
			<div class="col-md-1"></div>
		</div>
	</div>
 <jsp:include page="foot.jsp" /> 
</body>
</html>