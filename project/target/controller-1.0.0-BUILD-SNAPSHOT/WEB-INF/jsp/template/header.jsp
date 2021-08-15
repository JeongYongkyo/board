<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html> 
<html> 
<head>
<jsp:include page="../../include/include.jsp" />
<meta charset="utf-8">

<title>Header</title>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
</head>

<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
	<button class="btn btn-primary" id="menu-toggle">Toggle Menu</button>

	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav ml-auto mt-2 mt-lg-0" style="float: right; margin: -4px;">
		<c:if test="${not empty login}">
 			<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="margin-right: 30px;">
					<c:choose>
					  	<c:when test="${login.userGender eq 'F'}">
					  		<img src="/dist/img/loginUser2.png" class="img-circle" alt="User Image" style="width: 26px; margin-right: 10px; position: relative; top: -3px;">
					  	</c:when>
					  	<c:otherwise>
					  		<img src="/dist/img/loginUser1.png" class="img-circle" alt="User Image" style="width: 26px; margin-right: 10px; position: relative; top: -3px;">
					  	</c:otherwise>
					</c:choose>				  
					<span style="font-size:15px; font-weight:bold;">${login.userName}</span>
				</a>
		 		<div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdown">
				<a class="dropdown-item" href="/profile">Profile</a>
				<div class="dropdown-divider"></div>
				<a id=signout class="dropdown-item" style="cursor:pointer;">Sign out</a>
				</div>
			</li>
		</c:if>
		<c:if test="${empty login}">
 			<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="margin-right: 30px;">
					<span style="font-size:15px; font-weight:bold;">회원가입 또는 로그인</span>
				</a>
		 		<div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdown">
				<a class="dropdown-item" href="/profile">Profile</a>
				<div class="dropdown-divider"></div>
				<a id=signin class="dropdown-item" style="cursor:pointer;">Sign in</a>
				</div>
			</li>
		</c:if>
		</ul>
	</div>
</nav>

<script>

$(document).ready(function() {
	
	$("#signout").click(function(){
		$.ajax({
			type : "post",
			contentType: 'application/json',
			url : "/logout",
 			success : function(data) {
 				alert("로그아웃 되었습니다.")
 				window.location.href = "../"+data;
			},
			error : function(error) {
				alert("오류 발생"+ error);
				console.log(error);
			}
		});
	});
	
	$("#signin").click(function(){
		window.location.href = "../member/login";
	});
	
 	$("#menu-toggle").click(function(e) {
		e.preventDefault();
		$("#wrapper").toggleClass("toggled");
	});
 	
 	$('.dropdown').click(function(){
        $('.dropdown-menu').toggleClass('show');
    });
 	
/*  	$('.navbar-toggler-icon').click(function(e){
 		// 햄버거 버튼 사용법??
    }); */
 	
})

</script>

</body>

</html>