import java.util.*;
public class Anagram {
    public static void main(String[] args){
        String s1="silent";
        String s2="violent";//listen can be used for anagram output
        if(checkAnagram(s1,s2))
        {
            System.out.println("Strings are anagram");
        }
        else
        {
            System.out.println("Strings are not anagram");
        }
    }
    public static boolean checkAnagram(String str1,String str2) {
        char [] ch1=str1.toCharArray();
        char [] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);




    }
}