package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class AddQuestions_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            .style1 {\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                color: #666633;\r\n");
      out.write("            }\r\n");
      out.write("            .style4 {color: #421456; font-weight: bold; }\r\n");
      out.write("            -->\r\n");
      out.write("        </style>\r\n");
      out.write("        <script language=\"javascript\">\r\n");
      out.write("            function check()\r\n");
      out.write("            {\r\n");
      out.write("                var a= document.form1.Qno.value;\r\n");
      out.write("                if(document.form1.Qno.value==\"\")\r\n");
      out.write("                    {\r\n");
      out.write("                        alert(\"Enter Question No:\");\r\n");
      out.write("                        document.form1.Qno.focus();\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("                    else if(!parseInt(a))\r\n");
      out.write("                        {\r\n");
      out.write("                            alert(\"Enter Integer\");\r\n");
      out.write("                            document.form1.Qno.focus();\r\n");
      out.write("                            return false;\r\n");
      out.write("                        }\r\n");
      out.write("                        if(document.form1.question.value==\"\")\r\n");
      out.write("                            {\r\n");
      out.write("                                alert(\"Enter Question\");\r\n");
      out.write("                                document.form1.question.focus();\r\n");
      out.write("                                return false;\r\n");
      out.write("                            }\r\n");
      out.write("                            \r\n");
      out.write("                            if(document.form1.option1.value==\"\")\r\n");
      out.write("                                {\r\n");
      out.write("                                    alert(\"Enter First Option\");\r\n");
      out.write("                                    document.form1.option1.focus();\r\n");
      out.write("                                    return false;\r\n");
      out.write("                                }\r\n");
      out.write("                                if(document.form1.option1.value==\"\")\r\n");
      out.write("                                    {\r\n");
      out.write("                                        alert(\"Enter First Option\");\r\n");
      out.write("                                        document.form1.option1.focus();\r\n");
      out.write("                                        return false;\r\n");
      out.write("                                    }\r\n");
      out.write("                                    if(document.form1.option2.value==\"\")\r\n");
      out.write("                                        {\r\n");
      out.write("                                            alert(\"Enter Second Option\");\r\n");
      out.write("                                            document.form1.option2.focus();\r\n");
      out.write("                                            return false;\r\n");
      out.write("                                        }\r\n");
      out.write("                                        if(document.form1.option3.value==\"\")\r\n");
      out.write("                                            {\r\n");
      out.write("                                                alert(\"Enter Third Option\");\r\n");
      out.write("                                                document.form1.option3.focus();\r\n");
      out.write("                                                return false;\r\n");
      out.write("                                            }\r\n");
      out.write("                                            if(document.form1.option4.value==\"\")\r\n");
      out.write("                                                {\r\n");
      out.write("                                                    alert(\"Enter Fourth Option\");\r\n");
      out.write("                                                    document.form1.option4.focus();\r\n");
      out.write("                                                    return false;\r\n");
      out.write("                                                }\r\n");
      out.write("                                                if(document.form1.answer.value==\"\")\r\n");
      out.write("                                                    {\r\n");
      out.write("                                                        alert(\"Enter Correct Answer\");\r\n");
      out.write("                                                        document.form1.answer.focus();\r\n");
      out.write("                                                        return false;\r\n");
      out.write("                                                    }\r\n");
      out.write("                                                    \r\n");
      out.write("                                                    \r\n");
      out.write("                                                    return true;\r\n");
      out.write("                                                }\r\n");
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
      out.write("                <td width=\"961\" bgcolor=\"#F8EFDE\">\r\n");
      out.write("                    <form name=\"form1\" method=\"post\" action=\"savequestions.jsp\" onSubmit=\"return check()\">\r\n");
      out.write("                        <table width=\"398\" height=\"383\" border=\"1\" align=\"center\" bordercolor=\"#663333\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td colspan=\"2\" bordercolor=\"#996633\" bgcolor=\"#EBD8D8\"><div align=\"center\" class=\"style1\">Add Questions </div></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            ");

            try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                Statement st = con.createStatement();
                Statement st1 = con.createStatement();
                            
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"37\" bordercolor=\"#996633\" bgcolor=\"#EBD8D8\"><span class=\"style4\">Job ID </span></td>\r\n");
      out.write("                                <td bordercolor=\"#996633\" bgcolor=\"#EBD8D8\"><label>\r\n");
      out.write("                                        <select name=\"jobid\" id=\"jobid\">\r\n");
      out.write("                                            ");
      ResultSet rs1 = st1.executeQuery("select * from JobDetails");
                                          String s = null;
                                          // String s2=null;
                                          while (rs1.next()) {
                                              s = rs1.getString("jobid");
                                              //    s2=rs.getString("Post");

                                            
      out.write("\r\n");
      out.write("                                            <option value=\"");
      out.print(s);
      out.write('"');
      out.write('>');
      out.print(s);
      out.write("</option>\r\n");
      out.write("                                            ");
}
      out.write("  \r\n");
      out.write("                                        </select>\r\n");
      out.write("                                </label></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td width=\"127\" height=\"37\" bordercolor=\"#996633\" bgcolor=\"#EBD8D8\"><span class=\"style4\">Exam ID</span></td>\r\n");
      out.write("                                <td width=\"255\" bordercolor=\"#996633\" bgcolor=\"#EBD8D8\">\r\n");
      out.write("                                    <label>\r\n");
      out.write("                                        <select name=\"examid\">\r\n");
      out.write("                                            ");
      ResultSet rs = st.executeQuery("select * from Exam");
                                          String s1 = null;
                                          // String s2=null;
                                          while (rs.next()) {
                                              s1 = rs.getString("examid");
                                              //    s2=rs.getString("Post");

                                            
      out.write("\r\n");
      out.write("                                            <option value=\"");
      out.print(s1);
      out.write('"');
      out.write('>');
      out.print(s1);
      out.write("</option>\r\n");
      out.write("                                            ");
} 
      out.write("\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                </label>         </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"40\" bordercolor=\"#996633\" bgcolor=\"#EBD8D8\"><span class=\"style4\">Question No:</span></td>\r\n");
      out.write("                                <td bordercolor=\"#996633\" bgcolor=\"#EBD8D8\">\r\n");
      out.write("                                <input name=\"Qno\" type=\"text\" size=\"10\">       </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"47\" bordercolor=\"#996633\" bgcolor=\"#EBD8D8\"><span class=\"style4\">Question</span></td>\r\n");
      out.write("                                <td bordercolor=\"#996633\" bgcolor=\"#EBD8D8\">\r\n");
      out.write("                                    <label>\r\n");
      out.write("                                        <textarea name=\"question\" cols=\"28\"></textarea>\r\n");
      out.write("                                </label>               </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"37\" bordercolor=\"#996633\" bgcolor=\"#EBD8D8\"><span class=\"style4\">Option1</span></td>\r\n");
      out.write("                                <td bordercolor=\"#996633\" bgcolor=\"#EBD8D8\">\r\n");
      out.write("                                    <label></label>\r\n");
      out.write("                                <input name=\"option1\" type=\"text\" size=\"30\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"37\" bordercolor=\"#996633\" bgcolor=\"#EBD8D8\"><span class=\"style4\">Option2</span></td>\r\n");
      out.write("                                <td bordercolor=\"#996633\" bgcolor=\"#EBD8D8\"><input name=\"option2\" type=\"text\" size=\"30\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"38\" bordercolor=\"#996633\" bgcolor=\"#EBD8D8\"><span class=\"style4\">Option3</span></td>\r\n");
      out.write("                                <td bordercolor=\"#996633\" bgcolor=\"#EBD8D8\"><input name=\"option3\" type=\"text\" size=\"30\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"35\" bordercolor=\"#996633\" bgcolor=\"#EBD8D8\"><span class=\"style4\">Option4</span></td>\r\n");
      out.write("                                <td bordercolor=\"#996633\" bgcolor=\"#EBD8D8\"><input name=\"option4\" type=\"text\" size=\"30\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"36\" bordercolor=\"#996633\" bgcolor=\"#EBD8D8\"><span class=\"style4\">Answer</span></td>\r\n");
      out.write("                                <td bordercolor=\"#996633\" bgcolor=\"#EBD8D8\"><input name=\"answer\" type=\"text\" size=\"30\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td colspan=\"2\" bordercolor=\"#996633\" bgcolor=\"#EBD8D8\"><div align=\"center\">\r\n");
      out.write("                                        <input type=\"submit\" name=\"Submit\" value=\"Add Question\">\r\n");
      out.write("                                </div></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </form> \r\n");
      out.write("                    ");

            } catch (Exception e) {
                out.println(e);
            }
                    
                
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
