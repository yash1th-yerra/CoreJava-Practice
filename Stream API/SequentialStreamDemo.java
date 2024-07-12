import java.util.*;
import java.util.stream.*;
public class SequentialStreamDemo{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.stream().forEach(System.out::println);
    }
}