package com.learn.web.servlets;

import com.learn.web.holder.DepartmentsHolder;
import com.learn.web.model.Department;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by RUSLAN77 on  23.02.2018 in Ukraine
 */
@WebServlet("/RemoveDepartments")
public class RemoveDepartments extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String paramId = req.getParameter("departmentId");
        if (paramId != null) {
            Integer id = Integer.valueOf(paramId);
            DepartmentsHolder.removeDepartment(id);
        }
        resp.sendRedirect("/departmentsList");
    }
}
