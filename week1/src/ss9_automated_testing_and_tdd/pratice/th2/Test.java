package ss9_automated_testing_and_tdd.pratice.th2;

public class Test {
    public static void main(String[] args) {
        String str = "aaaaabbaaac";
        String result ="";
        int a = str.length();
        int count = 1;
        for(int i = 0 ; i < a-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count ++;
            }else{
                result += str.charAt(i)+String.valueOf(count);
               count = 1;
            }
        }
        result += str.charAt(a-1)+String.valueOf(count);
        System.out.println(result);
    }
}
