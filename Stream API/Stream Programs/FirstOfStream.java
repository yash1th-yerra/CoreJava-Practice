import java.util.*;
import java.util.stream.*;
public class FirstOfStream{
    public static <T> T firstOfStream(Stream<T> stream){
        //T firstEle = stream.findFirst().orElse(null);
        T firstEle = stream.reduce((first,last)->first).orElse(null);
        return firstEle;
    }
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,7,8,9,0);
        System.out.println("First Element: "+firstOfStream(stream));
    }
}