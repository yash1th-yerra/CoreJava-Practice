import java.util.*;

public class LinkedHashSetDemo{
    public static void main(String[] args) {
        System.out.println("difference between hashset and linkedhashset over same set");
        Set <String> set = new HashSet<String>();
        set.add("Geeks");
        set.add("for");
        set.add("Geeks");
        set.add("set");
        set.add("Example");
        System.out.println("Insertion order : "+set);
        Set <String> set2 = new LinkedHashSet<String>();
        set2.add("Geeks");
        set2.add("for");
        set2.add("Geeks");
        set2.add("set");
        set2.add("Example");
        System.out.println("Insertion order : "+set2);
    }   
}