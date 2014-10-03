package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;;

public final class Edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>www.CarrierMithr.com</title>\n");
      out.write("    </head>\n");
      out.write("<body bgcolor=\"#ECE9D8\" text=\"#0033FF\" link=\"#CC6600\">\n");
      out.write("     ");
 try {

//              
                String a=null;
                String b=null;
                String c=null;
                String d=null;
                String e=null;
                String f=null;
                String g=null;
                String c1 = (String)session.getAttribute("s1");
                String c2 = (String)session.getAttribute("s2"); 
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         out.println(c1);
         out.println(c2);
       
                Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
                Statement st = con.createStatement();
              
         
        
               // out.println("select * from Com where CUsername='" + c1 + "' and CPassword ='" + c2 + "'");
                
                ResultSet rs = st.executeQuery("select * from Com where CUsername='" + c1 + "'");
                
                
               
               
                
                while (rs.next())
                    {  
                    a=rs.getString(1);
                    b=rs.getString(2);
                    c=rs.getString(3);
                    d=rs.getString(4);
                    e=rs.getString(6);
                    f=rs.getString(7);
                    g=rs.getString(8);
                   
                   
                    
      out.write("\n");
      out.write("\n");
      out.write("<font SIZE=\"4\" COLOR=\"#993300\" face =arial>\n");
      out.write("<center></center></font>\n");
      out.write("<table bgcolor=#330099  border=0 cellpadding=0 cellspacing=2 width=80%  align=center >\n");
      out.write("<tr>\n");
      out.write("\t<td>\n");
      out.write("<table border=1 cellpadding=0 cellspacing=0 width=100% align=center bgcolor=#FFFFFF>\n");
      out.write("<tr align=center>\n");
      out.write("\t<td><br><br>\n");
      out.write("<form method=\"POST\" action=\"savecompanyedit.jsp\" name=\"form1\">\n");
      out.write("<table border=0 cellpadding=3 cellspacing=0 width =47% align=center>\n");
      out.write("<tr bgcolor=\"\" width=100%>\n");
      out.write("    <td><font SIZE=\"2\" COLOR=\"black\" face =arial >Name</font></td>\n");
      out.write("\t<td><input TYPE=\"text\" NAME=\"cname\" size=30 maxlength=30 value=\"");
      out.print(a);
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr bgcolor =#FEF7E9>\n");
      out.write("\t<td><font SIZE=\"2\" COLOR=\"black\" face =arial>Address</font></td>\n");
      out.write("\t<td><input TYPE=\"text\" NAME=\"caddress\" size=30 maxlength=50 value=\"");
      out.print(b);
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr bgcolor =#FEF7E9>\n");
      out.write("\t<td><font SIZE=\"2\" COLOR=\"black\" face =arial>Post</font></td>\n");
      out.write("\t<td><input TYPE=\"text\" NAME=\"cpost\" size=30 maxlength=50 value=\"");
      out.print(c);
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr bgcolor =#FEF7E9>\n");
      out.write("\t<td><font SIZE=\"2\" COLOR=\"black\" face =arial>Criteria</font></td>\n");
      out.write("\t<td><input TYPE=\"text\" NAME=\"ccriteria\" size=30 maxlength=50 value=\"");
      out.print(d);
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr  bgcolor =#FEF7E9>\n");
      out.write("\t<td><font SIZE=\"2\" COLOR=\"black\" face =arial>Email_id</font></td>\n");
      out.write("\t<td><input TYPE=\"text\" NAME=\"cemail\" size=30 maxlength=30 value=\"");
      out.print(e);
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\t<td><font SIZE=\"2\" COLOR=\"black\" face =arial>Contact No:</font></td>\n");
      out.write("\t<td><input TYPE=\"text\" NAME=\"ccontact\" size=4 maxlength=30 ><input TYPE=\"text\" NAME=\"phone1\" value='");
      out.print(f);
      out.write("'><font SIZE=\"2\" COLOR=\"#CC0000\" face =arial>(STD-No.)</td>\n");
      out.write("</tr>\n");
      out.write("<tr  bgcolor =#FEF7E9>\n");
      out.write("\t<td><font SIZE=\"2\" COLOR=\"black\" face =arial>CutOff %</font></td>\n");
      out.write("\t<td><input TYPE=\"text\" NAME=\"ccutoff\" size=30 maxlength=30 value=\"");
      out.print(g);
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("\t<td colspan=2 ><div align=\"center\"><br>\n");
      out.write("\t        <br>\n");
      out.write("\t  <input TYPE=\"reset\">\n");
      out.write("\t  &nbsp;&nbsp;\n");
      out.write("\t  <input TYPE=\"submit\" value=\"Edit\">\n");
      out.write("\t  <br>\n");
      out.write("\t  <br>\n");
      out.write("\t  <br>\n");
      out.write("\t  </div>\n");
      out.write("\t  <p><br></p></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("  <input class=USS_TEXT TYPE=\"hidden\" name=\"dob\"  value=''> \n");
      out.write("    <input class=USS_TEXT TYPE=\"hidden\" name=\"phone\"  value=''>\n");
      out.write("\n");
      out.write("<input class=USS_TEXT TYPE=\"hidden\" name=\"status\" value=\"new\">\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
 }//while
     
}
      catch(Exception e)
      {
         out.println(e); 
      }

      out.write("\n");
      out.write("    </body>\n");
      out.write("    </html>\n");
      out.write("\n");
      out.write("\n");
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
