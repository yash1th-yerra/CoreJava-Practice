import java.util.*;
import java.util.stream.*;
public class StreamDemo{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("Numbers less than 10: "+list);
        List<Integer> list2 = list.stream().map(i->i+10).collect(Collectors.toList());
        System.out.println("Numbers less than 20: "+list2);

    }
}