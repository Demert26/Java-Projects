package com.Revature.Data;

import com.Revature.Entities.Employee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class EmployeeDaoImpl implements EmployeeDao{

    Connection connection;

    public EmployeeDaoImpl(){
        connection = ConnectionFactory.getConnection();

    }


//
    @Override
    public Employee insert(Employee employee) {
        Logger logger =LoggerFactory.getLogger( "EmployeeDaoImpl");
        String sql = "insert into staff (employeeId, username, password, first_name, last_name, position)" +
                " values( default, ?, ?, ?, ?, ?);";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, employee.getusername());
            preparedStatement.setString(2, employee.getpassword());
            preparedStatement.setString(3, employee.getfirst_name());
            preparedStatement.setString(4, employee.getlast_name());
            preparedStatement.setString(5, employee.getposition());

            int count = preparedStatement.executeUpdate();

            if (count ==1){
                logger.info("Employee registered successfully");
            }
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            resultSet.next();
            employee.setemployeeId(resultSet.getInt(1));
        } catch (SQLException e) {
            logger.warn("Something went wrong with the insert");
            e.printStackTrace();
            return null;
        }
        return employee;

    }

    @Override
    public Employee getByemployeeId(int employeeId) {
        Logger logger = LoggerFactory.getLogger("Get employeeId Impl");
        String sql = "select * from staff where employeeId = ?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1,employeeId);
            ResultSet resultSet =preparedStatement.executeQuery();

            if(resultSet.next()){
                int employeeIdDb = resultSet.getInt("employeeId");
                String username =resultSet.getString("username");
                String password = resultSet.getString("password");
                String first_name = resultSet.getString("first_name");
                String last_name = resultSet.getString("last_name");
                String position = resultSet.getString("position");
                return new Employee(employeeIdDb, username, password, first_name, last_name, position);

            }
            else {
                logger.warn("person might not exists");
            }

        } catch (SQLException e) {
            logger.warn("SQL Exception occurred");
            e.printStackTrace();

        }
        return null;
    }

    @Override
    public Employee getByeusername(Employee username) {
        return null;
    }

    @Override
    public Employee update(Employee employee) {return null;}

    @Override
    public boolean delete(int employeeId){
        return false;

    }



}
