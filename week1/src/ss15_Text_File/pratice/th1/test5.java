package ss15_Text_File.pratice.th1;

import java.io.*;

public class test5 {
    public static void main(String[] args) {
        int a[] = {2, 3, 5, 7, 11};
//        try {
//            FileOutputStream fout = new FileOutputStream(args[0]);
//            DataOutputStream dout = new DataOutputStream(fout);
//            for (int i = 0; i < a.length; i++) {
//                dout.writeInt(a[i]);
//                dout.close();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        catch (Exception e){
//            e.getMessage();
//        }
        try {
            FileInputStream fin = new FileInputStream(args[0]);
            DataInputStream din = new DataInputStream(fin);
            while (true) {
                System.out.println(din.readInt());
            }
        } catch (EOFException e) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
