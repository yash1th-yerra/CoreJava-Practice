//string class meethods
import java.io.*;
import java.util.*;

import org.w3c.dom.TypeInfo;
public class StringMethods{
    public static void main(String[] args) {
        String str=" Hello Everyone";
        byte [] arr={65,66,67,68,69};
        String ns=new String(arr);
        char [] ch=ns.toCharArray();//toCharArray() method
        for(int i=0;i<ns.length();i++)//length() method
        {
            System.out.println(ch[i]);
        }
        System.out.println("ns="+ns);
        System.out.println(ns.charAt(2));//charAt() method
        System.out.println(ns.substring(2));//substring() method
        System.out.println(ns.concat(str));//concat() 
        System.out.println(ns.codePointAt(2));//codePointAt()
        System.out.println(ns.codePointBefore(2));//codePointBefore()
        System.out.println(ns.codePointCount(1,3));//;codePointCount()
        System.out.println(ns.contains("CD"));//contain()
        System.out.println(ns.toCharArray());//toCharAt()
        System.out.println(ns.hashCode());//hashCode()
        System.out.println(ns.isEmpty());   
        String string=new String(" Hello Everyone");
        String string1=string.intern();
        System.out.println("Before interning");
        System.out.println(string==str);
        System.out.println(string.equals(str));
        System.out.println("After interning");
        System.out.println(string1==str);
        System.out.println(string1.equals(str));
        StringBuffer sb=new StringBuffer(str);
        sb.append(" this is yashwanth");
        System.out.println(sb);
        sb.insert(0," How are you guys");
        System.out.println(sb);
        sb.replace(0, 12, "hi");
        System.out.println(sb);
        sb.delete(0, 8);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.charAt(31));
        



        

        
        
        
        


    }
}