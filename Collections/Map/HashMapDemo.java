import java.util.HashMap;
public class HashMapDemo{
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,new String("Yash"));
        hm.put(2,new String("Kohli"));
        hm.put(3,new String("Dhoni"));
        hm.put(4,new String("ABD"));
        System.out.println(hm.size());
        System.out.println(hm);
        if(hm.containsKey(3)){
            System.out.println(hm.get(3));
        }
        
    }
}