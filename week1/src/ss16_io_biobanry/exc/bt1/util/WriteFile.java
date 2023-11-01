package ss16_io_biobanry.exc.bt1.util;

import ss16_io_biobanry.exc.bt1.module.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    private static final String PATH = "ss16_io_biobanry/exc/bt1/doc/baopro.doc";

    public static void writeFile(List<Product> products) {
        OutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(PATH);
            objectOutputStream = new ObjectOutputStream(outputStream);
            for (Product product1 : products) {
                objectOutputStream.writeObject(product1);
            }
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File ton tai");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                outputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static List<Product> readFile(List<Product> products) {
        InputStream inputStream = null;
        ObjectInputStream objectIntputStream = null;
        try {
            inputStream = new FileInputStream(PATH);
            objectIntputStream = new ObjectInputStream(inputStream);
            products = (List<Product>) objectIntputStream.readObject();
            System.out.println(products);
            objectIntputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File ton tai");
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
                objectIntputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return products;
    }
}
