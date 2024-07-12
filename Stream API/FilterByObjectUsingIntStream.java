import java.util.*;
import java.util.stream.IntStream;
public class FilterByObjectUsingIntStream{
    public static void main(String[] args) {
        String[] myArray = new String[]{"Stream","is","a","sequence","of","elements"};
        IntStream.rangeClosed(0,myArray.length-1).filter(x->x%2==0).mapToObj(x->myArray[x]).forEach(System.out::println);
    }
}