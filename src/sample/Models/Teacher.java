package sample.Models;

public class Teacher extends Person {

    private int Teacher_degree;
    private boolean IsManager;

    public Teacher(String personally_code, String name, String lname, String register_time, String main_salary, int teacher_degree,boolean isManager) {
        super(personally_code, name, lname, register_time, main_salary);
        Teacher_degree = teacher_degree;
       this.IsManager=isManager;
    }

    public Teacher(String personally_code, String name, String lname, String register_time, String main_salary, String currentSalary, int teacher_degree, boolean isManager) {
        super(personally_code, name, lname, register_time, main_salary, currentSalary);
        Teacher_degree = teacher_degree;
        IsManager = isManager;
    }
    @Override
    public double Salary(){
      double currentSalary = Integer.parseInt(super.getMain_salary());
        int years = 2019-Integer.parseInt(super.getRegister_time());
        for (int i=1; i<=years;i++){
            currentSalary+=(currentSalary*(0.05));
        }
        return currentSalary;
    }



    public Boolean getIsManager() {
        return IsManager;
    }

    public void setIsManager(boolean isManager) {
        IsManager = isManager;
    }

    public int getTeacher_degree() {
        return Teacher_degree;
    }

    public void setTeacher_degree(int teacher_degree) {
        Teacher_degree = teacher_degree;
    }
}
