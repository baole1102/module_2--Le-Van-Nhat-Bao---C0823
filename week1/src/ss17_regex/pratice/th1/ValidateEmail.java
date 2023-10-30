package ss17_regex.pratice.th1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static Pattern pattern;
    private  Matcher matcher;
    private static final String REGEX = "^[a-zA-Z0-9]+[a-zA-Z0-9]*@[a-zA-Z0-9]+(\\.[a-zA-z0-9]+)$";
    public ValidateEmail(){
        pattern = Pattern.compile(REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
