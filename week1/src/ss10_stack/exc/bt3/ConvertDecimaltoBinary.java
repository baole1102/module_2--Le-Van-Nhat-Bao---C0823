package ss10_stack.exc.bt3;

import java.util.LinkedList;

public class ConvertDecimaltoBinary {
    public static void Stack() {
        LinkedList<Integer> stack = new LinkedList<>();
        int number = 30;
        while (number != 0) {
            int numberOne = number % 2;
            stack.addFirst(numberOne);
            number /= 2;
        }
        System.out.println(stack);
    }

    public static void main(String[] args) {
        Stack();
    }


}
