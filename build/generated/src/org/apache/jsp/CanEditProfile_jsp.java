package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class CanEditProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <title>www.CarrierMithr.com</title>\r\n");
      out.write("        <script language=\"javascript\">\r\n");
      out.write("            function setVal(obj)\r\n");
      out.write("            {\r\n");
      out.write("                if(obj.checked==false)\r\n");
      out.write("                {\r\n");
      out.write("                    document.getElementById(\"expyears\").disabled=true;\r\n");
      out.write("                    document.getElementById(\"company\").disabled=true;\r\n");
      out.write("                    document.getElementById(\"designation\").disabled=true;\r\n");
      out.write("                    document.getElementById(\"salary\").disabled=true;\r\n");
      out.write("                    document.getElementById(\"comAddress\").disabled=true;\r\n");
      out.write("\r\n");
      out.write("                }else{\r\n");
      out.write("                    document.getElementById(\"expyears\").disabled=false;\r\n");
      out.write("                    document.getElementById(\"company\").disabled=false;\r\n");
      out.write("                    document.getElementById(\"designation\").disabled=false;\r\n");
      out.write("                    document.getElementById(\"salary\").disabled=false;\r\n");
      out.write("                    document.getElementById(\"comAddress\").disabled=false;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            function check()\r\n");
      out.write("            {\r\n");
      out.write("                var x=document.form1.name.value;\r\n");
      out.write("                var y=document.form1.college.value;\r\n");
      out.write("                var d=document.form1.markDegree.value;\r\n");
      out.write("                var a=document.form1.collegephone.value;\r\n");
      out.write("                var e=document.form1.telephone.value;\r\n");
      out.write("                var f=document.form1.pin.value;\r\n");
      out.write("                var g=document.form1.expyears.value;\r\n");
      out.write("                var h=document.form1.salary.value;\r\n");
      out.write("\r\n");
      out.write("                if(document.form1.name.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter Your Name\");\r\n");
      out.write("                    document.form1.name.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if(parseInt(x))\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter name Correctly\");\r\n");
      out.write("                    document.form1.name.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if(document.form1.college.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter College Name \");\r\n");
      out.write("                    document.form1.college.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if(parseInt(y))\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter College Name correctly\");\r\n");
      out.write("                    document.form1.college.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if(document.form1.collegephone.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter collegephone number \");\r\n");
      out.write("                    document.form1.collegephone.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if(!parseInt(a))\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter CollegePhone Integer\");\r\n");
      out.write("                    document.form1.collegephone.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if(((document.form1.collegephone.value.length)<6) || ((document.form1.collegephone.value.length)>11))\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Phone no: should contain atleast 6 integers \");\r\n");
      out.write("                    document.form1.collegephone.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if(document.form1.collegeemail.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter College email \");\r\n");
      out.write("                    document.form1.collegeemail.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if(document.form1.collegeemail.value.indexOf('@')==-1)\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Use @ email correctly\");\r\n");
      out.write("                    document.form1.collegeemail.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if(document.form1.collegeemail.value.indexOf('.')==-1)\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Use . email correctly\");\r\n");
      out.write("                    document.form1.collegeemail.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if(document.form1.markDegree.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter Degree mark\");\r\n");
      out.write("                    document.form1.markDegree.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if(!parseInt(d))\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter Integer\");\r\n");
      out.write("                    document.form1.markDegree.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if(parseInt(d).length<0||parseInt(d).length>100)\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter Degree % mark correctly  \");\r\n");
      out.write("                    document.form1.markDegree.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if(document.form1.email.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter email \");\r\n");
      out.write("                    document.form1.email.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if(document.form1.email.value.indexOf('@')==-1)\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Use @ email correctly\");\r\n");
      out.write("                    document.form1.email.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if(document.form1.email.value.indexOf('.')==-1)\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Use . email correctly\");\r\n");
      out.write("                    document.form1.email.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if(document.form1.telephone.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter phone number \");\r\n");
      out.write("                    document.form1.telephone.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if(!parseInt(e))\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter Ph Integer\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if(((document.form1.telephone.value.length)<6) || ((document.form1.telephone.value.length)>11))\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Phone no should contain atleast 6 integers \");\r\n");
      out.write("\r\n");
      out.write("                    document.form1.telephone.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if(document.form1.address.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter Address\");\r\n");
      out.write("                    document.form1.address.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if(document.form1.state.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Specify State\");\r\n");
      out.write("                    document.form1.address.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if(document.form1.pin.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter pin number \");\r\n");
      out.write("                    document.form1.pin.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if(!parseInt(f))\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter Integer\");\r\n");
      out.write("                    document.form1.pin.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else if((document.form1.pin.value.length)<6)\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Pin no: should contain 6 integers \");\r\n");
      out.write("                    document.form1.pin.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                if(document.getElementById(\"cat\").checked==true)\r\n");
      out.write("                {\r\n");
      out.write("                    if(document.getElementById(\"expyears\").value==\"\")\r\n");
      out.write("                    {\r\n");
      out.write("                        alert(\"Enter Exp years\");\r\n");
      out.write("                        document.getElementById(\"expyears\").focus();\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("\t\t\t\t\telse\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tvar expyr=document.getElementById(\"expyears\").value;\r\n");
      out.write("\t\t\t\t\tif (!parseInt(expyr)){\r\n");
      out.write("                            alert(\"Expyr invalid\");\r\n");
      out.write("                            return false;\r\n");
      out.write("                        }\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                    if(document.getElementById(\"company\").value==\"\")\r\n");
      out.write("                    {\r\n");
      out.write("                        alert(\"Enter Company\");\r\n");
      out.write("                        document.getElementById(\"company\").focus();\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    if(document.getElementById(\"designation\").value==\"\")\r\n");
      out.write("                    {\r\n");
      out.write("                        alert(\"Enter Designation\");\r\n");
      out.write("                        document.getElementById(\"designation\").focus();\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    if(document.getElementById(\"salary\").value==\"\")\r\n");
      out.write("                    {\r\n");
      out.write("                        alert(\"Enter Salary\");\r\n");
      out.write("                        document.getElementById(\"salary\").focus();\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }else{\r\n");
      out.write("                        var sal=document.getElementById(\"salary\").value;\r\n");
      out.write("                        if (!parseInt(sal)){\r\n");
      out.write("                            alert(\"Salary invalid\");\r\n");
      out.write("                            return false;\r\n");
      out.write("                        }\r\n");
      out.write("\t\t\t\t\t\tif(document.getElementById(\"comAddress\").value==\"\")\r\n");
      out.write("                    {\r\n");
      out.write("                        alert(\"Enter Company Address\");\r\n");
      out.write("                        document.getElementById(\"comAddress\").focus();\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                return true;\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body  onload=\"setVal(document.getElementById('cat'))\">\r\n");
      out.write("        <table width=\"104%\" height=\"628\" border=\"1\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td height=\"23\" colspan=\"2\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "CandidateHeader.jsp", out, false);
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"1%\" height=\"597\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Candidatemenu.jsp", out, false);
      out.write("</td>\r\n");
      out.write("                <td width=\"99%\"  bgcolor=\"#EBD9CD\">\r\n");
      out.write("                    ");
 try {

            String c1 = (String) session.getAttribute("s1");
            String c2 = (String) session.getAttribute("s2");


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam");


            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from Details where Username='" + c1 + "'");

            String s1 = null;
            String s2 = null;
            String s3 = null;
            String s4 = null;
            String s5 = null;
            String s6 = null;
            String s7 = null;
            String s8 = null;
            String s9 = null;
            String s10 = null;
            String s11 = null;

            String expyrs = "", company = "", desig = "", sal = "", comadd = "", category = "";
            while (rs.next()) {
                s1 = rs.getString(2);//name
                s2 = rs.getString(5);//colg
                s3 = rs.getString(6);//colgph
                s4 = rs.getString(7);//colgemail
                s5 = rs.getString(9);//mark
                s6 = rs.getString(11);//email
                s7 = rs.getString(12);//tph
                s8 = rs.getString(13);//add
                s9 = rs.getString(14);//state
                s10 = rs.getString(15);//pin
                s11 = rs.getString(16);//category

            }
            String sql = "select * from Experienced where Username='" + c1 + "'";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                expyrs = rs.getString(2);
                company = rs.getString(3);
                desig = rs.getString(4);
                sal = rs.getString(5);
                comadd = rs.getString(6);
                category = "Experienced";
            } else {
                category = "Fresher";
            }
                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <form method=\"POST\" action=\"savestudentedit.jsp\" name=\"form1\" onsubmit=\"return check()\">\r\n");
      out.write("                        <table border=0 cellpadding=3 cellspacing=0 width =81% align=center>\r\n");
      out.write("                            <tr bgcolor =#FEF7E9 wdth =100%>\r\n");
      out.write("                                <td colspan=\"2\" bgcolor=\"#E2E0CF\"><div align=\"center\"><font color=\"#386A78\" size=\"5\"><strong>Edit Profile</strong></font></div></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr bgcolor =#FEF7E9 wdth =100%>\r\n");
      out.write("                                <td width=\"48%\" bgcolor=\"#F3E8DA\"><strong><font color=\"#666600\" size=\"3\" face=\"Times New Roman, Times, serif\">Name&nbsp;\r\n");
      out.write("                                <font color=\"#993333\">(as in academic records)</font> </font></strong></td>\r\n");
      out.write("                                <td width=\"52%\" bgcolor=\"#F3E8DA\"><input TYPE=\"text\" NAME=\"name\" size=30\r\n");
      out.write("                                                                         maxlength=30 value='");
      out.print(s1);
      out.write("'>                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr bgcolor =#FEF7E9>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\">\r\n");
      out.write("                                    <strong><font SIZE=\"3\" COLOR=\"#666600\" face ='Times New Roman, Times, serif'>College in which studying</font> </strong>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\"><input TYPE=\"text\" NAME=\"college\" size=30 maxlength=30 value='");
      out.print(s2);
      out.write("'>                       </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr bgcolor =#FEF7E9>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\">\r\n");
      out.write("                                    <strong><font SIZE=\"3\" COLOR=\"#666600\" face ='Times New Roman, Times, serif'>College Phone</font> </strong>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\"><input TYPE=\"text\" NAME=\"collegephone\" size=30 maxlength=30                                       value='");
      out.print(s3);
      out.write("'><font SIZE=\"2\" COLOR=\"#CC0000\" face =arial (STD-No.)>                                 </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <strong><font SIZE=\"3\" COLOR=\"#666600\" face ='Times New Roman, Times, serif'>College Email</font> </strong>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td><input TYPE=\"text\" NAME=\"collegeemail\" size=30 maxlength=50 value='");
      out.print(s4);
      out.write("'>                                 </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr bgcolor =#FEF7E9>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\">\r\n");
      out.write("                                    <strong><font SIZE=\"3\" COLOR=\"#666600\" face ='Times New Roman, Times, serif'>% of Marks</font></strong>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\">\r\n");
      out.write("                                    <table width=\"111\" border=0 cellpadding=0 cellspacing=0>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td width=\"95\"><div align=\"center\"><font SIZE=\"2\" COLOR=\"#3366CC\" face =arial><strong>BCA / B.Sc. %</strong></font> </div></td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td><input TYPE=\"text\" NAME=\"markDegree\" size=8 maxlength=8 value='");
      out.print(s5);
      out.write("' onblur=\"checkDec('markBSC')\">                                              </td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr  bgcolor =#FEF7E9>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\">\r\n");
      out.write("                                    <strong><font SIZE=\"3\" COLOR=\"#666600\" face ='Times New Roman, Times, serif'>Email_id</font></strong>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\"><input TYPE=\"text\" NAME=\"email\" size=30 maxlength=30 value='");
      out.print(s6);
      out.write("'></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("                                <td>\r\n");
      out.write("                                <strong><font SIZE=\"3\" COLOR=\"#666600\" face ='Times New Roman, Times, serif'>Telephone Number</font> </strong></td>\r\n");
      out.write("                                <td><input NAME=\"telephone\" TYPE=\"text\" id=\"telephone\" value=\"");
      out.print(s7);
      out.write("\">\r\n");
      out.write("                                    <font SIZE=\"2\" COLOR=\"#CC0000\" face ='arial'>(STD-No.)  </font>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr  bgcolor =#FEF7E9>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\" ><strong><font face=\"Times New Roman, Times, serif\" color=#666600 size=3>Address</font> </strong></td>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\">\r\n");
      out.write("                                    <input class=USS_TEXT maxLength=30 name=\"address\" size=40 value='");
      out.print(s8);
      out.write("'><b><font face=\"ARIAL, HELVETICA\" color=red size=+2></font></b>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("                                <td><strong><font face=\"Times New Roman, Times, serif\" color=#666600 size=3>State</font> </strong></td>\r\n");
      out.write("                                <td><select name=state> <option selected value='");
      out.print(s9);
      out.write("'>Select State</option>\r\n");
      out.write("                                        <option value=AP>Andhra Pradesh</option> <option value=AR>Arunachal\r\n");
      out.write("                                        Pradesh</option> <option value=AS>Assam</option> <option\r\n");
      out.write("                                            value=BR>Bihar</option> <option value=CH>Chandigarh</option> <option\r\n");
      out.write("                                            value=CG>Chattisgarh</option> <option value=DL>Delhi</option> <option\r\n");
      out.write("                                            value=GA>Goa</option> <option value=GJ>Gujarat</option> <option\r\n");
      out.write("                                            value=HR>Haryana</option> <option value=HP>Himachal Pradesh</option>\r\n");
      out.write("                                        <option value=JK>Jammu &amp; Kashmir</option> <option\r\n");
      out.write("                                            value=JH>Jharkhand</option> <option value=KA>Karnataka</option> <option\r\n");
      out.write("                                            value=KL>Kerala</option> <option value=MP>Madhya Pradesh</option>\r\n");
      out.write("                                        <option value=MH>Maharashtra</option> <option value=MN>Manipur</option>\r\n");
      out.write("                                        <option value=ML>Meghalaya</option> <option value=MZ>Mizoram</option>\r\n");
      out.write("                                        <option value=NL>Nagaland</option> <option value=OR>Orissa</option>\r\n");
      out.write("                                        <option value=PY>Pondicherry</option> <option value=PB>Punjab</option>\r\n");
      out.write("                                        <option value=RJ>Rajasthan</option> <option value=SK>Sikkim</option>\r\n");
      out.write("                                        <option value=TN>Tamilnadu</option> <option value=TR>Tripura</option>\r\n");
      out.write("                                        <option value=UA>Uttaranchal</option> <option value=UP>Uttar\r\n");
      out.write("                                        Pradesh</option> <option value=WB>West Bengal</option> <option\r\n");
      out.write("                                    value=XX>Others</option></select><br>                           </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\">\r\n");
      out.write("                                    <strong><FONT face=\"Times New Roman, Times, serif\" color=#666600 size=3>Pincode</FONT> </strong>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\"><INPUT class=USS_TEXT maxLength=6 name=\"pin\" size=6 value='");
      out.print(s10);
      out.write("'><B>\r\n");
      out.write("                                    <FONT face=\"ARIAL, HELVETICA\" color=red size=+2></FONT></B>\r\n");
      out.write("                                    <input type=\"hidden\" name=\"category\" id=\"category\" value=\"");
      out.print(category);
      out.write("\" />\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            ");

     if (s11.equalsIgnoreCase("Fresher")) {
                            
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <strong><font SIZE=\"3\" COLOR=\"#666600\" face ='Times New Roman, Times, serif'>Category</font></strong>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td align=\"left\" >\r\n");
      out.write("                                    <input type=\"checkbox\" name=\"cat\" id=\"cat\"  value='Experienced'  onclick=\"setVal(this);\" />Experienced\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            ");
     }

                            
      out.write("\r\n");
      out.write("                            <tr bgcolor =#FEF7E9>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\">\r\n");
      out.write("                                    <strong><font SIZE=\"3\" COLOR=\"#666600\" face ='Times New Roman, Times, serif'>Experienced Years</font></strong>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\"><input TYPE=\"text\" NAME=\"expyears\" id=\"expyears\" size=30 maxlength=30 value=\"");
      out.print(expyrs);
      out.write("\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr bgcolor =#FEF7E9>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\"><strong><font SIZE=\"3\" COLOR=\"#666600\" face ='Times New Roman, Times, serif'>Company</font></strong></td>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\"><input TYPE=\"text\" NAME=\"company\" id=\"company\" size=30 maxlength=30 value=\"");
      out.print(company);
      out.write("\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr bgcolor =#FEF7E9>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\"><strong><font SIZE=\"3\" COLOR=\"#666600\" face ='Times New Roman, Times, serif'>Designation </font></strong></td>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\"><input TYPE=\"text\" NAME=\"designation\" id=\"designation\" size=30 maxlength=30 value=\"");
      out.print(desig);
      out.write("\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr bgcolor =#FEF7E9>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\"><strong><font SIZE=\"3\" COLOR=\"#666600\" face ='Times New Roman, Times, serif'>Salary</font></strong></td>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\"><input TYPE=\"text\" NAME=\"salary\" id=\"salary\" size=30 maxlength=30 value=\"");
      out.print(sal);
      out.write("\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr bgcolor =#FEF7E9>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\"><strong><font SIZE=\"3\" COLOR=\"#666600\" face ='Times New Roman, Times, serif'>Company Address</font></strong></td>\r\n");
      out.write("                                <td bgcolor=\"#F3E8DA\"><input TYPE=\"text\" NAME=\"comAddress\" id=\"comAddress\" size=30 maxlength=30 value=\"");
      out.print(comadd);
      out.write("\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td height=\"49\" colspan=2 align=\"center\" ><input TYPE=\"submit\" value=\"Edit\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                    ");
// }//while
        }//try
        catch (Exception e) {
            out.println(e);
        }

                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
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
