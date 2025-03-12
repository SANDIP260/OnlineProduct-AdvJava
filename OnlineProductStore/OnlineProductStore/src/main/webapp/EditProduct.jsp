<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="Test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
ProductBean pb=(ProductBean)request.getAttribute("pbean");
out.println("page belongs to Admin:"+ab.getFname()+"<br>");


%>
<form action="update" method="post">
<input type="hidden" name="pcode" value=<%=pb.getCode() %>>
ProductPrice:<input type="text" name="price" value=<%=pb.getPrice() %>><br>
ProductQty:<input type="text" name="qty" value=<%=pb.getQty() %>><br>
<input type="submit" value="UpdateProduct">

</form>
</body>
</html>