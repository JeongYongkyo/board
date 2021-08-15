<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html> 
<html> 
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="../include/include.jsp" %>
<link href="${pageContext.request.contextPath}/resources/css/AdminLTE.css" rel="stylesheet">

<title>Timeline</title>
<style type="text/css">
.img-circle{
	border-radius: 50%;
}
</style>
</head>

<body>
<div class="d-flex" id="wrapper">
<jsp:include page="template/sidebar.jsp" />

<div id="page-content-wrapper">
<jsp:include page="template/header.jsp" />
    
<!-- Page Content Start -->

<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper" style="background-color:#ecf0f5; min-width: 1290px; min-height: 780px;">  
<!-- Page Content Start -->
          <!-- Box Comment -->
         
          <div class="box box-widget" style="margin: 0px;left: 20px;top: 20px;width: 43%;">
            <div class="box-header with-border">
              <div class="user-block">
                <img class="img-circle" src="resources/img/user1-128x128.jpg" alt="User Image">
                <span class="username"><a href="#">Jonathan Burke Jr.</a></span>
                <span class="description">Shared publicly - 7:30 PM Today</span>
              </div>
              <!-- /.user-block -->
              <div class="box-tools">
<!--                 <button type="button" class="btn btn-box-tool" data-toggle="tooltip" title="Mark as read">
                  <i class="fa fa-circle-o"></i></button> -->
                <button type="button" class="btn btn-box-tool" data-toggle="collapse" data-target="#zzz"><i class="fa fa-minus"></i></button>
<!--                 <button type="button" class="btn btn-box-tool" data-widget="remove" data-target="#zzz"><i class="fa fa-times"></i></button> -->              </div>
              <!-- /.box-tools -->
            </div>
            <!-- /.box-header -->
            <div id="zzz" class="collapse show box-body">
              <img class="img-responsive pad" src="resources/img/photo2.png" alt="Photo" style="height: 364px; position: inherit;">

              <p>I took this photo this morning. What do you guys think?</p>
              <button type="button" class="btn btn-default btn-xs"><i class="fa fa-thumbs-o-up"></i> Like</button>
              <span class="pull-right text-muted">127 likes - 3 comments</span>
            </div>
            <!-- /.box-body -->
            <div id="zzz" class="collapse show box-footer box-comments">
              <div class="box-comment">
                <!-- User image -->
                <img class="img-circle img-sm" src="resources/img/user3-128x128.jpg" alt="User Image">

                <div class="comment-text">
                      <span class="username">
                        Maria Gonzales
                        <span class="text-muted pull-right">8:03 PM Today</span>
                      </span><!-- /.username -->
                  It is a long established fact that a reader will be distracted
                  by the readable content of a page when looking at its layout.
                </div>
                <!-- /.comment-text -->
              </div>
              <!-- /.box-comment -->
              <div class="box-comment">
                <!-- User image -->
                <img class="img-circle img-sm" src="resources/img/user4-128x128.jpg" alt="User Image">

                <div class="comment-text">
                      <span class="username">
                        Luna Stark
                        <span class="text-muted pull-right">8:03 PM Today</span>
                      </span><!-- /.username -->
                  It is a long established fact that a reader will be distracted
                  by the readable content of a page when looking at its layout.
                </div>
                <!-- /.comment-text -->
              </div>
              <!-- /.box-comment -->
            </div>
            <!-- /.box-footer -->
            <div id="zzz" class="collapse show box-footer">
              <form action="#" method="post">
                <img class="img-responsive img-circle img-sm" src="resources/img/user4-128x128.jpg" alt="Alt Text">
                <!-- .img-push is used to add margin to elements next to floating images -->
                <div class="img-push">
                  <input type="text" class="form-control input-sm" placeholder="Press enter to post comment">
                </div>
              </form>
            </div>
            <!-- /.box-footer -->
          </div>
          <!-- /.box -->
          
  </div>
  <!-- /.content-wrapper -->
    
<!-- Page Content End -->

<jsp:include page="template/footer.jsp" />
</div>
</div>
<script>
</script>
</body>
</html>
