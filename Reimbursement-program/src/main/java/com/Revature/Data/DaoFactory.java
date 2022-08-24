package com.Revature.Data;

import java.security.PrivateKey;

public class DaoFactory {

    private static EmployeeDao employeeDao = null;



    private DaoFactory(){

    }
//Employee Dao created
    public static EmployeeDao getEmployeeDao() {
        if(employeeDao == null ){

            employeeDao = new EmployeeDaoImpl();

        }
        return employeeDao;
    }



}
