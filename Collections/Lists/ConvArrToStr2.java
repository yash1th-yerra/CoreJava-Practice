//Converting Arraylist to string using toArray()
import java.util.*;
public class ConvArrToStr2 {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("world");
        arr.add("welcome");
        arr.add("to my world");
        String[] str = arr.toArray(new String[arr.size()]);
        for(String s:str){
            System.out.println(s);
        }
    }
}