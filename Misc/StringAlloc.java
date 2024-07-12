import java.io.*;
public class StringAlloc{
    public static void main(String[] args){
		String str="Hello World";//string literal
        String str2="Hello World";//string literal referring to str(sane object) in string pool
        System.out.println("str= "+str);
        System.out.println("str==str2? "+ (str == str2));
        String str3= new String("Hello World");//new string object is created and assigned to a varaible str3
        //Here str3 will be stored dynamically in heap memory
        //allocate it in string pool by interning
        String strint=str3.intern();
        System.out.println("str2==str3 "+(str2==str3));
        System.out.println("str2 = str3 "+(str2.equals(strint)));
        System.out.println("str2==strint "+(str2==strint));
    }
}