<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script type="text/javascript">
	
		function requestJson(){
			var jsonUser=JSON.stringify({"username":"张三丰","age":"18",address:"武当山"});
			$.ajax({
				type:'post',
				url:'${pageContext.request.contextPath }/user/requestJson.do',
				contentType:'application/json;charset=utf-8',
				data:jsonUser,
				success:function(data){
					console.log(data);
					alert("完毕");
				}
			});
		}
</script>
</head>
<body>
	<input type="button" value="点击" onclick="requestJson()"/>
</body>
</html>