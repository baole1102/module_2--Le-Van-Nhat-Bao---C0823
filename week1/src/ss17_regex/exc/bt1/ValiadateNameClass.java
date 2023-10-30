package ss17_regex.exc.bt1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValiadateNameClass {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String REGEX = "^[A|C|P]\\d{4}[G|H|I|K]";
    public ValiadateNameClass(){

    }
    public boolean validateName(String regex){
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
