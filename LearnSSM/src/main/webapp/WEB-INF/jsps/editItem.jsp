<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form id="itemForm"
		action="${pageContext.request.contextPath }/items/saveOrUpdate.do"
		method="post">
		<input type="hidden" name="id" value="${item.id }" /> 修改商品信息：
		<table width="100%" border=1>
			<tr>
				<td>商品名称</td>
				<td><input type="text" name="name" value="${item.name }" /></td>
			</tr>
			<tr>
				<td>商品价格</td>
				<td><input type="text" name="price" value="${item.price }" /></td>
			</tr>
			<tr>
				<td>商品生产日期</td>
				<td><input type="text" name="createtime"
					value="<fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/>" /></td>
			</tr>
			<tr>
				<td>商品图片</td>
				<td>
					<p>
						<label></label> <img id='imgSize1ImgSrc'
							src='${picPath }${item.pic }' height="100" width="100" /> <input
							type='file' id='imgSize1File' name='imgSize1File' class="file"
							onchange='submitImgSize1Upload()' /><span class="pos"
							id="imgSize1FileSpan">请上传图片的大小不超过3MB</span> <input type='hidden'
							id='imgSize1' name='pic' value='' reg="^.+$" tip="亲！您忘记上传图片了。" />
					</p>

				</td>
			</tr>
			<tr>
				<td>商品简介</td>
				<td><textarea rows="3" cols="30" name="detail">${item.detail }</textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="提交" />
				</td>
			</tr>
		</table>

	</form>
</body>
</html>