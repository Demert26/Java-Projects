package com.Revature.Entities;

public class Employee {

    private int employeeId;

    private String username;

    private String password;

    private String first_name;

    private String last_name;

    private String position;

    public Employee(){


    }
    public Employee(int employeeId, String username,
                    String password, String first_name, String last_name, String position){
        this.employeeId = employeeId;
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.position = position;

    }
    public Employee(String username, String password, String first_name, String last_name, String position) {
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.position = position;
    }

    public Employee(String username, String password) {
            this.username = username;
            this.password = password;
    }

    public int getemployeeId() {
        return employeeId;
    }

    public void setemployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getfirst_name() {
        return first_name;
    }

    public void setfirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getlast_name() {
        return last_name;
    }

    public void setlast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getposition() {
        return position;
    }

    public void setpostion(String role) {
        this.position = position;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }
    public String getpassword(){
        return password;

    }
    public void setpassword(String password){
        this.password = password;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "employeeId = " + employeeId +
                ", username = " + username + '}';

    }
}
