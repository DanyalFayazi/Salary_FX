package sample.Models;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {
public static ArrayList<Teacher>teachers=new ArrayList<>();
public static ArrayList<Manager>managers=new ArrayList<>();
public static ArrayList<Employee>employees=new ArrayList<>();
public static ArrayList<Staff>staffs=new ArrayList<>();

public static ObservableList<Teacher> List_teachers= FXCollections.observableArrayList();
public static ObservableList<Manager> List_managers= FXCollections.observableArrayList();
public static ObservableList <Employee>List_employees= FXCollections.observableArrayList();
public static ObservableList<Staff> List_staffs= FXCollections.observableArrayList();



    @Override
    public void start(Stage primaryStage) throws Exception {

        //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Views/Main Menu(salary).fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("..///Views/Main Menu(salary).fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
