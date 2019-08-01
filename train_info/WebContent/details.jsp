<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	.tablelist{
		width:400px;
		border-collapse:collapse;
	} 

</style>
</head>
<body>
	<table border="1px solid #000000" class="tablelist">
		<tr> 
			<th bgcolor="#CCCCCC" colspan="2">火车车次详情</th>
		</tr>
		<tr>
			<td>车次</td><td>${ train.train_no }</td>
		</tr>
		<tr>
			<td>发车--到达</td>
			<td>${ train.start_station }——${ train.arrival_station }</td>
		</tr>
		<tr>
			<td>发时--到时</td>
			<td>${ train.start_time }——${ train.arrival_time }</td>
		</tr>
		<tr>
			<td>车型</td><td>${ train.type }</td>
		</tr>
		
		<tr>
			<td>里程（公里）</td><td>${ train.mile }</td>
		</tr>
	</table>
	<br><a href="${ pageContext.request.contextPath }/getAllServlet">返回</a>
</body>
</html>