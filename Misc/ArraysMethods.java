import java.util.*;
public class ArraysMethods {
    public static void main(String[] args){
        int [] a={1,2,3};
        //aslist(a);
        int key =2;
        binSear(a,key);
        System.out.println("copy of array:"+Arrays.toString(Arrays.copyOf(a, 10)));
        System.out.println("Deep Hash code:"+Arrays.hashCode(a));
        

    }
    public static void aslist(int [] arr){
        List<int[]> list=Arrays.asList(arr);
        System.out.println("List:"+list);
    }
    public static void binSear(int [] arr,int key){
        Arrays.sort(arr);
        System.out.println(key+" found at index "+Arrays.binarySearch(arr,key));    
    
    }
}

                    