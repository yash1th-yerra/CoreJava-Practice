import java.util.regex.*;

public class FindMethod {
    public static void main(String[] args) {
        String regex = "ee";
        String s = "geeksforgeeks";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.find());

    }
}