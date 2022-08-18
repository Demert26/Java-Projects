package com.Revature.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {

    private static Connection connection = null;

    private ConnectionFactory(){

    }

    public static Connection getConnection(){
        if(connection == null){
            System.out.println("Connection is being created");

            ResourceBundle bundle = ResourceBundle.getBundle("DbConfig.properties");

            String url = bundle.getString("url");
            String user = bundle.getString("username");
            String password = bundle.getString( "password");
            try{
                connection = DriverManager.getConnection(url, user, password);

            }catch(SQLException e){
                System.out.println("Something went wrong with the connection");
                e.printStackTrace();
            }
//            connection = DriverManager.getConnection(url, user, password);

        }
        return connection;
    }
}
