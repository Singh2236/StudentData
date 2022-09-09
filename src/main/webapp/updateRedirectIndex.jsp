<%@ page import="com.navi.studentdata.service.StudentDao" %><%--
  Created by IntelliJ IDEA.
  User: navka
  Date: 09-09-2022
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>updating</title>
</head>
<body>

<%
    int id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("name");
    String course = request.getParameter("course");
    String matri = request.getParameter("matri");
    StudentDao studentDao = new StudentDao();
    studentDao.update(id, new String[]{name,course,matri});
    response.sendRedirect("/StudentData_war_exploded/index.jsp");
%>

</body>
</html>
