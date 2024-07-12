import java.util.*;


public class HashSetTraverse{
    public static void main(String[] args) {
        
        HashSet  <String> set = new HashSet<String>();
        set.add("Geeks");
        set.add("for");
        set.add("Geeks");
        set.add("set");
        set.add("Example");
       
        System.out.println("HashSet: "+set);
        System.out.println("Using for");
        for(String s:set){
            System.out.println(s);
        }
        set.remove("Geeks");
        System.out.println("USing foreach stream");
        set.forEach(s->System.out.println(s));
        System.out.println("Using iterator()");
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("size of set is "+set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("for"));

       
    }   
}