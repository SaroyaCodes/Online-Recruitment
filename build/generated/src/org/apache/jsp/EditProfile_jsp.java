package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class EditProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>www.CarrierMithr.com</title>\n");
      out.write("        <script language=\"javascript\">\n");
      out.write("        function setVal(obj)\n");
      out.write("         {\n");
      out.write("             \n");
      out.write("             if(obj.value=='f')\n");
      out.write("                 {\n");
      out.write("                     form1.expyears.disabled=true;\n");
      out.write("                     form1.company.disabled=true;\n");
      out.write("                     form1.designation.disabled=true;\n");
      out.write("                     form1.salary.disabled=true;\n");
      out.write("                     form1.comAddress.disabled=true;\n");
      out.write("                 }\n");
      out.write("                 else{\n");
      out.write("                     form1.expyears.disabled=false;\n");
      out.write("                     form1.company.disabled=false;\n");
      out.write("                     form1.designation.disabled=false;\n");
      out.write("                     form1.salary.disabled=false;\n");
      out.write("                     form1.comAddress.disabled=false;\n");
      out.write("                 }\n");
      out.write("         }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("<body bgcolor=\"#FFFFFF\" text=\"#0033FF\" link=\"#CC6600\">\n");
      out.write("    ");
 try {

                String c1 = (String)session.getAttribute("s1");
                String c2 = (String)session.getAttribute("s2");
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");

                Statement st = con.createStatement();

                ResultSet rs = st.executeQuery("select * from Details where Username='" + c1 + "'");
            
                String s1=null;
                String s2=null;
                String s3=null;
                String s4=null;
                String s5=null;
                String s6=null;
                String s7=null;
                String s8=null;
                String s9=null;
                String s10=null;
                String s11=null;
                
                while (rs.next())
                    {  
                    s1=rs.getString(2);//name
                    s2=rs.getString(5);//colg
                    s3=rs.getString(6);//colgph
                    s4=rs.getString(7);//colgemail
                    s5=rs.getString(9);//mark
                    s6=rs.getString(11);//email
                    s7=rs.getString(12);//tph
                    s8=rs.getString(13);//add
                    s9=rs.getString(14);//state
                    s10=rs.getString(15);//pin
                    s11=rs.getString(16);//category
                    
                    }
      
      out.write("\n");
      out.write("            <form method=\"POST\" action=\"savestudentedit.jsp\" name=\"form1\">\n");
      out.write("              <table border=0 cellpadding=3 cellspacing=0 width =64% align=center>\n");
      out.write("              <tr bgcolor =#FEF7E9 wdth =100%>\n");
      out.write("                <td width=\"44%\"><font SIZE=\"2\" COLOR=\"black\" face =arial >Name&nbsp;</font>                                     <font color=\"blue\"> (as in academic records)</font>                </td>\n");
      out.write("\t                             <td width=\"56%\"><input TYPE=\"text\" NAME=\"name\" size=30 \n");
      out.write("                                       maxlength=30 value='");
      out.print(s1);
      out.write("'>\n");
      out.write("                </td>\n");
      out.write("                </tr>\n");
      out.write("                           <tr bgcolor =#FEF7E9>\n");
      out.write("\t                             <td><font SIZE=\"2\" COLOR=\"black\" face =arial>College in which studying</font>                  </td>\n");
      out.write("\t                             <td><input TYPE=\"text\" NAME=\"college\" size=30 maxlength=30 value='");
      out.print(s2);
      out.write("'>                       </td>\n");
      out.write("                           </tr>\n");
      out.write("                           <tr bgcolor =#FEF7E9>\n");
      out.write("\t                             <td><font SIZE=\"2\" COLOR=\"black\" face =arial>College Phone</font>                                 </td>\n");
      out.write("\t                             <td><input TYPE=\"text\" NAME=\"collegephone\" size=30 maxlength=30                                       value='");
      out.print(s3);
      out.write("'><font SIZE=\"2\" COLOR=\"#CC0000\" face =arial (STD-No.)>\n");
      out.write("                                 </td>\n");
      out.write("                           </tr>\n");
      out.write("                           <tr bgcolor =#FEF7E9>\n");
      out.write("\t                             <td><font SIZE=\"2\" COLOR=\"black\" face =arial>College Email</font>                                 </td>\n");
      out.write("\t                             <td><input TYPE=\"text\" NAME=\"collegeemail\" size=30 maxlength=50                                        value='");
      out.print(s4);
      out.write("'>\n");
      out.write("                                 </td>\n");
      out.write("                           </tr>\n");
      out.write("              <tr bgcolor =#FEF7E9>\n");
      out.write("                <td><font SIZE=\"2\" COLOR=\"black\" face =arial>% of Marks</font></td>\n");
      out.write("\t                           <td>\n");
      out.write("                                 <table border=0 cellpadding=0 cellspacing=0>\n");
      out.write("\t\t                                <tr>\n");
      out.write("\t\t                                     <td><font SIZE=\"1\" COLOR=\"black\" face =arial>BCA / B.Sc. %</font>                                </td>\n");
      out.write("\t\t                               </tr>\n");
      out.write("\t\t                               <tr>\n");
      out.write("                                              <td><input TYPE=\"text\" NAME=\"markDegree\" size=5 maxlength=5 value='");
      out.print(s5);
      out.write("' onblur=\"checkDec('markBSC')\">\n");
      out.write("                                              </td>\n");
      out.write("\t\t                               </tr>\n");
      out.write("\t                             </table>\n");
      out.write("\t                           </td>\n");
      out.write("                           </tr>\n");
      out.write("              <tr  bgcolor =#FEF7E9>\n");
      out.write("                <td><font SIZE=\"2\" COLOR=\"black\" face =arial>Email_id</font></td>\n");
      out.write("\t                            <td><input TYPE=\"text\" NAME=\"email\" size=30 maxlength=30 value='");
      out.print(s6);
      out.write("'></td>\n");
      out.write("                           </tr>\n");
      out.write("                           <tr>\n");
      out.write("\t                            <td><font SIZE=\"2\" COLOR=\"black\" face =arial>Telephone Number</font>                           </td>\n");
      out.write("\t                            <td><input TYPE=\"text\" NAME=\"telephone\" size=4 maxlength=4 value='");
      out.print(s7);
      out.write("'><input TYPE=\"text\" NAME=\"phone1\" value=\"\"><font SIZE=\"2\" COLOR=\"#CC0000\" face =arial>(STD-No.)                       </td>\n");
      out.write("                          </tr>\n");
      out.write("                          <tr  bgcolor =#FEF7E9>\n");
      out.write("                             <td ><font face=\"Arial, helvetica\" color=#000000 size=-1>Address</font>                        </td>\n");
      out.write("                             <td><input class=USS_TEXT maxLength=30 name=\"address\" size=40 value='");
      out.print(s8);
      out.write("'><b><font face=\"ARIAL, HELVETICA\" color=red size=+2></font></b>\n");
      out.write("                             </td>\n");
      out.write("                         </tr>\n");
      out.write("                         <tr>\n");
      out.write("                             <td><font face=\"Arial, helvetica\" color=#000000 size=-1>State</font>                             </td>\n");
      out.write("                             <td><select name=state> <option selected value='");
      out.print(s9);
      out.write("'>Select State</option> \n");
      out.write("        <option value=AP>Andhra Pradesh</option> <option value=AR>Arunachal \n");
      out.write("        Pradesh</option> <option value=AS>Assam</option> <option \n");
      out.write("        value=BR>Bihar</option> <option value=CH>Chandigarh</option> <option \n");
      out.write("        value=CG>Chattisgarh</option> <option value=DL>Delhi</option> <option \n");
      out.write("        value=GA>Goa</option> <option value=GJ>Gujarat</option> <option \n");
      out.write("        value=HR>Haryana</option> <option value=HP>Himachal Pradesh</option> \n");
      out.write("        <option value=JK>Jammu &amp; Kashmir</option> <option \n");
      out.write("        value=JH>Jharkhand</option> <option value=KA>Karnataka</option> <option \n");
      out.write("        value=KL>Kerala</option> <option value=MP>Madhya Pradesh</option> \n");
      out.write("        <option value=MH>Maharashtra</option> <option value=MN>Manipur</option> \n");
      out.write("        <option value=ML>Meghalaya</option> <option value=MZ>Mizoram</option> \n");
      out.write("        <option value=NL>Nagaland</option> <option value=OR>Orissa</option> \n");
      out.write("        <option value=PY>Pondicherry</option> <option value=PB>Punjab</option> \n");
      out.write("        <option value=RJ>Rajasthan</option> <option value=SK>Sikkim</option> \n");
      out.write("        <option value=TN>Tamilnadu</option> <option value=TR>Tripura</option> \n");
      out.write("        <option value=UA>Uttaranchal</option> <option value=UP>Uttar \n");
      out.write("        Pradesh</option> <option value=WB>West Bengal</option> <option\n");
      out.write("        value=XX>Others</option></select><br>\n");
      out.write("                              </td>\n");
      out.write("                             </tr>\n");
      out.write("                       <tr>\n");
      out.write("                              <td><FONT face=\"Arial, helvetica\" color=#000000 size=-1>Pincode</B></FONT>                       </td>\n");
      out.write("                              <td><INPUT class=USS_TEXT maxLength=6 name=\"pin\" size=6 value='");
      out.print(s10);
      out.write("'><B><FONT face=\"ARIAL, HELVETICA\" color=red size=+2></FONT></B>\n");
      out.write("                              </td>\n");
      out.write("                       </tr>\n");
      out.write("        ");

        if(s11.equals("Fresher"))
            {
        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                              <td><font SIZE=\"2\" COLOR=\"black\" face =arial>Category</font></td>\n");
      out.write("\t                          <td align=\"left\" ><input type=\"radio\" name=\"cat\"  value='Fresher' onclick=\"setVal(this);\"/>Fresher\n");
      out.write("                                      <input type=\"radio\" name=\"cat\"  value='Experienced' onclick=\"setVal(this);\" />Experienced\n");
      out.write("                               </td>\n");
      out.write("                        </tr>\n");
      out.write("  ");

                }
 
      out.write("\n");
      out.write("                        <tr bgcolor =#FEF7E9>\n");
      out.write("\t                           <td><font SIZE=\"2\" COLOR=\"black\" face =arial>Experienced Years</font></td>\n");
      out.write("\t                           <td><input TYPE=\"text\" NAME=\"expyears\" size=30 maxlength=30></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr bgcolor =#FEF7E9>\n");
      out.write("\t                            <td><font SIZE=\"2\" COLOR=\"black\" face =arial>Company</font></td>\n");
      out.write("\t                            <td><input TYPE=\"text\" NAME=\"company\" size=30 maxlength=30></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr bgcolor =#FEF7E9>\n");
      out.write("\t                         <td><font SIZE=\"2\" COLOR=\"black\" face =arial>Designation </font></td>\n");
      out.write("\t                         <td><input TYPE=\"text\" NAME=\"designation\" size=30 maxlength=30></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr bgcolor =#FEF7E9>\n");
      out.write("\t                         <td><font SIZE=\"2\" COLOR=\"black\" face =arial>Salary</font></td>\n");
      out.write("\t                         <td><input TYPE=\"text\" NAME=\"salary\" size=30 maxlength=30></td>\n");
      out.write("                        </tr>\n");
      out.write("                       <tr bgcolor =#FEF7E9>\n");
      out.write("\t                      <td><font SIZE=\"2\" COLOR=\"black\" face =arial>Company Address</font></td>\n");
      out.write("\t                      <td><input TYPE=\"text\" NAME=\"comAddress\" size=30 maxlength=30></td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                         <td height=\"49\" colspan=2 align=\"center\" ><input TYPE=\"submit\" value=\"submit\"></td>\n");
      out.write("                </tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write(" ");
// }//while
  }//try 
    catch (Exception e)
            {
               out.println(e);
            }
    
    
      out.write(" \n");
      out.write("</body>\n");
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
