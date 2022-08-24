package com.Revature.Data;

import com.Revature.Entities.Employee;

public interface EmployeeDao {
// enter new employee
    public Employee insert(Employee employee);

//    public Employee insert
    public Employee getByemployeeId(int employeeId);

    public Employee getByeusername(Employee username);

    public Employee update(Employee employee);

    public boolean delete(int employeeId);


}
