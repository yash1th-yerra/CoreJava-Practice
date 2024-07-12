import java.util.*;
public class EvenInStreams{
    public static void main(String[] args) {
        List<Integer> arr = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> even = arr.stream().reduce(new ArrayList<Integer>(),
        (a,b)->{    //this is accumulator function in which it takes each element and adds result to a if it is even
            if(b%2==0)
            a.add(b);
            return a;
        },
        (a,b)->{  //this is combiner function which is used to combine two result containers i.e result of each iteration is add to final result container either sequentially or parallel
            a.addAll(b);
            return a;
        });
        System.out.println(even);
    }
}