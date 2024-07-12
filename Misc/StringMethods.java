import java.io.*;
import java.util.*;
public class StringMethods{
    public static void main(String[] args) {
        String s="Virat Kohli";
        String s1=" MS Dhoni";
        System.out.println("length: "+s.length());
        System.out.println("character at 1: "+s.charAt(1));
        System.out.println("substring: "+s.substring(0,5));
        System.out.println("index of kohli: "+s.indexOf("Kohli"));
        System.out.println("concat: "+s.concat(s1));
        System.out.println("Name: "+s.toUpperCase());
        System.out.println("Name2: "+s1.toUpperCase());
        System.out.println(s1.contains("MS"));
        System.out.println(s1.subSequence(4, 9));
        System.out.println(s1.hashCode());
        /*trim()
        replace()
        compareTo()
        equalsIgnoreCase()
        compareToIgnoreCase()
        */
    }
}