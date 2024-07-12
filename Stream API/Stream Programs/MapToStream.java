//converting a map into stream
import java.util.*;
import java.util.stream.Stream;
public class MapToStream{
    public static <K,V>Stream<V> convertMaptoStreamValue(Map<K,V> map){
        return map.values().stream();
    }
    public static <K,V>Stream<K> convertMaptoStreamKey(Map<K,V> map){
        return map.keySet().stream();
    }
    public static <K,V>Stream<Map.Entry<K,V>> convertMapToStream(Map<K,V> map){
        return map.entrySet().stream();
    }
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Yash");
        map.put(2,"virat");
        map.put(3,"Dhoni");
        System.out.println("Map: "+map);
        Stream<Map.Entry<Integer,String>> stream = convertMapToStream(map);
        System.out.println(Arrays.toString(stream.toArray()));
        Stream<Integer> stream2 = convertMaptoStreamKey(map);
        System.out.println(Arrays.toString(stream2.toArray()));
        Stream<String> stream3 = convertMaptoStreamValue(map);
        System.out.println(Arrays.toString(stream3.toArray()));
       // System.out.println("Stream: "+Arrays.toString(stream.toArray()));
    }
}