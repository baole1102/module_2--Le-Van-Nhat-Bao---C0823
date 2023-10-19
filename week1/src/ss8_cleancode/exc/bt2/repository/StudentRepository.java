package ss8_cleancode.exc.bt2.repository;
import ss8_cleancode.exc.bt2.model.Student;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository{
    int size = 5;
    private static Student[] students = new Student[5];
    static {
        students[0] = new Student(1,"Dụng");
        students[1] = new Student(2,"Tuấn");
        students[2] = new Student(3,"Vi");
        students[3] = new Student(4,"Độ");
        students[4] = new Student(5,"Hải");
    }

    @Override
    public void showList() {
        for (Student s: students) {
            System.out.println(s);
        }
    }

    @Override
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien");
        String name = scanner.nextLine();
        System.out.println("Nhap id sinh vien");
        int identify = scanner.nextInt();
        if (students.length >= size){
            ensureCapa(1);
        }
        students[size] = new Student(identify,name);
        size++;

    }
    public void ensureCapa(int capacity){
        if (capacity >= 0){
            int newSize = students.length + capacity;
            students = Arrays.copyOf(students,newSize);
        }else {
            throw  new IllegalArgumentException("Erro capacity: "+capacity);
        }
    }

}
