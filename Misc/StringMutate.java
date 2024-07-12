//string_buffer and String_builder concept
import java.io.*;
import java.util.*;
public class StringMutate{
    public static void main(String[] args){
        StringBuffer sbBuffer=new  StringBuffer("Hello ");
        sbBuffer.append("world");
        //System.out.println(sbBuffer);
        String s =sbBuffer.toString();
        System.out.println(s);
    }
}