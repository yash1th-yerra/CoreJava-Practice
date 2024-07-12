import java.util.Scanner;
public class LargeInArrRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0;i<n ;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Largest element in the array: "+largeArr(arr));
        sc.close();
        
    }
    public static int largeArr(int arr[]){
        if ( arr.length < 1){
            return -1;
        }
        else if(arr.length==1){
                return arr[0];
        }
        else{
            int max = arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
        }
    }
}