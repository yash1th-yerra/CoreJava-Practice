import java.util.*;
public class Distinct{
    public static void printDistinctList(List<Integer> list){
        list.stream().forEach(n->System.out.print(n+" "));
        var count = list.stream().count();
        System.out.println("\n"+count);
        System.out.println("\nDistinct List: ");
        list.stream().distinct().forEach(n->System.out.print(n+" "));
        var count1 = list.stream().distinct().count();
        System.out.println("\n"+count1);
        
        System.out.println("\nSorted list: ");
        list.stream().distinct().sorted().forEach(n->System.out.print(n+" "));
        var count2 = list.stream().distinct().count();
        System.out.println("\n"+count2);
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(12,23,456,23,434,234,4,21,23,34,56,6,1,2332,445,3,42,56,7,834,6767,6,67,6,54,45,41,45,5,56,56,67,67,67,78,78,78,78,897);
        printDistinctList(list);
    }
}