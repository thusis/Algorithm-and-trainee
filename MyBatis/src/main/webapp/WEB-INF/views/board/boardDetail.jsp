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
		<h1 align="center">�Խñ� �󼼺���</h1>
		<table id="detailContent" class="detailTable">
			<tr>
				<th width="100px">�۹�ȣ</th>
				<td><b>${b.boardId}</b></td>
			</tr>
			<tr>
				<th>�ۼ���</th>
				<td><b>${b.boardWriter }</b></td>
			</tr>
			<tr>
				<th>��ȸ��</th>
				<td><b>${b.boardCount }</b></td>
			</tr>
			<tr>
				<th>�ۼ���</th>
				<td><b>${b.modifyDate }</b></td>
			</tr>
			<tr>
				<th>����</th>
				<td>
					<p style="height:100px;">${ b.boardContent }</p>
				</td>
			</tr>
		</table>
		
		<table>
			<tr>
				<td><textarea cols="80" rows="5"></textarea></td>
				<td><button>����ϱ�</button></td>
			</tr>
			<tr>	
				<td colspan="2">���</td>
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