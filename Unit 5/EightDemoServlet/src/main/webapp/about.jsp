<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  //Scriptlet tag holds your functional java code
	String for_username_field = (String)session.getAttribute("username_field");
%>

<h3>Welcome username : <%= for_username_field %></h3>
<a href="home.jsp">Home page</a><br><br>
<a href="profile.jsp">Profile</a><br><br>
<a href="logoutAction">Log Out</a><br><br>
</body>
</html>