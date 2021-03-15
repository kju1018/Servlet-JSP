<%-- page 지시자 --%>
<!-- page 지시자 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*, com.mycompany.webapp.dto.*" %>

<%-- taglib 지시자 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



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
	<h5>view052.jsp</h5>
	<hr/>
		<%-- Servlet04.java에 request.setAttribute("list", list); "list" <- 키 값 --%>
		<%-- board에 하나씩 꺼내서 넣어줌 --%>
		<c:forEach var="board" items="${list}">
			<div class="alert alert-primary">
				<div>${board.bno}</div>
				<div>${board.btitle}</div>
				<div>${board.bcontent}</div>
				<div>${board.bwriter}</div>
			</div>
		</c:forEach>
		
	
</body>
</html>