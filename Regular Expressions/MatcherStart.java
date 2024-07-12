import java.util.regex.*;

public class MatcherStart {
    public static void main(String[] args) {
        String regex = "geeks";
        String s = "for yeah geeks";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        if (m.find()) {
            System.out.println("Found at Start index " + m.start());
            System.out.println("Found at end index " + m.end());
        } else {
            System.out.println("Not Found");
        }
        System.out.println("Matcher State: " + m.toMatchResult());
        System.out.println(m.groupCount());

    }
}