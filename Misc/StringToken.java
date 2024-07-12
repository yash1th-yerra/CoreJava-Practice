import java.io.*;
import java.util.StringTokenizer;
public class StringToken{
    public static void main(String[] args) {
        String s="Hello this is yashwanth";
        StringTokenizer part=new StringTokenizer(s);
       /*/ while(part.hasMoreTokens()){
            System.out.println("token:"+part.nextToken());
        }*/
        System.out.println(part.countTokens());
        while(part.hasMoreElements()){
        
            System.out.println("Element:"+part.nextElement());
        }
    }
}