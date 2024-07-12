import java.util.*;


public class HashSetPrint{
    public static void main(String[] args){
        
        Set<String> set = new HashSet<String>();
        set.add("Geeks");
        set.add("for");
        set.add("Geeks");
        set.add("set");
        set.add("Example");
        System.out.println("HashSet: "+set);
        String[] hashArray = set.toArray(new String[set.size()]);
        Random rndm= new Random();
        int randn = rndm.nextInt(set.size());
        System.out.println("random number:"+hashArray[randn]);
        System.out.println("Using iterator()");
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

       
    }   
}