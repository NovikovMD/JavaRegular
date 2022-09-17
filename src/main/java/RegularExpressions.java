import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static boolean Task1(String s){
        String pat = "^(25[0-5]|[01]?[0-9]?[0-9]|2[0-4][0-9])\\." +
                "(25[0-5]|[01]?[0-9]?[0-9]|2[0-4][0-9])\\." +
                "(25[0-5]|[01]?[0-9]?[0-9]|2[0-4][0-9])\\." +
                "(25[0-5]|[01]?[0-9]?[0-9]|2[0-4][0-9])$";
        return s.matches(pat);
    }
}
