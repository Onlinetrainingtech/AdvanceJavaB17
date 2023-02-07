<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>LoginSucess!!</h1>
<%

HttpSession sess=request.getSession(true);

String s1=(String)sess.getAttribute("u1");

out.println("Welcome to the Website::"+s1);

%>
</body>
</html>