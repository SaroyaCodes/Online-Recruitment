package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class CompanyDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(".style1 {\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tcolor: #CC3333;\r\n");
      out.write("}\r\n");
      out.write(".style2 {color: #003399}\r\n");
      out.write("-->\r\n");
      out.write("        </style>\r\n");
      out.write("</head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <table width=\"100%\" border=\"1\" bordercolor=\"#ECE9D8\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("<tr>\r\n");
      out.write("            <td height=\"56\" colspan=\"2\" bordercolor=\"#622D13\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "CandidateHeader.jsp", out, false);
      out.write("</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"512\" bordercolor=\"#622D13\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Candidatemenu.jsp", out, false);
      out.write("</td>\r\n");
      out.write("            <td bordercolor=\"#622D13\" valign=\"top\">\r\n");
      out.write("            \r\n");
      out.write("            <table width=\"684\" height=\"89\" border=\"1\" align=\"center\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"24\" colspan=\"7\" bordercolor=\"#20450A\" bgcolor=\"#E3DFE2\" ><div align=\"center\" class=\"style63 style8 style1\"><strong>Company Details </strong></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"88\" height=\"27\" bordercolor=\"#20450A\" bgcolor=\"#CAC297\"><div align=\"center\" class=\"style64 style7 style2\"><strong>Name</strong></div></td>\r\n");
      out.write("        <td width=\"97\" bordercolor=\"#20450A\" bgcolor=\"#CAC297\" ><div align=\"center\" class=\"style64 style7 style2\"><strong>Address</strong></div></td>\r\n");
      out.write("        <td width=\"101\" bordercolor=\"#20450A\" bgcolor=\"#CAC297\" ><div align=\"center\" class=\"style64 style7 style2\"><strong>Post</strong></div></td>\r\n");
      out.write("        <td width=\"88\" bordercolor=\"#20450A\" bgcolor=\"#CAC297\" ><div align=\"center\" class=\"style64 style7 style2\"><strong>Criteria</strong></div></td>\r\n");
      out.write("        <td width=\"98\" bordercolor=\"#20450A\" bgcolor=\"#CAC297\" ><div align=\"center\" class=\"style64 style7 style2\"><strong>Email</strong></div></td>\r\n");
      out.write("        <td width=\"103\" bordercolor=\"#20450A\" bgcolor=\"#CAC297\" ><div align=\"center\" class=\"style64 style7 style2\"><strong>ContactNo:</strong></div></td>\r\n");
      out.write("        <td width=\"79\" bordercolor=\"#20450A\" bgcolor=\"#CAC297\" ><div align=\"center\" class=\"style64 style7 style2\"><strong>Cutoff % </strong></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      ");
 
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      Connection con=DriverManager.getConnection("jdbc:odbc:OnlineExam");
      try
              {
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("select * from Con");
        while(rs.next())
            {
   
      out.write("\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"28\" bordercolor=\"#20450A\" bgcolor=\"#E9DDD6\" ><span class=\"style6\">\r\n");
      out.write("        ");
 out.println(rs.getString("CName"));
      out.write("\r\n");
      out.write("        </span></td>\r\n");
      out.write("      <td bordercolor=\"#20450A\" bgcolor=\"#E9DDD6\" ><span class=\"style6\">\r\n");
      out.write("          ");
 out.println(rs.getString("CAddress"));
      out.write("\r\n");
      out.write("        </span></td>\r\n");
      out.write("        <td bordercolor=\"#20450A\" bgcolor=\"#E9DDD6\" ><span class=\"style6\">\r\n");
      out.write("          ");
 out.println(rs.getString("CPost"));
      out.write("\r\n");
      out.write("        </span></td>\r\n");
      out.write("        <td bordercolor=\"#20450A\" bgcolor=\"#E9DDD6\"><span class=\"style6\">\r\n");
      out.write("          ");
 out.println(rs.getString("CCriteria"));
      out.write("\r\n");
      out.write("        </span></td>\r\n");
      out.write("        <td bordercolor=\"#20450A\" bgcolor=\"#E9DDD6\"><span class=\"style6\">\r\n");
      out.write("          ");
 out.println(rs.getString("CEmail"));
      out.write("\r\n");
      out.write("        </span></td>\r\n");
      out.write("        <td bordercolor=\"#20450A\" bgcolor=\"#E9DDD6\"><span class=\"style6\">\r\n");
      out.write("          ");
 out.println(rs.getString("CContact"));
      out.write("\r\n");
      out.write("        </span></td>\r\n");
      out.write("        <td bordercolor=\"#20450A\" bgcolor=\"#E9DDD6\"><span class=\"style6\">\r\n");
      out.write("          ");
 out.println(rs.getString("CCutoff"));
      out.write("\r\n");
      out.write("        </span></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      ");

      }//while
      }//try
      catch(Exception e)
              {
          out.println(e);
              }
            
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("            </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("        \r\n");
      out.write("</body>\r\n");
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
