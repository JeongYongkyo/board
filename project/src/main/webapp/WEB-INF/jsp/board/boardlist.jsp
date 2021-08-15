<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html> 
<html> 
<head>
<%@ include file="../../include/include.jsp" %>
    
<title>게시판 페이지</title>
<style type="text/css">
body {
    font-family: 'Source Sans Pro', 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-weight: 400;
    overflow-x: hidden;
}
.pagenation {list-style: none; float: left; padding: 6px;}
</style>
</head>

<body>
<div class="d-flex" id="wrapper">
<jsp:include page="../template/sidebar.jsp" />

<div id="page-content-wrapper">
<jsp:include page="../template/header.jsp" />
<div class="content-wrapper" style="min-height: 650px;">
    
<!-- Page Content Start -->

		<div style="position:relative; left:15px; top:15px; width:97.5%; min-height: 538px; min-width: 860px;">
			<div class="box-header with-border">
				<h3 class="box-title">게시판</h3>
			</div>
			<a href = "boardwrite/i/0.do" class="btn btn-primary" style="left: 92%; position: relative; margin-bottom: 5px;">글쓰기</a>
			<div class="box-body" style="margin:5px;">
				<table id="tableId" class="table table-bordered table-hover" style="text-align:center;"> 
					<thead>
					    <colgroup>
					        <col style="width:10% ;">
					        <col style="width:*;">
					        <col style="width:10% ;">
					        <col style="width:20% ;">
					        <col style="width:10% ;">
					    </colgroup>
						<tr>
							<th scope="col">번호</th>
							<th scope="col">제목</th>
							<th scope="col">작성자</th>
							<th scope="col">작성일</th>
							<th scope="col">조회수</th>
						</tr>
					</thead>
					<tbody>
					<c:choose>
						<c:when test="${fn:length(list) > 0}">
							<c:forEach items="${list}" var="row">
								<tr>
									<td style="text-align: center;">${row.IDX}</td>
									<td style="text-align: left; cursor:pointer;">${row.TITLE}</td>
									<td style="text-align: center;">${row.NAME}</td>
									<td style="text-align: center;">${row.CREA_DTM}</td>
									<td style="text-align: center;">${row.HIT_CNT}</td>
								</tr>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<tr>
								<td colspan="5">조회된 결과가 없습니다.</td>
							</tr>
						</c:otherwise>
					</c:choose>
					</tbody>
				</table>
				<div>
				  <ul>
				    <c:if test="${pagenation.prev}">
				    	<li class="pagenation"><a href="boardlist.do${pagenation.makeQuery(pagenation.startPage - 1)}">이전</a></li>
				    </c:if> 
				
				    <c:forEach begin="${pagenation.startPage}" end="${pagenation.endPage}" var="idx">
				    	<li class="pagenation"><a href="boardlist.do${pagenation.makeQuery(idx)}">${idx}</a></li>
				    </c:forEach>
				
				    <c:if test="${pagenation.next && pagenation.endPage > 0}">
				    	<li class="pagenation"><a href="boardlist.do${pagenation.makeQuery(pagenation.endPage + 1)}">다음</a></li>
				    </c:if> 
				  </ul>
				</div>
			</div>
		</div>
 		<form name="params" action="boardwrite.do" method="get">
			<input type="hidden" id="idx" name="idx">
		</form>

    
<!-- Page Content End -->

</div>    
<jsp:include page="../template/footer.jsp" />
</div>
</div>
<script>

$("#tableId tr").click(function(){ 	
	var tr = $(this);
	var td = tr.children();
	var idx = td.eq(0).text();

	//document.params.submit();
	//var page_tp = document.getElementById("page_tp").value;
	if(idx == "번호"){
		return;
	}
	$("#idx").val(idx);
	
	document.location.href = "boardwrite/u/"+idx+".do"; 
})

</script>
</body>
</html>
