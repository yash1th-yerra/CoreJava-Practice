import java.util.*;
import java.util.stream.*;
public class FlattenCollec2{
    public static<T> Stream<T> flatten(T[] a,T[] b){
        Stream<T> stream = Stream.of(a,b).flatMap(Arrays::stream);
        return stream;
    }
    public static void main(String[] args) {
        String[] a = {"a","b","c"};
        String[] b ={"d","e","f"};
        String[] s = flatten(a,b).toArray(String[]::new);
        System.out.println(Arrays.toString(s));
    }
}