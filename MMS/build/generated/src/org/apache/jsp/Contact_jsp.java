package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import pck.contact;
import pck.javaclass;

public final class Contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("  ");
   contact ob=new contact(); 
               
            
                 ResultSet rs=ob.getall();
            
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Daily UI - Day 1 Sign In</title>\n");
      out.write("\n");
      out.write("\t<!-- Google Fonts -->\n");
      out.write("\t<link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("\t<!-- Custom Stylesheet -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Contact</title>\n");
      out.write("      <link href=\"mycss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("             \n");
      out.write("\n");
      out.write("         <script>\n");
      out.write("           \n");
      out.write("             function addi()\n");
      out.write("             {\n");
      out.write("              document.getElementById(\"i2\").style.display = \"none\";\n");
      out.write("              document.getElementById(\"but\").value=\"Save\";\n");
      out.write("             document.getElementById(\"i1\").style.display = \"none\";\n");
      out.write("             document.getElementById(\"adnewgrp\").style.display = \"block\";\n");
      out.write("           document.getElementById(\"r1\").style.display = \"none\";\n");
      out.write("        document.getElementById(\"r2\").style.display = \"none\";\n");
      out.write("        document.getElementById(\"contac\").action = \"csaved.jsp\";  \n");
      out.write("    \n");
      out.write("    document.contact.chk.value=\"1\";\n");
      out.write("         document.getElementById(\"cnam\").display = \"none\";\n");
      out.write("       document.getElementById('cnam').style.visibility = 'visible';\n");
      out.write("    document.getElementById('lblnam').style.visibility = 'visible';\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function addgrp()\n");
      out.write("    {\n");
      out.write("//empty id = grpx\n");
      out.write(" document.getElementById(\"grpx\").value=\"\";\n");
      out.write("\n");
      out.write(" document.getElementById(\"r1\").style.display = \"block\";\n");
      out.write("    document.getElementById(\"r2\").style.display = \"block\";\n");
      out.write("       document.getElementById(\"r3\").style.display = \"none\";       \n");
      out.write("          document.getElementById(\"adnewgrp\").focus();\n");
      out.write("    }\n");
      out.write("    function savegr()\n");
      out.write("    {\n");
      out.write("         document.getElementById(\"r1\").style.display = \"none\";\n");
      out.write("        document.getElementById(\"r2\").style.display = \"none\";\n");
      out.write("        document.getElementById(\"r3\").style.display = \"block\";\n");
      out.write("        \n");
      out.write("        var zz=document.getElementById(\"grpx\").value;\n");
      out.write("        if(zz!==\"\")\n");
      out.write("            {\n");
      out.write("      var z = document.getElementById(\"grpn\");\n");
      out.write("         var option = document.createElement(\"option\");\n");
      out.write("         option.text = zz;\n");
      out.write("         z.add(option);\n");
      out.write("            }\n");
      out.write("      else{\n");
      out.write("          alert(\"Enter Valid group name\");\n");
      out.write("      }\n");
      out.write("            \n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function done()\n");
      out.write("    {\n");
      out.write("        document.getElementById(\"r1\").style.display = \"none\";\n");
      out.write("        document.getElementById(\"r2\").style.display = \"none\";\n");
      out.write("        document.getElementById(\"r3\").style.display = \"block\";\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    function checkgrpnam()\n");
      out.write("    {\n");
      out.write("        \n");
      out.write("          var e = document.getElementById(\"grpn\");\n");
      out.write("           var x = document.getElementById(\"grpn\").length;\n");
      out.write("          //  var usn = obj.clusn;\n");
      out.write("           // var pwd= obj.clpwd;\n");
      out.write("          var usn=document.grpnamsave.groupname.value;\n");
      out.write("        \n");
      out.write("           \n");
      out.write("           var i=0;\n");
      out.write("             var j=0;\n");
      out.write("            for (i = 0; i < x; i++)\n");
      out.write("             {\n");
      out.write("              if((usn === e.options[i].value))\n");
      out.write("                   {\n");
      out.write("                       \n");
      out.write("                                       j=1;\n");
      out.write("                                     \n");
      out.write("                   }\n");
      out.write("              }\n");
      out.write("if(j===1)\n");
      out.write("    {\n");
      out.write("    \n");
      out.write(" alert(\"Please Select Another Group Name , this Group name has already taken\");\n");
      out.write(" document.getElementById(\"grpx\").value=\"\";\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function loaddata()\n");
      out.write("    {\n");
      out.write("        var e = document.getElementById(\"nam\");\n");
      out.write("var strUser = e.options[e.selectedIndex].value;\n");
      out.write("\n");
      out.write("document.getElementById(\"cnam\").value = strUser;\n");
      out.write("      ");
  
                 ResultSet rr=ob. getoneset();
                 
            
      out.write("\n");
      out.write("                     var strUser = e.options[e.selectedIndex].value;\n");
      out.write("                     var options= document.getElementById('c1').options;\n");
      out.write("    var nn= options.length;\n");
      out.write("        for (var ii= 0 ; ii<nn; ii++) {\n");
      out.write("    if (options[ii].value===strUser) {\n");
      out.write("     //   options[ii].selected= true;\n");
      out.write("        break;\n");
      out.write("        } }\n");
      out.write("    \n");
      out.write("  //alert(ii);\n");
      out.write("      // document.getElementById(\"grpn\").selectedIndex = ii;          \n");
      out.write("             document.getElementById(\"c2\").selectedIndex = ii; \n");
      out.write("            var ez = document.getElementById(\"c2\");\n");
      out.write("var p = ez.options[ez.selectedIndex].value;\n");
      out.write("   document.getElementById(\"cemail\").value = p;\n");
      out.write("   \n");
      out.write("document.getElementById(\"c3\").selectedIndex = ii;\n");
      out.write(" var ezz = document.getElementById(\"c3\");\n");
      out.write("var pz = ezz.options[ez.selectedIndex].value;\n");
      out.write("\n");
      out.write("\n");
      out.write("  var optionss= document.getElementById('grpn').options;\n");
      out.write("    var nnn= optionss.length;\n");
      out.write("        for (var iii= 0 ; iii<nnn; iii++) {\n");
      out.write("    if (options[iii].value===pz) {\n");
      out.write("     //   options[ii].selected= true;\n");
      out.write("     document.getElementById(\"grpn\").selectedIndex = iii;\n");
      out.write("        break;\n");
      out.write("        } }\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("          \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("              function checkem()\n");
      out.write("            {\n");
      out.write("                //alert(\"1\");\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                var e = document.getElementById(\"myemail\");\n");
      out.write("           var x = document.getElementById(\"myemail\").length;\n");
      out.write("          //  var usn = obj.clusn;\n");
      out.write("           // var pwd= obj.clpwd;\n");
      out.write("          var eemai=document.myForm.txtemail.value;\n");
      out.write("        \n");
      out.write("           \n");
      out.write("           var i;\n");
      out.write("             var j=0;\n");
      out.write("            for (i = 0; i < x; i++)\n");
      out.write("             {\n");
      out.write("              if((eemai === e.options[i].value))\n");
      out.write("                   {\n");
      out.write("                       \n");
      out.write("                                       j=1;\n");
      out.write("                                     \n");
      out.write("                   }\n");
      out.write("              }\n");
      out.write("if(j===1)\n");
      out.write("    {\n");
      out.write("    \n");
      out.write(" alert(\"Please Select Another E-mail ,this E-mail has already taken\");\n");
      out.write(" document.getElementById(\"emid\").value=\"\";\n");
      out.write("        }\n");
      out.write("                \n");
      out.write("\n");
      out.write("   }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    function loadgrp()\n");
      out.write("    { var co= document.cookie;\n");
      out.write("    \n");
      out.write("                \n");
      out.write("        ");
 
                
                 ResultSet r=ob.getgrpnam();
                 
            
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("         \n");
      out.write("          var ee = document.getElementById(\"druid\");\n");
      out.write("          xe = document.getElementById(\"druid\").length;\n");
      out.write("        var ff = document.getElementById(\"c3\");\n");
      out.write("           \n");
      out.write("           var uie=document.cookie; \n");
      out.write("\n");
      out.write("           var fe = document.getElementById(\"drname\");\n");
      out.write("           var grpna1 = document.getElementById(\"grpn1\");\n");
      out.write("           var drname = document.getElementById(\"nam\");\n");
      out.write("           var ie;\n");
      out.write("       \n");
      out.write("         \n");
      out.write("            for (ie = 0; ie < xe; ie++)\n");
      out.write("             {\n");
      out.write("\n");
      out.write("              if(uie === ee.options[ie].value)\n");
      out.write("                   {\n");
      out.write("                    // alert(1);\n");
      out.write("                        var option = document.createElement(\"option\");\n");
      out.write("                       option.text = fe.options[ie].value;\n");
      out.write("                       drname.add(option);\n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                          var option = document.createElement(\"option\");\n");
      out.write("                       option.text = ff.options[ie].value;\n");
      out.write("                       grpna1.add(option);\n");
      out.write("                   \n");
      out.write("                   //    drnam.options.add=e.options[i].value;\n");
      out.write("                                     //  j=1;\n");
      out.write("                                  \n");
      out.write("                   }\n");
      out.write("              }\n");
      out.write("//now sorting distinct values\n");
      out.write("    var i,j,n;\n");
      out.write("         var n = document.getElementById(\"grpn1\").length;\n");
      out.write("           var h = document.getElementById(\"grpn1\");\n");
      out.write("              var m = document.getElementById(\"grpn\");\n");
      out.write("          \n");
      out.write("      // alert(n);\n");
      out.write("        for(i=0;i<n;i++)\n");
      out.write("            {\n");
      out.write("                for(j=0;j<n;j++)\n");
      out.write("                    {\n");
      out.write("                        if(h.options[i].value === h.options[j].value)\n");
      out.write("                            {\n");
      out.write("                                break;\n");
      out.write("                            }\n");
      out.write("                    }\n");
      out.write("                    //now add in grpid2\n");
      out.write("                    if(i===j)\n");
      out.write("                        {\n");
      out.write("                          var option = document.createElement(\"option\");\n");
      out.write("                          option.text = h.options[j].value;                    \n");
      out.write("                           m.add(option);\n");
      out.write("                        }\n");
      out.write("            }             \n");
      out.write("    }\n");
      out.write("             function validate()\n");
      out.write("             \n");
      out.write("             {\n");
      out.write("                 var cc=0;\n");
      out.write("                 var y = document.forms[\"contact\"][\"txtcname\"].value;\n");
      out.write("                 if (y === null || y === \"\") {\n");
      out.write("                 alert(\"Name must be filled out\");\n");
      out.write("            cc=1;    \n");
      out.write("            return false;}\n");
      out.write("                 var x = document.forms[\"contact\"][\"group\"].value;\n");
      out.write("                 if (x === null || x === \"\") {\n");
      out.write("            cc=1;     \n");
      out.write("            alert(\"Group name must be filled out\");\n");
      out.write("                 return false;}\n");
      out.write("                  var z = document.forms[\"contact\"][\"txtcemail\"].value;\n");
      out.write("                  if (z === null || z === \"\") {\n");
      out.write("            cc=1;     \n");
      out.write("            alert(\"email Must be selected or Create A group First\");\n");
      out.write("                \n");
      out.write("            return false;\n");
      out.write("                  }\n");
      out.write("         /*  var x = document.forms[\"contact\"][\"txtcemail\"].value;\n");
      out.write("    var atpos = x.indexOf(\"@\");\n");
      out.write("    var dotpos = x.lastIndexOf(\".\");\n");
      out.write("    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {\n");
      out.write("        alert(\"Not a valid e-mail address\");\n");
      out.write("          cc=1;\n");
      out.write("        return false;\n");
      out.write("    }*/\n");
      out.write("              \n");
      out.write("  if(cc===0)\n");
      out.write("          {\n");
      out.write("      ");

  contact obj=new contact();               

//obj.id=
obj.name =(request.getParameter("txtcname"));
obj.email =(request.getParameter("txtcemail"));
obj.group =(request.getParameter("group"));
                          
      
      out.write("        }\n");
      out.write("              }\n");
      out.write("        </script>\n");
      out.write("      \n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body onload=\"loadgrp();\">\n");
      out.write("        \n");
      out.write("      <!--  <bodyb onload=\"loadgrp();\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"top\">\n");
      out.write("\t\t\t<h1 id=\"title\" class=\"hidden\"><span id=\"logo\">Daily <span>UI</span></span></h1>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"login-box animated fadeInUp\">\n");
      out.write("\t\t\t<div class=\"box-header\">\n");
      out.write("\t\t\t\t<h2>Log In</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<label for=\"username\">Username</label>\n");
      out.write("                        <a href=\"sendmail.jsp\"><span>Send Mail</span></a>\n");
      out.write("\t\t\t<br/>\n");
      out.write("      \n");
      out.write("\t\t\t<input type=\"text\" id=\"username\">\n");
      out.write("\t\t\t<br/>\n");
      out.write("\t\t\t<label for=\"password\">Password</label>\n");
      out.write("                        <a href=\"Contact.jsp\"><span>Contact</span></a>\n");
      out.write("\t\t\t<br/>\n");
      out.write("\t\t\t<input type=\"password\" id=\"password\">\n");
      out.write("\t\t\t<br/>\n");
      out.write("\t\t\t<button type=\"submit\">Sign In</button>\n");
      out.write("\t\t\t<br/>\n");
      out.write("\t\t\t<a href=\"#\"><p class=\"small\">Forgot your password?</p></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>-->\n");
      out.write("      <nav id=\"nav\">\n");
      out.write("                   <label for=\"username\">send mail</label>\n");
      out.write("\t\t\t<a href=\"sendmail.jsp\"><span></span></a>\n");
      out.write("                        \n");
      out.write("                 <label for=\"password\">contact</label>\n");
      out.write("\n");
      out.write("               <a href=\"Contact.jsp\"><span></span></a>\n");
      out.write("                    \n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\t\t\t<a href=\"inbox.jsp\"><span>Inbox</span></a>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li>\n");
      out.write("\t\t\t<a href=\"sent_mail.jsp\"><span>Sent Mails</span></a>\n");
      out.write("\t\t</li>\n");
      out.write("                 \n");
      out.write("\t\t\n");
      out.write("                <li>\n");
      out.write("\t\t\t<a href=\"index.jsp\"><span>Logout</span></a>\n");
      out.write("\t\t</li>\n");
      out.write("\t</ul>\n");
      out.write("</nav> \n");
      out.write("       \n");
      out.write("\n");
      out.write("        <form name=\"contact\" id='contac' action=\"csaved.jsp\" method=\"POST\"  onsubmit=\"return validate();\" >\n");
      out.write("            <select name=\"sortedgrp\" id=\"grpn1\" class=\"hidden\">\n");
      out.write("            </select>\n");
      out.write("         \n");
      out.write("          <div>\n");
      out.write("              <!--<input type=\"button\" value=\"Add More New Contact\" name=\"add\" onclick=\"addi();\"/>-->\n");
      out.write("             <br/> <input type=\"button\" id=\"updateid\" value=\"Update Saved Contacts\" name=\"Manage\" onclick=\"manage();\"/>\n");
      out.write("            <table border=\"0\" align=\"center\">\n");
      out.write("               \n");
      out.write("                <tbody>\n");
      out.write("                    <tr class=\"hidden\" id=\"i1\">\n");
      out.write("                    <td>Contact_name</td>    \n");
      out.write("                    <td><select id=\"nam\" name=\"con_name\" onchange=\"loaddata();\">\n");
      out.write("\n");
      out.write("                        </select></td>    \n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"hidden\" id=\"i2\">\n");
      out.write("                         <td></td>    \n");
      out.write("                         <td><input class=\"hidden\" type=\"button\" value=\"Select\" name=\"con_select\"  onclick=\"loaddata();\"/><br/></td>    \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td id=\"lblnam\">Name</td>\n");
      out.write("                        <td><input type=\"text\" required=\"required\" name=\"txtcname\" id='cnam' placeholder=\"name of new contact\" value=\"\" size=\"50\"  onblur=\"checkcon();\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>E-mail</td>\n");
      out.write("                        <td><input type=\"text\" required=\"required\" name=\"txtcemail\" id='cemail' placeholder=\"mms email address of contact\" onkeypress='return event.charCode >= 48 && event.charCode >= 57' value=\"\" size=\"50\" />@mms.com</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td >Group</td>\n");
      out.write("                        <td><select id=\"grpn\" name=\"group\" lemgth=\"50\" >\n");
      out.write("                              \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("              \n");
      out.write("\n");
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                       \n");
      out.write("                            <input type=\"button\" id=\"adnewgrp\" value=\"Add New Group\" name=\"addnew\" onclick=\"addgrp();\" />\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            \n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                               \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                            </td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    <tr id=\"r3\">\n");
      out.write("                        \n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" class='hidden' id='ch' name=\"chk\" value=\"1\" size=\"5\" />\n");
      out.write("                            <input type=\"text\" class=\"hidden\" name=\"coockie\" id=\"myText\" value=\"\" size=\"50\" /></td>\n");
      out.write("                        <td><input  type=\"reset\" value=\"clear\" name=\"con_clear\" />\n");
      out.write("                           <input id=\"but\" type=\"submit\" value=\"Save\" name=\"con_save\"  />\n");
      out.write("                      \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>    \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 <!-- hidden portion of drop down box-->\n");
      out.write(" \n");
      out.write(" <select id=\"druid\" class=\"hidden\">\n");
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
      out.write(" <select id=\"drname\" class=\"hidden\">\n");
      out.write("    \n");
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
      out.write(" \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("        </form>\n");
      out.write("  \n");
      out.write("        </div>\n");
      out.write("                 \n");
      out.write("               <div>\n");
      out.write("                                  <!--  <form name=\"grpnamsave\" action=\"grpsaved.jsp\" method=\"POST\">-->\n");
      out.write("                                 \n");
      out.write("                                    <table align=\"center\">\n");
      out.write("                                        \n");
      out.write("                    <tr align=\"center\" id=\"r1\" class=\"hidden\">\n");
      out.write("                        <td></td>\n");
      out.write("                        <td>Group Name</td>\n");
      out.write("                        <td><input type=\"text\" id=\"grpx\" placeholder=\"Name Of new group here\" name=\"groupname\" value=\"\" size=\"42\" onblur=\"checkgrpnam();\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                           <tr id=\"r2\" class=\"hidden\">\n");
      out.write("                       \n");
      out.write("                        <td><input type=\"Submit\" id=\"abc\" value=\"Save group name\"  name=\"savegrp\" onclick=\"savegr();\"/>\n");
      out.write("                        <input type=\"button\"  value=\"Do not Save\" name=\"savegrp\" onclick=\"done();\"/>\n");
      out.write("                        </td>\n");
      out.write("                        </tr>\n");
      out.write("                         \n");
      out.write("                            \n");
      out.write("                                        </table>\n");
      out.write("                                  <div align=\"center\"><a href=\"contactinfo.jsp\" align=\"center\"><span>Contact Info</span></a></div>\n");
      out.write("                                  <script language=\"javascript\"> \n");
      out.write("\n");
      out.write("document.getElementById('grpx').addEventListener('keypress', handlePress);\n");
      out.write("document.getElementById('myInput2').addEventListener('keypress', handlePress);\n");
      out.write("\n");
      out.write("function handlePress(evt) \n");
      out.write("{\n");
      out.write("    if( evt.keyCode == 13 )\n");
      out.write("    {\n");
      out.write("        // execute your function here\n");
      out.write("       document.getElementById(\"abc\").focus();\n");
      out.write(" // console.log('Enter pressed while in desired text input')\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("                                  \n");
      out.write("                                  \n");
      out.write("                                      <!-- </form>-->\n");
      out.write("                                    </div>   \n");
      out.write("                 \n");
      out.write("       <script>\n");
      out.write("               \n");
      out.write("                var x= document.cookie;\n");
      out.write("                document.getElementById(\"myText\").value = x;\n");
      out.write("                </script>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("        \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class='hidden'>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("<select id=\"c1\" align=\"center\" name=\"user1\" >\n");

                   while(rr.next())
                {
      out.write("\n");
      out.write("     <option>");
      out.print(rr.getString("cname"));
      out.write("</option>\n");
      out.write("      ");
}

      out.write("\n");
      out.write(" </select>\n");

    rr=ob.getoneset();
 
      out.write("\n");
      out.write(" <select id=\"c2\" align=\"center\" name=\"user2\"  >\n");

                   while(rr.next())
                {
      out.write("\n");
      out.write("\n");
      out.write("      <option>");
      out.print(rr.getString("email"));
      out.write("</option> \n");
      out.write("      ");
 
                            }

      out.write("\n");
      out.write(" </select>\n");
      out.write(" ");

    rr=ob.getoneset();
     

      out.write("\n");
      out.write(" <select id=\"c3\" align=\"center\" name=\"user2\"  >\n");

                   while(rr.next())
                {
      out.write("\n");
      out.write("\n");
      out.write("      <option>");
      out.print(rr.getString("groupn"));
      out.write("</option> \n");
      out.write("      ");
 
                            }

      out.write("\n");
      out.write(" </select>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write(" \n");
      out.write("         \n");
      out.write("       <script>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("              function checkcon()\n");
      out.write("         {\n");
      out.write("                  //to check contact name wather already same present in database\n");
      out.write("             //check new name with elements of dropdown id=nam\n");
      out.write("             // form name=txtcname,element name=txtcname of actual input box & id=cnam\n");
      out.write("             var conu = document.getElementById('cnam').value;\n");
      out.write("             //conu=new contact number Entered by user\n");
      out.write("       \n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("                \n");
      out.write("             \n");
      out.write("             \n");
      out.write("          var ee = document.getElementById(\"nam\");\n");
      out.write("          xe = document.getElementById(\"nam\").length;\n");
      out.write("      //alert(1);    \n");
      out.write("           var ie;\n");
      out.write("            for (ie = 0; ie < xe; ie++)\n");
      out.write("             {\n");
      out.write("\n");
      out.write("              if(conu === ee.options[ie].value)\n");
      out.write("                   {\n");
      out.write("                       \n");
      out.write("                     alert(\"Contact Name Already Used in your Contact Please Select Another Contact Name\");\n");
      out.write("                       document.getElementById('cnam').value=\"\";           \n");
      out.write("                   }\n");
      out.write("              }\n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("        \n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("    \n");
      out.write("    }\n");
      out.write("               \n");
      out.write("             //  var ee,xe;\n");
      out.write("                            function manage()\n");
      out.write("             { \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                \n");
      out.write("\n");
      out.write("     \n");
      out.write("             document.getElementById(\"i2\").style.display = \"block\";\n");
      out.write("             document.getElementById(\"but\").value=\"Update\";\n");
      out.write("             document.getElementById(\"i1\").style.display = \"block\";\n");
      out.write("             document.getElementById(\"adnewgrp\").style.display = \"none\";\n");
      out.write("        document.getElementById(\"r1\").style.display = \"none\";\n");
      out.write("        document.getElementById(\"r2\").style.display = \"none\";\n");
      out.write("        document.getElementById(\"contac\").action = \"UPDATE.jsp\";   \n");
      out.write("        document.contact.chk.value=\"0\";\n");
      out.write("             document.getElementById(\"cnam\").display = \"none\";\n");
      out.write("              document.getElementById('cnam').style.visibility = 'hidden';\n");
      out.write("              document.getElementById('lblnam').style.visibility = 'hidden';\n");
      out.write("    document.getElementById('updateid').style.visibility = 'hidden';\n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    }\n");
      out.write("               </script>\n");
      out.write("                \n");
      out.write("  ");


javaclass me=new javaclass();
//obj.clusn=(request.getParameter("txtuser"));
//obj.clpwd = (request.getParameter("txtpass"));
 ResultSet rme=me.check();

      out.write("              \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("    </body>\n");
      out.write("     \n");
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