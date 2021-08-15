<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html> 
<html> 
<head>
<jsp:include page="../include/include.jsp" />

<title>project</title>
<script type="text/javascript">

$(document).ready(function () {
	f_search();
});

function f_search(){
	alert("11");	
}

</script>

</head>
<body>
<h2>게시판 목록</h2>
<table style="border:1px solid #ccc">
	<colgroup>
		<col width="10%"/>
		<col width="*"/>
		<col width="15%"/>
		<col width="20%"/>
	</colgroup>
	<thead>
		<tr>
			<th scope="col">글번호</th>
			<th scope="col">제목</th>
			<th scope="col">조회수</th>
			<th scope="col">작성일</th>
		</tr>
	</thead>
	<tbody>
		<c:choose>
			<c:when test="${fn:length(list) > 0}">
				<c:forEach items="${list}" var="row">
					<tr>
						<td style="text-align: center;">${row.IDX}</td>
						<td style="text-align: center;">${row.TITLE}</td>
						<td style="text-align: center;">${row.HIT_CNT}</td>
						<td style="text-align: center;">${row.CREA_DTM}</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="4">조회된 결과가 없습니다.</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</tbody> 
</table> 
</body> 
</html> 

