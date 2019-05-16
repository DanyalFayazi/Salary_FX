package sample.Controlles;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sample.Models.*;

import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;

import static sample.Models.Main.*;

public class Controller{
    @FXML
    private Button btn_Show_Info_teacher;
    @FXML
    private Button btn_Show_Info_manager;
    @FXML
    private Button btn_Show_Info_employee;
    @FXML
    private Button btn_AddTeacher;
    @FXML
    private Button btn_AddManager;
    @FXML
    private Button btn_AddEmployee;
    @FXML
    private Button btn_AddStaff;
    @FXML
    private Button btn_back_fromInfo;
    @FXML
    private TextField txt_name;
    @FXML
    private TextField txt_manager_name;
    @FXML
    private TextField txt_last_name;
    @FXML
    private TextField txt_manager_last_name;
    @FXML
    private DatePicker dat_rg;
    @FXML
    private DatePicker manager_dat_rg;
    @FXML
    private DatePicker st_dat_rg;
    @FXML
    private TextField txt_main_salary;
    @FXML
    private TextField txt_manager_main_salary;
    @FXML
    private TextField txt_manager_section;
    @FXML
    private TextField txt_teacher_degree;
    @FXML
    private TextField txt_personalCode;
    @FXML
    private TextField txt_manager_personalCode;
    @FXML
    private TextField txt_em_name;
    @FXML
    private TextField txt_em_last_name;
    @FXML
    private TextField txt_em_main_salary;
    @FXML
    private TextField txt_em_section;
    @FXML
    private TextField txt_em_Hweek;
    @FXML
    private TextField txt_em_personalCode;
    @FXML
    private DatePicker em_dat_rg;
    @FXML
    private CheckBox ch_is_manager;

    @FXML
    private TextField txt_st_personalCode;
    @FXML
    private TextField txt_st_name;
    @FXML
    private TextField txt_st_last_name;
    @FXML
    private TextField txt_st_main_salary;
    @FXML
    private TextField txt_st_section;
    @FXML
    private TextField txt_st_Hweek;
    @FXML
    private TextField tech_sec;
    @FXML
    private RadioButton n1;
    @FXML
    private RadioButton n2;
    @FXML
    private RadioButton n3;
    @FXML
    private RadioButton n4;
    @FXML
    private RadioButton n5;

    @FXML
    private RadioButton d1;
    @FXML
    private RadioButton d2;
    @FXML
    private RadioButton d3;
    @FXML
    private RadioButton d4;

    public void see_info(ActionEvent event){
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("..///Views/See Info(salary).fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene rootScene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(rootScene);
        stage.show();
    }
    public void Back_to_home (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("..///Views/Main Menu(salary).fxml"));
        Scene rootScene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(rootScene);
        stage.show();
    }

