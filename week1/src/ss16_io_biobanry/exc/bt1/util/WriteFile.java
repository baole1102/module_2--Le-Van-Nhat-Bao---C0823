package ss16_io_biobanry.exc.bt1.util;

import ss16_io_biobanry.exc.bt1.module.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    private static final String PATH = "ss16_io_biobanry/exc/bt1/doc/bao.csv";

    public static void writeFile(List<Product> products) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(PATH);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(products);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            System.err.println("File ton tai");
        } catch (IOException e) {
           System.err.println("XXX");
        } finally {
            try {
                if (objectOutputStream != null){
                    objectOutputStream.close();
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                System.err.println("XXX");
            }
        }
    }

    public static List<Product> readFile() {
        List<Product> products = null;
        FileInputStream inputStream = null;
        ObjectInputStream objectIntputStream = null;
        try {
            inputStream = new FileInputStream(PATH);
            objectIntputStream = new ObjectInputStream(inputStream);
                products = (List<Product>) objectIntputStream.readObject();
        } catch (EOFException e) {
           e.printStackTrace();
        }catch (ClassNotFoundException e){
           e.printStackTrace();
        }
        catch (IOException e)  {
            System.out.println("File ton tai");
        } finally {
            try {
                if (objectIntputStream != null){
                    objectIntputStream.close();
                }
            } catch (IOException e) {
               e.printStackTrace();
            }
        }
        return products == null ? new ArrayList<>() : products ;
    }
}
