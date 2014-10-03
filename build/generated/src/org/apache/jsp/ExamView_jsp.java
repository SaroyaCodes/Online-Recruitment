package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class ExamView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                color: #FF0000;\r\n");
      out.write("            }\r\n");
      out.write("            .style7 {color: #006666; font-weight: bold; }\r\n");
      out.write("            .style9 {color: #663366; font-weight: bold; }\r\n");
      out.write("            -->\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"margin:0px\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("        <table width=\"100%\" border=\"1\" bgcolor=\"#FFFFFF\" >\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td height=\"23\" colspan=\"2\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "CompanyHeader.jsp", out, false);
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"1\" height=\"537\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Companymenu.html", out, false);
      out.write("</td>\r\n");
      out.write("                <td width=\"961\" bgcolor=\"#EDE0E2\" valign=\"top\"><form name=\"form1\" action=\"ExamView.jsp\">\r\n");
      out.write("                        <table width=\"277\" height=\"128\" border=\"0\" align=\"center\"  >\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"49\" colspan=\"2\"><div align=\"center\" class=\"style1\">\r\n");
      out.write("                                        Exam View\r\n");
      out.write("                                </div></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            ");

        String jid = request.getParameter("jobid");
        //out.print(jid);
        try {
            if (jid == null) {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                Statement st = con.createStatement();
                            
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td width=\"135\" height=\"42\"><span class=\"style7\">Select a JobID </span></td>\r\n");
      out.write("                                <td width=\"132\">\r\n");
      out.write("                                    <label>\r\n");
      out.write("                                        <select name=\"jobid\">\r\n");
      out.write("                                            ");
      ResultSet rs = st.executeQuery("select * from JobDetails");
                            String s1 = null;

                            while (rs.next()) {
                                s1 = rs.getString("JobId");


                                            
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
      out.write("                                    </label>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr><td> <input type=\"submit\" value=\"Show Details\"> </td></tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                    ");

                            } else {
                                jid = request.getParameter("jobid");
                                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                                Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                                Statement st = con.createStatement();

                                ResultSet rs = st.executeQuery("select * from JobDetails where JobId='" + jid + "'");
                                String s2 = null;
                                while (rs.next()) {
                                    s2 = rs.getString("Post");
                                }
                    
      out.write("\r\n");
      out.write("                    <table width=\"549\" height=\"54\" border=\"1\" align=\"center\" style=\"vertical-align:top\">\r\n");
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td width=\"98\" height=\"23\" bordercolor=\"#344631\" bgcolor=\"#F8E0E0\"><div align=\"center\" class=\"style9\">Exam ID </div></td>\r\n");
      out.write("                            <td width=\"139\" bordercolor=\"#344631\" bgcolor=\"#F8E0E0\"><div align=\"center\" class=\"style9\">Exam Name </div></td>\r\n");
      out.write("                            <td width=\"104\" bordercolor=\"#344631\" bgcolor=\"#F8E0E0\"><div align=\"center\" class=\"style9\">Cutoff % </div></td>\r\n");
      out.write("                            <td width=\"89\" bordercolor=\"#344631\" bgcolor=\"#F8E0E0\"><div align=\"center\" class=\"style9\">Edit</div></td>\r\n");
      out.write("                            <td width=\"85\" bordercolor=\"#344631\" bgcolor=\"#F8E0E0\"><div align=\"center\" class=\"style9\">Delete</div></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                        ");
    Statement st2 = con.createStatement();
                                ResultSet rs2 = st2.executeQuery("select * from Exam where JobId='" + jid + "'");

                                while (rs2.next()) {
                                    String eid = rs2.getString("ExamID");
                                    String ename = rs2.getString("ExamName");
                                    String ecut = rs2.getString("Cutoff");
                        
      out.write("\r\n");
      out.write("                        <tr valign=\"top\">\r\n");
      out.write("                            <td height=\"23\" bordercolor=\"#344631\" bgcolor=\"#F8E0E0\">");
      out.print(eid);
      out.write("</td>\r\n");
      out.write("                            <td bordercolor=\"#344631\" bgcolor=\"#F8E0E0\">");
      out.print(ename);
      out.write("</td>\r\n");
      out.write("                            <td bordercolor=\"#344631\" bgcolor=\"#F8E0E0\">");
      out.print(ecut);
      out.write("</td>\r\n");
      out.write("                            <td bordercolor=\"#344631\" bgcolor=\"#F8E0E0\"><a href=\"EditExam.jsp?eid=");
      out.print(eid);
      out.write("&jid=");
      out.print(jid);
      out.write("\">Edit</a></td>\r\n");
      out.write("                            <td bordercolor=\"#344631\" bgcolor=\"#F8E0E0\"><a href=\"DeleteExam.jsp?eid=");
      out.print(eid);
      out.write("\">Delete</a></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");

                }
            }
        } catch (Exception e) {
            out.println(e);
        }
                        
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </body>\r\n");
      out.write("</html> ");
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
