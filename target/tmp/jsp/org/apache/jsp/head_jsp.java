package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class head_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</head>\r\n");
      out.write("<body style=\"padding-top: 120px;\">\r\n");
      out.write(" <nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("    <div class=\"row\" style=\"background-color:rgba(19, 51, 89, 1);\">\r\n");
      out.write("\t  <div class=\"col-md-1\"></div>\r\n");
      out.write("      <div class=\"col-md-6\" >\r\n");
      out.write("      <span style=\"font-size:20px;color:yellow;style=\"text-align:bottom;\">海豚会(haitunhui,cn)</span>\r\n");
      out.write("      <span style=\"font-size:15px;color:white;\">由经理人联合中国商业领袖共同发起</span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-2\" >\r\n");
      out.write("       <span class=\"glyphicon glyphicon-phone-alt\" style=\"font-size:20px;color:yellow;\"></span>\r\n");
      out.write("       <span style=\"font-size:20px;color:yellow;\">400-810-9685</span>\r\n");
      out.write("       </div>     \r\n");
      out.write("       <div class=\"col-md-2\">      \r\n");
      out.write("       \t\t<ul class=\"navbar-header\">\r\n");
      out.write("       \t\t\t<a class=\"glyphicon glyphicon-user\" style=\"font-size:20px;color:white;\"></a>\r\n");
      out.write("       \t\t\t<a href=\"#\" style=\"color:white;\">会员登录</a>\r\n");
      out.write("       \t\t\t<a style=\"color:white;\">&nbsp|&nbsp</a>\r\n");
      out.write("       \t\t\t<a href=\"#\" style=\"color:yellow;\">注册</a>\r\n");
      out.write("       \t\t</ul>\r\n");
      out.write("       </div>\r\n");
      out.write("       <div class=\"col-md-1\"></div>\r\n");
      out.write("       </div>\r\n");
      out.write("   <div class=\"row\"style=\"background-color:white;padding-top:30px;\">\r\n");
      out.write("\t\t<div class=\"col-md-1\"></div>\r\n");
      out.write("\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t  <span style=\"font-size:20px;color:black;style=\"text-align:bottom;\">胜意行</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("       <div class=\"col-md-6\" >\r\n");
      out.write("      \t<ul class=\"navbar-header\">\r\n");
      out.write("       \t\t\t<a href=\"#\">首页</a>\r\n");
      out.write("       \t\t\t<a>&nbsp|&nbsp</a>\r\n");
      out.write("       \t\t\t<a href=\"#\">海外购房</a>\r\n");
      out.write("       \t\t\t<a>&nbsp|&nbsp</a>\r\n");
      out.write("       \t\t\t<a href=\"#\">购房返现</a>\r\n");
      out.write("       \t\t\t<a>&nbsp|&nbsp</a>\r\n");
      out.write("       \t\t\t<a href=\"#\">海外贷款</a>\r\n");
      out.write("       \t\t\t<a>&nbsp|&nbsp</a>\r\n");
      out.write("       \t\t\t<a href=\"#\">服务团队</a>\r\n");
      out.write("       \t\t\t<a>&nbsp|&nbsp</a>\r\n");
      out.write("       \t\t\t<a href=\"#\">置业指导</a>\r\n");
      out.write("       \t\t\t<a>&nbsp|&nbsp</a>\r\n");
      out.write("       \t\t\t<a href=\"#\">海外新闻</a>\r\n");
      out.write("       \t\t\t<a>&nbsp|&nbsp</a>\r\n");
      out.write("       \t\t\t<a href=\"#\">关于我们</a>\r\n");
      out.write("       \t\t</ul>\r\n");
      out.write("       </div>  \r\n");
      out.write("       <div class=\"col-md-2\" >\t\r\n");
      out.write("       \t<ul class=\"navbar-header\">\r\n");
      out.write("       \t<a class=\"glyphicon glyphicon-list-alt\" style=\"font-size:20px;color:LightSlateGray ;\"></a>\r\n");
      out.write("       \t\t<a href=\"#\"style=\"font-size:20px;color:LightSlateGray ;\">Blog</a>\r\n");
      out.write("       \t</ul>\r\n");
      out.write("       \t</div>\r\n");
      out.write("       <div class=\"col-md-1\"></div>\r\n");
      out.write("   </div>\r\n");
      out.write("</nav>\r\n");
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
