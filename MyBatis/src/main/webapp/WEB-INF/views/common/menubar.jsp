<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#welcome{
		background:black; 
		text-shadow:-1px -1px 0 red, 1px -1px 0 white, -1px 1px 0 white, 1px 1px 0 white;
		cursor: pointer;
		text-align:center;
	}
	.login-area{height:100px;}
	#login-btn{height:50px;}
	.login-area table{text-align:right; float:right;}
	#loginBtns>a{text-decoration:none; color:black;}
	#loginBtns>a:hover{text-decoration:underline; font-weight:bold; curson:pointer}
	
	
	
</style>
</head>
<body>
	<c:set var="contextPath" value="${pageContext.request.contextPath}" scope="application"/>
	<h1 id="welcome" onclick="location.href='${contextPath}'">Welcome to MyBatis world!</h1>
	
	<br>
	
	<div class='login-area'>
		<c:if test="${ empty loginUser }">
			<form action="${contextPath}/login.me" method="post">
				<table class="loginTable">
					<tr>
						<td>아이디: </td>
						<td><input type="text" name="userId"></td>
						<td rowspan="2"><button id="login-btn">로그인</button></td>
					</tr>
					
					<tr>
						<td>비밀번호: </td>
						<td><input type="password" name="userPwd"></td>
					</tr>
					<tr>
						<td colspan="3" id="loginBtns">
							<a href="${contextPath}/enrollPage.me">회원가입</a> &nbsp; &nbsp;
							<a>아이디/비밀번호 찾기</a>
						</td>
					</tr>
				</table>
			</form>
		</c:if>
		
		<c:if test="${ !empty loginUser }">
			<table class="loginTable">
				<tr>
					<td colspan="2"><h3> ${loginUser.nickName}님, 환영합니다</h3></td>
				</tr>
				<tr>
					<td><button onclick="location.href='${contextPath}/info.me'">내 정보 보기</button></td>
					<td><button onclick="location.href='${contextPath}/logout.me'">로그아웃</button></td>
				</tr>
			
			</table>
		
		</c:if>
		
		

	</div>
</body>
</html>