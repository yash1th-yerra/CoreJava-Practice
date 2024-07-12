import java.util.*;
public class TreeSetDemo2{
    public static void main(String[] args){
        NavigableSet<Integer> set = new TreeSet<>();

        set.add(2);
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(6);
        set.add(5);
        set.add(7);
        NavigableSet<Integer> set2 = Collections.synchronizedNavigableSet(set);
    
        set.remove(7);
        System.out.println(set2);
        System.out.println("size: "+set.size());
        System.out.println(set);
        System.out.println(set.lower(3));
        System.out.println(set.higher(4));
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.headSet(4));
        System.out.println(set.tailSet(4));
        System.out.println(set.contains(3));
        System.out.println(set.contains(9));
        System.out.println("Empty : "+set.isEmpty());

        

        
        
    }
}