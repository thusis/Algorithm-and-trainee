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
						<label for="id">���̵�</label>
					</td>
					<td>
						<input type="text" name="id" id="id" size="25">
					</td>
				</tr>
				<tr>
					<td align="right">
						<label for="pwd">��й�ȣ</label>
					</td>
					<td>
						<input type="password" name="pwd" id="pwd" size="25">
					</td>
				</tr>
			</table>
			<br>
			<label id="loginLabel">�α���</label>			
			&nbsp; &nbsp; &nbsp; &nbsp;
			<label id="findIdPwdLabel">ID/PW ã��</label>
		</div>
	</form>
	<script>
		window.onload = () => {
			document.getElementById("loginLabel").addEventListener('click', ()=>{
				const id = document.getElementById('id');
				const pwd = document.getElementById('pwd');
				//���̵� �����̸�
				if(id.value.trim() == '') {
					alert('���̵� �Է��ϼ���');
					id.focus();
				//��й�ȣ�� �����̸�
				} else if(pwd.value.trim()==''){
					alert('��й�ȣ�� �Է��ϼ���');
					pwd.focus();
				//�� �� ä���� ������ 	
				} else{
					document.getElementById('loginForm').submit();
				}
			});
		}
	</script>
</body>
</html>