package com.Revature.Entities;

public class Employee {

    private int employeeId;

    private String first_name;

    private String last_name;

    private String role;

    public Employee(){


    }
    public Employee(int employeeId, String first_name, String last_name, String role){
        this.employeeId = employeeId;
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;

    }
    public Employee(String first_name, String last_name, String role) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
