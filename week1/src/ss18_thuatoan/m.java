package ss18_thuatoan;

import java.util.Scanner;

public class m {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,i=0;
        do {
            System.out.println("Nhập số lượng ptu trong mang");
            n = Integer.parseInt(scanner.nextLine());
        } while (n < 0);
        int [] A = new int[n];
        System.out.println("Nhâập các pt trong mảng");
        do {
            int flag=0;
            System.out.println("Nhập pt thứ "+i+": ");
            A[i] = scanner.nextInt();
            for (int j = i-1; j >=0 ; j++) {
                if (A[i] == A[j]){
                    System.out.println("đã tồn tại! Nhập lại");
                    flag = 1;
                    break;
                }
            }
            if (flag == 1){
                continue;
            }else {
                i++;
            }
        }while (i<n);
        for (int j = 0; j < A.length; j++) {
            System.out.println(A[j]);
        }
    }
}
