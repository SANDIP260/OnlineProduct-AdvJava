<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="Test.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
out.println("Welcome Admin:"+ab.getFname()+"<br>");
%>
<a href="Product.html">AddProduct</a>
<a href="View">ViewAllProducts</a>
<a href="Logout">LogOut</a>
</body>
</html>