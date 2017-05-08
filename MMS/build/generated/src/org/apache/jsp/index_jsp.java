package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import pck.javaclass;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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


javaclass obj=new javaclass();
//obj.clusn=(request.getParameter("txtuser"));
//obj.clpwd = (request.getParameter("txtpass"));
 ResultSet rs=obj.check();

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <style>\n");
      out.write("          a {\n");
      out.write("    color: hotpink;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("html { height: 100% }\n");
      out.write("body {\n");
      out.write("    background-color: #dddddd;\n");
      out.write("    background-image: -webkit-gradient(radial, 50% 0%,100,50% 150%,100, from(#333333), to(#dddddd));\n");
      out.write("    background-image: -webkit-radial-gradient(50% 100%, #dddddd, #333333);\n");
      out.write("    background-image: -moz-radial-gradient(50% 100%, #dddddd, #333333);\n");
      out.write("    background-image: -o-radial-gradient(50% 100%, #dddddd, #333333);\n");
      out.write("    background-image: -ms-radial-gradient(50% 100%, #dddddd, #333333);\n");
      out.write("    background-image: radial-gradient(50% 100%, #dddddd, #333333);\n");
      out.write("    color: #fff;\n");
      out.write("    overflow: hidden;\n");
      out.write("    height: 100%;\n");
      out.write("    -webkit-text-size-adjust: 100%; /* Stops Mobile Safari from auto-adjusting font-sizes */\n");
      out.write("}\n");
      out.write(".hidden {\n");
      out.write("    display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Login</h1>\n");
      out.write("\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("         <Div>\n");
      out.write("                    <form name=\"flogin\" action=\"sendmail.jsp\" method=\"POST\">\n");
      out.write("                        <table border=\"0\"align=\"center\">\n");
      out.write("                        \n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>UserName</td>\n");
      out.write("                                    <td><input type=\"text\" id=\"unam\" name=\"txtuser\" value=\"\" size=\"50\" /></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>password</td>\n");
      out.write("                                    <td><input type=\"password\" id=\"upass\" name=\"txtpass\" value=\"\" size=\"50\" /></td>  \n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td> </td>   <td>\n");
      out.write("                            <!--<input type=\"submit\" value=\"Submit\" name=\"butsubmit\" />-->\n");
      out.write("                             <input type=\"reset\" value=\"Clear\" name=\"butclear\" />\n");
      out.write("                  \n");
      out.write("                            <input type=\"button\" id=\"log\" value=\"Login\" onclick=\"myFunction();\"/>\n");
      out.write("                             \n");
      out.write("                           \n");
      out.write("                                                </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr colspan=\"2\">\n");
      out.write("                                  </td><a href=\"signup.jsp\">   New User (Sign UP)</a></td>\n");
      out.write("                                    </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                    </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("           <script>\n");
      out.write("               if (typeof(Storage) !== \"undefined\") {\n");
      out.write("    // Store\n");
      out.write("    localStorage.setItem(\"lastname\", \"Smith\");\n");
      out.write("    // Retrieve\n");
      out.write("   // document.getElementById(\"result\").innerHTML = localStorage.getItem(\"lastname\");\n");
      out.write("} else {\n");
      out.write("    document.getElementById(\"result\").innerHTML = \"Sorry, your browser does not support Web Storage...\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            function myFunction()\n");
      out.write("            {\n");
      out.write("                  var e = document.getElementById(\"mySelect\");\n");
      out.write("           var x = document.getElementById(\"mySelect\").length;\n");
      out.write("          //  var usn = obj.clusn;\n");
      out.write("           // var pwd= obj.clpwd;\n");
      out.write("          var usn=document.flogin.txtuser.value;\n");
      out.write("          var pwd =document.flogin.txtpass.value;\n");
      out.write("            var f = document.getElementById(\"pwdid\");\n");
      out.write("           var i=0;\n");
      out.write("             var j=0;\n");
      out.write("             var usee;\n");
      out.write("             var pas;\n");
      out.write("            for (i = 0; i < x; i++)\n");
      out.write("             {\n");
      out.write("                  Usee = e.options[i].value;\n");
      out.write("                  pas = f.options[i].value;\n");
      out.write("          // document.getElementById(\"output\").innerHTML = pas\n");
      out.write("       // document.getElementById(\"output\").innerHTML = x+ e.options[i].value;\n");
      out.write("             \n");
      out.write("              if((usn === e.options[i].value) && (pas == pwd))\n");
      out.write("                   {\n");
      out.write("                       \n");
      out.write("                                       j=1;\n");
      out.write("                                       document.cookie=usn;\n");
      out.write("                   }\n");
      out.write("              }\n");
      out.write("if(j===1)\n");
      out.write("    {\n");
      out.write("    window.open(\"sendmail.jsp?lol=\" + usn + \"\",\"_self\");\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    else\n");
      out.write("        { \n");
      out.write("  alert(\"Please Enter Valid Username And Password\");\n");
      out.write("  window.open(\"index.jsp\",\"_self\");\n");
      out.write("       }\n");
      out.write("        \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </script>    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <!--         <table border=\"1px\" class=\"hidden\" > \n");
      out.write("                <tr>\n");
      out.write("           \n");
      out.write("                <td>\n");
      out.write("                     user id :\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    pass:\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("                </tr>\n");
      out.write("                ");

                   while(rs.next())
                {
      out.write("\n");
      out.write("     <tr>\n");
      out.write("                        \n");
      out.write("        \n");
      out.write("\n");
      out.write("       <td>");
      out.print(rs.getString("tbuname"));
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td>");
      out.print(rs.getString("tbpass"));
      out.write("\n");
      out.write("        </td>\n");
      out.write("  </tr>                      \n");
      out.write(" \n");
 
                            }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    
     rs=obj.check();

      out.write("\n");
      out.write("<div align=\"center\">\n");
      out.write(" <select id=\"mySelect\" align=\"center\" name=\"user\" class=\"hidden\">\n");

                   while(rs.next())
                {
      out.write("\n");
      out.write("\n");
      out.write("      <option>");
      out.print(rs.getString("tbuname"));
      out.write("</option>\n");
      out.write("      \n");
      out.write("    \n");
      out.write(" \n");
      out.write("      ");
 
                            }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" </select>\n");

    
     rs=obj.check();

      out.write("\n");
      out.write(" <select id=\"pwdid\" align=\"center\" name=\"user\" class=\"hidden\" >\n");

                   while(rs.next())
                {
      out.write("\n");
      out.write("\n");
      out.write("      <option>");
      out.print(rs.getString("tbpass"));
      out.write("</option> \n");
      out.write("      ");
 
                            }

      out.write("\n");
      out.write(" </select>\n");
      out.write(" <script>\n");
      out.write("     \n");
      out.write("   document.getElementById('unam').addEventListener('keypress', handlePress);\n");
      out.write("document.getElementById('upass').addEventListener('keypress', handlePress);\n");
      out.write("\n");
      out.write("function handlePress(evt) \n");
      out.write("{\n");
      out.write("    if( evt.keyCode === 13 )\n");
      out.write("    {\n");
      out.write("        // execute your function here\n");
      out.write("       // alert('Enter pressed while in desired text input');\n");
      out.write("        document.getElementById(\"log\").focus();\n");
      out.write("    }\n");
      out.write("}  \n");
      out.write("     \n");
      out.write(" </script>\n");
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
