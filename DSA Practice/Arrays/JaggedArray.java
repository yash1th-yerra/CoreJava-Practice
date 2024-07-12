import java.io.*;
import java.util.Scanner;
public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int[][] jagged=new int[row][];
        
        int column=0;
        for (int i =0;i<jagged.length;i++){
            column=sc.nextInt();
            jagged[i]=new int[column];
            for(int j=0;j<jagged[i].length;j++){
                jagged[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<jagged.length;i++){
            System.out.println((i+1)+"-testcase:");
            for(int j=0;j<jagged[i].length;j++){
                System.out.println(jagged[i][j]);
            }
        }
    }
}
