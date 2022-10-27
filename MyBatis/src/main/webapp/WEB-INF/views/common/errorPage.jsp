<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러페이지</title>
</head>
<body>
	<h1 align="center">${ message }</h1>
	<div  align="center">
		<button onclick="location.href='${header.referer}'">이전 페이지로</button>
		<button onclick="location.href='${contextPath}'">홈으로</button>
	</div>
	
	
</body>
</html>