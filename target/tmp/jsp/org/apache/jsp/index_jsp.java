package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   <link href=\"/css/index.css\" rel=\"stylesheet\">  \r\n");
      out.write("   <script src=\"http://echarts.baidu.com/build/dist/echarts-all.js\"></script>\r\n");
      out.write("   <script type=\"text/javascript\" src=\"http://ecn.dev.virtualearth.net/mapcontrol/mapcontrol.ashx?v=7.0\"></script>\r\n");
      out.write("   <script src=\"/js/bingMap.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"padding-top: 105px;background-color:rgba(233, 243, 248, 1);\" onload=\"getMap();\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\r\n");
      out.write("<div class=\"container\" style=\"\">\r\n");
      out.write("<div style=\"margin-top:20px;background-color:white;\">\r\n");
      out.write("<ul class=\"nav nav-tabs\" id=\"MyTabs\">\r\n");
      out.write("      <li><a href=\"#home\" data-toggle=\"tab\">Home</a></li>\r\n");
      out.write("      <li><a href=\"#profile\" data-toggle=\"tab\">Profile</a></li>\r\n");
      out.write("      <li class=\"navbar-text navbar-right\">&nbsp;&nbsp;&nbsp;&nbsp;</li>\r\n");
      out.write("      <p class=\"navbar-text navbar-right\"><b>以总价50万澳币计算</b></p>\r\n");
      out.write("      <!-- <div class=\"col-md-2 col-md-pull-5\"><p><b>以总价50万澳币计算</b></p></div> -->\r\n");
      out.write("      <!-- <li class=\"pull-right\"><p><b>以总价50万澳币计算</b></p></li> -->\r\n");
      out.write("      <!-- <li class=\"disabled\"><a href=\"#profile\" data-toggle=\"tab\">Web Service</a></li> -->\r\n");
      out.write("      <!--<li class=\"navbar-right\">&nbsp;&nbsp;&nbsp;&nbsp;</li> \r\n");
      out.write("      <li class=\"\"><p><b>以总价50万澳币计算</b></p></li>\r\n");
      out.write("      <li class=\"navbar-right\">&nbsp;&nbsp;&nbsp;&nbsp;</li> -->\r\n");
      out.write("    </ul>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"tab-content\">\r\n");
      out.write("      <div class=\"tab-pane active\" id=\"home\">\r\n");
      out.write("      \t<div style=\"padding-top:10px;padding-bottom:10px;\">\r\n");
      out.write("      \t\t<div style=\"float:left;margin-right:20px;margin-left:20px;\">\r\n");
      out.write("      \t\t\t<p>估计总购房税费</p>\r\n");
      out.write("      \t\t</div>\r\n");
      out.write("      \t\t<div>\r\n");
      out.write("      \t\t\t<select id=\"MySelect\">\r\n");
      out.write("\t\t\t\t<option>约5万澳元</option>\r\n");
      out.write("\t\t\t\t<option>约15万澳元</option>\r\n");
      out.write("\t\t\t\t<option>约115万澳元</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("      \t\t</div>\r\n");
      out.write("      \t</div>\r\n");
      out.write("      \t<div>\r\n");
      out.write("      \t\t<div id=\"GouFang_pie\" style=\"height:200px\"></div>\r\n");
      out.write("      \t</div>\r\n");
      out.write("      </div> \r\n");
      out.write("      <div class=\"tab-pane\" id=\"profile\">\r\n");
      out.write("      \t<div style=\"padding-top:10px;padding-bottom:10px;\">\r\n");
      out.write("      \t\t<div style=\"float:left;margin-right:20px;margin-left:20px;\">\r\n");
      out.write("      \t\t\t<p>预估每年持有成本</p>\r\n");
      out.write("      \t\t</div>\r\n");
      out.write("      \t\t<div style=\"float:left;\">\r\n");
      out.write("      \t\t\t<select id=\"MySelect1\">\r\n");
      out.write("\t\t\t\t<option value='5'>约5万澳元</option>\r\n");
      out.write("\t\t\t\t<option value='15'>约15万澳元</option>\r\n");
      out.write("\t\t\t\t<option value='115'>约115万澳元</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("      \t\t</div>\r\n");
      out.write("      \t\t<div style=\"margin-left:20px;float:left;\">\r\n");
      out.write("      \t\t\t<p>税费范围</p>\r\n");
      out.write("      \t\t</div>\r\n");
      out.write("      \t\t<div style=\"margin-left:20px;float:left;\">\r\n");
      out.write("      \t\t\t<p>约1万澳元</p>\r\n");
      out.write("      \t\t</div>\r\n");
      out.write("      \t\t<div style=\"margin-left:20px;float:left;\">\r\n");
      out.write("      \t\t\t<p>约7万澳元</p>\r\n");
      out.write("      \t\t</div>\r\n");
      out.write("      \t</div>\r\n");
      out.write("      \t<div>\r\n");
      out.write("      \t\t<div id=\"ChengBen_pie\" style=\"height:200px\">\r\n");
      out.write("      \t\t\t</div>\r\n");
      out.write("      \t</div>\r\n");
      out.write("      </div> \r\n");
      out.write("      \r\n");
      out.write("  \t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div  style=\"margin-top:20px;background-color:white;\">\r\n");
      out.write(" <ul class=\"nav nav-tabs nav-justified\" id=\"MyTabs\">\r\n");
      out.write("      <li><a href=\"#price\" data-toggle=\"tab\">South MelBourne区域中位数房价走势</a></li>\r\n");
      out.write("      <li><a href=\"#rent\" data-toggle=\"tab\">South MelBourne区域租金走势</a></li>\r\n");
      out.write("      <li><a href=\"#emptypercent\" data-toggle=\"tab\">South MelBourne区域空置率走势</a></li>\r\n");
      out.write("     <!-- <p class=\"navbar-text navbar-right\">Signed in as Mark Otto</p>-->\r\n");
      out.write("    </ul>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"tab-content\">\r\n");
      out.write("      <div class=\"tab-pane active\" id=\"price\">\r\n");
      out.write("      \t<div>\r\n");
      out.write("      \t\t<div id=\"price_line\" style=\"height:250px\"></div>\r\n");
      out.write("      \t</div>\r\n");
      out.write("      </div> \r\n");
      out.write("      <div class=\"tab-pane\" id=\"rent\">\r\n");
      out.write("      \t<div>\r\n");
      out.write("      \t\t<div id=\"rent_line\" style=\"height:250px\">\r\n");
      out.write("      \t\t\t</div>\r\n");
      out.write("      \t</div>\r\n");
      out.write("      </div> \r\n");
      out.write("      <div class=\"tab-pane\" id=\"emptypercent\">\r\n");
      out.write("      \t<div>\r\n");
      out.write("      \t\t<div id=\"emptypercent_line\" style=\"height:250px\">\r\n");
      out.write("      \t\t\t</div>\r\n");
      out.write("      \t</div>\r\n");
      out.write("      </div> \r\n");
      out.write("  \t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"margin-top:20px;background-color:white;\">\r\n");
      out.write("<div class=\"panel panel-default\">\r\n");
      out.write("\t  <div class=\"panel-heading\">South Melbourne区域家庭情况构成</div>\r\n");
      out.write("\t  <div class=\"panel-body\">\r\n");
      out.write("\t  \t<div id=\"zonefamily_pie\" style=\"height:200px\">\r\n");
      out.write("      \t</div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"margin-top:20px;background-color:white;\">\r\n");
      out.write("<div class=\"panel panel-default\">\r\n");
      out.write("\t  <div class=\"panel-heading\">项目位置</div>\r\n");
      out.write("\t  <div class=\"panel-body\">\r\n");
      out.write("\t  \t<div id=\"zonefamily_pie\" style=\"height:370px\">\r\n");
      out.write("\t  \t<div class=\"row\">\r\n");
      out.write("\t  \t<div class=\"col-md-6\">\r\n");
      out.write("\t  \t<div id='myMap' style=\"position:relative; width:550px; height:370px;\"></div>\r\n");
      out.write("\t  \t</div>\r\n");
      out.write("\t  \t<div class=\"col-md-6\"></div>\r\n");
      out.write("\t  \t <div><img src=\"images/streetside.png\"></div>\r\n");
      out.write("\t  \t</div>\r\n");
      out.write("      \t</div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"margin-top:20px;background-color:white;padding:40px 0px;\">\r\n");
      out.write("<div class=\"row\" style=\"height:200px;\">\r\n");
      out.write("<div class=\"col-md-2\"></div>\r\n");
      out.write(" <div class=\"col-md-2\" style=\"padding-left:70px;padding-right:0px;\">\r\n");
      out.write(" <div><img src=\"images/buy.png\"></div>\r\n");
      out.write(" <div style=\"color:#FF7F00;font-weight:900;font-size:28px;\">&nbsp;&nbsp;$561,000</div>\r\n");
      out.write(" </div>\r\n");
      out.write(" <div class=\"col-md-3\" style=\"padding-left:50px;width:340px;\">\r\n");
      out.write(" <div style=\"color:#000000;font-weight:900;font-size:16px;\">South Melbourne中位数公寓房价</div>\r\n");
      out.write(" <div style=\"color:#333;font-size:8px;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;价格最后更新日期为2015.02.02</div>\r\n");
      out.write(" </div>\r\n");
      out.write(" <div class=\"col-md-4\">\r\n");
      out.write(" <div><img src=\"images/rent.png\"></div>\r\n");
      out.write(" <div style=\"color:#27408B;font-weight:900;font-size:25px;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;560/周</div>\r\n");
      out.write(" </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<div class=\"col-md-5 col-md-offset-1\">\r\n");
      out.write(" <div class=\"btn-toolbar btn-group-lg\" role=\"toolbar\" aria-label=\"...\">\r\n");
      out.write("     <button type=\"button\" class=\"btn btn-inverse\" style=\"height:100px;width:140px;\">\r\n");
      out.write("     <div style=\"color:#FF7F00;font-weight:900;\">1居</div>\r\n");
      out.write("     <div style=\"color:#000000;font-weight:900;\">$409,000</div>\r\n");
      out.write("     </button>\r\n");
      out.write("      <button type=\"button\" class=\"btn btn-inverse\" style=\"height:100px;width:140px;\">\r\n");
      out.write("     <div style=\"color:#FF7F00;font-weight:900;\">2居</div>\r\n");
      out.write("     <div style=\"color:#000000;font-weight:900;\">$409,000</div>\r\n");
      out.write("     </button>\r\n");
      out.write("     <button type=\"button\" class=\"btn btn-inverse\" style=\"height:100px;width:140px;\">\r\n");
      out.write("     <div style=\"color:#FF7F00;font-weight:900;\">3居</div>\r\n");
      out.write("     <div style=\"color:#000000;font-weight:900;\">$409,000</div>\r\n");
      out.write("     </button>\r\n");
      out.write(" </div></div>\r\n");
      out.write(" <div class=\"col-md-6\">\r\n");
      out.write(" <div class=\"btn-toolbar btn-group-lg\" role=\"toolbar\" aria-label=\"...\">\r\n");
      out.write("     <button type=\"button\" class=\"btn btn-inverse\" style=\"height:100px;width:140px;\">\r\n");
      out.write("     <div style=\"color:#27408B;font-weight:900;\">1居</div>\r\n");
      out.write("     <div style=\"color:#000000;font-weight:900;\">$409</div>\r\n");
      out.write("     </button>\r\n");
      out.write("     <button type=\"button\" class=\"btn btn-inverse\" style=\"height:100px;width:140px;\">\r\n");
      out.write("     <div style=\"color:#27408B;font-weight:900;\">2居</div>\r\n");
      out.write("     <div style=\"color:#000000;font-weight:900;\">$409</div>\r\n");
      out.write("     </button>\r\n");
      out.write("     <button type=\"button\" class=\"btn btn-inverse\" style=\"height:100px;width:140px;\">\r\n");
      out.write("     <div style=\"color:#27408B;font-weight:900;\">3居</div>\r\n");
      out.write("     <div style=\"color:#000000;font-weight:900;\">$409</div>\r\n");
      out.write("     </button>\r\n");
      out.write(" </div></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "foot.jsp", out, false);
      out.write(" \r\n");
      out.write(" <script src=\"/js/familyStatus.js\"></script>\r\n");
      out.write(" <script src=\"/js/trend.js\"></script>\r\n");
      out.write(" <script src=\"/js/cost.js\"></script>\r\n");
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
