package com.database;


import java.sql.Connection;
import java.sql.DriverManager;

public class Database {



    private static final String Dbname = "JavaSample";
    private static final String User = "root_arturo";
    private static final String Pass = "";
    private static final String url ="jdbc:mysql://localhost:3306/"+Dbname;

    Connection conn = null;

    public Database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, User, Pass);

            if (conn != null){
                System.out.println("Connection was donde successfully");
            }
        }
        catch (Exception err){
            System.out.println("error by:"+err.toString());
        }
    }

    public Connection GetConnection(){ // this method provided Connection from driver connection
        // of java.sql

        return conn;
    }


}
