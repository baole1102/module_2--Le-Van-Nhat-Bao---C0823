package ss15_text_file.exc.bt2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public List<Country> readFile(){
        List<Country> list = new ArrayList<>();
       try {
           File file = new File("D:\\module_2--Le-Van-Nhat-Bao---C0823\\week1\\src\\ss15_text_file\\exc\\bt2\\cvs");
           if (!file.exists()){
               throw new FileNotFoundException();
           }
           FileReader fileReader = new FileReader( file);
           BufferedReader bufferedReader = new BufferedReader(fileReader);
           String line = "";
           while ((line = bufferedReader.readLine())!= null){
             String[] newList = line.split(",");
             int id = Integer.parseInt(newList[0]);
             String code = newList[1];
             String name = newList[2];
             list.add(new Country(id,code,name));
           }
           bufferedReader.close();
       }catch (Exception e){
           System.out.println("File khong ton tai");
       }
       return list;
    }

    public static void main(String[] args) {
//        Country country = new Country(1,"AU","Australia");
//        Country country1 = new Country(2,"CN","China");
//        Country country2 = new Country( 3,"AU","Australia");
//        Country country3 = new Country(  4,"CN","China");
//        Country country4 = new Country( 5,"JP","Japan");
//        Country country5 = new Country( 6,"CN","China");
//        Country country6 = new Country(  7,"JP","Japan");
//        Country country7 = new Country( 8,"TH","Thailand");
//
//        List<Country> list = new ArrayList<>();
//        list.add(country);
//        list.add(country1);
//        list.add(country2);
//        list.add(country3);
//        list.add(country4);
//        list.add(country5);
//        list.add(country6);
//        list.add(country7);
        ReadFile readFile = new ReadFile();
        readFile.readFile();
        System.out.println(readFile.readFile());
    }

}
