<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	.tablelist{
		
		width:600px;
		border-collapse:collapse;
		text-align:center;
	} 

</style>
<script type="text/javascript">
	window.onload = function (){
		var trs = document.getElementsByTagName("tr");
		for(i=0;i<trs.length;i++){
			if(i%2 == 1){
				trs[i].style.backgroundColor="#CCCCCC";
			}
		}
	} 
</script>
</head>
<body>
	${ (empty success)?"":"<script>alert('删除成功！');</script>" }
	${ (empty error)?"":"<script>alert('请选择车次！');</script>" }
	<form action="${ pageContext.request.contextPath }/deleteServlet">
	<table border="1px solid #000000"  class="tablelist">
		<tr>
			<th><input type="submit" value="删除"></th>
			<th>车次</th>
			<th>发车--到达</th>
			<th>发时--到时</th>
			<th>车型</th>
			<th>运行时间(小时)</th>
		</tr>
		<c:forEach items="${ trains }" var="train">
			<tr>
				<td><input type="checkbox" name="trainNO" value="${ train.train_no }"></td>
				<td><a href="${ pageContext.request.contextPath }/selectServlet?trainid=${ train.train_no }">${ train.train_no }</a></td>
				<td>${ train.start_station }——${ train.arrival_station }</td>
				<td>${ train.start_time }——${ train.arrival_time }</td>
				<td>${ train.type }</td>
				<td>${ train.runtime }</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="6">
				<c:forEach begin="1" end="${ page }" var="pageNum">
					<a href="${ pageContext.request.contextPath }/getAllServlet?pageNum=${ pageNum }">[${ pageNum }]</a>
				</c:forEach>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>