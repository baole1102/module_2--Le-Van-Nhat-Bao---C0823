package ss11_java_collection.practice.th2;

import java.util.HashMap;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Bao", 22,"Hue");
        Student student2 = new Student("Do", 21,"QuangNam");
        Student student3 = new Student("Vi",18 ,"Hue");
        // HashMap
        HashMap<Integer, Student> studentHashMap = new HashMap<Integer, Student>();
        studentHashMap.put(1,student1);
        studentHashMap.put(2,student2);
        studentHashMap.put(3,student3);
        for(HashMap.Entry<Integer, Student> student : studentHashMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        HashSet<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}
