package com.learn.web.servlets;

import com.learn.web.holder.DepartmentsHolder;
import com.learn.web.model.Department;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RUSLAN77 on  29.01.2018 in Ukraine
 */
@WebServlet("/addEditDepartment")
public class AddEditDepartmentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String paramId = req.getParameter("departmentId");
        if (paramId != null) {
            Integer departmentId = Integer.valueOf(paramId);
            Department department = DepartmentsHolder.getDepartmentById(departmentId);
            req.setAttribute("department", department);
        }
        req.getRequestDispatcher("addEditDepartment.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String departmentName = req.getParameter("departmentName");
        String departmentId = req.getParameter("departmentId");
        if (departmentId == null || departmentId.isEmpty()) {

            if (departmentName != null) {
                Department department = new Department(DepartmentsHolder.getNewDepartmentId(), departmentName);
                DepartmentsHolder.addDepartment(department);
            }
        } else {
            Integer id = Integer.valueOf(departmentId);
            DepartmentsHolder.getDepartmentById(id).setName(departmentName);
        }

        resp.sendRedirect("/departmentsList");
    }
//        req.getRequestDispatcher("/departmentsList").forward(req, resp);

}

