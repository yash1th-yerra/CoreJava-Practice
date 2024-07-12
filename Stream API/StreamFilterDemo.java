import java.util.stream.*;
import java.util.concurrent.atomic.AtomicInteger;
public class StreamFilterDemo{
    public static void main(String[] args) {
        Stream<Integer> myStream = Stream.of(1,2,3,4,5,6,7,8,9);
        //myStream.filter(x->x%2==0).forEach(System.out::println);
        AtomicInteger i = new AtomicInteger(0);
        myStream.filter(x->i.getAndIncrement()%2==0).forEach(System.out::println);
        
    }
}