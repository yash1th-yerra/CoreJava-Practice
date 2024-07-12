import java.util.*;
public class ReverseString {
    public static String reverseString(String s){
        if(s==null){
            return null;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(string [] args){
        String s=new String("Hello World");
        String reversed=reverseString(s);
        System.out.println("Reversed string is "+reversed);
        palindrome(reversed,s);
    }
    public static void palindrome(String s1,String s2){
        
        if(s1!=s2){
            System.out.println("Not a Palindrome");
        }
        else{
            
            System.out.println("Not a Palindrome");
        }
    }
}