<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<%@ page import="javax.persistence.EntityManagerFactory" %>
<%@ page import="javax.persistence.Persistence" %>
<%@ page import="javax.persistence.EntityManager" %>
<%@ page import="com.navi.studentdata.service.StudentDao" %>
<%@ page import="com.navi.studentdata.model.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
    StudentDao studentDao = new StudentDao();
    List<Student> all = studentDao.getAll();
%>
<!DOCTYPE html>
<html>
<head>
    <title>StudentData</title>
</head>
<body>
<h1>Student Data</h1>

<form action="/StudentData_war_exploded/save.jsp" method = "post">
    <table>
        <tr><td>Name: </td><td><input type="text" name = "name"></td></tr>
        <tr><td>Course: </td><td><input type="text" name = "course"></td></tr>
        <tr><td>Matriculation Number: </td><td><input type="text" name = "matri"></td></tr>
        <tr><td></td><td><input type="submit"></td></tr>
    </table>
</form>

<br/>
<div class="table-responsive">
    <table class="table table-sm table-dark">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">Course</th>
            <th scope="col">Matriculation No.</th>
        </tr>
        </thead>
        <tbody>
        <%
            for (Student s : all) {
        %>
        <tr>
            <td><%=s.getId()%>
            </td>
            <td><%=s.getName()%>
            </td>
            <td><%=s.getCourse()%>
            </td>
            <td><%=s.getMatri()%>
            </td>

        </tr>

        <%
            }
        %>
        </tbody>
    </table>
</div>
<a href="/StudentData_war_exploded/index.jsp">Refresh</a>
</body>
</html>