    public void Back_to_admin (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("..///Views/Admin Menu(salary).fxml"));
        Scene rootScene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(rootScene);
        stage.show();
    }



    @FXML private TableView<Teacher> Tteachers;
    @FXML private TableColumn<Teacher,String> personally_code;
    @FXML private TableColumn<Teacher,String> name;
    @FXML private TableColumn<Teacher,String> lname;
    @FXML private TableColumn<Teacher,String> register_time;
    @FXML private TableColumn<Teacher,String> main_salary;
    @FXML private TableColumn<Teacher,String> CurrentSalary;
    @FXML private TableColumn<Teacher,Integer> teacher_degree;
    @FXML private TableColumn<Teacher,Boolean> IsManage;



    @FXML private TableView<Manager> TManagers;
    @FXML private TableColumn<Manager,String> m_personally_code;
    @FXML private TableColumn<Manager,String> m_name;
    @FXML private TableColumn<Manager,String> m_lname;
    @FXML private TableColumn<Manager,String> m_register_time;
    @FXML private TableColumn<Manager,String> m_main_salary;
    @FXML private TableColumn<Manager,String> m_CurrentSalary;
    @FXML private TableColumn<Manager,String> m_section;

    @FXML private TableView  <Employee>TEmployees;
    @FXML private TableColumn<Employee,String> e_personally_code;
    @FXML private TableColumn<Employee,String> e_name;
    @FXML private TableColumn<Employee,String> e_lname;
    @FXML private TableColumn<Employee,String> e_register_time;
    @FXML private TableColumn<Employee,String> e_main_salary;
    @FXML private TableColumn<Employee,String> e_CurrentSalary;
    @FXML private TableColumn<Employee,String> e_section;
    @FXML private TableColumn<Employee,String> e_hours_in_week;


    public void Show_Info_employee(ActionEvent event){

        e_personally_code.setCellValueFactory(new PropertyValueFactory<Employee,String>("e_personally_code"));
        e_name.setCellValueFactory(new PropertyValueFactory<Employee,String>("e_name"));
        e_lname.setCellValueFactory(new PropertyValueFactory<Employee,String>("e_lname"));
        e_register_time.setCellValueFactory(new PropertyValueFactory<Employee,String>("e_register_time"));
        e_main_salary.setCellValueFactory(new PropertyValueFactory<Employee,String>("e_main_salary"));
        e_CurrentSalary.setCellValueFactory(new PropertyValueFactory<Employee,String>("e_CurrentSalary"));
        e_section.setCellValueFactory(new PropertyValueFactory<Employee,String>("e_section"));
        e_hours_in_week.setCellValueFactory(new PropertyValueFactory<Employee,String>("e_hours_in_week"));
        System.out.println("6666666666666666666");
        TEmployees.setItems(Main.List_employees);

    }



    public void Show_Info_manager(ActionEvent event){

        m_personally_code.setCellValueFactory(new PropertyValueFactory<Manager,String>("m_personally_code"));
        m_name.setCellValueFactory(new PropertyValueFactory<Manager,String>("m_name"));
        m_lname.setCellValueFactory(new PropertyValueFactory<Manager,String>("m_lname"));
        m_register_time.setCellValueFactory(new PropertyValueFactory<Manager,String>("m_register_time"));
        m_main_salary.setCellValueFactory(new PropertyValueFactory<Manager,String>("m_main_salary"));
        m_CurrentSalary.setCellValueFactory(new PropertyValueFactory<Manager,String>("m_CurrentSalary"));
        m_section.setCellValueFactory(new PropertyValueFactory<Manager,String>("m_section"));

        TManagers.setItems(Main.List_managers);
        //System.out.println("done");
        System.out.println(Main.List_managers.get(0).getName()+"   "+Main.List_managers.get(0).getLname());

    }


