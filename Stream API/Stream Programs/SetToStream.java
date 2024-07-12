import java.util.*;
import java.util.stream.Stream;
public class SetToStream{
    public static <T>Stream<T> convertSetToStream(Set<T> set){
        return set.stream();
    }
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,6,8,9,0,2));
        System.out.println("Set: "+set);
        Stream<Integer> stream = convertSetToStream(set);
        System.out.println("Stream: "+Arrays.toString(stream.toArray()));
    }
}