package sample.Models;

public abstract class Person {
    private String personally_code;
    private String name;
    private String lname;
    private String register_time;
    private String Main_salary ;
    private String CurrentSalary;


    public Person(String personally_code, String name, String lname, String register_time, String main_salary) {
        this.setPersonally_code(personally_code);
        this.setName(name);
        this.setLname(lname);
        this.setRegister_time(register_time);
        setMain_salary(main_salary);
    }

    public Person(String personally_code, String name, String lname, String register_time, String main_salary, String currentSalary) {
        this.personally_code = personally_code;
        this.name = name;
        this.lname = lname;
        this.register_time = register_time;
        Main_salary = main_salary;
       this.CurrentSalary = currentSalary;
    }
  abstract   public double Salary();

    public String getPersonally_code() {
        return personally_code;
    }

    public void setPersonally_code(String personally_code) {
        this.personally_code = personally_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getRegister_time() {
        return register_time;
    }

    public void setRegister_time(String register_time) {
        this.register_time = register_time;
    }

    public String getMain_salary() {
        return Main_salary;
    }

    public void setMain_salary(String main_salary) {
        Main_salary = main_salary;
    }

    public String getCurrentSalary() {
        return CurrentSalary;
    }

    public void setCurrentSalary(String currentSalary) {
        CurrentSalary = currentSalary;
    }

//  abstract public void calculate_salary(Person p);
}