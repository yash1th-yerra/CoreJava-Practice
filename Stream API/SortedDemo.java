import java.util.*;
public class SortedDemo{
    public static void printSortedList(List<Integer> list){
        list.stream().sorted().forEach(n->System.out.print(n+" "));
    }
    public static void main(String[] args)throws ClassCastException {
        List<Integer> list = List.of(12,3,6,2,4,7,9,4,34,89,43,76,34);
        System.out.println(list);
        System.out.println("list of elemts after sorting: ");
        printSortedList(list);
    }
}