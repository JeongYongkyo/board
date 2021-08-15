<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html> 
<html> 
<head>
<%@ include file="../../include/include.jsp" %>

<!-- CK Editor -->
<script src="${pageContext.request.contextPath}/resources/plugins/ckeditor/ckeditor.js"></script>

<title>게시판 페이지</title>
<style type="text/css">
body {
    font-family: 'Source Sans Pro', 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-weight: 400;
    overflow-x: hidden;
}
</style>
</head>

<body>
<div class="d-flex" id="wrapper">
<jsp:include page="../template/sidebar.jsp" />

<div id="page-content-wrapper">
<jsp:include page="../template/header.jsp" />
<div class="content-wrapper" style="height:85%;">
    
<!-- Page Content Start -->

	 <section class="content" style="position:relative; left:15px; top:15px; width:97.5%; min-height: 538px; min-width: 860px;">
      <div class="row">
        <div class="col-md-12">
          <div class="box-header" style="margin-bottom:5px;">
            <h3 class="box-title">게시판</h3>
            <!-- tools box -->
            <div class="pull-right box-tools" style="position: relative;">
	          <button id="writeBtn" class="btn btn-secondary" style="width: 70px; position: relative; color:#fff; margin:3px 0px 3px 0px;">작성</button>
	          <button id="delBtn" class="btn btn-secondary" style="width: 70px; position: relative; color:#fff; margin:3px 0px 3px 0px;">삭제</button>
              <button type="button" class="btn btn-info btn-sm" title="Remove" style="margin-right:8px;" onclick="closeWrite()">
                <i class="fa fa-times"></i></button>
            </div>
            <!-- /. tools -->
          </div>
          <!-- /.box-header -->
          <div class="box-body pad">
            <input id="title" style="float:left; font-size:18px; width:100%; height:35px;" placeholder="제목을 입력하세요."></input>
            <form>
                  <textarea id="editor1" name="editor1" rows="10" cols="80">

                  </textarea>
            </form>
          </div>
        </div>
        <!-- /.col-->
      </div>
      <!-- ./row -->
    </section>

<!-- Page Content End -->

</div>    
<jsp:include page="../template/footer.jsp" />
</div>
</div>
<script>
//var idx = ${param.idx} http://localhost:8080/boardlist.do?idx=... get형식의 파라미터를 JSTL에서 받을 수 있음

<c:forEach var="item" items="${contents}">
	var login_id="${item.login_id}"
	var name="${item.name}"
	var page_tp="${item.page_tp}"
	var index="${item.index}"
	var title="${item.TITLE}"
	var contents="${item.contents}"
	var create_id="${item.CREA_ID}"
</c:forEach>

var json;


$(function () {
	CKEDITOR.replace('editor1');
	
	if(page_tp == 'u'){
		$("#writeBtn").text("수정");
		
		$("#title").val(title);
		CKEDITOR.instances["editor1"].setData(contents);

		
		if(create_id != login_id){
			$("#writeBtn").prop('disabled', true);
			$("#delBtn").prop('disabled', true);
			
			$("#title").attr("readonly",true);
			$("#editor1").attr("readonly",true);
		}
	}
	else if(page_tp == 'i'){
		$("#delBtn").hide();

	}
	
   $("#writeBtn").click(function(){

		paramContents = CKEDITOR.instances.editor1.getData();
		paramTitle= $("#title").val();
		
		json = {
			login_id : login_id,
			name : name,
			page_tp : page_tp,
			index : index,
			title : paramTitle,
			contents : paramContents
			};
  	 
		if(paramTitle == null || paramTitle == ''){
			alert("제목을 입력해주세요.");
		} 
		else if(paramContents == null || paramContents == ''){
			alert("내용을 입력해주세요.");
		}
		else{
			f_write();
		}
		
		json = null;
		
	});
   
   $("#delBtn").click(function(){
		
	   json = {
			index : index,
			};
  	 
		f_delete();
		json = null;
   });
    
});
  
function f_write(){
	
	$.ajax({
		type : "post",
		contentType: 'application/json',
		url : "../../savewrite.do",
		data : JSON.stringify(json),
		success : function(data) {
			switch (Number(data)) {
			case 0:
				alert("등록된 내용이 없습니다.");
				break;
			case 1:
				alert("게시물이 등록되었습니다.");
				document.location.href = "../../boardlist.do"; 
				break;
			default:
				alert("알수없는 오류가 발생 했습니다. [Error Code :" + Number(data) + "]");
				break;
				}
			},
			error : function(error) {
				alert("오류 발생"+ error);
			}
		});
};

function f_delete(){
	
	$.ajax({
		type : "post",
		contentType: 'application/json',
		url : "../../delwrite.do",
		data : JSON.stringify(json),
		success : function(data) {
			switch (Number(data)) {
			case 0:
				alert("삭제된 내용이 없습니다.");
				break;
			case 1:
				alert("삭제되었습니다.");
				document.location.href = "../../boardlist.do"; 
				break;
			default:
				alert("알수없는 오류가 발생 했습니다. [Error Code :" + Number(data) + "]");
				break;
				}
			},
			error : function(error) {
				alert("오류 발생"+ error);
			}
		});
};

function closeWrite(){
	
	window.location.href = "../../boardlist.do";
}

</script>
</body>
</html>
