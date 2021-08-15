<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html> 
<html> 
<head>
<%@ include file="../include/include.jsp" %>

<!-- CK Editor -->
<script type="text/javascript" src="/plugins/ckeditor/ckeditor.js"></script>
<!--  for wysihtml5 -->
<script type="text/javascript" src="/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<link rel="stylesheet" type="text/css" href="/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">

<script type="text/javascript" src="/plugins/wysihtml-0.5.0/wysihtml.js"></script>

<title>게시판 페이지</title>
<style type="text/css">

</style>
<script>
$(function () {
    // Replace the <textarea id="editor1"> with a CKEditor
    // instance, using default configuration.
    CKEDITOR.replace('editor1');
    
    
    //editor.setData('your data');
    //editor.insertHtml('your html data');
    //editor.insertText('your text data');  
    
    //editor.getData();
    
    //var html = $(editor.editable.$);
   //$('#id_of_para',html).html('your html data');
    
    //$(".textarea").wysihtml5();

     $("#writeBtn").click(function(){
		

			
		/* var value = $("#cke_1_contents").val();
    	var editor = CKEDITOR.instances['editor1'].setData(); */
       
		console.log(editor);
		//var text = $(this).text();
        //$('.textarea').data("wysihtml5").editor.setValue(text);
    });
    
  });
</script>
</head>

<body>
<div class="d-flex" id="wrapper">
<jsp:include page="template/sidebar.jsp" />

<div id="page-content-wrapper">
<jsp:include page="template/header.jsp" />
<div class="content-wrapper" style="height:87%;">
    
<!-- Page Content Start -->

	 <section class="content">
      <div class="row">
        <div class="col-md-12">
          <div class="box box-info">
            <div class="box-header">
              <h3 class="box-title">게시판</h3>
              <!-- tools box -->
              <div class="pull-right box-tools">
                <button type="button" class="btn btn-info btn-sm" data-widget="collapse" data-toggle="tooltip" title="Collapse">
                  <i class="fa fa-minus"></i></button>
                <button type="button" class="btn btn-info btn-sm" data-widget="remove" data-toggle="tooltip" title="Remove">
                  <i class="fa fa-times"></i></button>
              </div>
              <!-- /. tools -->
              <a id="writeBtn" class="btn btn-secondary" style="left: 84%; width: 70px; position: relative; color:#fff">작성</a>
            </div>
            <!-- /.box-header -->
            <div class="box-body pad">
              <label style="float:left; margin:5px;"> Post Title</label>
              <input style="float:left; margin-bottom:10px; width:100%;" placeholder="제목을 입력하세요."></input>
              <form>
                    <textarea id="editor1" name="editor1" rows="10" cols="80">
                                            This is my textarea to be replaced with CKEditor.
                    </textarea>
              </form>
            </div>
          </div>
          <!-- /.box -->
        </div>
        <!-- /.col-->
      </div>
      <!-- ./row -->
    </section>
    
<!-- Page Content End -->

</div>    
<jsp:include page="template/footer.jsp" />
</div>
</div>

</body>
</html>
