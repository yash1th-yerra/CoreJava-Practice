import java.util.*;
public class LinkedHashMapDemo{
    public static void main(String[] args) {
        LinkedHashMap<String,String> lhm = new LinkedHashMap<>();
        lhm.put("A","Apple");
        lhm.put("B","Ball");
        lhm.put("C","Cat");
        System.out.println(lhm);
        System.out.println(lhm.size());
        System.out.println(lhm.get("B"));
        for(Map.Entry<String,String> me : lhm.entrySet()){
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
            
        }
        System.out.println(lhm.containsKey("C"));
        System.out.println(lhm.isEmpty());
        lhm.remove("A");
        System.out.println(lhm);
        lhm.put("B","Bat");
        lhm.put("A","Ant");
        System.out.println(lhm);
    
        
    }
}