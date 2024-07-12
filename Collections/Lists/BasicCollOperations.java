import java.util.*;
public class BasicCollOperations {
    public static void main(String[] args) {
        Collection <Integer> list = new ArrayList<Integer>(5);
        list.add(12);
        list.add(13);
        list.add(2);
        list.add(6);
        System.out.println("After Add Operation");
        for (Integer number : list){
            System.out.println("Number :"+number);
        }
        Collection<Integer> list2 = new ArrayList<Integer>();
        list2.addAll(list);
        System.out.println("the list2: "+list2);
        System.out.println("After Remove Operation");
        list.remove(12);
        System.out.println(list);
        list2.removeAll(list);
        System.out.println(list2);
        System.out.println("iterator Demo");
        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next()+" ");
        }
        
    }
   
}