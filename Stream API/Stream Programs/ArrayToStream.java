import java.util.*;
import java.util.stream.Stream;
public class ArrayToStream{
    public static <T>Stream<T> convertArrayToStream(T arr[]){
        //return Arrays.stream(arr);
        return Arrays.asList(arr).stream();
        //return Stream.of(arr);
    }
    public static void main(String[] args) {
        String [] arr = {"Geeks","For","Geeks"};
        System.out.println("Array: "+Arrays.toString(arr));
        Stream<String> stream = convertArrayToStream(arr);
        System.out.println("Stream: "+Arrays.toString(stream.toArray()));
    }
}