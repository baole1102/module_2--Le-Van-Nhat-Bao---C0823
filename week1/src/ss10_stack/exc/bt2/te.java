package ss10_stack.exc.bt2;

import java.util.Map;
import java.util.TreeMap;

public class te {
    public static void main(String[] args) {
        Map<Character, Integer> map = new TreeMap<>();
        String name = "Bao Dep Trai";
        name = name.toLowerCase();
        String newContent = "";
        for (int i = 0; i < name.length(); i++) {
            newContent += name.charAt(i);
        }
        System.out.println(newContent);
        int count;
        for (int i = 0; i < newContent.length(); i++) {
            if (map.containsKey(newContent.charAt(i))) {
                count = map.get(newContent.charAt(i));
                map.put((newContent.charAt(i)), count + 1);
            } else{
                map.put((newContent.charAt(i)), 1);
            }
        }
        System.out.println(map  );
    }
}
