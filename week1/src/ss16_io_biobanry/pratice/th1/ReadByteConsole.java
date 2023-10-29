package ss16_io_biobanry.pratice.th1;

import java.io.IOException;
import java.io.InputStream;

public class ReadByteConsole {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        while (true){
            System.out.println("Nhap 1 ky tu: ");
            int ch = is.read();
            if (ch == 'q'){
                System.out.println("Finished");
                break;
            }
            is.skip(2);
            System.out.println(" Ky tu nhan duoc: "+(char) ch);
        }
    }
}
