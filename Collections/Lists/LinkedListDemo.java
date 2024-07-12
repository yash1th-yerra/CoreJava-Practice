//LinkedList
import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.set(2,3);
        System.out.println(list);
        System.out.println("size:"+list.size());
        Object[] a = list.toArray();
        for (Object i:a){
            System.out.println((int)(i));
        }
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);
        System.out.println(list.contains(1));
        System.out.println(list.get(0));


        
    }
}