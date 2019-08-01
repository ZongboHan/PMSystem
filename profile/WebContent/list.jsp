<%@page import="com.neu.entity.Profile"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function get(id){
		location.href= "<%= request.getContextPath()%>/DetailServlet?id="+id;
	}
	function update(id){
		location.href= "<%= request.getContextPath()%>/EditServlet?id="+id;
	}
	function insert(){
		location.href= "<%= request.getContextPath()%>/insert.jsp";
	}
</script>
</head>
<body>
	<table border="1" width="700">
		<tr>
			<td>编号</td><td>姓名</td><td>生日</td><td>性别</td><td>职业</td><td>住所</td><td>电话</td><td>操作</td>
		</tr>
		<% 
			List<Profile> profiles = (List<Profile>)request.getAttribute("profiles");
			for(Profile profile:profiles){
				%>
				<tr>
					<td><%= profile.getId()%></td>
					<td><%= profile.getName()%></td>
					<td><%= profile.getBirthday()%></td>
					<td><%= profile.getGender()%></td>
					<td><%= profile.getCareer()%></td>
					<td><%= profile.getAddress()%></td>
					<td><%= profile.getMobile()%></td>
					<td><input type="button" value="明细" onclick="get(<%= profile.getId()%>)">
					<input type="button" value="修改" onclick="update(<%= profile.getId()%>)">
					</td>
				</tr>
				<% 
			}
		%>
	</table>
	<input type="button" value="新增" onclick="insert()">
</body>
</html>