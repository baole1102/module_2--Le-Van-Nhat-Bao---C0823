package ss11_java_collection.practice.th1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class pratice {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMapStudent = new HashMap<>();
        hashMapStudent.put("Bao", 22);
        hashMapStudent.put("Dung", 30);
        hashMapStudent.put("Do", 21);
        hashMapStudent.put("Vi", 19);
        System.out.println("List hashMap: ");
        System.out.println(hashMapStudent + "\n");
        // TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>(hashMapStudent);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        // LinkHashMap
        LinkedHashMap<String, Integer> linkedHashMap =new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Bao", 22);
        linkedHashMap.put("Dung", 30);
        linkedHashMap.put("Do", 21);
        linkedHashMap.put("Vi", 19);
        System.out.println("\nThe age for " + "Dung is " + linkedHashMap.get("Dung"));


    }


}
