import java.util.*;
import java.util.stream.*;
public class StreamToMap{
    public static Map toMap(String input){
        Map<String,Integer> map =Arrays.stream(input.split(" ")).collect(Collectors.toMap(value->value,value->value.length()));
        return map;
    }
    public static void main(String[] args) {
        String input = "Hello World !";
        System.out.println(toMap(input));
    }
}