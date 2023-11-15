package student.model;

public class Student {
    private String id;
    private String name;
    private String date;
    private String gender;
    private int score;
    private String nameClass;

    public Student() {
    }

    public Student(String name, String date, String gender, int score, String nameClass) {
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.score = score;
        this.nameClass = nameClass;
    }

    public Student(String id, String name, String date, String gender, int score, String nameClass) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.score = score;
        this.nameClass = nameClass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                ", nameClass='" + nameClass + '\'' +
                '}';
    }
}
