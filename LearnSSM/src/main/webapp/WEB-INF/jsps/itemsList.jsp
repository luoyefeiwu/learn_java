<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table width="100%" border=1>
<tr>
	<td>ID</td>
	<td>商品名称</td>
	<td>商品图片</td>
	<td>商品价格</td>
	<td>生产日期</td>
	<td>商品描述</td>
	<td>操作</td>
</tr>
<c:forEach items="${itemsList }" var="item">
<tr>
	<td>
	<input type="checkbox" name="id" value="${item.id }">
	</td>
	<td>${item.name }</td>
	<td>
	<img id='imgSize1ImgSrc' src='${picPath }${item.pic }'  height="100" width="100" />
	</td>
	<td>${item.price }</td>
	<td><fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	<td>${item.detail }</td>
	
	<td><a href="${pageContext.request.contextPath }/items/edit.do?id=${item.id}">修改</a>
	<a href="${pageContext.request.contextPath }/items/deleteByID.do?id=${item.id}">删除</a>
	</td>

</tr>
</c:forEach>

</table>
</body>
</html>