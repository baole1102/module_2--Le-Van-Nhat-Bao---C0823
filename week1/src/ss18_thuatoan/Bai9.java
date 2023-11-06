package ss18_thuatoan;

public class Bai9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 5, 4, 4};
        int length = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int count = 0;
        int temp =0 ;
        int averga = sum / length;
        System.out.println(sum);
        for (int i = 0; i < arr.length; i++) {
            if (averga == arr[i]) {
                temp = arr[i];
                count++;
            }
        }
        System.out.println("Giá trị trung bình các phần tử trong mảng là: " + averga + "--> Số " + temp + "Xuất hiện " + count + " lần.");
    }
}
