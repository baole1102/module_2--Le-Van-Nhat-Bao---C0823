package ss17_regex.exc.bt2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumber {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String REGEX = "[(]\\d{2}[)][-][(][0]+\\d{9}[)]";
    public ValidateNumber(){}
    public boolean checkValidate(String regex){
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
