<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	#errorDiv{ 
		border:1px solid black; 
		margin: auto; margin-top: 150px; padding: 150px; 
		width:500px;
	}
	#errorDiv>a{
		color:black;
		text-decoration: none;
	}
	#errorDiv>a:hover{
		font-weight: bold;
		text-decoration: underline;
		cursor:pointer;
	}
	
</style>
</head>
<body>
	<jsp:include page="top.jsp"/>
	<div align="center" id="errorDiv">
		<h1>${msg}</h1>
		<br>
		<a href="javascript:history.back();">���� �������� ���ư���</a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="${ contextPath }">�������� ���ư���</a>
	</div>

</body>
</html>