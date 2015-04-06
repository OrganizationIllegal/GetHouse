<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <base href="<%=basePath%>">
  <title>首页 | 自助挂号指南系统</title>
  <link href="style/guahao.css" rel="stylesheet" type="text/css">
  <link rel="stylesheet" type="text/css" href="style/style1.css" />
  <link  type="text/css" rel="stylesheet" href="style/index.css"/>
  <script type="text/javascript" src="js/jquery-1.6.js"></script>
  <script type="text/javascript" src="js/menu.js"></script>
  <script type="text/javascript">
	function a(){
		window.location.href= "file:///e:/health-report/report/index.html";
	}
	
	function addlink(alink){
		//alert(alink.id)
		//element=document.getElementById(alink.id)
    	//element.setAttribute("href","http://www.baidu.com?word="+alink.innerHTML);
    	alink.setAttribute("href","dis.action?dis_name="+encodeURIComponent(encodeURIComponent(alink.innerHTML)));
  		return true;	
	}
	function addlinktwo(alink){
		//alert(alink.id)
		//element=document.getElementById(alink.id)
    	//element.setAttribute("href","http://www.baidu.com?word="+alink.innerHTML);
    	alink.setAttribute("href","unaccucheck.action?disease="+encodeURIComponent(encodeURIComponent(alink.innerHTML))+"&prev_que="+encodeURIComponent(encodeURIComponent('无')));
  		//alink.setAttribute("href","unaccucheck.action?disease="+encodeURIComponent(encodeURIComponent(alink.innerHTML))+"&prev_que=''");
  		return true;	
	}
	function run(exe,path){
		var objShell=new ActiveXObject("wscript.shell");
		objShell.run(exe+"   "+path);
	}
</script>
<script type="text/javascript">
  /*function replace(){
       var  dis_name=document.getElementById("dis_name").value;
	  // var dis_name=request.getParameter("dis_name");
	   // var dis_name="高血压";
	 //  $("#image").css("display","none"); 
 	   // $("#main_content").css("display","block");
    window.location.href="dis.action?dis_name="+encodeURIComponent(encodeURIComponent(dis_name));
    document.getElementById("image").style.display = "none";
    document.getElementById("main_content").style.display = "";
	
	  
	 
 	    // $("#image").css("display","none"); 
 	   // $("#main_content").css("display","block");
   }*/
    $(function(){
    	//$("#rep").click(function(){
    	//$("#replace_1,#replace_2").replaceWith($("#replace").show());});
     $("#button1").click(
    			  function(){
    				var  dis_name=document.getElementById("dis_name").value;
    				 
    				   // document.getElementById("image").style.display = "none";
    				    //document.getElementById("main_content").style.dimageisplay = "";
    				  //$("#image").css("display","none");
    				 // $("#main_content").css("display","block");
    				 // $("#image").replaceWith($("#main_content").show());
    				  window.location.href="dis.action?dis_name="+encodeURIComponent(encodeURIComponent(dis_name));
    	  });
    			  
    	  
    	  
    	 $("#block0").live("mouseover",function(){
    		 $("#menu0").show();
    	 });
    	 $("*:not(#menu0)").click(function(){
    		 $("#menu0").hide();
    	 });
    	 $("#block1").live("mouseover",function(){
    		 $("#menu1").show();
    	 });
    	 $("*:not(#menu1)").click(function(){
    		 $("#menu1").hide();
    	 });
    	 $("#block2,#block3").live("mouseover",function(){
    		 $("#menu2").show();
    	 });
    	 $("*:not(.menu2)").click(function(){
    		 $("#menu2").hide();
    	 });
    	 $("#block4,#block5").live("mouseover",function(){
    		 $("#menu3").show();
    	 });
    	 $("*:not(.menu3)").click(function(){
    		 $("#menu3").hide();
    	 });
    	
     });
 </script>

