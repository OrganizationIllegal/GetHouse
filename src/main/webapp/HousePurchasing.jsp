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
<body style="padding-top: 105px;">
 <jsp:include page="head.jsp" />
	<div class="container">
        <div class="row" style="height:30px;background-color:#4B0082;">
            <div class="col-lg-1"></div>
            <div class="col-lg-2" style="margin:0 auto;height:100%;line-height:30px;color:white;">博客   置业指导</div>
        </div>
        <div class="row" style="height:70px;border:1px solid #FFE4E1;">
            <div class="col-lg-1"></div>
            <div class="col-lg-2" style="font-size:24px;line-height:70px;height:100%;font-weight:bold;">置业指导</div>
        </div>
        <div class="row" style="margin-top:20px;">
            <div class="col-lg-1"></div>
            <div class="col-lg-7">
                <div class="row">
                    <div class="panel panel-default">
                      <div class="panel-heading">1-11的27篇文章</div>
                      <div class="panel-body">
                        <ul class="media-list">
                          <li class="media">
                             <div class="media-left">
                                <a href="#">
                                  <img class="media-object" src="..." alt="..." width="180px" height="140px">
                                </a>
                              </div>
                              <div class="media-body">
                                <h4 class="media-heading">李先生高等数学个人投资者</h4>
                                <p style="font-size:12px;">房产经纪人</p>
                                <p style="font-size:120x;">房产经纪人房产经纪人房产经纪人房产经纪人房产经纪人房产经纪人房产经纪人</p>
                                <a href="">全文></a>
                              </div>
                          </li>
                          <li class="media">
                             <div class="media-left">
                                <a href="#">
                                  <img class="media-object" src="..." alt="..." width="180px" height="140px">
                                </a>
                              </div>
                              <div class="media-body">
                                <h4 class="media-heading">李先生高等数学个人投资者</h4>
                                <p style="font-size:12px;">房产经纪人</p>
                                <p style="font-size:120x;">房产经纪人房产经纪人房产经纪人房产经纪人房产经纪人房产经纪人房产经纪人</p>
                                <a href="">全文></a>
                              </div>
                          </li>
                          <li class="media">
                             <div class="media-left">
                                <a href="#">
                                  <img class="media-object" src="..." alt="..." width="180px" height="140px">
                                </a>
                              </div>
                              <div class="media-body">
                                <h4 class="media-heading">李先生高等数学个人投资者</h4>
                                <p style="font-size:12px;">房产经纪人</p>
                                <p style="font-size:120x;">房产经纪人房产经纪人房产经纪人房产经纪人房产经纪人房产经纪人房产经纪人</p>
                                <a href="">全文></a>
                              </div>
                          </li>
                          <li class="media">
                             <div class="media-left">
                                <a href="#">
                                  <img class="media-object" src="..." alt="..." width="180px" height="140px">
                                </a>
                              </div>
                              <div class="media-body">
                                <h4 class="media-heading">李先生高等数学个人投资者</h4>
                                <p style="font-size:12px;">房产经纪人</p>
                                <p style="font-size:120x;">房产经纪人房产经纪人房产经纪人房产经纪人房产经纪人房产经纪人房产经纪人</p>
                                <a href="">全文></a>
                              </div>
                          </li>
                          <li class="media">
                             <div class="media-left">
                                <a href="#">
                                  <img class="media-object" src="..." alt="..." width="180px" height="140px">
                                </a>
                              </div>
                              <div class="media-body">
                                <h4 class="media-heading">李先生高等数学个人投资者</h4>
                                <p style="font-size:12px;">房产经纪人</p>
                                <p style="font-size:120x;">房产经纪人房产经纪人房产经纪人房产经纪人房产经纪人房产经纪人房产经纪人</p>
                                <a href="">全文></a>
                              </div>
                          </li>
                          <li class="media">
                             <div class="media-left">
                                <a href="#">
                                  <img class="media-object" src="..." alt="..." width="180px" height="140px">
                                </a>
                              </div>
                              <div class="media-body">
                                <h4 class="media-heading">李先生高等数学个人投资者</h4>
                                <p style="font-size:12px;">房产经纪人</p>
                                <p style="font-size:120x;">房产经纪人房产经纪人房产经纪人房产经纪人房产经纪人房产经纪人房产经纪人</p>
                                <a href="">全文></a>
                              </div>
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
                <a href="" style="display:block;">置业指导</a><br>
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
    <div class="row" style="height:200px;background-color:#4B0082;vertical-align:middle;text-align:center;position:relative;">
        <div style="left:40%;top:40%;position:absolute;">
            <font style="font-size:20px;font-weight:bold;color:#FFFFFF;">为您提供最好的海外购房服务</font><br>
            <button class="buttton">注册</button>
        </div>
    </div>
   


   <jsp:include page="foot.jsp" />
   
</body>

</html>