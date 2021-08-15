<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html> 
<html> 
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="../../include/include.jsp" %>

<title>계정 삭제 확인</title>
<style type="text/css">
	#wrap {
		width: 490px;
		text-align :center;
		margin: 0 auto 0 auto;
	}
	#chk{
		text-align :center;
	}
</style>

<script>

function pValue(){
	document.getElementById("deleteMsg").innerHTML = "[ ${login.userId} ] 계정을 삭제하시겠습니까?";
}

function deleteProfile(){
	
	var id = $("#u_id").val();
	var pw = document.getElementById("userPw").value;
	var json = {
			u_id : id,
			u_pw : pw,
		};

	if (!pw) {
		alert("비밀번호를 입력하지 않았습니다.");
		return false;
	} 
	else
	{
		$.ajax({
			type : "post",
			contentType: 'application/json',
			url : "deleteProfile.do",
			data : JSON.stringify(json),
			async: false,
			success : function(data) {
				switch (Number(data)) {
				case 0:
					document.getElementById("msg").innerHTML = "비밀번호가 틀렸습니다.";
					break;
				case 1:
					alert("사용자 정보가 삭제되었습니다.");
					self.close();
					break; 
				default:
					alert("알수없는 오류가 발생 했습니다. [Error Code :" + Number(data) + "]");
					break;
				}
			},
			error : function(error) {
				console.log(error);
				alert("오류 발생"+ error);
			}
		});
	}
}
	
</script>
	
</head>
<body onload="pValue()">
<div id="wrap" style="margin-top: 20px;">
	<br>
	<b><font size="4" color="gray">계정 삭제 확인</font></b>
	<hr size="1" width="460">
	<br>
	<div id="chk">
		<div id="deleteMsg" style="position: relative; top: -18px;"></div>
		<form id="checkForm">
			<input type="hidden" value=${login.userId} id="u_id" >
			<input type="text" name="pwinput" id="userPw" style="border-width: thin; height:30px">
		</form>
		<div id="msg" style="margin-top: 20px;"><span>비밀번호를 입력해주세요.</span></div>
		<br>
		<button type="button" class="btn btn-info" id="deleteBtn" style="height:25px; line-height: 1;" onclick="deleteProfile()">삭제하기</button>
		<button type="button" class="btn btn-info" id="cancelBtn" style="width:76px; height:25px; line-height: 1;" onclick="window.close()">취소</button>
	</div>
</div>	
</body>
</html>