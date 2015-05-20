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
   
</head>
<body style="padding-top: 150px;">
 <jsp:include page="head.jsp" />
	<div class="container">
        <div class="row" style="height:30px;background-color:#4B0082;">
            <div class="col-lg-1"></div>
            <div class="col-lg-2" style="margin:0 auto;height:100%;line-height:30px;color:white;">首页 &nbsp&nbsp 新闻博客 &nbsp&nbsp 置业指导</div>
        </div>
        <div class="row" style="height:70px;border:1px solid #FFE4E1;">
            <div class="col-lg-1" style="padding-top:10px;"></div>
            <span style="font-family:华文中宋; font-size:25px;color:black; ">澳洲购房指南:你不得不知的八大退税技巧</span>
           
        </div>
        <div class="row" style="margin-top:20px;">
            <div class="col-lg-1"></div>
            <div class="col-lg-7">
                <div class="row">
                    <div >
                      
                      <div class="panel-body">
                        <ul class="media-list">

                        
                          <li class="media">
                            <img src="pic/1.jpg">
                          
                          </li>
                        
                        <li class="media">
                           <span>
                           	asdfsadfsdafasdfsafsadf
                           	asdfasdf
                           	asdfasdfdsa
                           	asdfasd
                           	</span>
                          
                          </li>
                        
                        <li class="media">
                           <span style="font-family:华文中宋; color:rgba(140, 181, 225, 1); ">八大房产投资退税技巧：</span>
                          
                          </li>
                          <li class="media">
                           <span>
                           	1.asdfsadfsdafasdfsafsadf
                           	asdfasdf
                           	asdfasdfdsa
                           	asdfasd
                           	</span>
                          
                          </li>
                        
                        
                        <li class="media">
                           <span style="font-family:华文中宋; color:rgba(140, 181, 225, 1); ">一定要注意:再融资之前一定要检查自己的账户，确保自住房和投资房的贷款不在同一个抵押贷款之下，否则会导致严重的税务问题。</span>
                          
                          </li>
                        
                        <li class="media">
                           <span>
                           	2.asdfsadfsdafasdfsafsadf
                           	asdfasdf
                           	asdfasdfdsa
                           	asdfasd
                           	</span>
                          
                          </li>
                        
                        <li class="media">
                           <span>
                           	3.asdfsadfsdafasdfsafsadf
                           	asdfasdf
                           	asdfasdfdsa
                           	asdfasd
                           	</span>
                          
                          </li>
                        
                        <li class="media">
                           <span>
                           	4.asdfsadfsdafasdfsafsadf
                           	asdfasdf
                           	asdfasdfdsa
                           	asdfasd
                           	</span>
                          
                          </li><li class="media">
                           <span>
                           	5.asdfsadfsdafasdfsafsadf
                           	asdfasdf
                           	asdfasdfdsa
                           	asdfasd
                           	</span>
                          
                          </li><li class="media">
                           <span>
                           	6.asdfsadfsdafasdfsafsadf
                           	asdfasdf
                           	asdfasdfdsa
                           	asdfasd
                           	</span>
                          
                          </li><li class="media">
                           <span>
                           	7.asdfsadfsdafasdfsafsadf
                           	asdfasdf
                           	asdfasdfdsa
                           	asdfasd
                           	</span>
                          
                          </li><li class="media">
                           <span>
                           	8.asdfsadfsdafasdfsafsadf
                           	asdfasdf
                           	asdfasdfdsa
                           	asdfasd
                           	</span>
                          
                          </li>
                        
                         </li><li class="media">
                           <a href="#" target="_blank"><span style="font-family:华文中宋; color:rgba(140, 181, 225, 1); ">退税技巧</span></a>
                            <a href="#" target="_blank"><span style="font-family:华文中宋; color:rgba(140, 181, 225, 1); ">个人投资</span></a>
                         		<a href="#" target="_blank"><span style="font-family:华文中宋; color:rgba(140, 181, 225, 1); ">房地产</span></a>
                         <a href="#" target="_blank"><span style="font-family:华文中宋; color:rgba(140, 181, 225, 1); ">市场</span></a>
                          </li>
                        
                         </li><li class="media">
                           <a href="#" target="_blank"><span style="font-family:华文中宋; color:rgba(140, 181, 225, 1); ">返回到所有博客文章</span></a>
                          
                          </li>
                        
                        
                        
                        </ul>
                       
                    </div>
                </div>
            </div>
        </div>
        <div class="col-lg-4">
            <div class="panel panel-default">
              <div class="panel-heading">置业</div>
              <div class="panel-body"> 
                <a href="/HousePurchasing.jsp?type=${j}&id=&{}" style="display:block;">置业指导</a><br>
                <a href="">博客</a>
              </div>
            </div>
            <div class="panel panel-default">
              <div class="panel-heading">分类浏览</div>
              <div class="panel-body"> 
                <select>
                    <option>请选择一个类别</option>
                    <option>类别一</option>
                    <option>类别二</option>
                    <option>类别三</option>
                </select>
              </div>
            </div>
            <div class="panel panel-default">
              <div class="panel-heading">最新博客文章</div>
              <div class="panel-body"> 
                <ul class="media-list">
                          <li class="media">
                             <div class="media-left">
                                <a href="#">
                                  <img class="media-object" src="..." alt="..." width="64px" height="58px">
                                </a>
                              </div>
                              <div class="media-body">
                                <h5 class="media-heading">李先生高等数学个人投资者</h5>
                                <p style="font-size:12px;">房产经纪人</p>
                                
                              </div>
                          </li>
                          <li class="media">
                             <div class="media-left">
                                <a href="#">
                                  <img class="media-object" src="..." alt="..." width="64px" height="58px">
                                </a>
                              </div>
                              <div class="media-body">
                                <h5 class="media-heading">李先生高等数学个人投资者</h5>
                                <p style="font-size:12px;">房产经纪人</p>
                                
                              </div>
                          </li>
                          <li class="media">
                             <div class="media-left">
                                <a href="#">
                                  <img class="media-object" src="..." alt="..."  width="64px" height="58px">
                                </a>
                              </div>
                              <div class="media-body">
                                <h5 class="media-heading">李先生高等数学个人投资者</h5>
                                <p style="font-size:12px;">房产经纪人</p>
                                
                              </div>
                          </li>
                        </ul>
              </div>
            </div>
            <div class="panel panel-default">
              <div class="panel-heading">置业指导</div>
              <div class="panel-body"> 
                <ul class="media-list">
                          <li class="media">
                             <div class="media-left">
                                <a href="#">
                                  <img class="media-object" src="..." alt="..."  width="64px" height="58px">
                                </a>
                              </div>
                              <div class="media-body">
                                <h5 class="media-heading">李先生高等数学个人投资者</h5>
                                <p style="font-size:12px;">房产经纪人</p>
                                
                              </div>
                          </li>
                          <li class="media">
                             <div class="media-left">
                                <a href="#">
                                  <img class="media-object" src="..." alt="..."  width="64px" height="58px">
                                </a>
                              </div>
                              <div class="media-body">
                                <h5 class="media-heading">李先生高等数学个人投资者</h5>
                                <p style="font-size:12px;">房产经纪人</p>
                                
                              </div>
                          </li>
                          <li class="media">
                             <div class="media-left">
                                <a href="#">
                                  <img class="media-object" src="..." alt="..."  width="64px" height="58px">
                                </a>
                              </div>
                              <div class="media-body">
                                <h5 class="media-heading">李先生高等数学个人投资者</h5>
                                <p style="font-size:12px;">房产经纪人</p>
                                
                              </div>
                          </li>
                        </ul>
              </div>
            </div>
        </div>
        
    </div>
   
   


   <jsp:include page="foot.jsp" />
   
</body>

</html>