<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Server Page - Directives</title>
</head>
<body>
	<font face="verdana" size="20"><b> The following content is from another resource
	Include Directive: 
	<%-- <%@include file="sample.html"%> --%>
	<%-- <jsp:forward page="index.jsp"/> --%>
	<jsp:include page="index.jsp"></jsp:include>
	<h2>===========================</h2>
	<b>This content is
	displayed after displaying the content of sample.html</b></b></font>
</body>
</html>
