package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("    <title>www.CarrierMithr.com</title>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        <!--\r\n");
      out.write("        .body {\r\n");
      out.write("            margin:0%;\r\n");
      out.write("        }\r\n");
      out.write("        a:link {\r\n");
      out.write("            color: #003366;\r\n");
      out.write("            text-decoration: underline;\r\n");
      out.write("        }\r\n");
      out.write("        a:visited {\r\n");
      out.write("            text-decoration: underline;\r\n");
      out.write("            color: #660066;\r\n");
      out.write("        }\r\n");
      out.write("        a:hover {\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: #CC6633;\r\n");
      out.write("        }\r\n");
      out.write("        a:active {\r\n");
      out.write("            text-decoration: underline;\r\n");
      out.write("            color: #990033;\r\n");
      out.write("        }\r\n");
      out.write("        .style10 {\r\n");
      out.write("            color: #993300;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("        .style11 {\r\n");
      out.write("            color: #993333;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("        .style12 {color: #339933}\r\n");
      out.write("        body,td,th {\r\n");
      out.write("            color: #336633;\r\n");
      out.write("        }\r\n");
      out.write("        -->\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"margin:0px\">\r\n");
      out.write("<table width=\"100%\" height=\"492\" border=\"1\">\r\n");
      out.write("    <tr valign=\"top\">\r\n");
      out.write("        <td height=\"120\" colspan=\"2\" bgcolor=\"#624631\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <td width=\"1\" height=\"449\" valign=\"top\" bgcolor=\"#624631\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.html", out, false);
      out.write("</td>\r\n");
      out.write("    <td width=\"759\" valign=\"top\" bgcolor=\"#E8E1C7\">\r\n");
      out.write("        <div align=\"right\" >\r\n");
      out.write("            <p><img src=\"Login.jpg\" width=\"209\" height=\"166\"></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <form name=\"login\" method=\"post\" action=\"savelogindata.jsp\">\r\n");
      out.write("\r\n");
      out.write("            <div align=\"right\">\r\n");
      out.write("                <table width=\"219\" height=\"230\" border=\"1\" align=\"right\">\r\n");
      out.write("                    <tr valign=\"top\">\r\n");
      out.write("                        <td height=\"36\" bgcolor=\"#668CCC\"><p align=\"center\" class=\"style10\">Already a member???</p>            </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td width=\"209\" height=\"155\" bgcolor=\"#93C2E6\">\r\n");
      out.write("                            <div align=\"center\">\r\n");
      out.write("                                <p><strong>Enter Username </strong><br>\r\n");
      out.write("                                    <input name=\"username\" type=\"text\" id=\"username\" />\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p align=\"center\"><strong>Enter Password\r\n");
      out.write("                                    <input name=\"password\" type=\"password\" id=\"password\" />\r\n");
      out.write("                            </strong></p>\r\n");
      out.write("\r\n");
      out.write("                            <label></label>\r\n");
      out.write("                            <div align=\"center\">\r\n");
      out.write("                                <input type=\"submit\" name=\"Submit\" value=\"Login\" />\r\n");
      out.write("                        </div></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("        </div></form>\r\n");
      out.write("        <p align=\"right\">&nbsp;</p>\r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("    <p>&nbsp;</p>    </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
