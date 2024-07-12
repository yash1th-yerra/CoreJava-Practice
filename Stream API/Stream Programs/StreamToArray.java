import java.util.*;
import java.util.stream.Stream;
import java.util.function.Function;
public class StreamToArray{
    public static <T> Object[] convertStreamToArray(Stream<T> stream){
         return stream.toArray(Object[]::new);
        //return stream.mapToInt(Integer::intValue).toArray();

    }
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,0);
        Object[] arr= convertStreamToArray(stream);
        System.out.println("Array: "+Arrays.toString(arr));
    }
}