package bt_them.model;

public class StudentManageProgram {
    private int code;
    private String name;
    private int DateOfBirth;
    private String Gender;
    private int className;
    private double score;
    private String Specialize;

    public StudentManageProgram(int code, String name, int dateOfBirth, String gender, String specialize) {
        this.code = code;
        this.name = name;
        DateOfBirth = dateOfBirth;
        Gender = gender;
        Specialize = specialize;
    }
    public StudentManageProgram(int code, String name, int dateOfBirth, String gender, int className, double score) {
        this.code = code;
        this.name = name;
        DateOfBirth = dateOfBirth;
        Gender = gender;
        this.className = className;
        this.score = score;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getClassName() {
        return className;
    }

    public void setClassName(int className) {
        this.className = className;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getSpecialize() {
        return Specialize;
    }

    public void setSpecialize(String specialize) {
        Specialize = specialize;
    }

    @Override
    public String toString() {
        return "StudentManageProgram{" +
                "code = " + code +
                ", name = '" + name + '\'' +
                ", DateOfBirth = " + DateOfBirth +
                ", Gender = '" + Gender + '\'' +
                ", className = '" + className + '\'' +
                ", score = " + score +
                ", Specialize = '" + Specialize + '\'' +
                '}';
    }
}
