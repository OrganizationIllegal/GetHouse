package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class foot_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   \r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"padding-top: 120px;\">\r\n");
      out.write("<div class=\"fooder\">\r\n");
      out.write("\t<div class=\"row\" style=\"padding-top:20px;\">\r\n");
      out.write("\t\t<div class=\"col-md-2\"></div>\r\n");
      out.write("\t\t<div class=\"col-md-2\" >\r\n");
      out.write("\t\t\t<span class=\"glyphicon glyphicon-phone-alt\" style=\"font-size:20px;color:white;valign:bottom;\"></spa>\r\n");
      out.write("       <span style=\"font-size:20px;color:white;\">海外优选</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-3\" >\r\n");
      out.write("\t\t\t<p style=\"font-size:20px;color:white;\">北京市朝阳区中海广场12层</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-3 style=\"color:white;\">\r\n");
      out.write("\t\t\t <p style=\"font-size:20px;color:white;\">联系电话：400-810-9685</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-2></div>\r\n");
      out.write("\t</div>\t\t\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<hr size=\"2\" width=\"1100\">\r\n");
      out.write("\t\t\t<div class=\"col-md-2\"></div>\r\n");
      out.write("\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t  <dl class=\"fore1\">\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a style=\"font-size:20px;color:white;target=\"_blank\" href=\"#\"\">Who we are</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a style=\"font-size:15px;color:white;\" target=\"_blank\" href=\"#\">联系我们</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a style=\"font-size:15px;color:white;\" target=\"_blank\" href=\"#\">加入我们</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a style=\"font-size:15px;color:white;\"target=\"_blank\" href=\"#\">关于我们</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a style=\"font-size:15px;color:white;\" target=\"_blank\" href=\"#\">新闻博客</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-1\"></div>\t\r\n");
      out.write("\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t  <dl class=\"fore1\">\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a style=\"font-size:20px;color:white;\" target=\"_blank\" href=\"#\">Who we do</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a style=\"font-size:15px;color:white;\" target=\"_blank\" href=\"#\">职业指导</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a style=\"font-size:15px;color:white;\" target=\"_blank\" href=\"#\">卖家服务</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a style=\"font-size:15px;color:white;\"target=\"_blank\" href=\"#\">现金返还</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a style=\"font-size:15px;color:white;\" target=\"_blank\" href=\"#\">贷款计算</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-1\"></div>\t\r\n");
      out.write("\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t  <dl class=\"fore1\">\r\n");
      out.write("\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a style=\"font-size:20px;color:white;\" target=\"_blank\" href=\"#\">Province</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a style=\"font-size:15px;color:white;\" target=\"_blank\" href=\"#\">墨尔本</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a style=\"font-size:15px;color:white;\" target=\"_blank\" href=\"#\">悉尼</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a style=\"font-size:15px;color:white;\"target=\"_blank\" href=\"#\">布里斯班</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a style=\"font-size:15px;color:white;\" target=\"_blank\" href=\"#\">阿德莱德</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<a style=\"font-size:15px;color:white;\" target=\"_blank\" href=\"#\">珀斯</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-2\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"row\" style=\"background-color:black;padding: 10px 0px;\">\r\n");
      out.write("\t\t    <div class=\"col-md-2\"></div>\r\n");
      out.write("\t\t    <div class=\"col-md-8\">\r\n");
      out.write("\t\t       <span style=\"font-size:12px;color:LightSlateGray;opacity:0.5;\">网络文化经营许可证京网文[2014]2148-348号   文明办网文明上网举报电话：4006561155 CopyRight@ 2014-2015 京东JD.com 版权所有</span>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t    <div class=\"col-md-2\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</body>\r\n");
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
