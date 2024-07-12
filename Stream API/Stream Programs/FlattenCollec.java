import java.util.*;
import java.util.stream.*;
public class FlattenCollec{
    public static <T> Stream<T> flatten(Collection<List<T>> values){
        Stream<T> stream = values.stream().flatMap(x->x.stream());
        return stream;
    }
    public static void main(String[] args) {

        Map<Integer,List<String>> map = new HashMap<>();
        map.put(1,Arrays.asList("1","2","3"));
        map.put(2,Arrays.asList("4","5","6"));
        System.out.println(map);
        List<String> list = flatten(map.values()).collect(Collectors.toList());
        System.out.println(list);
    }
}