package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Userlog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>UserLogin</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <input type=\"hidden\" id=\"status\" value=\"");
      out.print(request.getAttribute("status") );
      out.write("\">\n");
      out.write("           <form action=\"userLog\" method=\"post\">\n");
      out.write("  <div class=\"imgcontainer\">\n");
      out.write("    <img src=\"kisspng.jpg\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("  </div>\n");
      out.write("      <center>\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <label for=\"uname\"><b>Username</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Username\" name=\"username\" required><br><br>\n");
      out.write("\n");
      out.write("    <label for=\"psw\"><b>Password</b></label>\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required><br><br>\n");
      out.write("        \n");
      out.write("    <button type=\"submit\">Login</button>&ensp;&ensp;<button  type=\"reset\" class=\"cancelbtn\">Cancel</button><br><br>\n");
      out.write("    <label>\n");
      out.write("      <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Remember me&ensp;&ensp;\n");
      out.write("     <a href=\"userReg.jsp\">Sign-Up</a>\n");
      out.write("    </label>\n");
      out.write("        \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("      </center>\n");
      out.write("</form>\n");
      out.write("             <link rel=\" stylesheet\" href=\"alret/dist/sweetalert.css\">\n");
      out.write("        <script>\n");
      out.write("            var status=document.getElementById(\"status\").value;\n");
      out.write("            if(status === \"failed\"){\n");
      out.write("                alert(\"wrong user name or password!\");\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
