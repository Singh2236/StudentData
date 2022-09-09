package com.navi.studentdata.servlets;

import com.navi.studentdata.service.StudentDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "saveServlet" ,value = "/saveServlet")
public class saveServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String course = request.getParameter("course");
        String matri = request.getParameter("matri");
        StudentDao studentDao = new StudentDao();
        studentDao.save(new String[]{name, course, matri});

        response.getWriter().print("<html><body><h1>Success</h1></body></html>");

    }

    /*@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/
}
