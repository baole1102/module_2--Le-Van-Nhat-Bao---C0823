package ss15_Text_File.pratice.th1;

public class test2 {
    public static void main(String[] args) {
        String toSplit = "50, Zombie, teeth, hands";
        String [] results = toSplit.split(",");
        for (String str : results){
            System.out.println(str);
        }
    }
}
