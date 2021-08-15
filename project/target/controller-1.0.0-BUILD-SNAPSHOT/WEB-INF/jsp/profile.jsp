<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html> 
<html> 
<head>
<%@ include file="../include/include.jsp" %>
    
<title>Profile</title>
<style type="text/css">
.table{
	
}
.table,td{
	border:1px solid #dee2e6;
}
</style>

<script>
//*********************************************************************************************
//********** Declare public variable
//*********************************************************************************************
var registerChk = 'N';

<c:forEach var="item" items="${userProfile}">
	var u_id="${item.USER_ID}"
	var u_name="${item.NAME}"
	var u_gender="${item.GENDER}"
	var u_birth="${item.BIRTH}"
	var u_email="${item.EMAIL}"
	var u_phone="${item.PHONE}"
	var u_addr="${item.ADDRESS}"
</c:forEach>

//*********************************************************************************************
//********** Function Ready Section
//*********************************************************************************************

$(document).ready(function() {
	
	insertInitData();
	
	$("#edit_btn").click(function() {
		
		checkValue();
		if(registerChk == 'Y'){

			$("#p_id").val(u_id);
			$("#p_mail").val(paramMail());
			$("#p_phone").val(paramPhone());
			$("#p_birth").val(paramBirth());
			
			var paramObj1 = $("form[name=userParamForm1]").serializeObject();
			var paramObj2 = $("form[name=userParamForm2]").serializeObject();
			var paramObj3 = $("form[name=userParamForm3]").serializeObject();
			
			var paramObj = Object.assign(paramObj1, paramObj2, paramObj3);

			$.ajax({
				type : "post",
				contentType: 'application/json',
				url : "editProfile",
				data : JSON.stringify(paramObj),
				success : function(data) {
					switch (Number(data)) {
					case 0:
						alert("변경된 내용이 없습니다.");
						document.getElementById('profilePage').style.cssText = 'visibility:hidden;';
						break;
					case 1:
						alert("사용자 정보가 변경되었습니다.");
						document.getElementById('profilePage').style.cssText = 'visibility:hidden;';
						break;
					default:
						alert("알수없는 오류가 발생 했습니다. [Error Code :" + Number(data) + "]");
						break;
					}
				},
				error : function(error) {
					alert("오류 발생"+ error);
				}
			});
		}
	});
	
	$("#cancel_btn").click(function() {
		document.getElementById('profilePage').style.cssText = 'visibility:hidden;';
	});
	
});

function insertInitData(){
	$("input[name=u_name]").val(u_name);
	$("input[name=u_addr]").val(u_addr);

	var birthyy	= u_birth.substring(0,4);
	var birthmm = u_birth.substring(4,6);
	var birthdd = u_birth.substring(6,8);
	
	$("input[name=birthyy]").val(birthyy);
	$("#birthmm").val(birthmm);
	$("input[name=birthdd]").val(birthdd);
	
	var u_phone1 = u_phone.substring(0,3);
	var u_phone2 = u_phone.substring(3,7);
	var u_phone3 = u_phone.substring(7,11);
	
	$("#u_phone1").val(u_phone1);
	$("input[name=u_phone2]").val(u_phone2);
	$("input[name=u_phone3]").val(u_phone3);
	
	var temp_mail = u_email.split('@');
	var mail_name = temp_mail[0];
	var mail_addr = temp_mail[1];
	
	$("input[name=mail_name]").val(mail_name);
	$("#mail_addr").val(mail_addr);
	
	if(u_gender == 'F'){
		$('#r2').prop('checked', true);
	}else{
		$('#r1').prop('checked', true);
	}
}

