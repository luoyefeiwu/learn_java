<%@page import="com.jerry.domain.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<div>
		<%  
		User stu=(User)session.getAttribute("u");
		stu.getUsername();
		%>
		
		<%=stu.getUsername() %>
	</div>
	<a href="login.jsp">登录</a>
	<a href="reg.jsp">注册</a>


</body>
</html>
