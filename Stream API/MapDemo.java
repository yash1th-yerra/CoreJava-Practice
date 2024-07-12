import java.util.*;
public class MapDemo{
    public static void findTheCube(List<Integer> list){
        list.stream().map(x->x*x*x).forEach(x->System.out.print(x+" "));
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        findTheCube(list);
    }
}