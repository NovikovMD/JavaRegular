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
    public static boolean FindOutIfRegexIncluded(String s){
        Pattern p = Pattern.compile("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");
        Matcher m = p.matcher(s);
        return m.find();
    }
}
