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

<title>Login Page</title>
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
var list = new Array();

$(document).ready(function(){
	$("#login_btn").click(function(){
	
		login();
	});
});

function login(){
	
	var json = {
			u_id : $("#u_id").val(),
			u_pw : $("#u_pw").val()
		};
		
		for(var str in json){
			if(json[str].length == 0){
				alert($("#" + str).attr("placeholder") + "를 입력해주세요.");
				$("#" + str).focus();
				return;
			}
		}
		$.ajax({
			type : "post",
			contentType: 'application/json',
			url : "/member/login.do",
			data : JSON.stringify(json),
			success : function(data) {
				//console.log(data);
				window.location.href = "../"+data.URL;
				alert(data.MSG);
			},
			error : function(error) {
				alert("오류 발생"+ error);
				console.log(error);
			}
		});
	}

</script>
</head>

<body>
    <div class="ui middle aligned center aligned grid">
        <div class="column">
            <h2 class="ui teal image header">
 				로그인 페이지
            </h2>
            <form class="ui large form">
                <div class="ui stacked segment">
                    <div class="field">
                        <div class="ui left icon input">
                            <input type="text" id="u_id" placeholder="아이디" style="font-weight: bold; font-size: 13px;">
                        </div>
                    </div>
                    <div class="field">
                        <div class="ui left icon input">
                            <input type="password" id="u_pw" placeholder="비밀번호" style="font-weight: bold; font-size: 13px;" onkeypress="if(event.keyCode == 13){ login(); return; }">
                        </div>
                    </div>
                    <div class="ui fluid large teal submit button" id = "login_btn" style="font-size: 15px;font-weight: bold;">로그인</div>
                </div>
                <div class="ui error message"></div>
            </form>

            <div class="ui message">
                로그인 할 계정이 없다면 <a href="/member/register.do">여기</a>를 눌러주세요.
            </div>
        </div>
    </div>
</body>

</html>
