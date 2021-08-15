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

<title>아이디 중복 체크</title>
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
$(document).ready(function(){
	$('#useBtn').attr('disabled',true);
})

function pValue(){
	document.getElementById("userId").value = opener.document.paramForm.u_id.value;
}
		
function idCheck(){
	var id = document.getElementById("userId").value;
	
	if (!id) {
		alert("아이디를 입력하지 않았습니다.");
		return false;
	} 
	else if((id < "0" || id > "9") && (id < "A" || id > "Z") && (id < "a" || id > "z")){ 
		alert("한글 및 특수문자는 아이디로 사용하실 수 없습니다.");
		return false;
	}
	else
	{
		var json = {
				u_id : id,
			};
		
		$.ajax({
			type : "post",
			contentType: 'application/json',
			url : "check_id.do",
			data : JSON.stringify(json),
			success : function(data) {
				switch (Number(data)) {
				case 0:
					document.getElementById("msg").innerHTML = "사용 가능한 아이디입니다.";
					$('#useBtn').attr('disabled',false);
					break;
				default:
					document.getElementById("msg").innerHTML = "사용할 수 없는 아이디입니다.";
					$('#useBtn').attr('disabled',true);
					break;
				}
			},
			error : function(error) {
				alert("오류 발생"+ error);
			}
		});
	}
}
	
// 사용하기 클릭 시 부모창으로 값 전달 
function sendCheckValue(){
	opener.document.paramForm.idDuplication.value ="idCheck";
	// 회원가입 화면의 ID입력란에 값을 전달
	opener.document.paramForm.u_id.value = document.getElementById("userId").value;
	
	if (opener != null) {
      	opener.chkForm = null;
      	self.close();
	}	
}
</script>
	
</head>
<body onload="pValue()">
<div id="wrap" style="margin-top: 20px;">
	<br>
	<b><font size="4" color="gray">아이디 중복체크</font></b>
	<hr size="1" width="460">
	<br>
	<div id="chk">
		<form id="checkForm">
			<input type="text" name="idinput" id="userId" style="border-width: thin; height:30px">
			<input type="button" value="중복확인" style="height:30px;" onclick="idCheck()">
		</form>
		<div id="msg" style="margin-top: 20px;"></div>
		<br>
		<button type="button" class="btn btn-info" id="useBtn" style="height:25px; line-height: 1;" onclick="sendCheckValue()">사용하기</button>
		<button type="button" class="btn btn-info" id="cancelBtn" style="width:76px; height:25px; line-height: 1;" onclick="window.close()">취소</button>
	</div>
</div>	
</body>
</html>