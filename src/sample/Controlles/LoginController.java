package sample.Controlles;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.Models.LoginModel;


import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public LoginModel loginModel;
    @FXML
    public PasswordField pass;
    @FXML
    public TextField user;

    @FXML
    public Button login;


    @FXML private javafx.scene.control.Label isConnected;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            loginModel = new LoginModel();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (loginModel.isDbConnected()){
            isConnected.setText("Connected");
        }
        else
            isConnected.setText("Not Connected");
    }

    public void Login(ActionEvent event) throws SQLException, ClassNotFoundException, IOException {
//        LoginModel l=new LoginModel();
        //  boolean test= loginModel.isLogin(txt_username.getText(),txt_password.getText());
        if (loginModel.isLogin(user.getText(), pass.getText())){
            Parent root = FXMLLoader.load(getClass().getResource("..///Views/Admin Menu(salary).fxml"));
            Scene rootScene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(rootScene);
            stage.show();
        }
        else
            System.out.println("non");
    }





















}