package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class ChangePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>www.CarrierMithr.com</title>\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            <!--\r\n");
      out.write("            .style1 {color: #660099}\r\n");
      out.write("            .style9 {color: #990066}\r\n");
      out.write("            -->\r\n");
      out.write("        </style>\r\n");
      out.write("        <script language=\"javascript\">\r\n");
      out.write("            function check()\r\n");
      out.write("            {\r\n");
      out.write("                var a= document.form1.newpass2.value;\r\n");
      out.write("                var b= document.form1.newpass.value;\r\n");
      out.write("                    if(document.form1.pass.value  ==\"\")\r\n");
      out.write("                    {\r\n");
      out.write("                        alert(\"Enter the old password\");\r\n");
      out.write("                        document.form1.pass.focus();\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("                   if(document.form1.newpass2.value ==\"\")\r\n");
      out.write("                    {\r\n");
      out.write("                        alert(\"Enter the new password\");\r\n");
      out.write("                        document.form1.newpass2.focus();\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("                    else if(a.length<8)\r\n");
      out.write("                        {\r\n");
      out.write("                         alert(\"password should be minimum 8 characters\");\r\n");
      out.write("                        document.form1.newpass2.focus();\r\n");
      out.write("                        return false;\r\n");
      out.write("                        }\r\n");
      out.write("                    if(document.form1.newpass.value==\"\")\r\n");
      out.write("                    {\r\n");
      out.write("                        alert(\"ReEnter the password\");\r\n");
      out.write("                        document.form1.newpass.focus();\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("                    else if(a!=b)\r\n");
      out.write("                        {\r\n");
      out.write("                            alert(\"Wrong password match\");\r\n");
      out.write("                            document.form1.newpass.focus();\r\n");
      out.write("                            return false;\r\n");
      out.write("                        }\r\n");
      out.write("                    \r\n");
      out.write("                    return true;\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <table width=\"100%\" height=\"522\" border=\"1\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td height=\"95\" colspan=\"2\" bgcolor=\"#666734\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "AdminHeader.html", out, false);
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"1%\" bgcolor=\"#666734\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Adminmenu.html", out, false);
      out.write("</td>\r\n");
      out.write("                <td bgcolor=\"#FFFFFF\" valign=\"top\"><p>&nbsp;</p>\r\n");
      out.write("                    ");
 try {

            //              HttpSession s = request.getSession();
            //  String c1 = request.getParameter("id");
            String c1 = (String) session.getAttribute("s1");
            String c2 = (String) session.getAttribute("s2");
            // session.getAttribute("c1", c1);
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from Login where Username='" + c1 + "' and Password ='" + c2 + "'");

            String s1 = null;
            String s2 = null;
                    
      out.write("\r\n");
      out.write("                    <font color=\"#FFFFFF\" >\r\n");
      out.write("                        ");

     out.println(c1);
                        
      out.write("\r\n");
      out.write("                    </font>\r\n");
      out.write("                    ");

     while (rs.next()) {
         s1 = rs.getString(1);
         s2 = rs.getString(2);
     }
                    
      out.write("\r\n");
      out.write("                    <form name=\"form1\" method=\"post\" action=\"savepassword.jsp\" onsubmit=\"return check()\">\r\n");
      out.write("                        <table width=\"617\" height=\"150\" border=\"1\" align=\"right\" cellpadding=\"1\" bordercolor=\"#CC99FF\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"23\" colspan=\"3\" bordercolor=\"#CC6633\" bgcolor=\"cc99cc\"><div align=\"center\" class=\"style10 style1\"><strong>Change Password </strong></div></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td width=\"218\" height=\"26\" bordercolor=\"#CC6633\" bgcolor=\"#9999cc\"><span class=\"style15 style9\"><strong> Username </strong></span></td>\r\n");
      out.write("                                <td width=\"202\" bordercolor=\"#CC6633\" bgcolor=\"#FFFFFF\"><input name=\"user\" type=\"text\"  id=\"user\" value=\"");
      out.print(s1);
      out.write("\" size=\"35\"></td>\r\n");
      out.write("                                <td width=\"175\" rowspan=\"5\" bordercolor=\"#CC6633\" bgcolor=\"#FFFFFF\"><img src=\"gI_0_OnlineMarketingForWomenEntrepreneurs[1] copy.jpg\" width=\"175\" height=\"140\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"26\" bordercolor=\"#CC6633\" bgcolor=\"#9999cc\"><span class=\"style15 style9\"><strong>Old Password </strong></span></td>\r\n");
      out.write("                                <td bordercolor=\"#CC6633\" bgcolor=\"#FFFFFF\"><input name=\"pass\" type=\"password\"  id=\"pass\"  size=\"35\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"26\" bordercolor=\"#CC6633\" bgcolor=\"#9999cc\"><span class=\"style15 style9\"><strong>New Password </strong></span></td>\r\n");
      out.write("                                <td bordercolor=\"#CC6633\" bgcolor=\"#FFFFFF\"><input name=\"newpass2\" type=\"password\" id=\"newpass2\" size=\"35\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"26\" bordercolor=\"#CC6633\" bgcolor=\"#9999cc\"><span class=\"style15 style9\"><strong>Retype New Password</strong></span></td>\r\n");
      out.write("                                <td bordercolor=\"#CC6633\" bgcolor=\"#FFFFFF\"><input name=\"newpass\" type=\"password\" id=\"newpass\" size=\"35\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"28\" colspan=\"2\" bordercolor=\"#CC6633\" bgcolor=\"#9999cc\"><div align=\"center\">\r\n");
      out.write("                                        <input name=\"Submit\" type=\"submit\" class=\"style9\" value=\"Submit\">\r\n");
      out.write("                                </div></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    ");

        }//try
        catch (Exception e) {
            out.println(e);
        }

                    
      out.write("\r\n");
      out.write("\r\n");
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
