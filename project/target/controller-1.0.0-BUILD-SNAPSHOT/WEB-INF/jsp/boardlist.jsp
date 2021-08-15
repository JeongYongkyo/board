<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html> 
<html> 
<head>
<%@ include file="../include/include.jsp" %>
    
<title>게시판 페이지</title>
<style type="text/css">

</style>
<script>

</script>
</head>

<body>
<div class="d-flex" id="wrapper">
<jsp:include page="template/sidebar.jsp" />

<div id="page-content-wrapper">
<jsp:include page="template/header.jsp" />
<div class="content-wrapper" style="height:86%;">
    
<!-- Page Content Start -->

		<div style="position:relative; left:15px; top:15px; width:97.5%;">
			<div class="box-header with-border">
				<h3 class="box-title">게시판</h3>
			</div>
			<a href = "boardwrite" class="btn btn-primary" style="left: 92%; position: relative; margin-top: 10px;">글쓰기</a>
			<div class="box-body" style="margin:5px;">
				<table class="table table-bordered table-hover" style="text-align:center;"> 
					<thead>
					    <colgroup>
					        <col style="width:10% ;">
					        <col style="width:*;">
					        <col style="width:10% ;">
					        <col style="width:20% ;">
					        <col style="width:10% ;">
					    </colgroup>
						<tr>
							<th scope="col">글번호</th>
							<th scope="col">제목</th>
							<th scope="col">작성자</th>
							<th scope="col">작성일</th>
							<th scope="col">조회수</th>
					</thead>
					<tbody>
					<c:choose>
						<c:when test="${fn:length(list) > 0}">
							<c:forEach items="${list}" var="row">
								<tr>
									<td style="text-align: center;">${row.IDX}</td>
									<td style="text-align: left;">${row.TITLE}</td>
									<td style="text-align: center;">${row.CREA_ID}</td>
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
			</div>
		</div>
    
<!-- Page Content End -->

</div>    
<jsp:include page="template/footer.jsp" />
</div>
</div>

</body>
</html>
