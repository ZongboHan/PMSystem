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
	<form action="<%= request.getContextPath() %>/UpdateServlet" method="post">
	<table border="1">
		<tr>
			<td>编号：</td>
			<td><%= profile.getId()%></td>
		</tr>
		<tr>
			<td>姓名：</td>
			<td><input type="text" name="name" value="<%= profile.getName()%>"></td>
		</tr>
		<tr>
			<td>生日：</td>
			<td><input type="text" name="birthday" value="<%= profile.getBirthday()%>"></td>
		</tr>
		<tr>
			<td>性别：</td>
			<td>
				<select name="gender">
					<option value="<%= profile.getGender()%>" selected><%= profile.getGender()%></option>>
					<%
					
						if(profile.getGender().equals("男")){
						
							%>
							<option value="女">女</option>
							<%
						}else if(profile.getGender().equals("女")){
							
							%>
							<option value="男">男</option>
							<%
						}
					%>
					
				</select>
			</td>
		</tr>
		<tr>
			<td>职业：</td>
			<td><input type="text" name="career" value="<%= profile.getCareer()%>"></td>
		</tr>
		<tr>
			<td>住所：</td>
			<td><input type="text" name="address" value="<%= profile.getAddress()%>"></td>
		</tr>
		<tr>
			<td>电话：</td>
			<td><input type="text" name="mobile" value="<%= profile.getMobile()%>"></td>
		</tr>
	</table>
	<input type="button" value="返回" onclick="back()">
	<input type="submit" value="提交" >
</body>
</html>