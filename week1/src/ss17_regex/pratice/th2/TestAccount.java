package ss17_regex.pratice.th2;

public class TestAccount {
    private static ValidateAccount validateAccount;
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        validateAccount = new ValidateAccount();
        for (String str: validAccount){
            boolean isValid = validateAccount.checkAccount(str);
            System.out.println(" Account is: "+str + " isValid is: "+ isValid);
        }
        for (String str: invalidAccount){
            boolean isValid = validateAccount.checkAccount(str);
            System.out.println(" Account is: "+str + " isValid is: "+ isValid);
        }
    }
}
