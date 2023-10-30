package ss17_regex.pratice.th2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    private static Pattern pattern;
    public Matcher matcher;
    private static final String REGEX = "^[_a-z0-9]{6,}$";
    public ValidateAccount(){
    }
    public boolean checkAccount(String regex){
        pattern = Pattern.compile(REGEX);
         matcher = pattern.matcher(regex);
         return matcher.matches();
    }
}
