package com.database;


import java.sql.*;

public class Database {



    private static final String Dbname = "JavaSample";
    private static final String User = "root_arturo";
    private static final String Pass = "";
    private static final String url ="jdbc:mysql://localhost/"+Dbname;

    PreparedStatement state;
    ResultSet querySet;

    public static Connection GetConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(url, User, Pass); // to convert to DriverManager statement to Connection Type
            System.out.println("Connection was done successfully");

            /*
             *String connection = "jdbc:sqlserver://localhost:1433;"+"database=master;"+"user=sa;"+"password:1234;"+"loginTimeout=30;"
             *
             *
             * */



        } catch (Exception e ){
            System.out.println("Error in GetConnection method by: "+e.toString());
        }

        return  conn;
    }
    public void Insert(String name){

        Connection conn = null;

        try {
            conn = GetConnection();
            state = conn.prepareStatement("INSERT INTO users (name) VALUES(?) "); // from PreparedStatement
            state.setString(1,name);

            int succ = state.executeUpdate();

            if (succ > 0){
                System.out.println("Data was saved successfully");
            } else{
                System.out.println("Problem at the saved data");
            }

            conn.close();

        }catch (Exception e){
            System.out.println("Error by: "+e.toString());
        }


    }

    public void FetchRows(){

        Connection conn = null;

        try {
            conn = GetConnection();

            state = conn.prepareStatement("SELECT * FROM users ");
            //state.execute();
            querySet = state.executeQuery();

            while (querySet.next()){
                System.out.println(querySet.getString(2));
            }

            //System.out.println("This is the querySet: "+querySet.getFetchSize());

            conn.close();

        }catch (Exception e){
            System.out.println("Error in FetchRows method by: "+e);
        }
    }

}




















