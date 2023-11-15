package ss18_thuatoan;

import java.util.Scanner;

public class te {
    public static void main(String[] args) {
        int n, i = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        int A[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        do {
            int flag=0;
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
            for(int j = i-1; j >= 0; j--) {
                if (A[i] == A[j]) {
                    // nếu phần tử đứng sau bằng phần tử đứng trước
                    // thì flag = 1
                    // thì thoát khỏi vòng lặp for
                    System.out.println("Phần tử đã tồn tại. Mới nhập lại!");
                    flag=1;
                    break;
                }
            }
            if(flag == 1) {
                // sau khi ra khỏi vòng lặp for
                // mà flag = 1
                // thì quay lại thực hiện thân vòng lặp do - while
                continue;
            } else {
                // ngược lại tăng i lên 1
                // và quay lại thực hiện thân vòng lặp do - while
                i++;
            }
        } while (i<n);

        // Xuất giá trị các phần tử của mảng
        System.out.println("Mảng vừa nhập: ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
    }
}
