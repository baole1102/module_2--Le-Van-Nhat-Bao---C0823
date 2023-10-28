package ss15_Text_File.pratice.th2.branch2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public void writeFile(int max){
        int [] arr = {9,5,4,2,15,3,6};
        try {
            FileWriter fw = new FileWriter("text2.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (Integer o: arr){
                String str = Integer.toString(o);
                bw.write(str);
                bw.newLine();
            }
            bw.write("Số lớn nhất là "+ max);
            bw.close();
        }catch (Exception e){
            System.out.println("Loi can nhap lai");
        }
    }

    public static void main(String[] args) {
       Main main = new Main();
        List<Integer> numbers = main.readFile();
        int maxValue = maxMin(numbers);
        main.writeFile(maxValue);
    }
    public List<Integer> readFile(){
        List<Integer> number =new ArrayList<>();
        try {
            File file = new File("D:\\module_2--Le-Van-Nhat-Bao---C0823\\week1\\src\\text2.txt");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine())!= null){
                number.add(Integer.parseInt(line));
            }
            br.close();
        }catch (Exception e){
            System.err.println("Bi loi");
        }
        return number;
    }
    public static int maxMin(List<Integer> number){
        int max = number.get(0);
        for (int i = 1; i < number.size(); i++) {
            if (max < number.get(i)){
                max = number.get(i);
            }
        }
        return max;
    }
}
