package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class bingMap_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=gb2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("   <title>HouseSale</title>\r\n");
      out.write("   <link href=\"/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("   <script src=\"/js/jquery.min.js\"></script>\r\n");
      out.write("   <script src=\"/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("   <link href=\"/css/index.css\" rel=\"stylesheet\">\r\n");
      out.write("   <script type=\"text/javascript\" src=\"http://ecn.dev.virtualearth.net/mapcontrol/mapcontrol.ashx?v=7.0\"></script> \r\n");
      out.write("   <script src=\"/js/bingMap.js\"></script>\r\n");
      out.write("   <style type=\"text/css\">\r\n");
      out.write(".xian{ border-bottom-width: 1px;\r\n");
      out.write("       border-bottom-style: solid;\r\n");
      out.write("       border-bottom-color: rgb(204, 204, 204);\r\n");
      out.write("       height:1px;}\r\n");
      out.write(" .right{\r\n");
      out.write("      float:right;\r\n");
      out.write(" }\r\n");
      out.write(" .left{\r\n");
      out.write(" float:left;\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write(" .title{\r\n");
      out.write(" width:23%;\r\n");
      out.write(" height:auto;\r\n");
      out.write(" background:rgb(204,204,204);\r\n");
      out.write(" padding:5px 10px 5px 10px ;\r\n");
      out.write(" }\r\n");
      out.write(" #title{\r\n");
      out.write(" border-radius:4px;\r\n");
      out.write(" border-top-right-radius:4px;\r\n");
      out.write(" border-top-left-radius:4px;\r\n");
      out.write(" }\r\n");
      out.write(" .navbar-header a{color:LightSlateGray;}\r\n");
      out.write("\t   .navbar-header a:visited{color:blue;text-decoration:none;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"padding-top: 120px;\" onload=\"getMap();\">\r\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\r\n");
      out.write(" <div class=\"container\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write(" <div class=\"col-md-4\">\r\n");
      out.write("  <div id=\"houselist\" >\r\n");
      out.write("       <div id=\"title\" style=\"background:rgb(204,204,204);height:30px;\">\r\n");
      out.write("          <!--<ul class=\"nav navbar-nav\">\r\n");
      out.write("             <li style=\"padding:5 10 ;\">房屋列表</li>\r\n");
      out.write("             <li>价格从低到高</li>\r\n");
      out.write("             <li>价格从高到低</li>\r\n");
      out.write("          </ul>-->\r\n");
      out.write("         <!-- <p>\r\n");
      out.write("          <span class=\"left\">房屋类型</span>\r\n");
      out.write("          <span>价格从低到高</span>\r\n");
      out.write("          <span class=\"right\">价格从高到低</span>\r\n");
      out.write("          <p/>-->\r\n");
      out.write("          <table>\r\n");
      out.write("          <tr>\r\n");
      out.write("          <td  width=\"33%\">房屋类型</td>\r\n");
      out.write("          <td  width=\"33%\">价格从低到高</td>\r\n");
      out.write("          <td  width=\"33%\">价格从高到低</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          </table>\r\n");
      out.write("          <!-- <div class=\"col-md-3\" >\r\n");
      out.write("      \t<ul class=\"navbar-header\">\r\n");
      out.write("       \t\t\t<a href=\"#\">首页</a>\r\n");
      out.write("       \t\t\t<a>&nbsp|&nbsp</a>\r\n");
      out.write("       \t\t\t<a href=\"#\">海外购房</a>\r\n");
      out.write("       \t\t\t<a>&nbsp|&nbsp</a>\r\n");
      out.write("       \t\t\t<a href=\"#\">购房返现</a>\r\n");
      out.write("       \t\t\t<a>&nbsp|&nbsp</a>\r\n");
      out.write("       \t\t</ul>\r\n");
      out.write("       </div>-->\r\n");
      out.write("       </div>\r\n");
      out.write("       <div id=\"list\">\r\n");
      out.write("           <table>\r\n");
      out.write("            <tbody>\r\n");
      out.write("              <!--the first item sstart-->\r\n");
      out.write("               <tr><td>项目地址：澳洲产阳泉开来</td></tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("                <td><img src=\"images/house1.jpg\"></td>\r\n");
      out.write("                <td width=\"25px\"></td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <p><span>澳大利亚房产</span></p>\r\n");
      out.write("                    <p><span>项目价格</span><span>&nbsp&nbsp</span><span class=\"right\">$550,000</span> </p>\r\n");
      out.write("                    <p><span>项目面积</span><span>&nbsp&nbsp</span><span class=\"right\">58-119</span></p>\r\n");
      out.write("                    <p><span>可售套数</span><span>&nbsp&nbsp</span><span class=\"right\">47</span></p>\r\n");
      out.write("                    <p><span>平均单价</span><span>&nbsp&nbsp</span><span class=\"right\">$550,000</span></p>\r\n");
      out.write("                </td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("               <td class=\"xian\" colspan=\"3\"></td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <!--the first item end-->\r\n");
      out.write("               <!--the second item start-->\r\n");
      out.write("                <tr><td>项目地址：澳洲产阳泉开来</td></tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("                <td><img src=\"images/house1.jpg\"></td>\r\n");
      out.write("                <td width=\"25px\"></td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <p><span>澳大利亚房产</span></p>\r\n");
      out.write("                    <p><span>项目价格</span><span class=\"right\">$550,000</span> </p>\r\n");
      out.write("                    <p><span>项目面积</span><span class=\"right\">58-119</span></p>\r\n");
      out.write("                    <p><span>可售套数</span><span class=\"right\">47</span></p>\r\n");
      out.write("                    <p><span>平均单价</span><span class=\"right\">$550,000</span></p>\r\n");
      out.write("                </td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr><td class=\"xian\" colspan=\"3\"></td></tr>\r\n");
      out.write("               <!--the second item end-->\r\n");
      out.write("           </tbody>\r\n");
      out.write("          </table>\r\n");
      out.write("       </div>\r\n");
      out.write("   </div>\r\n");
      out.write(" </div>\r\n");
      out.write("<div class=\"col-md-8\">\r\n");
      out.write(" <nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("      <div>\r\n");
      out.write("      <form class=\"navbar-form navbar-left\" role=\"search\">\r\n");
      out.write("         <div class=\"form-group\">\r\n");
      out.write("            <input id=\"txtQuery\" type=\"text\" class=\"form-control\" placeholder=\"coffee in Seattle\">\r\n");
      out.write("         </div>\r\n");
      out.write("         <button type=\"button\" class=\"btn btn-default\" onclick=\"LoadSearchModule()\">Search</button>\r\n");
      out.write("      </form>    \r\n");
      out.write("      </div>\r\n");
      out.write("\t<div class=\"collapse navbar-collapse\" id=\"myCollapse\">\r\n");
      out.write("      <ul class=\"nav navbar-nav\">\r\n");
      out.write("         <li class=\"dropdown\">\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("               房屋类型 \r\n");
      out.write("               <b class=\"caret\"></b>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("               <li><a href=\"#\">一居室</a></li>\r\n");
      out.write("               <li><a href=\"#\">两居室</a></li>\r\n");
      out.write("               <li><a href=\"#\">海景房</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("         </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("\t   <ul class=\"nav navbar-nav\">\r\n");
      out.write("         <li class=\"dropdown\">\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("               价格范围 \r\n");
      out.write("               <b class=\"caret\"></b>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("               <li><a href=\"#\">1000-2000</a></li>\r\n");
      out.write("               <li><a href=\"#\">3000-4000</a></li>\r\n");
      out.write("               <li><a href=\"#\">5000-6000</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("         </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("\t   <ul class=\"nav navbar-nav\">\r\n");
      out.write("         <li class=\"dropdown\">\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("               交房时间 \r\n");
      out.write("               <b class=\"caret\"></b>\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("               <li><a href=\"#\">四月底</a></li>\r\n");
      out.write("               <li><a href=\"#\">五月底</a></li>\r\n");
      out.write("               <li><a href=\"#\">六月底</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("         </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("   </div>\r\n");
      out.write("   </nav>\r\n");
      out.write("   <div id='myMap' style=\"position:relative; width:700px; height:600px;\"></div>\r\n");
      out.write("  </div>\r\n");
      out.write("     \r\n");
      out.write("   \r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "foot.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
