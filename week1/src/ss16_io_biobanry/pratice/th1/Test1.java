package ss16_io_biobanry.pratice.th1;

import java.io.*;
public class Test1 {
    public static void main(String[] args) {
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"))) {
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeUTF("Susan");
            output.writeDouble(185.5);
            output.writeUTF("Kim");
            output.writeDouble(105.25);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //đọc dữ liệu từ file temp.dat với DataInputStream
        try (DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"))) {
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
