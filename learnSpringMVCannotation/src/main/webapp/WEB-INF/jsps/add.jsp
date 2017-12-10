<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>int 类型参数传递</h1>
<form action="${pageContext.request.contextPath }/user/recieveInt.do" method="post">
	ID：<input type="text" name="id" id="id">
	<input type="submit" value="提交">
</form>
<h1>String 类型参数传递</h1>
<form action="${pageContext.request.contextPath}/user/recieveString.do" method="post">
	username：<input type="text" name="username">
	<input type="submit" value="提交">
</form>
<h1>javaBean类型对象</h1>
<form action="${pageContext.request.contextPath }/user/recieveUser.do" method="post">
姓名：<input type="text" name="username" id="username">
生日：<input type="text" name="birthday" id="birthday">
性别：<input type="text" name="sex" id="sex">
地址：<input type="text" name="address" id="address">
<input type="submit" value="提交">
</form>
<h1>java包装类型对象</h1>
<form action="${pageContext.request.contextPath }/user/recieveUserCustom.do" method="post">
姓名：<input type="text" name="user.username" id="username">
生日：<input type="text" name="user.birthday" id="birthday">
性别：<input type="text" name="user.sex" id="sex">
地址：<input type="text" name="user.address" id="address">
<input type="submit" value="提交">
</form>
<h1>java数组类型</h1>
<form action="${pageContext.request.contextPath }/user/recieveArray.do" method="post">
ID:<input type="checkbox" name="ids" value="1">
ID:<input type="checkbox" name="ids" value="2">
ID:<input type="checkbox" name="ids" value="3">
ID:<input type="checkbox" name="ids" value="4">
<input type="submit" value="提交">
</form>

<h1>java集合类型</h1>
<form action="${pageContext.request.contextPath }/user/recieveList.do" method="post">
姓名：<input type="text" name="userList[0].username" />
生日：<input type="text" name="userList[0].birthday" />
性别：<input type="text" name="userList[0].sex" />
地址：<input type="text" name="userList[0].address" />
姓名：<input type="text" name="userList[1].username" />
生日：<input type="text" name="userList[1].birthday" />
性别：<input type="text" name="userList[1].sex" />
地址：<input type="text" name="userList[1].address" />
<input type="submit" value="提交">
</form>
<h1>javaMap类型</h1>
<form action="${pageContext.request.contextPath }/user/recieveMap.do" method="post">
姓名：<input type="text" name="maps['username']" id="username">
地址：<input type="text" name="maps['address']" id="address">
<input type="submit" value="提交">
</form>
</html>