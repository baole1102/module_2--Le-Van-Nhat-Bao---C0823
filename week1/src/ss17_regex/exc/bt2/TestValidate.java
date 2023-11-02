package ss17_regex.exc.bt2;

import ss17_regex.exc.bt1.ValiadateNameClass;

public class TestValidate {
    private static ValidateNumber validateNumber;
    private static final String [] number = {"(84)-(0978489648)"};
    private static final String [] inNumber = {"(a8)-(22222222)","(84)-(22b22222)","(84)-(9978489648)"};

    public static void main(String[] args) {
        validateNumber = new ValidateNumber();
        for (String temp : number){
            boolean isValidate = validateNumber.checkValidate(temp);
            System.out.println("Value: "+temp + " check validate: "+isValidate);
        }
        for (String str : inNumber){
            boolean isValidate = validateNumber.checkValidate(str);
            System.out.println("Value: "+str + " check validate: "+isValidate);
        }
    }
}
