<%@page import="java.io.*,java.sql.*;" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>www.CarrierMithr.com</title>
    </head>
    <body bgcolor="#D9EEFB">
        <p>
            <% try {

                            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                            Connection con = DriverManager.getConnection("jdbc:odbc:OnlineExam", "", "");
                            Statement st = con.createStatement();
                            Statement st2 = con.createStatement();
                            Statement st3 = con.createStatement();
                            String status = "s";
                            st2.executeUpdate("insert into Login values('" + request.getParameter("Username") + "','" + request.getParameter("Password") + "','" + status + "')");
                            st.executeUpdate("insert into Details values('" + request.getParameter("Username") + "','" + request.getParameter("Name") + "','" + request.getParameter("Gender") + "','" + request.getParameter("DateOfBirth") + "','" + request.getParameter("College") + "','" + request.getParameter("CollegePhone") + "','" + request.getParameter("CollegeEmail") + "','" + request.getParameter("Branch") + "','" + request.getParameter("Mark") + "','" + request.getParameter("Degree") + "','" + request.getParameter("Email_id") + "','" + request.getParameter("Telephone") + "','" + request.getParameter("Address") + "','" + request.getParameter("State") + "','" + request.getParameter("Pincode") + "','" + request.getParameter("Category") + "')");
                            if (request.getParameter("sel_cat").equals("Experienced")) {
                                st3.executeUpdate("insert into Experienced values('" + request.getParameter("Username") + "','" + request.getParameter("ExpYears") + "','" + request.getParameter("Company") + "','" + request.getParameter("Designation") + "','" + request.getParameter("Salary") + "','" + request.getParameter("ComAddress") + "')");
                            }
                            st.close();
                            st2.close();
                            st3.close();
                        } catch (Exception e) {
                            out.println(e);
                        }

            %>

            <font color="red" size="5"> You have registered successfully!!!<br>
            </font></p>
        <p><a href="Login.jsp"><strong>Go Forward</strong></a></p>
    </body>
</html>

