import java.util.regex.*;

public class PatternMethod {
    public static void main(String[] args) {
        String regex = "(.*)?";
        Pattern pattern = Pattern.compile(regex);
        String og_regex = pattern.pattern();
        System.out.println(og_regex);
    }
}