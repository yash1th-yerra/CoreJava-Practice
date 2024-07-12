import java.util.*;
public class LargeInArrBF {
    public static void main(String[] args) {
        System.out.println("Enter Array Size:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i =0; i<n; i++){
            System.out.println("Enter the element:");
            arr[i] =scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Largest Element :"+arr[n-1]);
        scan.close();
    }
}