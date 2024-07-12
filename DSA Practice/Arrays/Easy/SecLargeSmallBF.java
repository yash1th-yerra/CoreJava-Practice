import java.util.*;
public class SecLargeSmallBF{
    public static void main(String[] args) {
        System.out.println("Enter array size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements: ");
        for( int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        secLargeSmallBF(arr);
        sc.close();
    }
    public static void secLargeSmallBF( int arr[]){
        if(arr.length==0||arr.length==1){
            System.out.println(" No elements processed correctly");

        }
        else {
            Arrays.sort(arr);
            System.out.println("second largest : "+arr[arr.length-2]+" Second smallest : "+arr[1]);
        }
    }
}