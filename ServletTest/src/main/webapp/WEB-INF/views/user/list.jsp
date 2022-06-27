<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User List</title>
</head>
<body>
	<c:set var="members" value="${list }"/>
	<c:forEach var="users" items="${members }">
		<p>${users.getName() }</p><br>
		<p>${users.getEmail() }</p><br>
	</c:forEach>
</body>
</html>