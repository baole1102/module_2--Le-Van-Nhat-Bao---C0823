package ss16_io_biobanry.pratice.th1;

import java.io.*;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {
       /* ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("D:\\module_2--Le-Van-Nhat-Bao---C0823\\week1\\src\\ss16_io_biobanry\\pratice\\th1\\product"));
            Product product = new Product(1,"Iphone 12",280000,"New");
            oos.writeObject(product);
            oos.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            oos.close();
        }
        System.out.println("Success!!!");
    }*/
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("D:\\module_2--Le-Van-Nhat-Bao---C0823\\week1\\src\\ss16_io_biobanry\\pratice\\th1\\product"));
            Product product = (Product) ois.readObject();
            System.out.println(product);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }}

}
