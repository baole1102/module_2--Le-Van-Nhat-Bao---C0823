package ss15_text_file.pratice.th3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    private static final String PATH = "ss15_text_file/pratice/th3/source";
    private static final String PATHSECOND = "ss15_text_file/pratice/th3/target";

    private static List<String> readFile() {
        String line;
        List<String> stringList = new ArrayList<>();
        try {
            File file = new File(PATH);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) !=null){
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringList;
    }
    private static void writeToFile(List<String> stringList){
      try {
          File file = new File(PATHSECOND);
          FileWriter fileWriter = new FileWriter(file);
          BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
          for (String str : stringList){
              bufferedWriter.write(str);
          }
          bufferedWriter.close();
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
    }

    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        List<String > list = copyFile.readFile();
        writeToFile(list);
    }
}
