<%@ page import="com.navi.studentdata.service.StudentDao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage='true' %>
<html>
<head>
    <title>redirect</title>
</head>
<body>
<%
    StudentDao studentDao = new StudentDao();
    String name = request.getParameter("name");
    String course = request.getParameter("course");
    String matri = request.getParameter("matri");
    studentDao.save(new String[]{name, course, matri});
    response.sendRedirect("/StudentData_war_exploded/index.jsp");
%>
<h1>Student Data</h1>
<p>You data has been saved</p>
<a href="index.jsp">Home</a>

</body>
</html>
