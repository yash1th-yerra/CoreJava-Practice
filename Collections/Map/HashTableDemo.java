import java.util.*;
public class HashTableDemo{
    public static void main(String[] args) {
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        ht.put(1,1);
        ht.put(2,2);
        ht.put(3,3);
        int value1 = ht.get(1);
        System.out.println(ht);
        System.out.println(value1);
        ht.remove(3);
        System.out.println(ht);
        //ht.clear();
        //System.out.println(ht);
        Enumeration<Integer> keys = ht.keys();
        while(keys.hasMoreElements()){
            int key = keys.nextElement();
            System.out.println(key+":"+ht.get(key));
        } 

    }
}