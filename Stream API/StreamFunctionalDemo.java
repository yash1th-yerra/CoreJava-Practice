import java.util.*;
public class StreamFunctionalDemo{
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,6,7,9,5,8};
        var streamNum = Arrays.stream(numbers);
        var evenNum = streamNum.filter(n->n%2==0).count();
        System.out.println(evenNum);
    }
}