import java.util.*;
public class StreamFunctionalDemo2{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(Arrays.asList(20,4,21,35,6,3,24,34));
        var stream=list.stream();
        var num = stream.filter(x->x>20).filter(x->x%2==0);
        num.forEach(System.out::println);
    }
}