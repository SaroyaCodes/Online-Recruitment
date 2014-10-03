package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddJobDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            <!--\r\n");
      out.write("            .style1 {\r\n");
      out.write("                font-size: 24px;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                color: #993300;\r\n");
      out.write("            }\r\n");
      out.write("            .style2 {\r\n");
      out.write("                color: #000000;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("            -->\r\n");
      out.write("        </style>\r\n");
      out.write("        <script language=\"javascript\">\r\n");
      out.write("            function check()\r\n");
      out.write("            {\r\n");
      out.write("                var a= document.form1.jobid.value;\r\n");
      out.write("                var b= document.form1.vacancies.value;\r\n");
      out.write("                var c= document.form1.salary.value;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                if(document.form1.jobid.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter Job Id\");\r\n");
      out.write("                    document.form1.jobid.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if(!parseInt(a))\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter integer\");\r\n");
      out.write("                    document.form1.jobid.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                if(document.form1.post.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter Post\");\r\n");
      out.write("                    document.form1.post.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if(document.form1.criteria.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter Criteria\");\r\n");
      out.write("                    document.form1.criteria.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if(document.form1.vacancies.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter no: of Vacancies available\");\r\n");
      out.write("                    document.form1.vacancies.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if(!parseInt(b))\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter integer\");\r\n");
      out.write("                    document.form1.vacancies.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if(document.form1.salary.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter Salary\");\r\n");
      out.write("                    document.form1.salary.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if(!parseInt(c))\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter integer\");\r\n");
      out.write("                    document.form1.salary.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if(document.form1.lastdate.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter Last Date\");\r\n");
      out.write("                    document.form1.lastdate.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                return true;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
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
      out.write("                <td width=\"961\" bgcolor=\"#6699CC\">\r\n");
      out.write("                    <form name=\"form1\" method=\"post\" action=\"savejobdetails.jsp\">\r\n");
      out.write("                        <table width=\"517\" height=\"334\" border=\"1\" align=\"center\" bgcolor=\"#FFCCCC\">\r\n");
      out.write("                            <tr bordercolor=\"#0099FF\">\r\n");
      out.write("                                <td height=\"30\" colspan=\"2\" bgcolor=\"#E3EAF4\"><div align=\"center\" class=\"style1\">Job Description </div></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td width=\"160\" height=\"26\" bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><div align=\"left\" class=\"style2\">JobID</div></td>\r\n");
      out.write("                                <td width=\"213\" bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\">\r\n");
      out.write("                                    <label>\r\n");
      out.write("                                        <input name=\"jobid\" id=\"jobid\"type=\"text\" size=\"30\">\r\n");
      out.write("                                    </label>            </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"26\" bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><div align=\"left\" class=\"style2\"> Name of Post </div></td>\r\n");
      out.write("                                <td bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><input name=\"post\" name=\"post\" type=\"text\" size=\"30\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"26\" bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><div align=\"left\" class=\"style2\">Criteria</div></td>\r\n");
      out.write("                                <td bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><input name=\"criteria\" name=\"criteria\" type=\"text\" size=\"30\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"26\" bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><div align=\"left\" class=\"style2\">No: of Vacancies </div></td>\r\n");
      out.write("                                <td bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><input name=\"vacancies\" name=\"vacancies\" type=\"text\" size=\"30\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"26\" bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><div align=\"left\" class=\"style2\">Salary/Annum</div></td>\r\n");
      out.write("                                <td bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><input name=\"salary\" name=\"salary\" type=\"text\" size=\"30\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"26\" bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><div align=\"left\" class=\"style2\">Last Date<font color=\"red\">&nbsp;&nbsp;(dd/mm/yy) </font></div></td>\r\n");
      out.write("                                <td bordercolor=\"#0099FF\" bgcolor=\"#E3EAF4\"><input name=\"lastdate\" name=\"lastdate\" type=\"text\" size=\"30\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr bordercolor=\"#0099FF\">\r\n");
      out.write("                                <td height=\"28\" colspan=\"2\" bgcolor=\"#E3EAF4\">\r\n");
      out.write("                                    <div align=\"center\">\r\n");
      out.write("                                        <input type=\"submit\" name=\"Submit\" value=\"Submit\" onClick=\"return check()\">\r\n");
      out.write("                                    </div>           </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <h2>&nbsp;</h2>\r\n");
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
