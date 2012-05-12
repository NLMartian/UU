package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class personalpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>personalhome</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("#apDiv1 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\twidth:1136px;\n");
      out.write("\theight:124px;\n");
      out.write("\tz-index:2;\n");
      out.write("\tleft: 9px;\n");
      out.write("\ttop: 15px;\n");
      out.write("}\n");
      out.write("#apDiv2 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\twidth:260px;\n");
      out.write("\theight:606px;\n");
      out.write("\tz-index:1;\n");
      out.write("\tleft: 11px;\n");
      out.write("\ttop: 27px;\n");
      out.write("}\n");
      out.write("#apDiv3 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\twidth:313px;\n");
      out.write("\theight:248px;\n");
      out.write("\tz-index:1;\n");
      out.write("\tleft: 833px;\n");
      out.write("\ttop: 37px;\n");
      out.write("}\n");
      out.write("#apDiv4 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\twidth:559px;\n");
      out.write("\theight:34px;\n");
      out.write("\tz-index:3;\n");
      out.write("\tleft: 273px;\n");
      out.write("\ttop: 170px;\n");
      out.write("}\n");
      out.write("#apDiv5 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\twidth:551px;\n");
      out.write("\theight:45px;\n");
      out.write("\tz-index:4;\n");
      out.write("\tleft: 284px;\n");
      out.write("\ttop: 187px;\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\n");
      out.write("\tcolor: #333;\n");
      out.write("}\n");
      out.write("#apDiv6 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\twidth:128px;\n");
      out.write("\theight:129px;\n");
      out.write("\tz-index:1;\n");
      out.write("\tleft: 81px;\n");
      out.write("\ttop: 21px;\n");
      out.write("}\n");
      out.write("#apDiv7 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\twidth:557px;\n");
      out.write("\theight:388px;\n");
      out.write("\tz-index:5;\n");
      out.write("\tleft: 273px;\n");
      out.write("\ttop: 243px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script src=\"resource/SpryAssets/SpryAccordion.js\" type=\"text/javascript\"></script>\n");
      out.write("<link href=\"resource/SpryAssets/SpryAccordion.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<style type=\"text/css\">\n");
      out.write("#apDiv8 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\twidth:314px;\n");
      out.write("\theight:241px;\n");
      out.write("\tz-index:6;\n");
      out.write("\tleft: 834px;\n");
      out.write("\ttop: 296px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div id=\"apDiv1\"><img src=\"resource/image001.png\" width=\"1137\" height=\"195\" /></div>\n");
      out.write("<div id=\"apDiv2\"><img src=\"resource/image002.png\" width=\"259\" height=\"604\" /></div>\n");
      out.write("<div id=\"apDiv3\"><img src=\"resource/image005.png\" width=\"313\" height=\"255\" /></div>\n");
      out.write("<div id=\"apDiv4\"><img src=\"resource/head.png\" width=\"558\" height=\"70\" /></div>\n");
      out.write("<div id=\"apDiv5\"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;日&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;志&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;状&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;态&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;论&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;相&nbsp;&nbsp;&nbsp;&nbsp;册&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>\n");
      out.write("<div id=\"apDiv7\">\n");
      out.write("  <div id=\"Accordion1\" class=\"Accordion\" tabindex=\"0\">\n");
      out.write("    <div class=\"AccordionPanel\">\n");
      out.write("      <div class=\"AccordionPanelTab\">日志动态</div>\n");
      out.write("      <div class=\"AccordionPanelContent\">内容预览1</div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"AccordionPanel\">\n");
      out.write("      <div class=\"AccordionPanelTab\">新状态</div>\n");
      out.write("      <div class=\"AccordionPanelContent\">内容预览2</div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"AccordionPanel\">\n");
      out.write("      <div class=\"AccordionPanelTab\">相册动态</div>\n");
      out.write("      <div class=\"AccordionPanelContent\">内容预览3</div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div id=\"apDiv8\">\n");
      out.write("  <div id=\"Accordion2\" class=\"Accordion\" tabindex=\"0\">\n");
      out.write("    <div class=\"AccordionPanel\">\n");
      out.write("      <div class=\"AccordionPanelTab\">最新评论</div>\n");
      out.write("      <div class=\"AccordionPanelContent\">评论内容</div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("var Accordion1 = new Spry.Widget.Accordion(\"Accordion1\");\n");
      out.write("var Accordion2 = new Spry.Widget.Accordion(\"Accordion2\");\n");
      out.write("</script>\n");
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
