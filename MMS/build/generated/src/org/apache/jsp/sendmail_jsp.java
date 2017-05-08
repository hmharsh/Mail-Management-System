package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import pck.javaclass;
import pck.contact;

public final class sendmail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("  ");
   contact ob=new contact(); 
               
            
                 ResultSet rs=ob.getall();
            
      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Mail</title>\n");
      out.write("          <style>\n");
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
      out.write("/* Navi */\n");
      out.write("#nav {\n");
      out.write("    width: 800px;\n");
      out.write("    margin: 25px auto;\n");
      out.write("    overflow: hidden;\n");
      out.write("}\n");
      out.write("#nav ul {\n");
      out.write("    float: left;\n");
      out.write("    height: 25px;\n");
      out.write("    width: 800px;\n");
      out.write("    opacity: 0.95;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    list-style-type: none;\n");
      out.write("    box-shadow: 0 250px 150px rgba(0,0,0,.2);\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("}\n");
      out.write("#nav ul li {\n");
      out.write("    float: left;\n");
      out.write("    height: 25px;\n");
      out.write("}\n");
      out.write("#nav ul li a {\n");
      out.write("    font: bold 21px/24px \"Lato\",\"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("    display: block;\n");
      out.write("    height: 25px;\n");
      out.write("    border-bottom: 5px solid #143157;\n");
      out.write("    background-color: #0f6fb2;\n");
      out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(rgb(15, 111, 178)), to(rgb(34, 65, 112)));\n");
      out.write("    background-image: -webkit-linear-gradient(top, rgb(15, 111, 178), rgb(34, 65, 112));\n");
      out.write("    background-image: -moz-linear-gradient(top, rgb(15, 111, 178), rgb(34, 65, 112));\n");
      out.write("    background-image: -o-linear-gradient(top, rgb(15, 111, 178), rgb(34, 65, 112));\n");
      out.write("    background-image: -ms-linear-gradient(top, rgb(15, 111, 178), rgb(34, 65, 112));\n");
      out.write("    background-image: linear-gradient(top, rgb(15, 111, 178), rgb(34, 65, 112));\n");
      out.write("    filter: progid:DXImageTransform.Microsoft.gradient(GradientType=0,StartColorStr='#0f6fb2', EndColorStr='#224170');\n");
      out.write("    color: #fff;\n");
      out.write("    text-decoration: none;\n");
      out.write("    box-shadow: inset 0 1px 0 #0081bd,inset 0 2px 0 #0078b0,inset 0 3px 0 #0070a3, 0 0 10px rgba(0,0,0,0.2);\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    transition: all .2s ease-in;\n");
      out.write("    -o-transition: all .2s ease-in;\n");
      out.write("    -moz-transition: all .2s ease-in;\n");
      out.write("    -webkit-transition: all .2s ease-in;\n");
      out.write("}\n");
      out.write("#nav ul li a { width: 160px }\n");
      out.write("#nav ul li:first-child a {\n");
      out.write("    -webkit-border-top-left-radius: 5px;\n");
      out.write("    -webkit-border-bottom-left-radius: 5px;\n");
      out.write("    -moz-border-radius-topleft: 5px;\n");
      out.write("    -moz-border-radius-bottomleft: 5px;\n");
      out.write("    border-top-left-radius: 5px;\n");
      out.write("    border-bottom-left-radius: 5px;\n");
      out.write("}\n");
      out.write("#nav ul li:last-child a {\n");
      out.write("    -webkit-border-top-right-radius: 5px;\n");
      out.write("    -webkit-border-bottom-right-radius: 5px;\n");
      out.write("    -moz-border-radius-topright: 5px;\n");
      out.write("    -moz-border-radius-bottomright: 5px;\n");
      out.write("    border-top-right-radius: 5px;\n");
      out.write("    border-bottom-right-radius: 5px;\n");
      out.write("}\n");
      out.write("#nav ul li a:hover {\n");
      out.write("    box-shadow: inset 0 1px 0 #0070a3,inset 0 0 30px 0 #142a4a;\n");
      out.write("    text-shadow: 0 1px 3px #143157;\n");
      out.write("    border-bottom: 5px solid #0e223d;\n");
      out.write("}\n");
      out.write("#nav ul li a:active,\n");
      out.write("#nav ul li a.active {\n");
      out.write("    border-bottom: 1px solid #0e223d;\n");
      out.write("    height: 25px;\n");
      out.write("    padding-top: 2px;\n");
      out.write("    box-shadow: inset 0 1px 0 #0070a3,inset 0 0 40px 0 #0d1b30;\n");
      out.write("}\n");
      out.write("#nav ul li a span {\n");
      out.write("    border-left: 1px solid #143157;\n");
      out.write("    border-right: 1px solid #1563a3;\n");
      out.write("    height: 100%;\n");
      out.write("    display: block;\n");
      out.write("    width: 100%;\n");
      out.write("    text-align: center;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("#nav ul li:first-child a span { border-left: none }\n");
      out.write("#nav ul li:last-child a span { border-right: none }\n");
      out.write("\n");
      out.write(".hidden {\n");
      out.write("    display: none;\n");
      out.write("}\n");
      out.write("</style>  \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"loadcon();\">\n");
      out.write("        <script>\n");
      out.write("                document.getElementById(\"result\").innerHTML = localStorage.getItem(\"lastname\");\n");
      out.write("           function shcon()\n");
      out.write("           {\n");
      out.write("               //to show id= conlis\n");
      out.write("               \n");
      out.write("                  document.getElementById(\"conlis\").style.display = \"block\";\n");
      out.write("           }\n");
      out.write("            </script>\n");
      out.write("         <nav id=\"nav\">\t\n");
      out.write("\t<ul>\t\t\n");
      out.write("\t\t<li>\n");
      out.write("                   \n");
      out.write("\t\t\t<a href=\"sendmail.jsp\"><span>Send Mail</span></a>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li>\n");
      out.write("                    <a href=\"Contact.jsp\"><span>Add Contact</span></a>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li>\n");
      out.write("\t\t\t<a href=\"group.jsp\"><span>Contact-Info</span></a>\n");
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
      out.write("        \n");
      out.write("          \n");
      out.write("        \n");
      out.write("        \n");
      out.write("          <form name=\"send\" action=\"mail.jsp\" method=\"POST\" style=\"margin-top: -20px;\">\n");
      out.write("            <br/>  <br/>  <br/>  \n");
      out.write("              <table border=\"1\" align=\"center\">\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>To</td>\n");
      out.write("                        <td ><input type=\"text\" name=\"ti_to\" value=\"\" id=\"cl\" size=\"38\" /></td>\n");
      out.write("                        <td rowspan=\"5\">\n");
      out.write("                            <div  id=\"conlis\" class=\"hidden\">\n");
      out.write("                            <select id=\"contact\" name=\"conlist\" size=\"10\">\n");
      out.write("                              \n");
      out.write("                            </select>\n");
      out.write("                        <div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><input type=\"button\" value=\"Contacts\" name=\"sh_con\"  onclick=\"shcon();\"/></td>\n");
      out.write("            <input type=\"button\" value=\"Clear\" name=\"clear\"  onclick=\"clr();\"/>\n");
      out.write("                      </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Subject</td>\n");
      out.write("                        <td ><input type=\"text\" name=\"ti_subject\" value=\"\" size=\"38\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Message</td>\n");
      out.write("                        <td  align=\"center\"><textarea name=\"Msg\" rows=\"10\" cols=\"37\">\n");
      out.write("                            </textarea></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><input type=\"submit\" value=\"Send\" name=\"b_send\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <select id=\"druid\" class=\"hidde\">\n");
      out.write("        ");

                   while(rs.next())
             {
      out.write("\n");
      out.write("                  <option>");
      out.print(rs.getString("uid"));
      out.write("</option>\n");
      out.write("             ");
 }                        
        
      out.write("\n");
      out.write(" </select>\n");
      out.write("  ");
 rs=ob.getall();
      out.write("\n");
      out.write(" <select id=\"drname\" class=\"hidde\">\n");
      out.write("     ");

                   while(rs.next())
             {
      out.write("\n");
      out.write("                  <option>");
      out.print(rs.getString("cname"));
      out.write("</option>\n");
      out.write("             ");
 }                        
        
      out.write("\n");
      out.write(" </select>\n");
      out.write("  ");
 rs=ob.getall();
      out.write("\n");
      out.write(" <select id=\"drgrname\" class=\"hidde\">\n");
      out.write("     ");

                   while(rs.next())
             {
      out.write("\n");
      out.write("                  <option>");
      out.print(rs.getString("groupn"));
      out.write("</option>\n");
      out.write("             ");
 }                        
        
      out.write("\n");
      out.write(" </select>\n");
      out.write(" \n");
      out.write("                 \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("        </form>\n");
      out.write("             \n");
      out.write("          <script>\n");
      out.write("              function clr()\n");
      out.write("              {\n");
      out.write("                  document.getElementById(\"cl\").value = \"\";\n");
      out.write("              }\n");
      out.write("   \n");
      out.write("    \n");
      out.write("    function loadcon()\n");
      out.write("    {\n");
      out.write("      \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("           var ee = document.getElementById(\"druid\");\n");
      out.write("          xe = document.getElementById(\"druid\").length;\n");
      out.write("       \n");
      out.write("          \n");
      out.write("          var uie=document.cookie; \n");
      out.write("   \n");
      out.write("           var fe = document.getElementById(\"drname\");\n");
      out.write("           \n");
      out.write("           var drnam = document.getElementById(\"contact\");\n");
      out.write("           var ie;\n");
      out.write("           \n");
      out.write("            for (ie = 0; ie < xe; ie++)\n");
      out.write("             {\n");
      out.write("         alert(1);\n");
      out.write("              if(uie === ee.options[ie].value)\n");
      out.write("                   {\n");
      out.write("                       \n");
      out.write("                        var option = document.createElement(\"option\");\n");
      out.write("                       option.text = fe.options[ie].value;                    \n");
      out.write("                       drnam.add(option);                                     \n");
      out.write("                   }\n");
      out.write("              }\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</script>\n");
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