function checkValue(){
	var form1 = document.userParamForm1;
	var form2 = document.userParamForm2;
	var chk = document.userParamForm3.checkbox.checked;
	
	if(!form1.u_pw.value){
		alert("비밀번호를 입력해주세요.");
		$("input[name=u_pw]").focus();
		return;
	}
	
	if(form1.u_pw.value != form1.u_pw2.value){
		alert("비밀번호를 동일하게 입력해주세요.");
		$("input[name=u_pw2]").focus();
		return;
	}
	
	if(!form1.u_name.value){
		alert("이름을 입력해주세요.");
		$("input[name=u_name]").focus();
		return;
	}
	
	if(!(form1.u_phone2.value)){
		alert("전화번호를 입력해주세요.");
		$("input[name=u_phone2]").focus();
		return;
	}
	
	if(!(form1.u_phone3.value)){
		alert("전화번호를 입력해주세요.");
		$("input[name=u_phone3]").focus();
		return;
	}
	
	if(isNaN(form1.u_phone2.value)){
		alert("전화번호는 숫자만 입력가능합니다.");
		$("input[name=u_phone2]").focus();
		return;
	}
	
	if(isNaN(form1.u_phone3.value)){
		alert("전화번호는 숫자만 입력가능합니다.");
		$("input[name=u_phone3]").focus();
		return;
	}
	
	if(!chk){
		alert("개인정보 수집 및 이용에 대한 동의는 필수입니다.");
		return;
	}
	registerChk = 'Y';
}

function deleteChkPop(){
	var popupWidth = 500;
	var popupHeight = 300;
	
	var popupX = (window.screen.width / 2) - (popupWidth / 2);
	var popupY= (window.screen.height / 2) - (popupHeight / 2);
	
	window.name = "parentForm";
	window.open("member/check_delete", "chkForm", "width="+ popupWidth +", height="+ popupHeight +", left="+ popupX +", top="+ popupY +", resizable = no, scrollbars = no");
}

function paramPhone(){
	var u_phone1= $("#u_phone1 option:selected").val();
	var u_phone2= $("input[name=u_phone2]").val();
	var u_phone3= $("input[name=u_phone3]").val();
	
	return u_phone1+u_phone2+u_phone3;
}

function paramBirth(){
	var birthyy= $("input[name=birthyy]").val();
	var birthmm= $("#birthmm option:selected").val();
	var birthdd= $("input[name=birthdd]").val();
	
	if(birthdd.length == 1){
		f_birthdd = '0'+birthdd;
	
		return birthyy+birthmm+f_birthdd;
	}
	else{
		return birthyy+birthmm+birthdd;
	}
}

function paramMail(){
	var mail_name= $("input[name=mail_name]").val();
	var mail_addr= $("#mail_addr option:selected").val();
		
	return mail_name+'@'+mail_addr;
}

//*********************************************************************************************
// ********** User Defined Function Section 
//*********************************************************************************************
</script>
</head>

<body>
<div class="d-flex" id="wrapper">
<jsp:include page="template/sidebar.jsp" />

<div id="page-content-wrapper">
<jsp:include page="template/header.jsp" />
<div class="container-fluid" style="height:87%;">
    
<!-- Page Content Start -->

