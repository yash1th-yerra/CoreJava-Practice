import java.util.*;
public class SortedSetDemo{
    public static void main(String[] args){
        SortedSet<Integer> set  =new TreeSet<>();
        set.add(3);
        set.add(5);
        set.add(2);
        set.add(1);
        set.add(4);
        SortedSet<Integer> sorset = Collections.synchronizedSortedSet(set);
        System.out.println(set);
        System.out.println(sorset);
        set.remove(3);
        System.out.println(set);
        set.add(3);
        Iterator<Integer> i = set.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
        System.out.println("First element in TreeSet is "+set.first());
        System.out.println("last element in TreeSet is "+set.last());
        System.out.println(set.contains(10));
        System.out.println(set.contains(3));
        System.out.println(set.hashCode());
        set.add(6);
        System.out.println(set.hashCode());
        System.out.println(set.headSet(4));
        System.out.println(set.size());
        System.out.println(set.tailSet(4));
        
        
    }
}