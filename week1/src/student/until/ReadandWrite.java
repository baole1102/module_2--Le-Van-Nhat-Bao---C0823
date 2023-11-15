package student.until;

import student.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadandWrite {
    private static final String PATH = "student/doc/student.cvs";

    public static List<Student> readFile() {
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<Student> students = new ArrayList<>();
        Student student;
        try {
            String[] newArr;
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                newArr = line.split(",");
                String id = newArr[0];
                String name = newArr[1];
                String date = newArr[2];
                String gender = newArr[3];
                int score = Integer.parseInt(newArr[4]);
                String nameClass = newArr[5];
                student = new Student(id, name, date, gender, score, nameClass);
                students.add(student);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return students;
    }

    public static void writeFile(List<Student> students) {
        File file = new File(PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Student student: students){
                line = student.getId()+","+student.getName()+","+student.getDate()+","+student.getGender()+","+student.getScore()+","+student.getNameClass();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (bufferedWriter != null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
