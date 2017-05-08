package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import pck.contact;

public final class contactinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write(" ");
   contact ob=new contact(); 
               
            
                 ResultSet rs=ob.getall();
            
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"mycss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"loadcon();\">\n");
      out.write("       \n");
      out.write("         <nav id=\"nav\">\t\n");
      out.write("\t<ul>\t\t\n");
      out.write("\t\t<li>\n");
      out.write("                   \n");
      out.write("\t\t\t<a href=\"sendmail.jsp\"><span>Send Mail</span></a>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li>\n");
      out.write("                    <a href=\"Contact.jsp\"><span>Contact</span></a>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li>\n");
      out.write("\t\t\t<a href=\"contactinfo.jsp\"><span>Contact-Info</span></a>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li>\n");
      out.write("\t\t\t<a href=\"sent_mail.jsp\"><span>Sent Mails</span></a>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t\n");
      out.write("                <li>\n");
      out.write("\t\t\t<a href=\"index.jsp\"><span>Logout</span></a>\n");
      out.write("\t\t</li>\n");
      out.write("\t</ul>\n");
      out.write("</nav> \n");
      out.write("\n");
      out.write("        \n");
      out.write("        <br/>\n");
      out.write("        <script>\n");
      out.write("             function loadcon()\n");
      out.write("    { var co= document.cookie;\n");
      out.write("       \n");
      out.write("                \n");
      out.write("     \n");
      out.write("    }\n");
      out.write("            </script>\n");
      out.write("            \n");
      out.write("            <table border=\"1\" align=\"center\">\n");
      out.write("                \n");
      out.write("                <tbody>\n");
      out.write("                <tr>\n");
      out.write("            \n");
      out.write("                 <td>\n");
      out.write("                     Contact Name\n");
      out.write("                 </td>\n");
      out.write("                 <td>\n");
      out.write("                      E-mail\n");
      out.write("                  </td>\n");
      out.write("                  <td>\n");
      out.write("                      Group Name\n");
      out.write("                  </td>\n");
      out.write("                 </tr>\n");
      out.write("                 ");

                   while(rs.next())
                       
                {
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                   \n");
      out.write("                  \n");
      out.write("                    <td id=\"cnam\">");
      out.print(rs.getString("cname"));
      out.write("</td>\n");
      out.write("                    <td id=\"emai\">");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("                    <td id=\"group\">");
      out.print(rs.getString("groupn"));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("<div class='hidde'>\n");
      out.write("     \n");
      out.write(" ");

    rs=ob.getall();
 
      out.write("\n");
      out.write(" \n");
      out.write(" <select id=\"c0\" align=\"center\" name=\"user1\" >\n");

                   while(rs.next())
                {
      out.write("\n");
      out.write("     <option>");
      out.print(rs.getString("uid"));
      out.write("</option>\n");
      out.write("      ");
}

      out.write("\n");
      out.write("\n");
      out.write(" ");

    rs=ob.getall();
 
      out.write("           \n");
      out.write("<select id=\"c1\" align=\"center\" name=\"user1\" >\n");

                   while(rs.next())
                {
      out.write("\n");
      out.write("     <option>");
      out.print(rs.getString("cname"));
      out.write("</option>\n");
      out.write("      ");
}

      out.write("\n");
      out.write(" </select>\n");

    rs=ob.getall();
 
      out.write("\n");
      out.write(" <select id=\"c2\" align=\"center\" name=\"user2\"  >\n");

                   while(rs.next())
                {
      out.write("\n");
      out.write("\n");
      out.write("      <option>");
      out.print(rs.getString("email"));
      out.write("</option> \n");
      out.write("      ");
 
                            }

      out.write("\n");
      out.write(" </select>\n");
      out.write(" ");

    rs=ob.getall();
     

      out.write("\n");
      out.write(" <select id=\"c3\" align=\"center\" name=\"user2\"  >\n");

                   while(rs.next())
                {
      out.write("\n");
      out.write("\n");
      out.write("      <option>");
      out.print(rs.getString("groupn"));
      out.write("</option> \n");
      out.write("      ");
 
                            }

      out.write("\n");
      out.write(" </select>\n");
      out.write("</div>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
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
