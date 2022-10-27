<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.GregorianCalendar, java.util.Calendar"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <jsp:include page="../common/menubar.jsp"/><br>
    <h1 align="center">회원수정</h1><br>
    <form action="${contextPath}/updateMember.me" method="post">
        <table style="margin:auto;">
            <tr>
                <td>* 아이디</td>
                <td>${loginUser.userId}</td>
            </tr>
            <tr>
                <td>* 비밀번호</td>
                <td><input type="password" name="userPwd" ></td>
            </tr>
            <tr>
                <td>비밀번호 확인</td>
                <td><input type="text" name="userPwd2"></td>
            </tr>
            <tr>
                <td>* 이름</td>
                <td><input type="text" name="userName" required value=${loginUser.userName}></td>
            </tr>
            <tr>
                <td>* 닉네임</td>
                <td><input type="text" name="nickName" required value=${loginUser.nickName}></td>
            </tr>
            <tr>
                <td>&nbsp;&nbsp;이메일</td>
                <td><input type="email" name="email" value=${loginUser.email}></td>
            </tr>
            <tr>
                <td>&nbsp;&nbsp;생일</td>
                <td>
                    <select name="year">
                        <c:forEach begin="<%=new GregorianCalendar().get(Calendar.YEAR)-100%>"
                                    end="<%=new GregorianCalendar().get(Calendar.YEAR)%>" var="i">
                            <c:if test="${fn:substring(loginUser.birthDay,0,4)==i }">
                            	<option selected>${ i }</option>
                            </c:if>
                            <c:if test="${fn:substring(loginUser.birthDay,0,4)!=i }">
                            	<option selected>${ i }</option>
                           	</c:if>
                        </c:forEach>
                    </select>

                    <select name="month">
                        <c:forEach begin="1" end="12" var="i">
                        	<c:if test="${fn:substring(loginUser.birthDay, 5, 7)==i }">
                                <option>${i}</option>
                            </c:if>
                        	<c:if test="${fn:substring(loginUser.birthDay, 5, 7)!=i }">
                                <option>${i}</option>
                            </c:if>
                        </c:forEach>
                    </select>
                    
                    <select name="date">
                        <c:forEach begin="1" end="31" var="i">
                        	<c:if test="${fn:substring(loginUser.birthDay, 8, 10)==i }">
                                <option>${i}</option>
                            </c:if>
                        	<c:if test="${fn:substring(loginUser.birthDay, 8, 10)!=i }">
                                <option>${i}</option>
                            </c:if>
                        </c:forEach>
                    </select>

                </td>
            </tr>

            <tr>
                <td>&nbsp;&nbsp;전화번호</td>
                <td><input type="text" name="phone" value=${loginUser.phone}></td>
            </tr>
            <tr>
                <td>&nbsp;&nbsp;주소</td>
                <td><input type="text"  name="address" value=${loginUser.phone}></td>
            </tr>
            <tr>
                <td>&nbsp;&nbsp;성별</td>
                <td>
                	<input type="radio" name="gender" value="M">남자
                	<input type="radio" name="gender" value="F">여자
               	</td>
            </tr>
            <tr>
                <td colspan="2">
                    <div align="center">
                        <br>
                        <input type="submit" value="수정하기">
                        <button type="button" id="deleteBtn">회원탈퇴</button>
                        <input type="reset" value="취소">
                    </div>
                </td>
            </tr>
        </table>
    </form>
    
   	<script>
   		window.onload = () => {
   			document.getElementById('deleteBtn').addEventListener('click', ()=>{
   				if(confirm('정말 탈퇴하시겠습니까?')){
   					location.href='deleteMember.me';
   				}
   			})
   		}
   	
   	</script>
    
</body>
</html>