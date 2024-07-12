import java.util.*;
import java.util.stream.Stream;
import java.util.stream.IntStream;
public class PrimitiveArrayToStream{
    public static IntStream convertPrimiteArrayToStream(int[] arr){
        return IntStream.of(arr);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,3,25,7,4};
        System.out.println("Arrays: "+Arrays.toString(arr));
        IntStream stream = convertPrimiteArrayToStream(arr);
        System.out.println("Stream: "+Arrays.toString(stream.toArray()));
    }
}