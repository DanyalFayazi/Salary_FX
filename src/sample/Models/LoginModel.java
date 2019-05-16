package sample.Models;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {

    Connection connection;
    public LoginModel() throws SQLException, ClassNotFoundException {
        connection = SQLiteConnection.connector();

        if (connection==null) {
            System.out.println("Connection is not ok");
            System.exit(1);}
    }
    public boolean isDbConnected(){
        try {
            return !connection.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public  boolean isLogin(String user,String pass) throws SQLException {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet=null;
//        String query1="update admins set username = ? and password = ? where id=1";
//
//        try {
////            if(connection == null)
////                System.out.println("1");
//            preparedStatement = connection.prepareStatement(query1);
////            System.out.println("2");
//            preparedStatement.setString(1,"t");
//            preparedStatement.setString(2,"t");
//            resultSet=preparedStatement.executeQuery();
//            if (resultSet.next()){
//                return true;
//            }
//            else {
//                return false;
//            }
//        } catch (SQLException e) {
//            System.out.println(e);
//            return false;
//        }
//        finally {
//            preparedStatement.close();
//            resultSet.close();
//        }









        String query="select * from admins where username = ? and password = ?";
        try {
//            if(connection == null)
//                System.out.println("1");
            preparedStatement = connection.prepareStatement(query);
//            System.out.println("2");
            preparedStatement.setString(1,user);
            preparedStatement.setString(2,pass);
            resultSet=preparedStatement.executeQuery();
            if (resultSet.next()){
                return true;
            }
            else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        finally {
            preparedStatement.close();
            resultSet.close();
        }
    }

}
