<%@page import="java.io.*,java.sql.*;"session="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
        Connection con = null;
        Statement st = null, st2 = null;
        ResultSet rs = null;
        String sql = null;
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:OnlineExam");
            st = con.createStatement();
        } catch (Exception ex) {
            out.println("Error: " + ex.toString());
        }
%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>JSP Page</title>
        <style type="text/css">
            <!--
.style15 {
	font-family: "Comic Sans MS";
	font-size: 24px;
	color: #990000;
}
.style17 {color: #CAF2FF}
.style18 {font-weight: bold; font-size: 18px;}
            -->
        </style>
</head>
    <body style="margin:0px" bgcolor="#FFFFFF">
        <table width="100%" border="1" bgcolor="#FFFFFF">
            <tr>
                <td height="107" colspan="2"><jsp:include page="CandidateHeader.jsp"/></td>
            </tr>
            <tr>
                <td width="1" height="512"><jsp:include page="Candidatemenu.jsp"/></td>
                <td width="961" bgcolor="#CCCC99" valign="top"><table width="967" height="788" border="1">
                  <tr>
                    <td width="957" height="34"><div align="center"><span class="style15">Online Exam </span></div></td>
                  </tr>
                  <tr>
                    <td height="703" valign="top"><table width="565" border="1" align="center">
                      <tr>
                        <td width="573" height="123" valign="top" bgcolor="#666600"><div align="justify" class="style17"><span class="style18"> The duration of the exam is 5 minutes. There is no order to answer a question.You may use Next as well as Previous button to get a question to answer. </span></div></td>
                      </tr>
                      <tr>
                        <td valign="top"><form name="form1" method="post" action="ExamConduct.jsp">
                          <label>
                            <div align="center">
                              <input name="Submit" type="submit" class="style18" value="Start Exam">
                              </div>
                          </label>
                        </form>
                        </td>
                      </tr>
                    </table></td>
                  </tr>
                  <tr>
                    <td height="41">&nbsp;</td>
                  </tr>
                </table></td>
            </tr>
        </table>
    </body>
</html>
