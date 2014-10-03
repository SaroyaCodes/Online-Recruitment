package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class AdminCandidateDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("        <title>www.CarrierMithr.com</title>\r\n");
      out.write("\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            <!--\r\n");
      out.write("            .body {\r\n");
      out.write("                margin:0%;\r\n");
      out.write("            }\r\n");
      out.write("            a:link {\r\n");
      out.write("                color: #0066CC;\r\n");
      out.write("                text-decoration: underline;\r\n");
      out.write("            }\r\n");
      out.write("            a:visited {\r\n");
      out.write("                text-decoration: underline;\r\n");
      out.write("                color: #663399;\r\n");
      out.write("            }\r\n");
      out.write("            a:hover {\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                color: #996666;\r\n");
      out.write("            }\r\n");
      out.write("            a:active {\r\n");
      out.write("                text-decoration: underline;\r\n");
      out.write("                color: #FF9999;\r\n");
      out.write("            }\r\n");
      out.write("            .style5 {\r\n");
      out.write("                color: #006633;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("            }\r\n");
      out.write("            .style7 {color: #CC0000}\r\n");
      out.write("            .style8 {color: #000099}\r\n");
      out.write("            .style11 {color: #CC0000; font-weight: bold; }\r\n");
      out.write("            .style12 {\r\n");
      out.write("                color: #663399;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("            -->\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body style=\"margin:0px\">\r\n");
      out.write("        <table width=\"100%\" height=\"472\" border=\"1\" align=\"left\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td height=\"45\" colspan=\"2\" bgcolor=\"#666734\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "AdminHeader.html", out, false);
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"1%\" bgcolor=\"#666734\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Adminmenu.html", out, false);
      out.write("</td>\r\n");
      out.write("                <td bgcolor=\"#FFFFFF\" valign=\"top\"><table width=\"830\" height=\"109\" border=\"1\" align=\"left\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td height=\"31\" colspan=\"16\" bordercolor=\"#663300\" bgcolor=\"#99BBB7\" ><div align=\"center\" class=\"style8 style63 style5\">Candidate Details </div></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td width=\"89\" height=\"33\" bordercolor=\"#663300\" bgcolor=\"#99BBB7\" ><div align=\"center\"><span class=\"style11\">Username</span></div></td>\r\n");
      out.write("                            <td width=\"112\" bordercolor=\"#663300\" bgcolor=\"#99BBB7\"><div align=\"center\" class=\"style64 style7\"><strong> Name</strong></div></td>\r\n");
      out.write("                            <td width=\"104\" bordercolor=\"#663300\" bgcolor=\"#99BBB7\" ><div align=\"center\" class=\"style64 style7\"><strong>Address</strong></div></td>\r\n");
      out.write("                            <td width=\"106\" bordercolor=\"#663300\" bgcolor=\"#99BBB7\" ><div align=\"center\" class=\"style64 style7\"><strong>Phone</strong></div></td>\r\n");
      out.write("                            <td width=\"124\" bordercolor=\"#663300\" bgcolor=\"#99BBB7\" ><div align=\"center\" class=\"style64 style7\"><strong>Email_id</strong></div></td>\r\n");
      out.write("                            <td width=\"109\" bordercolor=\"#663300\" bgcolor=\"#99BBB7\" ><div align=\"center\" class=\"style64 style7\"><strong>Category</strong></div></td>\r\n");
      out.write("                            <td width=\"86\" bordercolor=\"#663300\" bgcolor=\"#99BBB7\" ><div align=\"center\" class=\"style64 style7\"><strong>Delete</strong></div></td>\r\n");
      out.write("                            <td width=\"71\" bordercolor=\"#663300\" bgcolor=\"#99BBB7\" ><div align=\"center\" class=\"style64 style7\"><strong>Resume</strong></div></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");

                                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                                    Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                                    try {
                                        Statement st = con.createStatement();
                                        ResultSet rs = st.executeQuery("select Username,Name,Address,Telephone,Email_id,Category from Details");
                                        String uid = "", name = "", address = "", phone = "", email = "", cat = "";
                                        while (rs.next()) {
                                            uid = rs.getString("Username");
                                            name = rs.getString("Name");
                                            address = rs.getString("Address");
                                            phone = rs.getString("Telephone");
                                            email = rs.getString("Email_id");
                                            cat = rs.getString("Category");




                        
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td height=\"35\" bordercolor=\"#663300\" bgcolor=\"#99BBB7\" ><div align=\"center\">");
      out.print(uid);
      out.write("</div></td>\r\n");
      out.write("                            <td bordercolor=\"#663300\" bgcolor=\"#99BBB7\" ><div align=\"center\">");
      out.print(name);
      out.write("</div></td>\r\n");
      out.write("                            <td bordercolor=\"#663300\" bgcolor=\"#99BBB7\" ><div align=\"center\">");
      out.print(address);
      out.write("</div></td>\r\n");
      out.write("                            <td bordercolor=\"#663300\" bgcolor=\"#99BBB7\" ><div align=\"center\">");
      out.print(phone);
      out.write("</div></td>\r\n");
      out.write("                            <td bordercolor=\"#663300\" bgcolor=\"#99BBB7\" ><div align=\"center\">");
      out.print(email);
      out.write("</div></td>\r\n");
      out.write("                            <td bordercolor=\"#663300\" bgcolor=\"#99BBB7\"><div align=\"center\">");
      out.print(cat);
      out.write("</div></td>\r\n");
      out.write("                            <td bordercolor=\"#663300\" bgcolor=\"#99BBB7\"><div align=\"center\"><a href=\"Delete.jsp?uid=");
      out.print(uid);
      out.write("\" class=\"style12\">Delete</a></div></td>\r\n");
      out.write("                            <td bordercolor=\"#663300\" bgcolor=\"#99BBB7\"><div align=\"center\"><a href=\"Resume.jsp?uid=");
      out.print(uid);
      out.write("\"><strong>View</strong></a></div></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");

                                        }
                                    } catch (Exception e) {
                                        out.println(e);
                                    }
                        
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </body>\r\n");
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
