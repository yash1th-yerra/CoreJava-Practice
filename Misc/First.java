import java.io.*;
import java.util.Scanner;
public class First{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0 ;i<n;i++){
            System.out.println(i*i);
        }
    }
}