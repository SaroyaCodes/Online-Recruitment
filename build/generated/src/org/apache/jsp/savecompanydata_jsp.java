package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class savecompanydata_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>www.CarrierMithr.com</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body bgcolor=\"#E2C2CB\">\r\n");
      out.write("        ");
 try
          {
         
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           Connection con=DriverManager.getConnection("jdbc:odbc:OnlineExam");
          
            Statement st=con.createStatement();
          Statement st2=con.createStatement();
          
          String stat="c";
          st2.executeUpdate("insert into Login values('"+request.getParameter("comusername")+"','"+request.getParameter("compassword")+"','"+stat+"')");
          st.executeUpdate("insert into Com(CName,CAddress,CPost,CCriteria,CUsername,CEmail,CContact,CCutoff) values('"+request.getParameter("comname")+"','"+request.getParameter("comaddress")+"','"+request.getParameter("compost")+"','"+request.getParameter("comcriteria")+"','"+request.getParameter("comusername")+"','"+request.getParameter("comemail")+"','"+request.getParameter("comcontact")+"','"+request.getParameter("comcutoff")+"')");
          st.close();
          st2.close();
          
             }
       
        
           catch(Exception e)
                   {
               out.println(e);
                   }
        
           
      out.write("\r\n");
      out.write("           <font color=\"red\" size=\"5\"><br>\r\n");
      out.write("               ");
out.println("Registration Successfull!!!");
      out.write("\r\n");
      out.write("               <br>\r\n");
      out.write("               ");
out.println("You will be activated soon... ");
      out.write("\r\n");
      out.write("               <br>\r\n");
      out.write("                <p><a href=\"Login.jsp\">Go Forward</a></p>\r\n");
      out.write("          </font>\r\n");
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