</head>
  
  <body>
  <div id="main_container">
	<div class="header">
    	<div id="logo"><a href="index.html"><img src="images/logo1.png" alt="" title="" width="50" height="54" border="0" />
    	<img src="images/logo2.png" alt="" title="" width="260" height="54" border="0" /></a></div>
    	
        <div class="right_header">
        	<div class="top_menu">
            <a href="user/login.jsp" class="login">登 陆</a>
            <a href="user/register.jsp" class="sign_up">注 册</a>
            </div>
            <div id="menu" style="float:right">
                <ul>                                              
                    <li><a href="index.jsp" title="">首 页</a></li>
                    <li><a  class="current" href="guahao.jsp" title="" id="zizhu">自助挂号 </a></li>
                    <li><a href="showDep.jsp"  title="">科室介绍</a></li>
                    <li><a href="contact.jsp" title="">联系我们</a></li>
                    <!--<li><a href="AXieYi://FeiQ.exe" title="">联系我们</a></li>
                      <li><button onclick="run('FeiQ.exe','D:\FeiQ.exe')">飞秋</button></li>-->
                  
                </ul>
            </div>
        </div>
    </div>
 </div>
 
 
 
  <div class="pattern_bg">
    
    	<div class="pattern_box">
            <div class="pattern_box_icon"><img src="images/icon1.png" alt="" title="" width="70" height="112" /></div>
            <div class="pattern_content">
            <h1>按 <span class="blue">疾病</span>查找</h1>
            <br/>
            <p class="pat">
                                                      请输入疾病名称
            </p>
      <!-- <form action="dis.action" method="post">  -->
      
           <input type="text" style="width:210px;height:50px;" id="dis_name" name="dis_name"></input>
            <input type="button" value="提交"  id="button1" onclick="" > 
            <input type="reset" value="重置"  />

        <!--  </form>  -->
            <div>
            <span>
               <a  style="color: white" title="癫痫" onmousedown="return _smartlog(this,'DIS')" onclick="return addlink(this)" target="_blank" href="accurate_diagnosis/diagnosis_neurology.jsp">癫痫</a>
            </span>
            <span>
               <a  style="color: white" title="高血压" onmousedown="return _smartlog(this,'DIS')" onclick="return addlink(this)" target="_blank" href="">高血压</a>
            </span>
            <span>
               <a  style="color: white" title="脑出血" onmousedown="return _smartlog(this,'DIS')" onclick="return addlink(this)" target="_blank" href="accurate_diagnosis/diagnosis_neurology.jsp">脑出血</a>
            </span>
            </div>
            </div>
        </div>
        
        
    	<div class="pattern_box">
            <div class="pattern_box_icon"><img src="images/icon2.png" alt="" title="" width="70" height="112" /></div>
            <div class="pattern_content">
            <h1>按  <span class="blue"> 症状</span>查找</h1>
            <br/>
            <p class="pat">
                                               请输入症状名称
            </p>
            <textarea style="width:210px;height:50px;"></textarea>
            <input type="button" value="提交"/>
             <input type="button" value="重置"/>
            </div>
        </div>        
        <div class=menuskin id=popmenu
					      onmouseover="clearhidemenu();highlightmenu(event,'on')"
					      onmouseout="highlightmenu(event,'off');dynamichide(event)" style="Z-index:100;position:absolute;">
	    </div> 
    
</div> 
<!-- 核心内容 -->
<div id="main_content" style="width:888px;height:500px">
    	<div id="youroom" style="margin-right:50px;padding-left:3px;float:right;padding-right: 10px;height:auto">
    	<br/>
    	<h2>医生信息：</h2>
    	<br/>
    	<br/>
    	    <table width="700" border="1" cellspacing="0" cellpadding="0" align="center">
		<s:iterator value="#request.doctorinfo" id="doctorinfo"> 
      <tr align="center">
        <td colspan="2" >
        <s:property value="#doctorinfo.doc_name"  ></s:property>
        <s:property value="#doctorinfo.doc_title"></s:property></td>
      </tr>

      <tr>
        <td>医院：中国人民解放军总医院301医院</td>
        <td> <s:property value="#request.dep_name"  ></s:property></td>
      </tr>
      
      <tr>
        <td colspan="2">擅长：<s:property value="#doctorinfo.doc_strength"></s:property></td>
      </tr>
      <tr>
        <td>坐诊时间:</td>
        <td><s:property value="#doctorinfo.doc_time"></s:property></td>
      </tr>
      <tr>
      	<td colspan="2"> <s:property value="#doctorinfo.doc_intro"></s:property></td>
      </tr>
        </s:iterator>
    </table>
    </table> 
    	</div>
    </div>        
  <!-- footer -->          
 <div id="footer">
     	<div class="copyright">
        <img src="images/footer_logo1.gif" alt="" title="" />
        </div>
        <div class="center_footer">&copy; copyright 2013-2014. All Rights Reserved</div>
    	<div class="footer_links">
        </div>
</div>
</body>
</html>
