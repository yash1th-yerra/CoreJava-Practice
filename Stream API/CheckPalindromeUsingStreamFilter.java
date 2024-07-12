import java.util.stream.*;
class CheckPalindromeUsingStream{
    public  void filterPalindrome(){
        String[] str  =new String[]{"madam","please","refer","link","on","racecar"};
        Stream.of(str).filter(x->palindrome(x)).forEach(System.out::println);
    }
    public static boolean palindrome(String s){
        if(s.length() <=1)
        return true;
        else
        return (s.charAt(0)==s.charAt(s.length()-1)&&palindrome(s.substring(1,s.length()-1)));
    }
}
public class CheckPalindromeUsingStreamFilter{
    public static void main(String[] args) {
        
        new CheckPalindromeUsingStream().filterPalindrome();
       
    }
}