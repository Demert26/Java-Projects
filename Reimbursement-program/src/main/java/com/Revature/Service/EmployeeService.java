package com.Revature.Service;

import com.Revature.Data.DaoFactory;
import com.Revature.Data.EmployeeDao;
import com.Revature.Data.EmployeeDaoImpl;
import com.Revature.Entities.Employee;

public class EmployeeService {

    public Employee register(Employee employee) {
        EmployeeDao employeeDao = DaoFactory.getEmployeeDao();
        Employee employee1 = employeeDao.insert(employee);

//        EmployeeDao employeeDao = DaoFactory.getEmployeeDao();

        return employee1;
    }

    public Employee login(int employeeId, String password) {
//        EmployeeDao employeeDAO = new EmployeeDaoImpl();
        EmployeeDao employeeDao = DaoFactory.getEmployeeDao();
        Employee employee = employeeDao.getByemployeeId(employeeId);
        if (password.equals(employee.getpassword())) {
            return employee;


        }
        return null;


    }

    public Employee submitTicket(int ticketId, String amount, int description) {

        return null;
    }

    public Employee logout(int employeeId, String password) {
        return null;
    }
}