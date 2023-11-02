package case_study.model.modulePerson;

public class Employee extends Person {
    private String code;
    private String level;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String date, String gender, String identify,
                    String number, String email, String level, String position, double salary) {
        super(name, date, gender, identify, number, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String code,String name, String date, String gender, String identify, String number, String email, String level, String position, double salary) {
        super(name, date, gender, identify, number, email);
        this.code = code;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "code='" + code + '\'' +
                super.toString() +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary;
    }

}
