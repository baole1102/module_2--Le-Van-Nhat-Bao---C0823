package ss18_thuatoan;

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;
import com.sun.media.sound.AiffFileReader;

public class Bai3Sheet62 {
    public static void main(String[] args) {
        int number = 9137;
        checkNumber(number);
    }

    public static void checkNumber(int number) {
        if (number < 1000) {
            System.out.println("-1");
        }
        int hangNghin = number / 1000;
        int hangTram = number % 1000;
        int a = hangTram/100;
        int hangChuc = number % 100;
        int b = hangChuc/10;
        int hangLe = number % 10;
        int th1 = a*100 + b*10 + hangLe;
        int th2 = hangNghin*100 + b*10+hangLe;
        int th3 = hangNghin*100 + a*10+hangLe;
        int th4 = hangNghin*100+a*10+b;
        if (th1 > th2 && th1 > th3 && th1 > th4){
            System.out.println(th1);
        }
        if (th2 > th1 && th2 > th3 && th2 > th4){
            System.out.println(th2);
        }
        if (th3 > th1 && th3 > th2 && th3 > th4){
            System.out.println(th3);
        }
        if (th4 > th1 && th4 > th2 && th4 > th3){
            System.out.println(th4);
        }
    }
}
