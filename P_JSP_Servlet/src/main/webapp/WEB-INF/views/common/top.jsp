<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
  h1>a{
      color:darkturquoise;
      text-decoration: none;
      text-shadow: 1px 1px 2px coral, 0 0 1em rgb(251, 255, 0), 0 0 0.2em rgba(255, 217, 145, 0.212);
  }
</style>
</head>
<body>
	<c:set var="contextPath" value="${ pageContext.servletContext.contextPath }" scope="application"></c:set>
	<h1 align="center">
		<a href="${ contextPath }">
<!-- 		<img src="WEB-INF/views/img/image1.jpg" alt="image1"/> -->
		Squirrel the Sorcery</a>
	</h1>

</body>
</html>