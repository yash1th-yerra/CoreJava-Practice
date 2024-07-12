
//Regular Expressions in java
import java.util.regex.*;

public class CompilePattern {
    public static void main(String[] args) {
        String regex = ".*www.*";
        String actualString = "www.youtube.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(actualString);
        boolean matches = matcher.matches();
        System.out.println(matches);
    }
}