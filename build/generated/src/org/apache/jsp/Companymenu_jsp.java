package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Companymenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"160\" height=\"593\" border=\"0\" bgcolor=\"#666734\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"118\" height=\"246\">\r\n");
      out.write("\t<td width=\"155\" valign=\"top\" bgcolor=\"#666734\"><p align=\"center\">&nbsp;</p>\r\n");
      out.write("      <p align=\"center\"><img src=\"logosit.jpg\" width=\"113\" height=\"112\" /></p>\r\n");
      out.write("\t    <p><a href=\"index.jsp\">Home</a><br>\r\n");
      out.write("        <a href=\"EditComProfile.jsp\">Edit Profile</a><br>\r\n");
      out.write("        <a href=\"ChangePassword.jsp\">Change Password</a><br>\r\n");
      out.write("        Job Details<br>\r\n");
      out.write("        <a href=\"AddJobDetails.jsp\">Add</a><br>\r\n");
      out.write("        <a href=\"ViewJobDetails.jsp\">View</a><br> \r\n");
      out.write("        Exam<br>\r\n");
      out.write("        <a href=\"ExamCreation.jsp\">Exam Creation</a><br>\r\n");
      out.write("        <a href=\"ExamView.jsp\">Exam View</a><br>\r\n");
      out.write("        Exam Results<br>\r\n");
      out.write("        Question<br>\r\n");
      out.write("        <a href=\"AddQuestions.jsp\">Add</a><br>\r\n");
      out.write("        <a href=\"ViewQues.jsp\">View</a><br>\r\n");
      out.write("        <a href=\"Login.jsp\">LogOut</a><br>\r\n");
      out.write("    </p></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
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
