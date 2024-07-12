import java.util.regex.*;

public class MatchesMethod {
    public static void main(String[] args) {
        String regex = "(.*)ee(.*)?";
        Pattern pattern = Pattern.compile(regex); // Compile the regular expression
        String text = "this is sample geek text";
        boolean matcher = Pattern.matches(regex, text);
        Matcher matcher2 = pattern.matcher(text);
        boolean matcher3 = matcher2.matches();
        if (matcher)
            System.out.println("Found");
        else
            System.out.println("Not Found");
        if (matcher3)
            System.out.println("1");

        else
            System.out.println("0");

    }

}