package ss16_io_biobanry.pratice.th3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void writeFile(File pathFile, List<Student> list){
        try {
            OutputStream os = new FileOutputStream(pathFile);
            ObjectOutputStream oos =new ObjectOutputStream(os);
            oos.writeObject(list);
            oos.flush();
            oos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public List<Student> readFile(File pathFile){
        List<Student> students = new ArrayList<>();
        try {
            InputStream is = new FileInputStream(pathFile);
            ObjectInputStream ois = new ObjectInputStream(is);
            students = (List<Student>) ois.readObject();
            ois.close();
            is.close();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Bao","Hue"));
        students.add(new Student(2,"Do","QuangNam"));
        students.add(new Student(3,"Vi","Hue"));
        System.out.println("Nhap ma nguon file");
        String path = scanner.nextLine();
        File file = new File( path);
        Main main = new Main();
        writeFile(file,students);
//        System.out.println(main.readFile(file));
        List<Student> studentList = main.readFile(file);
        for (Student student: studentList){
            System.out.println(student);
        }
    }
}
