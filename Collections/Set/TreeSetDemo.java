import java.util.*;


public class TreeSetDemo{
    public static void main(String[] args) {
        
        TreeSet <String> set = new TreeSet<String>();
        set.add("Geeks");
        set.add("for");
        set.add("Geeks");
        set.add("set");
        set.add("Example");
        System.out.println("TreeSet: "+set);
        Iterator<String> it = set.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

       
    }   
}