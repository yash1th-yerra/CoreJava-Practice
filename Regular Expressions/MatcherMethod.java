import java.util.regex.*;

public class MatcherMethod {
    public static void main(String[] args) {
        String regex = "(.*)ee(.*)?";
        String text = " this is a sample geek string ";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        boolean matchFound = false;
        while (matcher.find()) {
            System.out.println("Found match in text :" + matcher.group() + "Starting index:" + matcher.start()
                    + "Ending index:" + matcher.end());
            matchFound = true;

        }
        if (!matchFound) {
            System.out.println("No matches found");
        }
    }

}