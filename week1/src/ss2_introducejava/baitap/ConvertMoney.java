package ss2_introducejava.baitap;
import java.util.Scanner;
public class ConvertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 23000;
        double moneyUSD;
        System.out.println("input money USD ");
        double moneyVND = scanner.nextDouble();
        moneyUSD = rate*moneyVND;
        System.out.println("Số tiền đã chuyển đổi: "+moneyUSD+"VND");
    }
}
