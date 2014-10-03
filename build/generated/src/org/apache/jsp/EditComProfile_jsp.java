package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class EditComProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>www.CarrierMithr.com</title>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        <!--\r\n");
      out.write("        .style1 {\r\n");
      out.write("            color: #CC6633;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("        }\r\n");
      out.write("        .style2 {color: #FFFFFF}\r\n");
      out.write("        -->\r\n");
      out.write("    </style>\r\n");
      out.write("    <script language=\"javascript\">\r\n");
      out.write("\t\t\tfunction check()\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tvar a=document.form1.comname.value;\r\n");
      out.write("           \t\tvar c=document.form1.comemail.value;\r\n");
      out.write("            \tvar d=document.form1.comcontact.value;\r\n");
      out.write("            \tvar e=document.form1.comcutoff.value;\r\n");
      out.write("\t\t\t\tif(document.form1.comname.value == \"\")\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\talert(\"Enter Company Name\");\r\n");
      out.write("                \tdocument.form1.comname.focus();\r\n");
      out.write("                \treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\telse if(parseInt(a))\r\n");
      out.write("           \t\t {\r\n");
      out.write("                alert(\"Company Name cannot be integer\");\r\n");
      out.write("                document.form1.comname.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("           \t\t }\r\n");
      out.write("\t\t\t\tif(document.form1.comaddress.value == \"\")\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\talert(\"Enter Company Address\");\r\n");
      out.write("                \tdocument.form1.comaddress.focus();\r\n");
      out.write("                \treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(document.form1.compost.value == \"\")\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\talert(\"Enter Post\");\r\n");
      out.write("                \tdocument.form1.compost.focus();\r\n");
      out.write("                \treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(document.form1.comcriteria.value == \"\")\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\talert(\"Enter Criteria of the Company\");\r\n");
      out.write("                \tdocument.form1.comcriteria.focus();\r\n");
      out.write("                \treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(document.form1.comemail.value == \"\")\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\talert(\"Enter Company Email\");\r\n");
      out.write("                \tdocument.form1.comemail.focus();\r\n");
      out.write("                \treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\telse if(c.indexOf('@')==-1)\r\n");
      out.write("         \t   {\r\n");
      out.write("                alert(\"Enter Email Correctly\");\r\n");
      out.write("                document.form1.comemail.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("          \t\t}\r\n");
      out.write("           \t\t else if(c.indexOf('.')==-1)\r\n");
      out.write("           \t\t {\r\n");
      out.write("                alert(\"Enter Email Correctly\");\r\n");
      out.write("                document.form1.comemail.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("          \t\t  }\r\n");
      out.write("\t\t\t\tif(document.form1.comcontact.value == \"\")\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\talert(\"Enter Company Contact no:\");\r\n");
      out.write("                \tdocument.form1.comcontact.focus();\r\n");
      out.write("                \treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\telse if(!parseInt(d))\r\n");
      out.write("            \t{\r\n");
      out.write("                alert(\"Enter integer\");\r\n");
      out.write("                document.form1.comcontact.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            \t}\r\n");
      out.write("            \telse if(((document.form1.comcontact.value.length)<6) || ((document.form1.comcontact.value.length)>11))\r\n");
      out.write("            \t{\r\n");
      out.write("                alert(\"Phone no should contain atleast 6 integers \");\r\n");
      out.write("                document.form1.comcontact.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            \t}\r\n");
      out.write("\t\t\t\tif(document.form1.comcutoff.value == \"\")\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\talert(\"Enter Company Cutoff mark\");\r\n");
      out.write("                \tdocument.form1.comcutoff.focus();\r\n");
      out.write("                \treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t else if(!parseInt(e))\r\n");
      out.write("            \t{\r\n");
      out.write("                alert(\"Enter integer\");\r\n");
      out.write("                document.form1.comcutoff.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            \t}\r\n");
      out.write("           \t \telse if(parseInt(e)<0||parseInt(e)>100)\r\n");
      out.write("            \t{\r\n");
      out.write("                alert(\"Enter cutoff in %\");\r\n");
      out.write("                document.form1.comcutoff.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            \t}\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("    <body style=\"margin:0px\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("        <table width=\"100%\" border=\"1\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td height=\"107\" colspan=\"2\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "CompanyHeader.jsp", out, false);
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"1\" height=\"512\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Companymenu.html", out, false);
      out.write("</td>\r\n");
      out.write("                <td width=\"961\" bgcolor=\"#E7E8EB\" valign=\"top\">\r\n");
      out.write("                    <span class=\"style2\">\r\n");
      out.write("                        ");

        //out.println(c1);
        try {

            //

            String c1 = (String) session.getAttribute("s1");
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            Statement st = con.createStatement();


            ResultSet rs = st.executeQuery("select CName,CAddress,CPost,CCriteria,CEmail,CContact,CCutoff from Com where CUsername='" + c1 + "'");
            String a = null;
            String b = null;
            String c = null;
            String d = null;
            String e = null;
            String f = null;
            String g = null;
            while (rs.next())
            {
                a = rs.getString("CName");
                b = rs.getString("CAddress");
                c = rs.getString("CPost");
                d = rs.getString("CCriteria");
                e = rs.getString("CEmail");
                f = rs.getString("CContact");
                g = rs.getString("CCutoff");

                        
      out.write("\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <div class=\"Reg\" align=\"center\">\r\n");
      out.write("                        <form method=\"POST\" action=\"savecompanyedit.jsp\" name=\"form1\" onSubmit=\"return check()\">\r\n");
      out.write("                            <table width =66% border=0 cellpadding=3 cellspacing=0 bordercolor=\"#FFFFFF\" >\r\n");
      out.write("                                <tr bgcolor=\"\" width=100%>\r\n");
      out.write("                                    <td colspan=\"2\" bgcolor=\"#F5E7DC\">\r\n");
      out.write("                                    <div align=\"center\" class=\"style5 style1\">Edit Company Profile </div>                </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr bgcolor=\"\" width=100%>\r\n");
      out.write("                                    <td width=\"46%\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("                                    <div align=\"center\"><font SIZE=\"2\" COLOR=\"black\" face =arial >Name</font></div></td>\r\n");
      out.write("                                    <td width=\"54%\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("                                        <div align=\"left\">\r\n");
      out.write("                                            <input TYPE=\"text\" NAME=\"comname\" id=\"comname\" size=30 maxlength=30 value=\"");
      out.print(a);
      out.write("\">\r\n");
      out.write("                                    </div>\t</td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr bgcolor =#FEF7E9>\r\n");
      out.write("                                    <td bgcolor=\"#D9DEE6\">\r\n");
      out.write("                                    <div align=\"center\"><font SIZE=\"2\" COLOR=\"black\" face =arial>Address</font></div></td>\r\n");
      out.write("                                    <td bgcolor=\"#D9DEE6\">\r\n");
      out.write("                                        <div align=\"left\">\r\n");
      out.write("                                            <input NAME=\"comaddress\" TYPE=\"text\" id=\"comaddress\" size=30 maxlength=50 value=\"");
      out.print(b);
      out.write("\">\r\n");
      out.write("                                    </div>\t </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr bgcolor =#FEF7E9>\r\n");
      out.write("                                    <td bgcolor=\"#F5E7DC\">\r\n");
      out.write("                                    <div align=\"center\"><font SIZE=\"2\" COLOR=\"black\" face =arial>Post</font></div></td>\r\n");
      out.write("                                    <td bgcolor=\"#F5E7DC\">\r\n");
      out.write("                                        <div align=\"left\">\r\n");
      out.write("                                            <input NAME=\"compost\" TYPE=\"text\" id=\"compost\" size=30  maxlength=50 value=\"");
      out.print(c);
      out.write("\">\r\n");
      out.write("                                    </div>\t </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr bgcolor =#FEF7E9>\r\n");
      out.write("                                    <td bgcolor=\"#D9DEE6\">\r\n");
      out.write("                                    <div align=\"center\"><font SIZE=\"2\" COLOR=\"black\" face =arial>Criteria</font></div></td>\r\n");
      out.write("                                    <td bgcolor=\"#D9DEE6\">\r\n");
      out.write("                                        <div align=\"left\">\r\n");
      out.write("                                            <input NAME=\"comcriteria\" TYPE=\"text\" id=\"comcriteria\" size=30  maxlength=50 value=\"");
      out.print(d);
      out.write("\">\r\n");
      out.write("                                    </div>\t</td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr  bgcolor =#FEF7E9>\r\n");
      out.write("                                    <td bgcolor=\"#F5E7DC\">\r\n");
      out.write("                                    <div align=\"center\"><font SIZE=\"2\" COLOR=\"black\" face =arial>Email_id</font></div></td>\r\n");
      out.write("                                    <td bgcolor=\"#F5E7DC\">\r\n");
      out.write("                                        <div align=\"left\">\r\n");
      out.write("                                            <input TYPE=\"text\" NAME=\"comemail\" id=\"comemail\" size=30 maxlength=30 value=\"");
      out.print(e);
      out.write("\">\r\n");
      out.write("                                    </div>\t   </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td bgcolor=\"#FFFFFF\">\r\n");
      out.write("                                    <div align=\"center\"><font SIZE=\"2\" COLOR=\"black\" face =arial>Contact No:</font></div></td>\r\n");
      out.write("                                    <td bgcolor=\"#FFFFFF\">\r\n");
      out.write("                                        <div align=\"left\">\r\n");
      out.write("                                            <input TYPE=\"text\" NAME=\"comcontact\" id=\"comcontact\"size=20 maxlength=30 value=\"");
      out.print(f);
      out.write("\">\r\n");
      out.write("                                    &nbsp;                 <font SIZE=\"2\" COLOR=\"#CC0000\" face =arial>(STD-No.)</font>\t\t   </div>\t   </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr  bgcolor =#FEF7E9>\r\n");
      out.write("                                    <td bgcolor=\"#D9DEE6\">\r\n");
      out.write("                                    <div align=\"center\"><font SIZE=\"2\" COLOR=\"black\" face =arial>CutOff %</font></div></td>\r\n");
      out.write("                                    <td bgcolor=\"#D9DEE6\">\r\n");
      out.write("                                        <div align=\"left\">\r\n");
      out.write("                                            <input TYPE=\"text\" NAME=\"comcutoff\" id=\"comcutoff\" size=30 maxlength=30 value=\"");
      out.print(g);
      out.write("\">\r\n");
      out.write("                                    </div>\t   </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td height=\"49\" colspan=2 bgcolor=\"#F5E7DC\" >\r\n");
      out.write("                                        <div align=\"center\"><br>\r\n");
      out.write("                                            <input type=\"reset\" />\r\n");
      out.write("                                            &nbsp;&nbsp;<input TYPE=\"submit\" value=\"Edit\" >\r\n");
      out.write("                                    </div>\t    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    ");
 }//while

        } catch (Exception e) {
            out.println(e.toString());
        }
                    
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
