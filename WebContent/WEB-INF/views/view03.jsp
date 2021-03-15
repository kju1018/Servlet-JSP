<%-- page 지시자 --%>
<!-- page 지시자 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
		<link rel="stylesheet" href="/servletjsp/common/bootstrap-4.6.0/css/bootstrap.min.css">
		<script src="/servletjsp/common/js/jquery-3.5.1.min.js"></script>
		<script src="/servletjsp/common/bootstrap-4.6.0/js/bootstrap.bundle.min.js"></script>	
		<script src="/servletjsp/common/bootstrap-4.6.0/js/bootstrap.min.js"></script>
</head>
<body>
	<h5>view03.jsp</h5>
	<hr/>
	<table class="table">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>글쓴이</th>
		</tr>
		<tr>
		<%-- Servlet03.java에서 req.setAttribute("board", board); 키 값과 같아야함 --%>
		<%-- EL로 데이터 표현 --%>
			<%-- Board의 필드라고 생각하면 안되고 getBno(), getBtitle()에서 get빼고 소문자로 바꾼것 --%>
			<%-- board.bno = board.getBno();  board.bno = board.bno;(X)--%>
			<td>${board.bno}</td>
			<td>${board.btitle}</td>
			<td>${board.bcontent}</td>
			<td>${board.bwriter}</td>
		</tr>
	</table>
	
</body>
</html>