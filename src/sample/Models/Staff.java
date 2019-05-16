package sample.Models;

public class Staff extends Person {
    private String Section;
    private String H_in_week;
    private int hardness;

    public Staff(String personally_code, String name, String lname, String register_time, String main_salary,  String section, String h_in_week, int hardness) {
        super(personally_code, name, lname, register_time, main_salary);
        Section = section;
        H_in_week = h_in_week;
        this.hardness = hardness;
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

    public int getHardness() {
        return hardness;
    }

    public void setHardness(int hardness) {
        this.hardness = hardness;
    }
}
