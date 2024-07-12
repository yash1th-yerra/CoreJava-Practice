//-1 for if o1 has to come before o2 that is if o1<o2 you have to return -1
//1 for if o2 has to come before o1 that is if o1>o2 you have to return 1
// otherwise 0 that is both objects are equal at that instance.

import java.util.*;
public class LambdaCompDemo{
    public static void main(String[] args) {
        TreeMap<Integer,String> m = new TreeMap<Integer,String>((o1,o2) -> (o1>o2)?1:(o1<o2)?-1:0);
        m.put(1,"Apple"); 
        m.put(3,"banana"); 
        m.put(4,"guava"); 
        m.put(2,"pineApple"); 
        m.put(5,"berry"); 
        System.out.println(m);
    }
}