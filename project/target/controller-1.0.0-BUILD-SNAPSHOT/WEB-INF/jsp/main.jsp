<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html> 
<html> 
<head>
<%@ include file="../include/include.jsp" %>
    
<title>메인 페이지</title>
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
<div class="content-wrapper">      
<!-- Page Content Start -->

<!-- Page Content End -->

</div>    
<jsp:include page="template/footer.jsp" />
</div>
</div>

</body>
</html>
