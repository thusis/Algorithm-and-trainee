<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	.mainDiv{border: 1px solid black;}
	#mainDiv{margin: 100px;}
	#mainDiv>table{width:100%; border-collapse: collapse;}
	#cell1, #cell2{padding: 5px; border: 1px solid black;}
	#cell1{text-align: center;}
	#cell1 *{margin: 3px;}
	#cell1 select, #cell1 input[name=title], #cell1 button{height: 30px;}
	#cell1 select{width : 80px;}
	#cell2>table{width: 100%;}
	#cell2>table th{border-bottom: 1px solid black;}
	#cell2>table *{text-align: center; padding: 3px;}
	#cell2>table tfoot td{text-align: right;}
	#moreBoard:hover{font-weight: bold; text-decoration: underline; cursor: pointer;}
</style>
</head>
<body>

	<jsp:include page="WEB-INF/views/common/top.jsp"></jsp:include>
	<jsp:include page="WEB-INF/views/common/loginbar.jsp"></jsp:include>
	
    <div id="mainDiv" class="mainDiv">
        <table>
            <tr>
                <td id="cell1">
                    <form action="${contextPath}/insertBoard.bo" method="post">
                        <select name="category">
                            <option value="공통">공통</option>
                            <option value="운동">운동</option>
                            <option value="등산">등산</option>
                            <option value="게임">게임</option>
                            <option value="낚시">낚시</option>
                            <option value="요리">요리</option>
                            <option value="기타">기타</option>
                        </select>

                        <div>글
                            쓰기 위한 공란, <br>
                            1. 유저 아이디가 admin이냐 아니냐에 따라 공지 체크 가부 달라짐<br>
                            2. textarea 이용해서 게시글 내용 작성란 만들기<br>
                            3. 유저 아이디가 null 이면 작성 불가<br>
                            <b>단, JSTL 의 core 태그 이용</b>
                        </div>
                    </form>
                </td>
                <td id="cell2">
                    <table>

                        <thead>
                            <tr>
                                <th>번호</th>
                                <th>카테고리</th>
                                <th width="250px">제목</th>
                                <th width="70px">작성자</th>
                                <th>작성 일자</th>
                                <th>조회수</th>
                            </tr>
                        </thead>

                        <tbody>
                            <tr>
                                <td>1234</td>
                                <td>공통</td>
                                <td>안녕</td>
                                <td>강건강</td>
                                <td>2022-10-09</td>
                                <td>0</td>
                            </tr>
                            <tr>
                                <td>1234</td>
                                <td>공통</td>
                                <td>안녕</td>
                                <td>강건강</td>
                                <td>2022-10-09</td>
                                <td>0</td>
                            </tr>
                            <tr>
                                <td>1234</td>
                                <td>공통</td>
                                <td>안녕</td>
                                <td>강건강</td>
                                <td>2022-10-09</td>
                                <td>0</td>
                            </tr>
                        </tbody>

                        <tfoot>
                            <tr>
                                <td colspan="6" id="moreBoard"><br>더보기...</td>
                            </tr>
                        </tfoot>
                    </table>
                </td>
            </tr>
        </table>
    </div>
    <script>
        window.onload =()=>{
            document.getElementById('moreBoard').addEvenetListener('click', function(){
                location.href='${contextPath}/list.bo';
            })
        }
    </script>


</body>
</html>