import java.util.*;

public class HashSetMaxMin{
    public static void main(String[] args) {
        
        Set <Integer> set = new HashSet<Integer>();
        for(int i=0;i<=10;i++){
                set.add(i);
        }
        System.out.println("Max :"+Collections.max(set));
        System.out.println("Min :"+Collections.min(set));
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(Integer val : set){
            if(val<min){
                min = val;
            }
            else if (val > max ){
                max= val;
            }
            
        } 
        System.out.println("Max element: "+max);
        System.out.println("Min element: "+min);
        
    }   
}