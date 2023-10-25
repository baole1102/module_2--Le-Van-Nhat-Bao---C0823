package ss13_arrange_algorithm.exc.bt2;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size");
        int size = Integer.parseInt(scanner.nextLine());
        int [] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        arrangeAlgorithm(list);
        System.out.println();
        System.out.println("Last list after sort insertion: " +Arrays.toString(list));
    }
    public static void arrangeAlgorithm( int [] list){
        int firstValue;
        int index;
        for (int i = 0; i < list.length; i++) {
            firstValue = list[i];
            index = i;
            while (index > 0 && firstValue < list[index-1]){
                list[index] = list[index-1];
                index--;
            }
            list[index] = firstValue;
        }
    }
}