public void Show_Info_teacher(ActionEvent event){

    for (int i = 0; i < Main.List_teachers.size(); i++) {
        if(Main.List_teachers.get(i).getIsManager()){
            double new_salary=(Double.parseDouble(Main.List_teachers.get(i).getMain_salary())*(0.7));
            double tmp=Double.parseDouble(Main.List_teachers.get(i).getCurrentSalary())+new_salary;
            new_salary=tmp+ Main.List_teachers.get(i).Salary();
            Main.List_teachers.get(i).setCurrentSalary(""+new_salary);
        }else{
            Main.List_teachers.get(i).setCurrentSalary(""+""+Main.List_teachers.get(i).Salary());
        }
    }

    personally_code.setCellValueFactory(new PropertyValueFactory<Teacher,String>("personally_code"));
    name.setCellValueFactory(new PropertyValueFactory<Teacher,String>("name"));
    lname.setCellValueFactory(new PropertyValueFactory<Teacher,String>("lname"));
    register_time.setCellValueFactory(new PropertyValueFactory<Teacher,String>("register_time"));
    main_salary.setCellValueFactory(new PropertyValueFactory<Teacher,String>("main_salary"));
    CurrentSalary.setCellValueFactory(new PropertyValueFactory<Teacher,String>("main_salary"));
    teacher_degree.setCellValueFactory(new PropertyValueFactory<Teacher,Integer>("teacher_degree"));
    IsManage.setCellValueFactory(new PropertyValueFactory<Teacher,Boolean>("IsManage"));

    System.out.println(Main.List_teachers.get(0).getCurrentSalary());
    String temp=Main.List_teachers.get(0).getCurrentSalary();
    Main.List_teachers.get(0).setCurrentSalary(temp);
    //System.out.println("done");
    Tteachers.setItems(Main.List_teachers);

}



    public void Add_teacher(ActionEvent event) throws SQLException, ClassNotFoundException {
        LocalDate ld = dat_rg.getValue();
        String[] str=ld.toString().split("-");
//        try {
            int d=0;
            if (d1.isSelected())
            d=1;
            else if(d2.isSelected())
            d=2;
            else if (d3.isSelected())
            d=3;
            else if (d4.isSelected())
            d=4;

//            String url="jdbc:sqlite:Admind                                                                                     b.sqlite";
//            con= DriverManager.getConnection(url);
//            PreparedStatement statement=con.prepareStatement("INSERT INTO teachers(PersonalCode,Name,LastName,RegisterTime,MainSalary,TeacherDegree,IsManager,CurrentSalary) " +
//                    "VALUES(?,?,?,?,?,?,?,?)");
//            statement.setString(1,txt_personalCode.getText());
//            statement.setString(2,txt_name.getText());
//            statement.setString(3,txt_last_name.getText());
//
//            statement.setString(4,ld.toString());
//            statement.setString(5,txt_main_salary.getText());
//            statement.setString(6,txt_teacher_degree.getText());

                      boolean m;
                      String section;
            if (ch_is_manager.isSelected()) {
               m=true;
               section=tech_sec.getText();

                Manager manager = new Manager(txt_personalCode.getText(), txt_name.getText(),
                        txt_last_name.getText(), str[0],
                        txt_main_salary.getText(),txt_main_salary.getText(),section);

                managers.add(manager);
                Main.List_managers.addAll(manager);
            } else {
                section="";
                m=false;
            }
//(String personally_code, String name, String lname, String register_time,String main_salary, String section)
        Teacher t = new Teacher(txt_personalCode.getText(), txt_name.getText(),
                txt_last_name.getText(), str[0],
                txt_main_salary.getText(),txt_main_salary.getText(),d,m);


//        t.setCurrentSalary(t.getMain_salary());
//            if (txt_personal_id.getText()==null||txt_name.getText()==null||txt_last_name.getText()==null||ld.toString()==null||txt_main_salary.getText()==null
//             || txt_teacher_degree.getText()==null ){Add_teacher( event);}

//            statement.execute();
//
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            try {
//                con.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
        teachers.add(t);
        System.out.println(t.getIsManager());
        System.out.println(txt_main_salary.getText());
        //txt_main_salary.getText()
       // Main.List_teachers.addAll(new Teacher(t.getPersonally_code(),t.getName(),t.getLname(),t.getRegister_time(),t.getMain_salary(),t.getTeacher_degree(),m))  ;
        Main.List_teachers.addAll(t);


        System.out.println(t.getName());
        System.out.println(List_teachers.get(0).getName());

        }

    public void Add_manager(ActionEvent event) throws  ClassNotFoundException {
        LocalDate ld = manager_dat_rg.getValue();
        String []str=ld.toString().split("-");
        Manager m=new Manager(txt_manager_personalCode.getText(),
        txt_manager_name.getText(),txt_manager_last_name.getText(),
        str[0],txt_manager_main_salary.getText()
        ,txt_manager_main_salary.getText(),txt_manager_section.getText());

         Main.managers.add(m);
         Main.List_managers.add(m);
        System.out.println(m.getName());
        System.out.println(List_managers.get(0).getName());
    }


    public void Add_employee(ActionEvent event){
        LocalDate ld = em_dat_rg.getValue();
        Employee e =new Employee(txt_em_personalCode.getText(),txt_em_name.getText()
        ,txt_em_last_name.getText(),ld.toString(),
        txt_em_main_salary.getText(), txt_em_main_salary.getText(),txt_em_section.getText(),txt_em_Hweek.getText());

        Main.employees.add(e);
        Main.List_employees.add(e);

    }
/**/
    public void Add_staff(ActionEvent event){
        LocalDate ld = st_dat_rg.getValue();
        int h = 0;
        if(n1.isSelected())
            h=1;
        else if(n2.isSelected())
            h=2;
        else if (n3.isSelected())
            h=3;
        else if (n4.isSelected())
            h=4;
        else if (n5.isSelected()){
            h=5;
        }

        Staff s=new Staff(txt_st_personalCode.getText(),txt_st_name.getText(),
         txt_st_last_name.getText(),ld.toString(),txt_st_main_salary.getText(),
         txt_st_section.getText(),txt_st_Hweek.getText(),h);

        Main.staffs.add(s);


    }



}