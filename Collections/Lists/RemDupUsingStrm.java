import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class RemDupUsingStrm{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,1,2,3,1,2));
        List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list2);

    }
}