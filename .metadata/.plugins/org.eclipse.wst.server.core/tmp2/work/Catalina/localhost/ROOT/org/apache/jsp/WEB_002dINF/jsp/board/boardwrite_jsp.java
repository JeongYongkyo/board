/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.47
 * Generated at: 2020-09-25 11:35:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class boardwrite_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_dependants.put("/WEB-INF/jsp/board/../../include/include.jsp", Long.valueOf(1600257781627L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html> \r\n");
      out.write("<html> \r\n");
      out.write("<head>\r\n");
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
      out.write("<!-- CK Editor -->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/plugins/ckeditor/ckeditor.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<title>게시판 페이지</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("    font-family: 'Source Sans Pro', 'Helvetica Neue', Helvetica, Arial, sans-serif;\r\n");
      out.write("    font-weight: 400;\r\n");
      out.write("    overflow-x: hidden;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"d-flex\" id=\"wrapper\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../template/sidebar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"page-content-wrapper\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../template/header.jsp", out, false);
      out.write("\r\n");
      out.write("<div class=\"content-wrapper\" style=\"height:85%;\">\r\n");
      out.write("    \r\n");
      out.write("<!-- Page Content Start -->\r\n");
      out.write("\r\n");
      out.write("\t <section class=\"content\" style=\"position:relative; left:15px; top:15px; width:97.5%; min-height: 538px; min-width: 860px;\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-12\">\r\n");
      out.write("          <div class=\"box-header\" style=\"margin-bottom:5px;\">\r\n");
      out.write("            <h3 class=\"box-title\">게시판</h3>\r\n");
      out.write("            <!-- tools box -->\r\n");
      out.write("            <div class=\"pull-right box-tools\" style=\"position: relative;\">\r\n");
      out.write("\t          <button id=\"writeBtn\" class=\"btn btn-secondary\" style=\"width: 70px; position: relative; color:#fff; margin:3px 0px 3px 0px;\">작성</button>\r\n");
      out.write("\t          <button id=\"delBtn\" class=\"btn btn-secondary\" style=\"width: 70px; position: relative; color:#fff; margin:3px 0px 3px 0px;\">삭제</button>\r\n");
      out.write("              <button type=\"button\" class=\"btn btn-info btn-sm\" title=\"Remove\" style=\"margin-right:8px;\" onclick=\"closeWrite()\">\r\n");
      out.write("                <i class=\"fa fa-times\"></i></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /. tools -->\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.box-header -->\r\n");
      out.write("          <div class=\"box-body pad\">\r\n");
      out.write("            <input id=\"title\" style=\"float:left; font-size:18px; width:100%; height:35px;\" placeholder=\"제목을 입력하세요.\"></input>\r\n");
      out.write("            <form>\r\n");
      out.write("                  <textarea id=\"editor1\" name=\"editor1\" rows=\"10\" cols=\"80\">\r\n");
      out.write("\r\n");
      out.write("                  </textarea>\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.col-->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- ./row -->\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("<!-- Page Content End -->\r\n");
      out.write("\r\n");
      out.write("</div>    \r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../template/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("//var idx = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.idx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" http://localhost:8080/boardlist.do?idx=... get형식의 파라미터를 JSTL에서 받을 수 있음\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("var json;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$(function () {\r\n");
      out.write("\tCKEDITOR.replace('editor1');\r\n");
      out.write("\t\r\n");
      out.write("\tif(page_tp == 'u'){\r\n");
      out.write("\t\t$(\"#writeBtn\").text(\"수정\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#title\").val(title);\r\n");
      out.write("\t\tCKEDITOR.instances[\"editor1\"].setData(contents);\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(create_id != login_id){\r\n");
      out.write("\t\t\t$(\"#writeBtn\").prop('disabled', true);\r\n");
      out.write("\t\t\t$(\"#delBtn\").prop('disabled', true);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#title\").attr(\"readonly\",true);\r\n");
      out.write("\t\t\t$(\"#editor1\").attr(\"readonly\",true);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\telse if(page_tp == 'i'){\r\n");
      out.write("\t\t$(\"#delBtn\").hide();\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("   $(\"#writeBtn\").click(function(){\r\n");
      out.write("\r\n");
      out.write("\t\tparamContents = CKEDITOR.instances.editor1.getData();\r\n");
      out.write("\t\tparamTitle= $(\"#title\").val();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tjson = {\r\n");
      out.write("\t\t\tlogin_id : login_id,\r\n");
      out.write("\t\t\tname : name,\r\n");
      out.write("\t\t\tpage_tp : page_tp,\r\n");
      out.write("\t\t\tindex : index,\r\n");
      out.write("\t\t\ttitle : paramTitle,\r\n");
      out.write("\t\t\tcontents : paramContents\r\n");
      out.write("\t\t\t};\r\n");
      out.write("  \t \r\n");
      out.write("\t\tif(paramTitle == null || paramTitle == ''){\r\n");
      out.write("\t\t\talert(\"제목을 입력해주세요.\");\r\n");
      out.write("\t\t} \r\n");
      out.write("\t\telse if(paramContents == null || paramContents == ''){\r\n");
      out.write("\t\t\talert(\"내용을 입력해주세요.\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t\tf_write();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tjson = null;\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("   \r\n");
      out.write("   $(\"#delBtn\").click(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t   json = {\r\n");
      out.write("\t\t\tindex : index,\r\n");
      out.write("\t\t\t};\r\n");
      out.write("  \t \r\n");
      out.write("\t\tf_delete();\r\n");
      out.write("\t\tjson = null;\r\n");
      out.write("   });\r\n");
      out.write("    \r\n");
      out.write("});\r\n");
      out.write("  \r\n");
      out.write("function f_write(){\r\n");
      out.write("\t\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\ttype : \"post\",\r\n");
      out.write("\t\tcontentType: 'application/json',\r\n");
      out.write("\t\turl : \"../../savewrite.do\",\r\n");
      out.write("\t\tdata : JSON.stringify(json),\r\n");
      out.write("\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\tswitch (Number(data)) {\r\n");
      out.write("\t\t\tcase 0:\r\n");
      out.write("\t\t\t\talert(\"등록된 내용이 없습니다.\");\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\tcase 1:\r\n");
      out.write("\t\t\t\talert(\"게시물이 등록되었습니다.\");\r\n");
      out.write("\t\t\t\tdocument.location.href = \"../../boardlist.do\"; \r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\tdefault:\r\n");
      out.write("\t\t\t\talert(\"알수없는 오류가 발생 했습니다. [Error Code :\" + Number(data) + \"]\");\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function(error) {\r\n");
      out.write("\t\t\t\talert(\"오류 발생\"+ error);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("function f_delete(){\r\n");
      out.write("\t\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\ttype : \"post\",\r\n");
      out.write("\t\tcontentType: 'application/json',\r\n");
      out.write("\t\turl : \"../../delwrite.do\",\r\n");
      out.write("\t\tdata : JSON.stringify(json),\r\n");
      out.write("\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\tswitch (Number(data)) {\r\n");
      out.write("\t\t\tcase 0:\r\n");
      out.write("\t\t\t\talert(\"삭제된 내용이 없습니다.\");\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\tcase 1:\r\n");
      out.write("\t\t\t\talert(\"삭제되었습니다.\");\r\n");
      out.write("\t\t\t\tdocument.location.href = \"../../boardlist.do\"; \r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\tdefault:\r\n");
      out.write("\t\t\t\talert(\"알수없는 오류가 발생 했습니다. [Error Code :\" + Number(data) + \"]\");\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function(error) {\r\n");
      out.write("\t\t\t\talert(\"오류 발생\"+ error);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("function closeWrite(){\r\n");
      out.write("\t\r\n");
      out.write("\twindow.location.href = \"../../boardlist.do\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/jsp/board/boardwrite.jsp(71,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("item");
      // /WEB-INF/jsp/board/boardwrite.jsp(71,0) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/board/boardwrite.jsp(71,0) '${contents}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${contents}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\tvar login_id=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.login_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("\tvar name=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("\tvar page_tp=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.page_tp}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("\tvar index=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("\tvar title=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.TITLE}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("\tvar contents=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.contents}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("\tvar create_id=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.CREA_ID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('\r');
            out.write('\n');
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
