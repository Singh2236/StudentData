<%@ page import="javax.persistence.EntityManagerFactory" %>
<%@ page import="javax.persistence.Persistence" %>
<%@ page import="javax.persistence.EntityManager" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%



%>








<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Student Data</h1>
<br/>
<table>
    <tr>
        <th>Name of the coloumn 1</th>
        <th>Name of the coloumn 2</th>
        <th>Name of the coloumn 3</th>
        <th>Name of the coloumn 1 4</th>
    </tr>
    <tr>
        <td></td>
        <td>id of the student</td>
        <td>Matriculation number of the student</td>
        <td>Name of the student</td>
        <td>Course</td>
    </tr>
</table>
<a href="/StudentData_war_exploded/index.jsp">Refresh</a>
</body>
</html>