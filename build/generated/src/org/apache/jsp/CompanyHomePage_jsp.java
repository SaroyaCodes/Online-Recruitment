package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CompanyHomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

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
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>www.CarrierMithr.com</title>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".body {\r\n");
      out.write("        margin:0%;\r\n");
      out.write("}\r\n");
      out.write("a:link {\r\n");
      out.write("\tcolor: #000066;\r\n");
      out.write("\ttext-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("a:visited {\r\n");
      out.write("\ttext-decoration: underline;\r\n");
      out.write("\tcolor: #C0DCC0;\r\n");
      out.write("}\r\n");
      out.write("a:hover {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: #996666;\r\n");
      out.write("}\r\n");
      out.write("a:active {\r\n");
      out.write("\ttext-decoration: underline;\r\n");
      out.write("\tcolor: #FF9999;\r\n");
      out.write("}\r\n");
      out.write(".style1 {\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".style2 {font-size: 18px}\r\n");
      out.write(".style3 {color: #CBD1D9}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"margin:0px\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("        <table width=\"100%\" border=\"1\" bordercolor=\"#ECE9D8\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"107\" colspan=\"2\" bordercolor=\"#622D13\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "CompanyHeader.jsp", out, false);
      out.write("</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td valign=\"top\" height=\"512\" bordercolor=\"#622D13\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Companymenu.html", out, false);
      out.write("</td>\r\n");
      out.write("            <td width=\"961\" bordercolor=\"#622D13\" valign=\"top\"><img src=\"campus-training[1].jpg\" width=\"743\" height=\"356\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
