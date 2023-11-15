package cuoimodule2.until;

import cuoimodule2.module.Bug;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadandFile {
    private static final String PATH = "doc/bug.cvs";

    public static List<Bug> readFile() {
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<Bug> list = new ArrayList<>();
        Bug bug;
        try {
            String[] newArr;
            String line = "";
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                newArr = line.split(",");
                String id = newArr[0];
                String name = newArr[1];
                String description = newArr[2];
                String time = newArr[3];
                String dangerous = newArr[4];
                bug = new Bug(id, name, description, time, dangerous);
                list.add(bug);
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
        return list;
    }

    public static void writeFile(List<Bug> bugs) {
        File file = new File(PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Bug bug : bugs){
                line = bug.getId()+","+bug.getName()+","+bug.getDescription()+","+bug.getTime()+","+bug.getDangerous();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (bufferedWriter!=null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
