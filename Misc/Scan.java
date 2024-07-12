import java.io.*;
import java.util.*;
public class Scan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        char c=sc.next().charAt(0);
        System.out.println("Age:"+n);
        System.out.println("name:"+s);
        System.out.println("gender:"+c);
        sc.close();
    }
}