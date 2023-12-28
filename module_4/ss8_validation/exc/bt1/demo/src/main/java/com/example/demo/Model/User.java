package com.example.demo.Model;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class User{
    @Size(min = 5,max = 45,message = "Toi thieu 4 den 45 ky tu")
    private String firstName;
    @Size(min = 5,max = 45,message = "Toi thieu 4 den 45 ky tu")
    private String lastName;
    @Min(18)
    private int age;
    @Pattern(regexp = "^0[0-9]\\d{8}$",message = "Khong hop le")
    private String phone;
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$",message = "Nhap dung yeu cau abc@gmail.com")
    private String email;

    public User() {
    }

    public User(String firstName, String lastName, int age, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
