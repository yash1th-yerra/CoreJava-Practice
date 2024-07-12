import java.util.*;
import java.util.stream.*;

public class SlicingStream{
    public static <T>Stream<T> getSliceOfStream(Stream<T> stream,int bi,int ei){
        return stream.collect(Collectors.toList()).subList(bi,ei+1).stream();
        
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=10;i++){
            list.add(i);
        }
        System.out.println("List: "+list);
        Stream<Integer> intStream = list.stream();
        Stream<Integer> slice = getSliceOfStream(intStream,4,9);
        System.out.println("\nSlice of Stream:");
        slice.forEach(System.out::println);
    }
}