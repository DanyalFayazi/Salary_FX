package sample.Models;

public class Employee extends Person {
   private String Section;
   private String H_in_week;

    public Employee(String personally_code, String name, String lname, String register_time, String main_salary, String currentSalary, String section, String h_in_week) {
        super(personally_code, name, lname, register_time, main_salary, currentSalary);
        Section = section;
        H_in_week = h_in_week;
    }
    @Override
    public double Salary(){
        double currentSalary = Integer.parseInt(super.getMain_salary());
        int years = 2019-Integer.parseInt(super.getRegister_time());
        for (int i=1; i<=years;i++){
            currentSalary+=(currentSalary*(0.03));
        }
        return currentSalary;
    }
    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

    public String getH_in_week() {
        return H_in_week;
    }

    public void setH_in_week(String h_in_week) {
        H_in_week = h_in_week;
    }
}
