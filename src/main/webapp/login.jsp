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
     .container1{
     	width: 414px;
    margin: 0,auto;
    margin: auto;
    margin-top: 75px;
     }
</style>
</head>
<body style="padding-top: 105px;">
<jsp:include page="head.jsp" />
 <div class="container1" >
 
  <form class="form-horizontal" role="form" method="post" name="fm" action="/login">
   <div class="form-group">
      <label for="firstname" class="col-sm-2 control-label">用户名</label>
      <div class="col-sm-10">
         <input type="text" class="form-control" id="username" 
            name="username" placeholder="请输入用户名">
         <input type="hidden" class="form-control" id="username1" 
            name="username1" placeholder="请输入用户名">
        <input type="hidden" class="form-control" id="role" 
            name="role" placeholder="用户角色">
           
      </div>
       <div id="user" style="height:60px;margin-left:20px;">
         
      </div>
      
   </div>
   <div class="form-group">
      <label for="lastname" class="col-sm-2 control-label">密码</label>
      <div class="col-sm-10">
         <input type="text" class="form-control" id="password" 
            name="password" placeholder="请输入密码">
         <input type="hidden" class="form-control" id="password1" 
            name="password1" placeholder="请输入密码">
      </div>
       <div id="pass" style="height:60px;margin-left:20px;">
          
      </div>
   </div>
   
   <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
         <div class="checkbox">
            <label>
               <input type="checkbox"> 请记住我
            </label>
         </div>
      </div>
   </div>
   <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
         <button type="button" class="btn btn-default" id="login">登录</button>
      </div>
   </div>
</form>
        </div>
            
   
</body>

</html>

<script>

var role;
 $(function() {
                $("#login").click(function() {
                	var user = $("#username").val();
                	var pass = $("#password").val();
                	var temp;
                	temp = judge(user,pass);
                	//alert(role)
                	if(temp==true){
	                	var username = encode64($("#username").val());
	                	var password = encode64($("#password").val());
	                	//alert("用户名加密后的结果:"+username+"密码加密后的结果:"+password);
	                	$("#username1").val(username);
	                    $("#password1").val(password);
	                    $("#role").val(role);
	                    document.fm.submit();  //fm为form表单name
                	}
                })
        })

function judge(username, password){
	 var result = false;
	 if(username==""){
		 $("#user").html("请输入用户名");
		 return false;
	 }
	 else if(username!=""&&password==""){
		 $("#pass").html("请输入密码");
		 $("#user").html("");
		 return false;
	 }
	 else{
		$.ajax({
			type:'GET',
			url:'/loginPanduan?username='+username+'&password='+password,
			dataType:'json',
			async: false, 
			success:function(data){
				if(data.user==0){
					$("#user").html("用户名不存在");
				}
				else if(data.user==2){
					$("#pass").html("用户名和密码不符");
					$("#user").html("");
				}
				else if(data.user==1){
					//alert(data.role)
					if(data.role==0){
						role = 0;
					}
					else{
						role = 1;
					}
					result=true;
				}
			},
			error:function(){
				
			}
		})
 
	 }
	
 if(result == true){
	 return true;
 }
 }

var keyStr = "ABCDEFGHIJKLMNOP" + "QRSTUVWXYZabcdef" + "ghijklmnopqrstuv"
+ "wxyz0123456789+/" + "=";

function encode64(input) {

var output = "";
var chr1, chr2, chr3 = "";
var enc1, enc2, enc3, enc4 = "";
var i = 0;
do {
chr1 = input.charCodeAt(i++);
chr2 = input.charCodeAt(i++);
chr3 = input.charCodeAt(i++);
enc1 = chr1 >> 2;
enc2 = ((chr1 & 3) << 4) | (chr2 >> 4);
enc3 = ((chr2 & 15) << 2) | (chr3 >> 6);
enc4 = chr3 & 63;
if (isNaN(chr2)) {
        enc3 = enc4 = 64;
} else if (isNaN(chr3)) {
        enc4 = 64;
}
output = output + keyStr.charAt(enc1) + keyStr.charAt(enc2)
                + keyStr.charAt(enc3) + keyStr.charAt(enc4);
chr1 = chr2 = chr3 = "";
enc1 = enc2 = enc3 = enc4 = "";
} while (i < input.length);

return output;
}
</script>