<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html> 
<html> 
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<%@ include file="../include/include.jsp" %>
    
<title>메인 페이지</title>
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
<jsp:include page="template/sidebar.jsp" />

<div id="page-content-wrapper">
<jsp:include page="template/header.jsp" />
<div class="container-fluid">
    
<!-- Page Content Start -->

        <h1 class="mt-4">Simple Sidebar</h1>
        <p>The starting state of the menu will appear collapsed on smaller screens, and will appear non-collapsed on larger screens. When toggled using the button below, the menu will change.</p>
        <p>Make sure to keep all page content within the <code>#page-content-wrapper</code>. The top navbar is optional, and just for demonstration. Just create an element with the <code>#menu-toggle</code> ID which will toggle the menu when clicked.</p>
    <!-- /#page-content-wrapper -->


<!-- Page Content End -->

</div>    
<jsp:include page="template/footer.jsp" />
</div>
</div>

</body>
</html>
