import java.util.*;
public class ArraysProp {
    public static void main(String[] args){
        int [] a={1,2,3};
        aslist(a);

    }
    public static void aslist(int [] arr){
        List<int[]> list=Arrays.asList(arr);
        System.out.println("List:"+list);
    }
}