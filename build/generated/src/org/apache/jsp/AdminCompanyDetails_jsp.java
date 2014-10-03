package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class AdminCompanyDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {color: #3300CC}\r\n");
      out.write(".style4 {color: #003300}\r\n");
      out.write("-->\r\n");
      out.write("        </style>\r\n");
      out.write("</head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <table width=\"100%\" height=\"522\" border=\"1\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"95\" colspan=\"2\" bgcolor=\"#666734\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "AdminHeader.html", out, false);
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("    <td width=\"1%\" bgcolor=\"#666734\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Adminmenu.html", out, false);
      out.write("</td>\r\n");
      out.write("    <td bgcolor=\"#FFFFFF\" valign=\"top\"><table width=\"828\" height=\"78\" border=\"1\" align=\"left\" bordercolorlight=\"#CC0099\" bgcolor=\"#F2E4D9\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"23\" colspan=\"8\" bordercolor=\"#CC9999\" ><div align=\"center\" class=\"style63 style8 style1\"><strong>Company Details </strong></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"129\" height=\"23\" bordercolor=\"#CC9999\"><div align=\"center\" class=\"style64 style7 style4\"><strong>Company Name</strong></div></td>\r\n");
      out.write("        <td width=\"103\" height=\"23\" bordercolor=\"#CC9999\"><div align=\"center\" class=\"style64 style7 style4\"><strong>Address</strong></div></td>\r\n");
      out.write("        <td width=\"117\" bordercolor=\"#CC9999\" ><div align=\"center\" class=\"style64 style7 style4\"><strong>Post</strong></div></td>\r\n");
      out.write("        <td width=\"98\" bordercolor=\"#CC9999\" ><div align=\"center\" class=\"style64 style7 style4\"><strong>Username</strong></div></td>\r\n");
      out.write("        <td width=\"89\" bordercolor=\"#CC9999\" ><div align=\"center\" class=\"style64 style7 style4\"><strong>Phone</strong></div></td>\r\n");
      out.write("        <td width=\"109\" bordercolor=\"#CC9999\" ><div align=\"center\" class=\"style64 style7 style4\"><strong>Email ID</strong></div></td>\r\n");
      out.write("        <td width=\"69\" bordercolor=\"#CC9999\" ><div align=\"center\" class=\"style64 style7 style4\"><strong>Cutoff % </strong></div></td>\r\n");
      out.write("        <td width=\"66\" bordercolor=\"#CC9999\" ><div align=\"center\" class=\"style7 style64 style4\"><strong>Delete</strong></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      ");

    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      Connection con=DriverManager.getConnection("jdbc:odbc:OnlineExam");
      try
              {
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("select * from Com");
      String cname;
      String name="",add="",post="",uname="",phone="",email="",cutoff="";

        while(rs.next())
            {
            name=rs.getString("CName");
            add=rs.getString("CAddress");
            post=rs.getString("CPost");
            uname=rs.getString("CUsername");
            phone=rs.getString("CContact");
            email=rs.getString("CEmail");
            cutoff=rs.getString("CCutoff");
      
      out.write("\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"22\" bordercolor=\"#CC9999\" ><div align=\"center\"><span class=\"style6\">\r\n");
      out.write("          ");
      out.print(name);
      out.write("\r\n");
      out.write("        </span></div></td>\r\n");
      out.write("        <td bordercolor=\"#CC9999\" ><div align=\"center\"><span class=\"style6\">\r\n");
      out.write("          ");
      out.print(add);
      out.write("\r\n");
      out.write("        </span></div></td>\r\n");
      out.write("        <td bordercolor=\"#CC9999\" ><div align=\"center\"><span class=\"style6\">\r\n");
      out.write("          ");
      out.print(post);
      out.write("\r\n");
      out.write("        </span></div></td>\r\n");
      out.write("        <td bordercolor=\"#CC9999\"><div align=\"center\"><span class=\"style6\">\r\n");
      out.write("          ");
      out.print(uname);
      out.write("\r\n");
      out.write("        </span></div></td>\r\n");
      out.write("        <td bordercolor=\"#CC9999\"><div align=\"center\"><span class=\"style6\">\r\n");
      out.write("          ");
      out.print(phone);
      out.write("\r\n");
      out.write("        </span></div></td>\r\n");
      out.write("        <td bordercolor=\"#CC9999\"><div align=\"center\"><span class=\"style6\">\r\n");
      out.write("          ");
      out.print(email);
      out.write("\r\n");
      out.write("        </span></div></td>\r\n");
      out.write("        <td bordercolor=\"#CC9999\"><div align=\"center\"><span class=\"style6\">\r\n");
      out.write("          ");
      out.print(cutoff);
      out.write("\r\n");
      out.write("        </span></div></td>\r\n");
      out.write("        <td bordercolor=\"#CC9999\"><div align=\"center\"><span class=\"style6\">\r\n");
      out.write("          ");
 out.println("<a href='ComDelete.jsp?id="+uname+"'>Delete</a>");
      out.write("\r\n");
      out.write("        </span></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      ");

      }
      }
      catch(Exception e)
              {
          out.println(e);
              }
            
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("   \t </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
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
