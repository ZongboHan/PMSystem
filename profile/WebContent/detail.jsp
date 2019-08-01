<%@page import="com.neu.entity.Profile"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function back(){
		location.href="<%= request.getContextPath()%>/ListServlet";
	}
</script>
</head>
<body>
	<% 
		Profile profile = (Profile)request.getAttribute("profile");
	%>
	<table border="1">
		<tr>
			<td>编号：</td><td><%= profile.getId()%></td>
		</tr>
		<tr>
			<td>姓名：</td><td><%= profile.getName()%></td>
		</tr>
		<tr>
			<td>生日：</td><td><%= profile.getBirthday()%></td>
		</tr>
		<tr>
			<td>性别：</td><td><%= profile.getGender()%></td>
		</tr>
		<tr>
			<td>职业：</td><td><%= profile.getCareer()%></td>
		</tr>
		<tr>
			<td>住所：</td><td><%= profile.getAddress()%></td>
		</tr>
		<tr>
			<td>电话：</td><td><%= profile.getMobile()%></td>
		</tr>
	</table>
	<input type="button" value="返回" onclick="back()">
</body>
</html>