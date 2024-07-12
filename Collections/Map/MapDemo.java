import java.util.*;
public class MapDemo{
    public static void main(String[] args) {
        Map<String,String> hm = new HashMap<>();
        hm.put("m",new String("my"));
        hm.put("n",new String("name"));
        hm.put("i",new String("is"));
        hm.put("y",new String("Yashwanth"));
        for(Map.Entry<String,String> me: hm.entrySet()){
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
        }
    }
}