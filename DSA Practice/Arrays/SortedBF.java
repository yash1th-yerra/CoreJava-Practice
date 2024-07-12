import java.util.Scanner;
public class SortedBF{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array Elements: ");
        for (int i = 0;i<n ;i++){
            arr[i]=sc.nextInt();
        }
        int flag =0;
        for (int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                flag = 1;
                break;
            }
        }
        if(flag ==1){
            System.out.print("\nArray is not sorted");  
        }
        else{
            System.out.print("\nArray is already sorted");
        }
        sc.close();    
    }
    
}