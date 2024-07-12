import java.io.*;
import java.io.util.*;
public class StringImmute {
    public static void main(String[] args){
        String s="virat";
        s.concat("kohli");//strings are immutable so it can't be modified.
        System.out.println(s);
        String s1=s.concat(" kohli");
        System.out.println(s1);
    }
    
}
