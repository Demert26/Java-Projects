package com.Revature.Controller;

import com.Revature.Entities.Employee;
import com.Revature.Service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.function.IntBinaryOperator;

public class EmployeeServlet extends HttpServlet  {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        EmployeeService employeeService = new EmployeeService();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        PrintWriter out = resp.getWriter();
        EmployeeService employeeService = new EmployeeService();

        ObjectMapper mapper = new ObjectMapper();

        Employee employee;
        
        employee = mapper.readValue(req.getReader(),Employee.class);

        employee = employeeService.register(employee);
    }
}
