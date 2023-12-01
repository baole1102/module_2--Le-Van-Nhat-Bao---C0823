package util;

import java.sql.Connection;
import java.util.logging.Logger;

public class Java {
    public static Connection connection;
    public static synchronized Connection getConnection ()
    {
        if (connection != null){
            return connection;
        }else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
