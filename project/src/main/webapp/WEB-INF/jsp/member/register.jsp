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

<title>Register Page</title>
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
	    max-width: 450px;
	}
</style>
	
<script>
var registerChk = 'N';

$(document).ready(function() {

	$("#register_btn").click(function() {
		
		checkValue();
		
		if(registerChk == 'Y'){
			
			$("#birth").val(paramBirth());
			$("#u_mail").val(paramMail());
			
			var paramString = $("form[name=paramForm]").serializeObject();
	 		$.ajax({
				type : "post",
				contentType: 'application/json',
				url : "register.do",
				data : JSON.stringify(paramString),
				success : function(data) {
					switch (Number(data)) {
					case 0:
						alert("아이디가 중복 되었습니다.");
						break;
					case 1:
						alert("정상적으로 회원가입 되었습니다.");
						window.location.href = "/member/login.do";
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
});

function checkValue(){
	var form = document.paramForm;
	var chk = document.paramForm.checkbox.checked;
	
	if(!form.u_id.value){
		alert("아이디를 입력해주세요.");
		$("input[name=u_id]").focus();
		return;
	}
	
	if(form.idDuplication.value != "idCheck"){
		alert("아이디 중복체크를 해주세요.");
		return false;
	}
	
	if(!form.u_pw.value){
		alert("비밀번호를 입력해주세요.");
		$("input[name=u_pw]").focus();
		return;
	}
	
	if(form.u_pw.value != form.u_pw2.value){
		alert("비밀번호를 동일하게 입력해주세요.");
		$("input[name=u_pw2]").focus();
		return;
	}
	
	if(!form.u_name.value){
		alert("이름을 입력해주세요.");
		$("input[name=u_name]").focus();
		return;
	}
	
	if(!form.u_phone.value){
		alert("전화번호를 입력해주세요.");
		$("input[name=u_phone]").focus();
		return;
	}
	
	if(isNaN(form.u_phone.value)){
		alert("전화번호는 - 제외한 숫자만 입력해주세요.");
		$("input[name=u_phone]").focus();
		return;
	}
	
	if(!form.birthyy.value){
		alert("년도를 입력해주세요.");
		$("input[name=birthyy]").focus();
		return;
	}
	
	if(isNaN(form.birthyy.value)){
		alert("년도는 숫자만 입력가능합니다.");
		$("input[name=birthyy]").focus();
		return;
	}
	
	if(form.birthmm.value == "00"){
		alert("월을 선택해주세요.");
		$("input[name=birthmm]").focus();
		return;
	}
	
	if(!form.birthdd.value){
		alert("날짜를 입력해주세요.");
		$("input[name=birthdd]").focus();
		return;
	}
	
	if(isNaN(form.birthdd.value)){
		alert("날짜는 숫자만 입력가능합니다.");
		$("input[name=birthdd]").focus();
		return;
	}
	
	if(!chk){
		alert("개인정보 수집 및 이용에 대한 동의는 필수입니다.");
		return;
	}
	registerChk = 'Y';
}

// 아이디 중복체크 화면 오픈
function checkIdPopOpen(){
	var popupWidth = 500;
	var popupHeight = 300;
	
	var popupX = (window.screen.width / 2) - (popupWidth / 2);
	var popupY= (window.screen.height / 2) - (popupHeight / 2);
	
	window.name = "parentForm";
	window.open("check_id.do", "chkForm", "width="+ popupWidth +", height="+ popupHeight +", left="+ popupX +", top="+ popupY +", resizable = no, scrollbars = no");
}

function inputIdChk(){
	document.paramForm.idDuplication.value ="idUncheck";
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

</script>
</head>

<body>

    <div class="ui middle aligned center aligned grid">
        <div class="column">
            <h2 class="ui teal image header">
                회원가입 페이지
            </h2>
            <div class="ui large form">
                <div class="ui stacked segment">
		            <button style="position: absolute; left: 325px; top: 20px; font-size: 10pt; border-width: thin; z-index: 1;" onclick="checkIdPopOpen()">중복확인</button>
		            <form name="paramForm" id="paramForm" role="form">
					<input type="hidden" id="birth" name="birth">
					<input type="hidden" id="u_mail" name="u_mail">
	                    <div class="field">
	                        <div class="ui left icon input">
	                            <input type="text" id="u_id" name="u_id" placeholder="아이디 *" autofocus autocomplete="off" onkeydown="inputIdChk()" style="font-weight: bold; font-size: 13px;">
								<input type="hidden" name="idDuplication" value="idUncheck" >
	                        </div>
	                    </div>
	                    <div class="field">
	                        <div class="ui left icon input">
	                            <input type="password" name="u_pw" placeholder="비밀번호 *" style="font-weight: bold; font-size: 13px;">
	                        </div>
	                    </div>
	                    <div class="field">
	                        <div class="ui left icon input">
	                            <input type="password" name="u_pw2" placeholder="비밀번호 확인 *" style="font-weight: bold; font-size: 13px;">
	                        </div>
	                    </div>
	                    <div class="field">
	                        <div class="ui left icon input">
	                            <input type="text" name="u_name" placeholder="이름 *" style="font-weight: bold; font-size: 13px;">
	                        </div>
	                    </div>
	                    <div class="field">
	                        <div class="ui left icon input">
	                            <input type="text" name="u_phone" maxlength="11" placeholder="휴대폰 번호 *" style="font-weight: bold; font-size: 13px;">
	                        </div>
	                    </div>
	                    <div class="field">
	                        <div>
	                        	<label style="font-size:13px; float:left; margin-left:37px; margin-bottom:10px; color:rgba(0,0,0,0.25);">성별 *</label>
	                            <input type="radio" name="gender" value = "M" style="margin-right:10px; float:left; margin-left:60px; margin-top:3px" checked id = "r1" >
	                            <label for = "r1" style="font-size:13px; float:left;">남</label>
	                            <input type="radio" name="gender" value = "F" style="margin-right: 10px; float:left; margin-left:20px; margin-top:3px" id = "r2">
	                            <label for = "r2" style="font-size:13px; float:left;">여</label>
	                        </div>
	                    </div>
	                    <div class="field">
	                        <div class="ui left icon input">
	                            <input type="text" name="birthyy" maxlength="4" placeholder="년도(4자) *" size="6" style="width:30%; margin-right: 10px; font-weight: bold; font-size: 13px;">
								<select id="birthmm" name="birthmm" style="width:30%; margin-right: 10px; font-weight: bold; font-size: 13px;">
									<option value="00">월</option>
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
								<input type="text" name="birthdd" maxlength="2" placeholder="일 *" size="4" style="width:30%; font-weight: bold; font-size: 13px;">
	                        </div>
	                    </div>
	                    <div class="field">
	                        <div class="ui left icon input">
	                            <input type="text" name="mail_name" placeholder="이메일" maxlength="50" style="width:40%; font-weight: bold; font-size: 13px;">
	                            <label style="font-size: 15px;line-height: 1.5;">@</label>
								<select id="mail_addr" name="mail_addr" style="width:48%; font-size: 13px;">
									<option>naver.com</option>
									<option>daum.net</option>
									<option>gmail.com</option>
									<option>nate.com</option>						
								</select>
	                        </div>
	                    </div>
	                    <div class="field">
	                        <div class="ui left icon input">
	                            <input type="text" name="u_addr" placeholder="주소" style="font-weight: bold; font-size: 13px;" size="50">
	                        </div>
	                    </div>
	                    <div class="field">
	                        <div>
	                            <input type="checkbox" name="checkbox" style="margin-bottom: 15px; font-weight: bold; font-size: 13px;">
	                            <span style="position: relative;top: -4px;font-size: 12px;">개인정보 수집 및 이용에 동의합니다.</span>
	                        </div>
	                    </div>
		            </form>
                    <button class="ui fluid large teal submit button" id="register_btn" style="font-size: 15px; font-weight: bold;">회원가입</button>
                </div>
                <div class="ui error message"></div>
            </div>


            <div class="ui message">
                로그인 할 계정이 있다면 <a href="/member/login.do">여기</a>를 눌러주세요.
            </div>
        </div>
    </div>
</body>

</html>
