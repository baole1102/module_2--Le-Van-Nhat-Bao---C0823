package ss2.baitap;
import java.util.Scanner;
public class ConvertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyVND = 23000;
        double moneyUSD;
        System.out.println("input money USD ");
        double convert = scanner.nextDouble();
        moneyUSD = moneyVND*convert;
        System.out.println("Số tiền đã chuyển đổi: "+moneyUSD+"VND");
    }
}
