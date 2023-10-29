package ss16_io_biobanry.pratice.th1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("D:\\module_2--Le-Van-Nhat-Bao---C0823\\week1\\src\\ss16_io_biobanry\\pratice\\th1\\Codygym");
        byte[] bytes = {'C', 'o', 'd', 'e', 'G', 'y', 'm'};
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            os.write(b);
        }
        os.close();
    }
}
