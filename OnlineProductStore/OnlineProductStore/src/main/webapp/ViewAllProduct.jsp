<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="Test.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("alist");
out.println("page belongs to Admin"+ab.getFname()+"<br>");
if(al.size()==0)
{
	out.println("products not Available..<br>");
	
}else
{
	Iterator<ProductBean> it=al.iterator();
	while(it.hasNext())
	{
		ProductBean pb=(ProductBean)it.next();
		out.println(pb.getCode()+"&nbsp&nbsp"+pb.getName()+"&nbsp&nbsp"+pb.getPrice()+"&nbsp&nbsp"+pb.getQty()+"&nbsp&nbsp"+"<a href='edit?pcode="+pb.getCode()+"'>Edit</a>"+"&nbsp&nbsp"+"<a href='delete?pcode="+pb.getCode()+"'>Delete</a>"+"<br>");
		
		
	}
}

%>
<a href="Product.html">AddProduct</a>
<a href="logout.html">Logout</a>
</body>
</html>