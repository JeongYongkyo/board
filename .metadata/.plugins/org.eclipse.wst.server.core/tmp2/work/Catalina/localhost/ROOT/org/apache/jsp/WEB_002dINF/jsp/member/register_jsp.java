/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.47
 * Generated at: 2020-09-16 12:40:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/localProject/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/project/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1598526168805L));
    _jspx_dependants.put("jar:file:/D:/localProject/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/project/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/jsp/member/../../include/include.jsp", Long.valueOf(1600257781627L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html> \r\n");
      out.write("<html> \r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\r<!-- for jQuery -->\r<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/plugins/jquery/jquery.min.js\"></script>\r<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery.serialize-object.js\"></script>\r<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\r<!-- Bootstrap core CSS -->\r<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/plugins/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\r<!-- Custom styles for this template -->\r<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/simple-sidebar.css\" rel=\"stylesheet\">\r\r<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/semantic.min.css\" rel=\"stylesheet\">\r\r");
      out.write("\r \r<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/font-awesome.min.css\" rel=\"stylesheet\">\r<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/ionicons.min.css\" rel=\"stylesheet\">\r\r\r\r<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/semantic.min.js\"></script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>Register Page</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\tbody {\r\n");
      out.write("\t    background-color: #DADADA;\r\n");
      out.write("\t}\r\n");
      out.write("\tbody>.grid {\r\n");
      out.write("\t    height: 100%;\r\n");
      out.write("\t}\r\n");
      out.write("\t.image {\r\n");
      out.write("\t    margin-top: -100px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.column {\r\n");
      out.write("\t    max-width: 450px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\t\r\n");
      out.write("<script>\r\n");
      out.write("var registerChk = 'N';\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("\t$(\"#register_btn\").click(function() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tcheckValue();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(registerChk == 'Y'){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#birth\").val(paramBirth());\r\n");
      out.write("\t\t\t$(\"#u_mail\").val(paramMail());\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar paramString = $(\"form[name=paramForm]\").serializeObject();\r\n");
      out.write("\t \t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\t\tcontentType: 'application/json',\r\n");
      out.write("\t\t\t\turl : \"register.do\",\r\n");
      out.write("\t\t\t\tdata : JSON.stringify(paramString),\r\n");
      out.write("\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\tswitch (Number(data)) {\r\n");
      out.write("\t\t\t\t\tcase 0:\r\n");
      out.write("\t\t\t\t\t\talert(\"???????????? ?????? ???????????????.\");\r\n");
      out.write("\t\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t\tcase 1:\r\n");
      out.write("\t\t\t\t\t\talert(\"??????????????? ???????????? ???????????????.\");\r\n");
      out.write("\t\t\t\t\t\twindow.location.href = \"/member/login.do\";\r\n");
      out.write("\t\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t\tdefault:\r\n");
      out.write("\t\t\t\t\t\talert(\"???????????? ????????? ?????? ????????????. [Error Code :\" + Number(data) + \"]\");\r\n");
      out.write("\t\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\terror : function(error) {\r\n");
      out.write("\t\t\t\t\talert(\"?????? ??????\"+ error);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function checkValue(){\r\n");
      out.write("\tvar form = document.paramForm;\r\n");
      out.write("\tvar chk = document.paramForm.checkbox.checked;\r\n");
      out.write("\t\r\n");
      out.write("\tif(!form.u_id.value){\r\n");
      out.write("\t\talert(\"???????????? ??????????????????.\");\r\n");
      out.write("\t\t$(\"input[name=u_id]\").focus();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(form.idDuplication.value != \"idCheck\"){\r\n");
      out.write("\t\talert(\"????????? ??????????????? ????????????.\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(!form.u_pw.value){\r\n");
      out.write("\t\talert(\"??????????????? ??????????????????.\");\r\n");
      out.write("\t\t$(\"input[name=u_pw]\").focus();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(form.u_pw.value != form.u_pw2.value){\r\n");
      out.write("\t\talert(\"??????????????? ???????????? ??????????????????.\");\r\n");
      out.write("\t\t$(\"input[name=u_pw2]\").focus();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(!form.u_name.value){\r\n");
      out.write("\t\talert(\"????????? ??????????????????.\");\r\n");
      out.write("\t\t$(\"input[name=u_name]\").focus();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(!form.u_phone.value){\r\n");
      out.write("\t\talert(\"??????????????? ??????????????????.\");\r\n");
      out.write("\t\t$(\"input[name=u_phone]\").focus();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(isNaN(form.u_phone.value)){\r\n");
      out.write("\t\talert(\"??????????????? - ????????? ????????? ??????????????????.\");\r\n");
      out.write("\t\t$(\"input[name=u_phone]\").focus();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(!form.birthyy.value){\r\n");
      out.write("\t\talert(\"????????? ??????????????????.\");\r\n");
      out.write("\t\t$(\"input[name=birthyy]\").focus();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(isNaN(form.birthyy.value)){\r\n");
      out.write("\t\talert(\"????????? ????????? ?????????????????????.\");\r\n");
      out.write("\t\t$(\"input[name=birthyy]\").focus();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(form.birthmm.value == \"00\"){\r\n");
      out.write("\t\talert(\"?????? ??????????????????.\");\r\n");
      out.write("\t\t$(\"input[name=birthmm]\").focus();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(!form.birthdd.value){\r\n");
      out.write("\t\talert(\"????????? ??????????????????.\");\r\n");
      out.write("\t\t$(\"input[name=birthdd]\").focus();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(isNaN(form.birthdd.value)){\r\n");
      out.write("\t\talert(\"????????? ????????? ?????????????????????.\");\r\n");
      out.write("\t\t$(\"input[name=birthdd]\").focus();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(!chk){\r\n");
      out.write("\t\talert(\"???????????? ?????? ??? ????????? ?????? ????????? ???????????????.\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\tregisterChk = 'Y';\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// ????????? ???????????? ?????? ??????\r\n");
      out.write("function checkIdPopOpen(){\r\n");
      out.write("\tvar popupWidth = 500;\r\n");
      out.write("\tvar popupHeight = 300;\r\n");
      out.write("\t\r\n");
      out.write("\tvar popupX = (window.screen.width / 2) - (popupWidth / 2);\r\n");
      out.write("\tvar popupY= (window.screen.height / 2) - (popupHeight / 2);\r\n");
      out.write("\t\r\n");
      out.write("\twindow.name = \"parentForm\";\r\n");
      out.write("\twindow.open(\"check_id.do\", \"chkForm\", \"width=\"+ popupWidth +\", height=\"+ popupHeight +\", left=\"+ popupX +\", top=\"+ popupY +\", resizable = no, scrollbars = no\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function inputIdChk(){\r\n");
      out.write("\tdocument.paramForm.idDuplication.value =\"idUncheck\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function paramBirth(){\r\n");
      out.write("\tvar birthyy= $(\"input[name=birthyy]\").val();\r\n");
      out.write("\tvar birthmm= $(\"#birthmm option:selected\").val();\r\n");
      out.write("\tvar birthdd= $(\"input[name=birthdd]\").val();\r\n");
      out.write("\t\r\n");
      out.write("\tif(birthdd.length == 1){\r\n");
      out.write("\t\tf_birthdd = '0'+birthdd;\r\n");
      out.write("\t\r\n");
      out.write("\t\treturn birthyy+birthmm+f_birthdd;\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t\treturn birthyy+birthmm+birthdd;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function paramMail(){\r\n");
      out.write("\tvar mail_name= $(\"input[name=mail_name]\").val();\r\n");
      out.write("\tvar mail_addr= $(\"#mail_addr option:selected\").val();\r\n");
      out.write("\t\t\r\n");
      out.write("\treturn mail_name+'@'+mail_addr;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"ui middle aligned center aligned grid\">\r\n");
      out.write("        <div class=\"column\">\r\n");
      out.write("            <h2 class=\"ui teal image header\">\r\n");
      out.write("                ???????????? ?????????\r\n");
      out.write("            </h2>\r\n");
      out.write("            <div class=\"ui large form\">\r\n");
      out.write("                <div class=\"ui stacked segment\">\r\n");
      out.write("\t\t            <button style=\"position: absolute; left: 325px; top: 20px; font-size: 10pt; border-width: thin; z-index: 1;\" onclick=\"checkIdPopOpen()\">????????????</button>\r\n");
      out.write("\t\t            <form name=\"paramForm\" id=\"paramForm\" role=\"form\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"birth\" name=\"birth\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"u_mail\" name=\"u_mail\">\r\n");
      out.write("\t                    <div class=\"field\">\r\n");
      out.write("\t                        <div class=\"ui left icon input\">\r\n");
      out.write("\t                            <input type=\"text\" id=\"u_id\" name=\"u_id\" placeholder=\"????????? *\" autofocus autocomplete=\"off\" onkeydown=\"inputIdChk()\" style=\"font-weight: bold; font-size: 13px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"idDuplication\" value=\"idUncheck\" >\r\n");
      out.write("\t                        </div>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <div class=\"field\">\r\n");
      out.write("\t                        <div class=\"ui left icon input\">\r\n");
      out.write("\t                            <input type=\"password\" name=\"u_pw\" placeholder=\"???????????? *\" style=\"font-weight: bold; font-size: 13px;\">\r\n");
      out.write("\t                        </div>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <div class=\"field\">\r\n");
      out.write("\t                        <div class=\"ui left icon input\">\r\n");
      out.write("\t                            <input type=\"password\" name=\"u_pw2\" placeholder=\"???????????? ?????? *\" style=\"font-weight: bold; font-size: 13px;\">\r\n");
      out.write("\t                        </div>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <div class=\"field\">\r\n");
      out.write("\t                        <div class=\"ui left icon input\">\r\n");
      out.write("\t                            <input type=\"text\" name=\"u_name\" placeholder=\"?????? *\" style=\"font-weight: bold; font-size: 13px;\">\r\n");
      out.write("\t                        </div>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <div class=\"field\">\r\n");
      out.write("\t                        <div class=\"ui left icon input\">\r\n");
      out.write("\t                            <input type=\"text\" name=\"u_phone\" maxlength=\"11\" placeholder=\"????????? ?????? *\" style=\"font-weight: bold; font-size: 13px;\">\r\n");
      out.write("\t                        </div>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <div class=\"field\">\r\n");
      out.write("\t                        <div>\r\n");
      out.write("\t                        \t<label style=\"font-size:13px; float:left; margin-left:37px; margin-bottom:10px; color:rgba(0,0,0,0.25);\">?????? *</label>\r\n");
      out.write("\t                            <input type=\"radio\" name=\"gender\" value = \"M\" style=\"margin-right:10px; float:left; margin-left:60px; margin-top:3px\" checked id = \"r1\" >\r\n");
      out.write("\t                            <label for = \"r1\" style=\"font-size:13px; float:left;\">???</label>\r\n");
      out.write("\t                            <input type=\"radio\" name=\"gender\" value = \"F\" style=\"margin-right: 10px; float:left; margin-left:20px; margin-top:3px\" id = \"r2\">\r\n");
      out.write("\t                            <label for = \"r2\" style=\"font-size:13px; float:left;\">???</label>\r\n");
      out.write("\t                        </div>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <div class=\"field\">\r\n");
      out.write("\t                        <div class=\"ui left icon input\">\r\n");
      out.write("\t                            <input type=\"text\" name=\"birthyy\" maxlength=\"4\" placeholder=\"??????(4???) *\" size=\"6\" style=\"width:30%; margin-right: 10px; font-weight: bold; font-size: 13px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select id=\"birthmm\" name=\"birthmm\" style=\"width:30%; margin-right: 10px; font-weight: bold; font-size: 13px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"00\">???</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"01\" >01</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"02\" >02</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"03\" >03</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"04\" >04</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"05\" >05</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"06\" >06</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"07\" >07</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"08\" >08</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"09\" >09</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"10\" >10</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"11\" >11</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"12\" >12</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"birthdd\" maxlength=\"2\" placeholder=\"??? *\" size=\"4\" style=\"width:30%; font-weight: bold; font-size: 13px;\">\r\n");
      out.write("\t                        </div>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <div class=\"field\">\r\n");
      out.write("\t                        <div class=\"ui left icon input\">\r\n");
      out.write("\t                            <input type=\"text\" name=\"mail_name\" placeholder=\"?????????\" maxlength=\"50\" style=\"width:40%; font-weight: bold; font-size: 13px;\">\r\n");
      out.write("\t                            <label style=\"font-size: 15px;line-height: 1.5;\">@</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<select id=\"mail_addr\" name=\"mail_addr\" style=\"width:48%; font-size: 13px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>naver.com</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>daum.net</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>gmail.com</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>nate.com</option>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t                        </div>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <div class=\"field\">\r\n");
      out.write("\t                        <div class=\"ui left icon input\">\r\n");
      out.write("\t                            <input type=\"text\" name=\"u_addr\" placeholder=\"??????\" style=\"font-weight: bold; font-size: 13px;\" size=\"50\">\r\n");
      out.write("\t                        </div>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <div class=\"field\">\r\n");
      out.write("\t                        <div>\r\n");
      out.write("\t                            <input type=\"checkbox\" name=\"checkbox\" style=\"margin-bottom: 15px; font-weight: bold; font-size: 13px;\">\r\n");
      out.write("\t                            <span style=\"position: relative;top: -4px;font-size: 12px;\">???????????? ?????? ??? ????????? ???????????????.</span>\r\n");
      out.write("\t                        </div>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t\t            </form>\r\n");
      out.write("                    <button class=\"ui fluid large teal submit button\" id=\"register_btn\" style=\"font-size: 15px; font-weight: bold;\">????????????</button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"ui error message\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"ui message\">\r\n");
      out.write("                ????????? ??? ????????? ????????? <a href=\"/member/login.do\">??????</a>??? ???????????????.\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
