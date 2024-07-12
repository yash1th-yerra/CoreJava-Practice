//Converting Arraylist to string using copyOf()
import java.util.*;
public class ConvArrToStr3 {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("world");
        arr.add("welcome");
        arr.add("to my world");
        String[] str = Arrays.copyOf(arr.toArray(),arr.size(),String[].class);
        for(String s:str){
            System.out.println(s);
        }
    }
}