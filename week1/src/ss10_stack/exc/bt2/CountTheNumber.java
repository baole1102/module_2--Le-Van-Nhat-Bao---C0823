package ss10_stack.exc.bt2;

import java.util.*;

public class CountTheNumber {
    public static void main(String[] args) {
        Map<Character, Integer> integerMap = new TreeMap<>();
        String string = "Bao Dep Trai";
        String newString = string.toLowerCase();
        String newContent = "";
        for (int i = 0; i < newString.length(); i++) {
            newContent += newString.charAt(i);
        }
        System.out.println(newContent);
        for (int i = 0; i < newContent.length(); i++) {
            if (integerMap.containsKey(newContent.charAt(i))) {
                int count = integerMap.get(newContent.charAt(i));
                integerMap.put(newContent.charAt(i), count + 1);
            } else {
                integerMap.put(newContent.charAt(i), 1);
            }
        }
        System.out.println(integerMap);
    }
}
