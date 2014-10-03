package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style4 {color: #B17725; font-weight: bold; font-size: 18px; }\r\n");
      out.write("a:link {\r\n");
      out.write("\tcolor: #CC6633;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:visited {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("}\r\n");
      out.write("a:hover {\r\n");
      out.write("\ttext-decoration: underline;\r\n");
      out.write("\tcolor: #CCCC99;\r\n");
      out.write("}\r\n");
      out.write("a:active {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: #ECE9D8;\r\n");
      out.write("}\r\n");
      out.write(".style5 {\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<table width=\"100%\" height=\"166\" border=\"0\" >\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"138\" colspan=\"6\" bordercolor=\"#44241E\" bgcolor=\"#4E2B21\"><div align=\"center\"><img src=\"homepage-images[1].jpg\" width=\"833\" height=\"136\" /></div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"16%\" height=\"22\" bordercolor=\"#44241E\" bgcolor=\"#4E2B21\"><div align=\"center\" class=\"style4\"></div></td>\r\n");
      out.write("    <td width=\"14%\" bordercolor=\"#4E3A34\" bgcolor=\"#4E2B21\"><div align=\"center\" class=\"style5\">\r\n");
      out.write("      <div align=\"center\"><a href=\"index.jsp\">Home</a></div>\r\n");
      out.write("    </div></td>\r\n");
      out.write("    <td width=\"14%\" bordercolor=\"#4E3A34\" bgcolor=\"#4E2B21\"><div align=\"center\" class=\"style4\"><a href=\"AboutUs.jsp\">About Us </a></div></td>\r\n");
      out.write("    <td width=\"16%\" bordercolor=\"#4E3A34\" bgcolor=\"#4E2B21\"><div align=\"center\" class=\"style4\"><a href=\"ContactUs.jsp\">Contact Us </a></div></td>\r\n");
      out.write("    <td width=\"18%\" bordercolor=\"#4E3A34\" bgcolor=\"#4E2B21\"><div align=\"center\" class=\"style4\"><a href=\"Registration.jsp\">New Registration</a></div></td>\r\n");
      out.write("    <td width=\"22%\" bordercolor=\"#4E3A34\" bgcolor=\"#4E2B21\"><div align=\"center\" class=\"style4\"><a href=\"CompanyReg.jsp\">Company Registration</a></div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
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
