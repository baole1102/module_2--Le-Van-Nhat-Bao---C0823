package ss17_regex.exc.bt1;

public class TestValidateNameClass {
    private static ValiadateNameClass valiadateNameClass;
    private static final String [] name = {"C0223G", "A0323K"};
    private static final String [] inName = {"M0318G", "P0323A"};

    public static void main(String[] args) {
        valiadateNameClass = new ValiadateNameClass();
        for (String str : name){
            boolean isValidate = valiadateNameClass.validateName(str);
            System.out.println("Value: "+str + " check validate: "+isValidate);
        }
        for (String str : inName){
            boolean isValidate = valiadateNameClass.validateName(str);
            System.out.println("Value: "+str + " check validate: "+isValidate);
        }
    }

}
