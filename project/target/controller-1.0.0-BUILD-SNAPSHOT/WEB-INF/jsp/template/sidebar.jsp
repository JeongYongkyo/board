<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html> 
<html> 
<head>
<jsp:include page="../../include/include.jsp" />
<meta charset="utf-8">

<title>Sidebar</title>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
</head>

<body>

<!-- Sidebar -->
<div class="bg-light border-right" id="sidebar-wrapper">
	<div class="sidebar-heading">
		<a href="/main" class="list-group-item-action">Welcom My Home!</a>
	</div>
	<div class="list-group list-group-flush">
		<a href="/timeline" class="list-group-item list-group-item-action bg-light">Timeline</a>
		<a href="/boardlist" class="list-group-item list-group-item-action bg-light">Bulletin Board</a>
		<a href="#" class="list-group-item list-group-item-action bg-light">Gallery</a>
		<a href="/calendar" class="list-group-item list-group-item-action bg-light">Calendar</a>
		<a href="/visitor" class="list-group-item list-group-item-action bg-light">Visitors Book</a>
		<a href="/profile" class="list-group-item list-group-item-action bg-light">Profile</a>
	</div>
</div>
<!-- /#sidebar-wrapper -->

</body>

</html>