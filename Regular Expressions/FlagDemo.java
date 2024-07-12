import java.util.regex.*;

public class FlagDemo {
    public static void main(String[] args) {
        String regex = "(.*)ee(.*)?";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        int patternFlags = pattern.flags();
        System.out.println("flags:" + patternFlags);
        if ((patternFlags & Pattern.CASE_INSENSITIVE) != 0)
            System.out.println("Case Insensitive is set");
        else
            System.out.println("case insensitive is not set");
    }
}