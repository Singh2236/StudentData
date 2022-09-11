<%@ page import="com.navi.studentdata.service.StudentDao" %><%--
  Created by IntelliJ IDEA.
  User: navka
  Date: 09-09-2022
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>deleting</title>
</head>
<body>
<%

    int id = Integer.parseInt(request.getParameter("id"));
    StudentDao studentDao = new StudentDao();
    studentDao.delete(id);
    response.sendRedirect("/StudentData_war_exploded/index.jsp");
%>

</body>
</html>
