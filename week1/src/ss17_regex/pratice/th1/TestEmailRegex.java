package ss17_regex.pratice.th1;

public class TestEmailRegex {
    private static ValidateEmail validateEmail;
    private static final String [] validEmail = {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    private static final String [] invalidEmail  = {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        validateEmail = new ValidateEmail();
        for (String str: validEmail){
            boolean isvalid  = validateEmail.validate(str);
            System.out.println("Email is "+ str + " is valid: "+isvalid);
        }
        for (String str: invalidEmail){
            boolean isvalid  = validateEmail.validate(str);
            System.out.println("Email is "+ str + " is valid: "+isvalid);
        }
    }
}
