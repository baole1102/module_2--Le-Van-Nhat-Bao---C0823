package cuoimodule2.until;

import java.util.ArrayList;
import java.util.List;

public class aaa {
    public static void main(String[] args) {

    }
    char[] solution(String s) {
        int count = 0;
        List<String> newArr = new ArrayList();
        String [] a = s.split("");
        List<Character> arr = new ArrayList();
        int id = 0;
        for(int i = 0; i < a.length;i++){
            newArr.add(a[i]);
        }
        int id = 0;
        for(int i = 0; i < newArr.size(); i ++){
            for(int j = 1; j < newArr.size();j++){
                if(newArr.get(i)==newArr.get(j)){
                    count++;
                }
            }
            if(count > 1) {
                arr.add(newArr.get(i).charAt(0));
                index++;
            }
            count = 0;
        }
        char [] b = new char [id];
        for(int i =0; i <arr.size();i++ ){
            b[i]=arr.get(i);
        }
        return b;
    }
}
