package ss15_text_file.exc.bt2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public List<Country> readFile() {
        List<Country> list = new ArrayList<>();
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            File file = new File("D:\\module_2--Le-Van-Nhat-Bao---C0823\\week1\\src\\ss15_text_file\\exc\\bt2\\cvs");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] newList = line.split(",");
                int id = Integer.parseInt(newList[0]);
                String code = newList[1];
                String name = newList[2];
                list.add(new Country(id, code, name));
            }
        } catch (Exception e) {
            System.out.println("File khong ton tai");
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        readFile.readFile();
        System.out.println(readFile.readFile());
    }

}
