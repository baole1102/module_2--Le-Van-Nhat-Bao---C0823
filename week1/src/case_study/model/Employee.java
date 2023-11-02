package case_study.model;

public class Employee {
    private String code;
    private String name;
    private String date;
    private String gender;
    private String identify;
    private String number;
    private String email;
    private String level;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String date, String gender, String identify,
                    String number, String email, String level, String position, double salary) {
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.identify = identify;
        this.number = number;
        this.email = email;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String code, String name, String date, String gender, String identify,
                    String number, String email, String level, String position, double salary) {
        this.code = code;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.identify = identify;
        this.number = number;
        this.email = email;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
                "code='" + code +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", identify=" + identify +
                ", number=" + number +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                 salary
                ;
    }

}
