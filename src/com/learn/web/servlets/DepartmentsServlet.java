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
@WebServlet("/departmentsList")
public class DepartmentsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listOfDepartments", DepartmentsHolder.getDepartments());
        req.getRequestDispatcher("departmentsList.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
