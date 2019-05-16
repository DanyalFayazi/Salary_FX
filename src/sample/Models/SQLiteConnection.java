package sample.Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnection {
    public static Connection connector() throws SQLException, ClassNotFoundException {
        try {
            //Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Admindb.sqlite");
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:EmployeeDb.sqlite");
            return conn;
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }

    }
}
