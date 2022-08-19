package com.Revature.Entities;

public class Manager {

    private int Id;

    private String first_name;

    private String last_name;

    private String role;

    public Manager(){

    }


    public Manager(int id, String first_name, String last_name, String role) {
        Id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
    }

    public Manager(String first_name, String last_name, String role) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
    }
}
