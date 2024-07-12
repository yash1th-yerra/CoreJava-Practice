import java.util.*;

public class HashSetSort{
    public static void main(String[] args) {
        
        Set <Integer> set = new HashSet<Integer>();
        set.add(12);
        set.add(1);
        set.add(20);
        set.add(8);
        set.add(3);
        set.add(7);

        System.out.println(set);
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);
        TreeSet<Integer> set2 = new TreeSet<>(set);
        System.out.println(set2);
        
            
        
        
    }   
}