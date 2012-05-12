package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RealLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Login</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("body {\n");
      out.write("\tbackground-repeat: repeat-y;\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tfont-family: \"Arial Black\", Gadget, sans-serif;\n");
      out.write("\tfont-weight: normal;\n");
      out.write("\tfont-variant: normal;\n");
      out.write("\tcolor: #F60;\n");
      out.write("\tbottom: auto;\n");
      out.write("\ttext-align: left;\n");
      out.write("}\n");
      out.write("#apDiv1 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\twidth:509px;\n");
      out.write("\theight:417px;\n");
      out.write("\tz-index:1;\n");
      out.write("\tleft: 136px;\n");
      out.write("\ttop: 42px;\n");
      out.write("\ttext-align: left;\n");
      out.write("}\n");
      out.write("#apDiv2 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\twidth:869px;\n");
      out.write("\theight:571px;\n");
      out.write("\tz-index:2;\n");
      out.write("\tleft: 138px;\n");
      out.write("\ttop: 43px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tcolor: #FC0;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("    <script language=\"javascript\">\n");
      out.write("        function fsubmit(obj)\n");
      out.write("        {\n");
      out.write("            obj.submit();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("<body background=\"resource/5252423_173600895562_2.png\" leftmargin=\"0\">\n");
      out.write("<div id=\"apDiv1\"><img src=\"resource/login_div.png\" width=\"870\" height=\"570\" /></div>\n");
      out.write("<div id=\"apDiv2\">\n");
      out.write("  <p>&nbsp;</p>\n");
      out.write("  <p>&nbsp;</p>\n");
      out.write("  <p>&nbsp;</p>\n");
      out.write("  <p><img src=\"resource/logo.png\" width=\"423\" height=\"67\" /></p>\n");
      out.write("  <form id=\"login_form\" method=\"post\" action=\"Login.action\">\n");
      out.write("  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    <label for=\"textfield\">登录邮箱：</label>\n");
      out.write("    <input name=\"username\" type=\"text\" size=\"20\" />\n");
      out.write("  </p>\n");
      out.write("  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    <label for=\"textfield2\">密   码：&nbsp;&nbsp;&nbsp;&nbsp;</label>\n");
      out.write("    <input name=\"password\" type=\"password\"  size=\"20\" />\n");
      out.write("  </p>\n");
      out.write("  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"resource/login3.png\" width=\"165\" height=\"59\" onclick=\"javascript:fsubmit(document.login_form);\"/></p>\n");
      out.write("  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"resource/login2.png\" width=\"291\" height=\"59\" /></p>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
