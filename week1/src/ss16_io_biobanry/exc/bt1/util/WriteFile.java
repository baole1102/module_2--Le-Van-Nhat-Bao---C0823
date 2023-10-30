package ss16_io_biobanry.exc.bt1.util;

import ss16_io_biobanry.exc.bt1.module.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    private static final String PATH = "ss16_io_biobanry/exc/bt1/doc/baopro.doc";

    public static void writeFile(List<Product> products) {
        try {
            OutputStream outputStream = new FileOutputStream(PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
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
        }
    }
}
