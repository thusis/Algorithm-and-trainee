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
			<a href="${ contextPath }/loginView.me">�α���</a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="${ contextPath }/enrollView.me">ȸ������</a>&nbsp;&nbsp;&nbsp;&nbsp;
		</div>
	</c:if>
	
	<c:if test="${ !empty loginUser }">
		<div id="noLoginbar">
			<b>${ loginUser.nickname }��, �ݰ����ϴ�.</b><br><br>
			<a href="${ contextPath }/editView.me">�� ���� ����</a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="${ contextPath }/myBoard.vo">���� �� ��</a><span id="myBoardCount"> 1 </span>&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="${ contextPath }/logout.me">�α׾ƿ�</a>
		</div>
	</c:if>
	
	<script>
// 		���� �� �� ��ȸ ��� : 
// 		myBoard.vo �� �Ѿ�� [where=���� ���̵�]�� select �� �Խñ۸�� ��������
		
// 		member �ʵ�� boardCount �߰��ؼ�
// 		�� �� ������ boardCount 1�� �����ϵ���, ������ ������ 1�� �����ϵ���
		
	</script>

</body>
</html>