<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../common/menubar.jsp"/>
	<div class="outer">
		<br>
		<h1 align="center">게시글 상세보기</h1>
		<table id="detailContent" class="detailTable">
			<tr>
				<th width="100px">글번호</th>
				<td><b>${b.boardId}</b></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><b>${b.boardWriter }</b></td>
			</tr>
			<tr>
				<th>조회수</th>
				<td><b>${b.boardCount }</b></td>
			</tr>
			<tr>
				<th>작성일</th>
				<td><b>${b.modifyDate }</b></td>
			</tr>
			<tr>
				<th>내용</th>
				<td>
					<p style="height:100px;">${ b.boardContent }</p>
				</td>
			</tr>
		</table>
		
		<table>
			<tr>
				<td><textarea cols="80" rows="5"></textarea></td>
				<td><button>등록하기</button></td>
			</tr>
			<tr>	
				<td colspan="2">댓글</td>
			</tr>
		</table>
		
		<c:if test="${ rCount>0 }">
			<table>
				<c:forEach items="${b.replyList}" var="r">
					<tr>
						<td width="100px">${r.nickName }</td>
						<td width="400px">${r.replyContent }</td>
						<td width="150px">${r.modifyDate }</td>
					</tr>				
				</c:forEach>
			</table>
		</c:if>
	</div>



</body>
</html>