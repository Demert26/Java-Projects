package com.Revature.Controller;

import com.Revature.Entities.Employee;
import com.Revature.Service.EmployeeService;

import java.util.Scanner;

public class EmployeeCommandLineInterface {

    public static void menu()   {
        EmployeeService employeeService = new EmployeeService();

        Employee employee = null;

        Scanner intscanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);


        while(true){
            printOptions();
            int choice = intscanner.nextInt();
            switch(choice){
                case 1:
                    if(employee != null){
                        System.out.println("You are already logged in");
                        break;
                    }

                    System.out.print("username :");
                    String username = stringScanner.nextLine();
                    System.out.print("password:");
                    String password = stringScanner.nextLine();
                    System.out.print("First Name:");
                    String first_name = stringScanner.nextLine();
                    System.out.print("Last Name:");
                    String last_name = stringScanner.nextLine();
                    System.out.print("Position:");
                    String position = stringScanner.nextLine();

                    Employee employee1 = new Employee(username, password, first_name, last_name,position);
                    employee = employeeService.register(employee1);
                    break;
                case 2:
                    if(employee != null) {
                        System.out.println("You are already logged in.");
                        break;
                    }
                    System.out.print("Enter id:");
                    int employeeId = intscanner.nextInt();
                    System.out.print("Enter Password:");
                    password = stringScanner.nextLine();
                    employee = employeeService.login(employeeId, password);
                    if(employee == null) {
                        System.out.println("Login Unsuccessfull");
                    }
                    break;

                case 3:
                    if(employee == null) {
                        System.out.println("you must be logged in to submit ticket");
                    }
                case 6:

        }

    }


    }

    private static void printOptions() {
        System.out.println("1 - Register");
        System.out.println("2 - Login");
        System.out.println("3 - Submit ticket");
        System.out.println("4 - search for tickets");
        System.out.println("5 - process ticket submission");
        System.out.println("6 - Logout");
        System.out.print("Enter = ");
    }
}
