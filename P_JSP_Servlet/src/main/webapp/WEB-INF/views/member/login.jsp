<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../common/top.jsp"/>
	<form action="${ contextPath }/login.me" method="post" id="loginForm">
		<div align="center" id="loginDiv">
			<table>
				<tr>
					<td align="right">
						<label for="id">아이디</label>
					</td>
					<td>
						<input type="text" name="id" id="id" size="25">
					</td>
				</tr>
				<tr>
					<td align="right">
						<label for="pwd">비밀번호</label>
					</td>
					<td>
						<input type="password" name="pwd" id="pwd" size="25">
					</td>
				</tr>
			</table>
			<br>
			<label id="loginLabel">로그인</label>			
			&nbsp; &nbsp; &nbsp; &nbsp;
			<label id="findIdPwdLabel">ID/PW 찾기</label>
		</div>
	</form>
	<script>
		window.onload = () => {
			document.getElementById("loginLabel").addEventListener('click', ()=>{
				const id = document.getElementById('id');
				const pwd = document.getElementById('pwd');
				//아이디가 공란이면
				if(id.value.trim() == '') {
					alert('아이디를 입력하세요');
					id.focus();
				//비밀번호가 공란이면
				} else if(pwd.value.trim()==''){
					alert('비밀번호를 입력하세요');
					pwd.focus();
				//둘 다 채워져 있으면 	
				} else{
					document.getElementById('loginForm').submit();
				}
			});
		}
	</script>
</body>
</html>