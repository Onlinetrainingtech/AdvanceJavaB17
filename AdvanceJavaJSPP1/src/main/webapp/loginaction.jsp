<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String uname=request.getParameter("uname");
String pass=request.getParameter("pass");

if(uname.equals("admin")&&pass.equals("admin"))
{
	HttpSession session1=request.getSession();
	session1.setAttribute("u1",uname);
	RequestDispatcher rd=request.getRequestDispatcher("homepage.jsp");
	rd.forward(request, response);
}
else
{
	Cookie ck=new Cookie("e1",uname);
	response.addCookie(ck);
	RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
	rd.include(request, response);
}

%>
</body>
</html>