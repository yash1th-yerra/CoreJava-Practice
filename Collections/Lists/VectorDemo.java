//VectorDemo
import java.io.Scanner;
import java.util.*;
public class VectorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector <Integer> vt = new Vector<>(n);
        for (int i=1 ;i<=n;i++){
            vt.add(i);
        }
        System.out.println("The vector is : "+vt);
        sc.close();
        for (int i=0 ;i<n;i++){
            System.out.println(vt.get(i));
        }
    }
}