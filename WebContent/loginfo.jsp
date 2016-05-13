<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--    <jsp:useBean id="info" class="kalenPage.JavaBean" scope="page">
   	<jsp:setProperty name="info" property="*"/>
   </jsp:useBean> --%>
	<%@page import="java.util.List" %>
	<%@page import="com.kalen.JavaBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录信息</title>
</head>
<body>

	<%
		int i=0;
		List<JavaBean> list = (List<JavaBean>) application
				.getAttribute("users");
		if (list != null) {
			for (JavaBean user : list) {
			i++;	
	%>
	<ul>
		<li>用户名:<%=user.getUsername() %></li>
		<li>密码:<%=user.getPwd() %></li>
	</ul>
	<%
		}
		}
	%>
	
	<a href="index.jsp">继续登录</a>
</body>
</html>