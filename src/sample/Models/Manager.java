package sample.Models;

public class Manager extends Person {
    private String section;

    public Manager(String personally_code, String name, String lname, String register_time, String main_salary, String currentSalary, String section) {
        super(personally_code, name, lname, register_time, main_salary, currentSalary);
        this.section = section;
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
    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
