package ss10_stack.exc.bt1;

import java.util.LinkedList;

public class ReserveElementStack<E> {
    public static void newStack() {
        LinkedList<Integer> stack1 = new LinkedList<>();
        LinkedList<Integer> stack2 = new LinkedList<>();
        int newStack;
        stack1.addFirst(1);
        stack1.addFirst(2);
        stack1.addFirst(3);
        stack1.addFirst(4);
        stack1.addFirst(5);
        System.out.println("Before reserve: " + stack1);
        for (int i = stack1.size(); i > 0; i--) {
            newStack = stack1.pop();
            stack2.addFirst(newStack);
        }
        System.out.println("After reserve: " + stack2);
    }

    public static void wStack() {
        LinkedList<String> wStack1 = new LinkedList<>();
        LinkedList<String> wStack2 = new LinkedList<>();
        String newStack;
        wStack1.addFirst("Bao");
        wStack1.addFirst("Do");
        wStack1.addFirst("Vi");
        wStack1.addFirst("Dung");
        wStack1.addFirst("ThaiBao");
        System.out.println("Before reserve: " + wStack1);
        for (int i = wStack1.size(); i > 0; i--) {
            newStack = wStack1.pop();
            wStack2.addFirst(newStack);
        }
        System.out.println("After reserve: " + wStack2);
    }

    public static void main(String[] args) {
        newStack();
        wStack();
    }
}
