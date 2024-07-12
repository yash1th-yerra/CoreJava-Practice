import java.util.*;
public class FilterDemo{
    public static void main(String[] args) {
        List<Integer>  list  = List.of(13,12,4,598,3,67,3,6,85,8,56,76,4,5,56,56,65,54);
        printEvenNumber(list);

    }
    public static void printEvenNumber(List<Integer> list){
        System.out.println("Even numbers: ");
        list.stream().filter(n->n%2==0).forEach(n->System.out.print(n+" "));
    }
}