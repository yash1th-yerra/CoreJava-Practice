import java.util.regex.*;

public class SplitMethod {
    public static void main(String[] args) {
        String regex = "ee";
        String actualString = "geeksforgeeks";
        Pattern pattern = Pattern.compile(regex);
        String[] array = pattern.split(actualString);
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}