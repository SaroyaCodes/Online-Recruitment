package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class savelogindata_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>www.CarrierMithr.com</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 try {
            String s1 = request.getParameter("Username");
            String s2 = request.getParameter("Password");


            session.setAttribute("s1", s1);
            session.setAttribute("s2", s2);
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            Statement st = conn.createStatement();
            Statement st2 = conn.createStatement();
            String stat = "";
            ResultSet rs;
            rs = st.executeQuery("select * from Login where Username='" + s1 + "' and Password='" + s2 + "'");
        
      out.write("\n");
      out.write("        <!-- <input type= \"hidden\" name=\"id\" value =\"");
      out.print(s1);
      out.write("\">\n");
      out.write("           <input type= \"hidden\" name=\"pass\" value =\"");
      out.print(s2);
      out.write("\">-->\n");
      out.write("           ");

            while (rs.next()) {
                stat = rs.getString("Status");
            } //while
            if (stat.equals("s")) {
                response.sendRedirect("CandidateHomePage.jsp");
            } else if (stat.equals("c")) {
                response.sendRedirect("CompanyHomePage.jsp");
            } else if (stat.equals("a")) {
                response.sendRedirect("AdminHomePage.jsp");
            } else {
                response.sendRedirect("Login.jsp");

            }
        }//try
        catch (Exception e) {
            out.println(e);
        }
        
      out.write("\n");
      out.write("        <!-- <input type=\"hidden\" name = \"hid\" value=\"");
request.getParameter("Username");
      out.write("\" -->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
