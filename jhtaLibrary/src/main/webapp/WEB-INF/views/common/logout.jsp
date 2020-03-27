<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카스탐로그아웃</title>
</head>
<body>
	<h1>logout</h1><!-- /common/customLogout 일로 보내야 하는거 아닌감? 저짝 매핑인뎅 -->
	<form action="<c:url value="/common/logout" />" method="post">
		<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }" />
		<input type="submit" value="로그아웃" />
	</form>
</body>
</html>