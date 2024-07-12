/*
                        topics covered
    Declaring 1d arrays
    iterating over arrays
    finding length of arrays
    passing and returning arrays from methods
    finding sum of elements in an array
    creating multidimensional (2 d )arrays
 */
import java.util.*;
public class ArraysDemo {
    public static void main(String[] args) {
        int  [] arr1={1,2,3,4,5};
        for(int i:arr1){
            System.out.print(i);
        }
        System.out.println();
        //sending array as parameter
        System.out.println(sum(arr1));
        //Intialising 2-D arrays
        int[][] arr
            = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };
        for(int i=0;i<3;i++){  //iterating over 2-D array
            for(int j=0;j<3;j++){
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int [] a=m1();
        for(int i:a)
        System.out.print(i);
        
    }
    //function to sum the elements in an array.
    public static int sum(int [] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    //returning array as method
    public static int[] m1(){
        return new int[] {1,2,3,4,5};
    }
}