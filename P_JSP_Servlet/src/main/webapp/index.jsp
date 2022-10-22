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
                            <option value="����">����</option>
                            <option value="�">�</option>
                            <option value="���">���</option>
                            <option value="����">����</option>
                            <option value="����">����</option>
                            <option value="�丮">�丮</option>
                            <option value="��Ÿ">��Ÿ</option>
                        </select>

                        <div>��
                            ���� ���� ����, <br>
                            1. ���� ���̵� admin�̳� �ƴϳĿ� ���� ���� üũ ���� �޶���<br>
                            2. textarea �̿��ؼ� �Խñ� ���� �ۼ��� �����<br>
                            3. ���� ���̵� null �̸� �ۼ� �Ұ�<br>
                            <b>��, JSTL �� core �±� �̿�</b>
                        </div>
                    </form>
                </td>
                <td id="cell2">
                    <table>

                        <thead>
                            <tr>
                                <th>��ȣ</th>
                                <th>ī�װ�</th>
                                <th width="250px">����</th>
                                <th width="70px">�ۼ���</th>
                                <th>�ۼ� ����</th>
                                <th>��ȸ��</th>
                            </tr>
                        </thead>

                        <tbody>
                            <tr>
                                <td>1234</td>
                                <td>����</td>
                                <td>�ȳ�</td>
                                <td>���ǰ�</td>
                                <td>2022-10-09</td>
                                <td>0</td>
                            </tr>
                            <tr>
                                <td>1234</td>
                                <td>����</td>
                                <td>�ȳ�</td>
                                <td>���ǰ�</td>
                                <td>2022-10-09</td>
                                <td>0</td>
                            </tr>
                            <tr>
                                <td>1234</td>
                                <td>����</td>
                                <td>�ȳ�</td>
                                <td>���ǰ�</td>
                                <td>2022-10-09</td>
                                <td>0</td>
                            </tr>
                        </tbody>

                        <tfoot>
                            <tr>
                                <td colspan="6" id="moreBoard"><br>������...</td>
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