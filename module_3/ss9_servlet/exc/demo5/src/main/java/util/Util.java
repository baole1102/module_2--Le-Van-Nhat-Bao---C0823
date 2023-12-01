package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static Connection connection;
    public static synchronized Connection getConnection ()
    {
        if (connection != null){
            return connection;
        }else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/text";
                String user = "root";
                String pass =  "Baopro1102";
                try {
                    connection = DriverManager.getConnection(url,user,pass);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }
    public static synchronized void closeConnection ()
    {
        if (connection != null){
            try {
                connection.close();
            }catch (Exception e){

            }finally {
                connection= null;
            }
        }
    }
}
