<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.GregorianCalendar, java.util.Calendar"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <jsp:include page="../common/menubar.jsp"/><br>
    <h1 align="center">회원가입</h1><br>
    <form action="${contextPath}/insertMember.me" method="post">
        <table style="margin:auto;">
            <tr>
                <td>* 아이디</td>
                <td><input type="text" name="userId" required></td>
            </tr>
            <tr>
                <td>* 비밀번호</td>
                <td><input type="password" name="userPwd" required></td>
            </tr>
            <tr>
                <td>비밀번호 확인</td>
                <td><input type="text" name="userPwd2"></td>
            </tr>
            <tr>
                <td>* 이름</td>
                <td><input type="text" name="userName" required></td>
            </tr>
            <tr>
                <td>* 닉네임</td>
                <td><input type="text" name="nickName" required></td>
            </tr>
            <tr>
                <td>&nbsp;&nbsp;이메일</td>
                <td><input type="email" name="email"></td>
            </tr>
            <tr>
                <td>&nbsp;&nbsp;생일</td>
                <td>
                    <select name="year">
                        <c:forEach begin="<%=new GregorianCalendar().get(Calendar.YEAR)-100%>"
                                    end="<%=new GregorianCalendar().get(Calendar.YEAR)%>" var="i">
                            <option>${ i }</option>        
                        </c:forEach>
                    </select>
                    <select name="month">
                        <c:forEach begin="1" end="12" var="i">
                                <option>${i}</option>
                        </c:forEach>
                    </select>
                    <select name="date">
                        <c:forEach begin="1" end="31" var="i">
                            <option>${i}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>

            <tr>
                <td>&nbsp;&nbsp;전화번호</td>
                <td><input type="text" name="phone"></td>
            </tr>
            <tr>
                <td>&nbsp;&nbsp;주소</td>
                <td><input type="text"  name="address"></td>
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
                        <input type="submit" value="가입하기">
                        <input type="reset" value="취소">
                    </div>
                </td>
            </tr>










        </table>
    </form>


</body>
</html>