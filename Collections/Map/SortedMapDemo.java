import java.util.*;
public class SortedMapDemo{
    public static void main(String[] args) {
        SortedMap<Integer,String> sm = new TreeMap<>();
        sm.put(1,"One");
        sm.put(2,"Two");
        sm.put(3,"Three");
        sm.put(4,"Four");
        sm.put(5,"Five");
       for(Map.Entry<Integer,String> me  : sm.entrySet()){
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());  
        }
        System.out.println(sm.firstKey());
        System.out.println(sm.lastKey());
        System.out.println(sm.headMap(3));
        System.out.println(sm.tailMap(3));
        System.out.println(sm.subMap(2,4));
        System.out.println(sm.keySet());
        System.out.println(sm.values());
        System.out.println(sm.size());

    }
}