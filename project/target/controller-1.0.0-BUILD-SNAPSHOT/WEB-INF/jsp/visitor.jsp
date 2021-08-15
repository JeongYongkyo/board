<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html> 
<html> 
<head>
<%@ include file="../include/include.jsp" %>
    
<title>게시판 페이지</title>
<style type="text/css">
	body {
	    background-color: #DADADA;
	}
	body>.grid {
	    height: 100%;
	}
	.image {
	    margin-top: -100px;
	}
	.column {
	    max-width: 1000px;
	}
	.view_btn {
	    cursor: pointer;
	}
</style>
<script>

</script>
</head>

<body>
<div class="d-flex" id="wrapper">
<jsp:include page="template/sidebar.jsp" />

<div id="page-content-wrapper">
<jsp:include page="template/header.jsp" />
    
<!-- Page Content Start -->

<div class="content-wrapper">

</div>
    
<!-- Page Content End -->

<jsp:include page="template/footer.jsp" />
</div>
</div>

</body>
</html>
