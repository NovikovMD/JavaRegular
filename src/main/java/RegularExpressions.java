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
    public static boolean FindOutIfRegexIncluded(String s){//task 2
        Pattern p = Pattern.compile("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");
        Matcher m = p.matcher(s);
        return m.find();
    }

    public static String GetFromText(String text){//task3
        Pattern p = Pattern.compile(" (((https?)?:\\/\\/)?[0-9a-zA-Z][0-9a-zA-Z-]{0,63}[0-9a-zA-Z]\\.)+(ru|com|net)" +
                "(:\\d+)?" +
                "(\\/[a-zA-Z]+\\?(\\w+=\\w+)(&\\w+=\\w+)*)?" +
                "((\\/[0-9a-zA-Z][0-9a-zA-Z-]{0,63}[0-9a-zA-Z])+)?" +
                "(#\\w+)? ");
        Matcher m = p.matcher(text);
        if (m.find()) {
            return m.group(0);
        }
        else
            return null;
    }

    public static boolean CheckPassword(String passw){
        String pat = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[\\w]{8,}$";
        return passw.matches(pat);
    }
}
