package case_study.model.modulePerson;

public abstract class Person {
    private String name;
    private String date;
    private String gender;
    private String identify;
    private String number;
    private String email;

    public Person() {
    }

    public Person(String name, String date, String gender, String identify, String number, String email) {
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.identify = identify;
        this.number = number;
        this.email = email;
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

    @Override
    public String toString() {
        return ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", identify='" + identify + '\'' +
                ", number='" + number + '\'' +
                ", email='" + email + '\'';
    }
}
