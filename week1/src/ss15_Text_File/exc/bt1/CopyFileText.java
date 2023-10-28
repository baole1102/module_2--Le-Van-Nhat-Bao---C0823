package ss15_Text_File.exc.bt1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyFileText {
    public List<String> readFIle() {
        List<String> list = new ArrayList<>();
        try {
            File file = new File("D:\\module_2--Le-Van-Nhat-Bao---C0823\\week1\\src\\ss15_Text_File\\exc\\bt1\\source file");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine())!= null){
                list.add(line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("File khong ton tai");
        }
        return list;
    }

    public void writeFile(List<String> list, int max) {
        try {
            FileWriter fw = new FileWriter("D:\\module_2--Le-Van-Nhat-Bao---C0823\\week1\\src\\ss15_Text_File\\exc\\bt1\\target file");
            BufferedWriter bw = new BufferedWriter(fw);
            for (String str : list) {
                System.out.println(str);
            }
            bw.write("Tong so ky tu trong chuoi la: " + max);
            bw.close();
        } catch (Exception e) {
            System.out.println("File ko ton tai");
        }
    }
    public int maxWord(){
        
    }

    public static void main(String[] args) {
        CopyFileText cft = new CopyFileText();
        List<String> list = cft.readFIle();
        int valueMax =
          //      cft.writeFile(list);
    }
}
