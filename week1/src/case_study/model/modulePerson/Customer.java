package case_study.model.modulePerson;

public class Customer extends Person {
    private String code;
    private String level;
    private String address;

    public Customer() {
    }
    public Customer(String code,String name, String date, String gender, String identify, String number, String email, String level, String address) {
        super(name, date, gender, identify, number, email);
        this.code = code;
        this.level = level;
        this.address = address;
    }

    public Customer(String name, String date, String gender, String identify, String number, String email, String level, String address) {
        super(name, date, gender, identify, number, email);
        this.level = level;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "code='" + code + '\'' +
                super.toString()+
                ", level='" + level + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
