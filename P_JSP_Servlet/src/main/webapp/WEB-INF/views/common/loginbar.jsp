<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	#noLoginbar{text-align: right; margin:50px;}
	#noLoginbar>a{color:black; text-decoration:none;}
	#noLoginbar>a:hover{font-weight:bold; text-decoration:underline;}
	#myBoardCount{width:23px; height:23px; margin-left:5px; background-color:lightgrey; border-radius:10px;}
</style>
</head>
<body>
	<c:if test="${ empty loginUser }">
		<div id="noLoginbar">
			<a href="${ contextPath }/loginView.me">로그인</a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="${ contextPath }/enrollView.me">회원가입</a>&nbsp;&nbsp;&nbsp;&nbsp;
		</div>
	</c:if>
	
	<c:if test="${ !empty loginUser }">
		<div id="noLoginbar">
			<b>${ loginUser.nickname }님, 반갑습니다.</b><br><br>
			<a href="${ contextPath }/editView.me">내 정보 수정</a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="${ contextPath }/myBoard.vo">내가 쓴 글</a><span id="myBoardCount"> 1 </span>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="${ contextPath }/logout.me">로그아웃</a>
		</div>
	</c:if>
	
	<script>
// 		내가 쓴 글 조회 기능 : 
// 		myBoard.vo 로 넘어가면 [where=유저 아이디]로 select 한 게시글목록 나오도록
		
// 		member 필드로 boardCount 추가해서
// 		글 쓸 때마다 boardCount 1씩 증가하도록, 삭제할 때마다 1씩 감소하도록
		
	</script>

</body>
</html>