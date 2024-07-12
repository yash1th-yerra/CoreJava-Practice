import java.util.*;
import java.util.stream.*;
public class ParallelStreamDemo{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.parallelStream().forEachOrdered(System.out::println);
    }
}


///based on requirement we use either sequential or parallel
//parallel is platform  dependent 