<div id="profilePage" style="min-width:1200px;">
	<div class="box-header">
		<h3 class="box-title">기본 정보</h3>
	</div>
  <!-- /.box-header -->
	<div class="box-body no-padding" style="margin-left:15px;margin-right:15px;border-top:1px solid #dee2e6;">
	<form name="userParamForm1" id="userParamForm1" role="form">
	<input type="hidden" id="p_id" name="p_id">
	<input type="hidden" id="p_birth" name="p_birth">
	<input type="hidden" id="p_phone" name="p_phone">
	<input type="hidden" id="p_mail" name="p_mail">
	<table class="table table-striped">
	  <colgroup>
		<col width="10%"/>
		<col width="90%"/>
	  </colgroup>
	  <tr>
	    <td>아이디</td>
	    <c:if test="${not empty login}">
	    <td><span id="u_id">${login.userId}</span></td>
	    </c:if>
	  </tr>
	  <tr>
	    <td>비밀번호</td>
	    <td><input type="password" name="u_pw" style="border:1px solid #dee2e6;"></td>
	  </tr>
	  <tr>
	    <td>비밀번호 확인</td>
	    <td><input type="password" name="u_pw2" style="border:1px solid #dee2e6;"></td>
	  </tr>
	  <tr>
	    <td>이름</td>
	    <td><input type="text" name="u_name" style="border:1px solid #dee2e6;"></td>
	  </tr>
	  <tr>
	    <td>휴대폰 번호</td>
	    <td><select id="u_phone1" name="u_phone1" style="border:1px solid #dee2e6;height: 24.8px;width:80px;">
									<option>010</option>
									<option>011</option>
									<option>016</option>
									<option>017</option>
									<option>019</option>
								</select>
		<label style="font-size: 15px;line-height: 1.0;">-</label>						
	    <input type="text" name="u_phone2" maxlength="4" style="border:1px solid #dee2e6;width:80px;">
	    <label style="font-size: 15px;line-height: 1.0;">-</label>
	    <input type="text" name="u_phone3" maxlength="4" style="border:1px solid #dee2e6;width:80px;">
	  </tr>
	  <tr>
	    <td>이메일</td>
	    <td><input type="text" name="mail_name" maxlength="50" style="border:1px solid #dee2e6;">
            <label style="font-size: 15px;line-height: 1.0;">@</label>
			<select id="mail_addr" name="mail_addr" style="border:1px solid #dee2e6;height: 27.5px; width:150px;">
				<option>naver.com</option>
				<option>daum.net</option>
				<option>gmail.com</option>
				<option>nate.com</option>						
			</select>
	    </td>
	  </tr>
	  <tr>
	    <td>주소</td>
	    <td><input type="text" name="u_addr" style="border:1px solid #dee2e6; width:50%;"></td>
	  </tr>
	</table>
	</form>
	</div>
  <!-- /.box-body -->
	<div class="box-header">
		<h3 class="box-title">추가 정보</h3>
	</div>
  <!-- /.box-header -->
	<div class="box-body no-padding" style="margin-left:15px;margin-right:15px;border-top:1px solid #dee2e6;">
	<form name="userParamForm2" id="userParamForm2" role="form">
	<table class="table table-striped">
	  <colgroup>
		<col width="10%"/>
		<col width="90%"/>
	  </colgroup>
	  <tr>
	    <td>성별</td>
	    <td><input type="radio" name="gender" value = "M" style="margin-right:10px; float:left; margin-left:10px; margin-top:3px" checked id = "r1" >
            <label for = "r1" style="float:left;">남자</label>
            <input type="radio" name="gender" value = "F" style="margin-right: 10px; float:left; margin-left:20px; margin-top:3px" id = "r2">
            <label for = "r2" style="float:left;">여자</label>
	    </td>
	  </tr>
	  <tr>
	    <td>생년월일</td>
	    <td><input type="text" name="birthyy" maxlength="4" style="float:left; border:1px solid #dee2e6; width:80px; margin-right: 5px; font-size: 13px;">
			<label for = "r1" style="float:left; margin-right:5px;">년</label>
			<select id="birthmm" name="birthmm" style="float:left; border:1px solid #dee2e6; width:80px; margin-right: 5px; font-size: 13px; height: 27.5px;">
				<option value="01" >01</option>
				<option value="02" >02</option>
				<option value="03" >03</option>
				<option value="04" >04</option>
				<option value="05" >05</option>
				<option value="06" >06</option>
				<option value="07" >07</option>
				<option value="08" >08</option>
				<option value="09" >09</option>
				<option value="10" >10</option>
				<option value="11" >11</option>
				<option value="12" >12</option>
			</select>
			<label for = "r1" style="float:left;margin-right:5px;">월</label>
			<input type="text" name="birthdd" maxlength="2" style="float:left; border:1px solid #dee2e6; width:80px; margin-right: 5px;font-size: 13px;">
			<label for = "r1" style="float:left;">일</label>
		</td>
	  </tr>
	</table>
	</form>
	</div>
  <!-- /.box-body -->
  <div style="position:relative; left:2%; float:left; width:100%; ">
  <form name="userParamForm3" id="userParamForm3" role="form">
      <input type="checkbox" name="checkbox" style="margin-top: 15px; font-weight: bold; font-size: 13px;">
      <span style="position: relative;top: -4px;font-size: 12px;">개인정보 취급방침에 따른 개인정보의 수집 및 이용에 동의합니다.</span>
  </form>    
  </div>
  <div style="position:relative; left:35%; float:left; margin-bottom: 40px;">
  <button class="btn btn-secondary" id="edit_btn" style="width: 107px;">회원정보수정</button>
  <button class="btn btn-secondary" id="cancel_btn" style="width: 107px;">취소</button>
  <button class="btn btn-outline-secondary" id="withdrawal_btn" style="width: 90px; left: 167%; position: relative;" onclick="deleteChkPop()">회원탈퇴</button>
  </div>
</div>

<!-- Page Content End -->

</div>    
<jsp:include page="template/footer.jsp" />
</div>
</div>

</body>
</html>
