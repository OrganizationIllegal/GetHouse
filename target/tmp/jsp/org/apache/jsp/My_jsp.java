package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class My_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<div class=\"ad_position\" style=\"height:205px\";>\r\n");
      out.write("\t\r\n");
      out.write("\t<ul class=\"nav nav-tabs\">\r\n");
      out.write("      <li><a href=\"#home\" >Home</a></li>\r\n");
      out.write("      <li><a href=\"#profile\" >Profile</a></li>\r\n");
      out.write("      <li><a href=\"#messages\" >Messages</a></li>\r\n");
      out.write("      <li><a href=\"#settings\" >Settings</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      \r\n");
      out.write("   \r\n");
      out.write("\t<div class=\"limit\" >\r\n");
      out.write("\t\t<div style=\"float:left;width:527px;display:inline;\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<table class=\"ad_left_big\" width=\"527\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"margin-top: 0px;\">\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t<tr><td><img src=\"images/a.jpg\" width=\"527\" height=\"163\" /></a></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td><video id=\"example_video_1\" class=\"video-js vjs-default-skin\" controls preload=\"none\"  data-setup=\"{}\"width=\"527\" height=\"163\" >\r\n");
      out.write("    \t\t\t\t\t\t\t<source src=\"s.mp4\" type='video/mp4'/>\r\n");
      out.write("    \t\t\t\t\t\t\t<track kind=\"captions\" src=\"demo.captions.vtt\" srclang=\"en\" label=\"English\"></track><!-- Tracks need an ending tag thanks to IE9 -->\r\n");
      out.write("    \t\t\t\t\t\t\t<track kind=\"subtitles\" src=\"demo.captions.vtt\" srclang=\"en\" label=\"English\"></track><!-- Tracks need an ending tag thanks to IE9 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</video>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr><td><img src=\"images/c.jpg\" width=\"527\" height=\"163\" /></a></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td><img src=\"images/d.jpg\" width=\"527\" height=\"163\" /></a></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td><img src=\"images/e.jpg\" width=\"527\" height=\"163\" /></a></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td><img src=\"images/f.jpg\" width=\"527\" height=\"163\" /></a></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td><img src=\"images/g.jpg\" width=\"527\" height=\"163\" /></a></td></tr>\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>  \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"ad_small_box\">\r\n");
      out.write("\t\t\t<div class=\"top_button off\"></div>\r\n");
      out.write("\t\t\t<div class=\"small_right_limit\">\r\n");
      out.write("\t\t\t\t<ul style=\"margin-top: 0px;\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t<li><img src=\"images/a.jpg\" /></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"images/b.jpg\" /></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"images/c.jpg\" /></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"images/d.jpg\" /></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"images/e.jpg\" /></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"images/f.jpg\" /></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"images/g.jpg\" /></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<div class=\"this_ad\" style=\"top:0px;\"><img src=\"images/this_ad.gif\" width=\"136\" height=\"47\" /></div>                    \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"bottom_button\"></div>            \t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</div>");
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
