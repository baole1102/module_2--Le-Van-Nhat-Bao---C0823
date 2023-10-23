package ss10_stack.exc.bt4;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        Queue<Character> queue = new LinkedList<>();
        String something = "Able was I ere I saw Elba";
        String newStr = "";
        int strLength = something.length();
        for (int i = strLength - 1; i >= 0; i--) {
            queue.add(something.charAt(i));
        }
        while (!queue.isEmpty()) {
            newStr += queue.poll();
        }
        System.out.println(newStr);
        if (newStr.toLowerCase().equals(something.toLowerCase())) {
            System.out.println("Is a Palindrome");
        } else {
            System.out.println("Is not a Palindrome");
        }

    }

}
