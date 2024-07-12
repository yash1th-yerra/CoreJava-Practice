import java.util.*;
public class SecLargeSmallOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        getElements(arr,n);
        sc.close();
        
    }
    public static void getElements(int arr[],int n){
        if(n==0||n==1){
            System.out.println("can't be processed");
        }
        int large = arr[0];
        int sec_large= Integer.MIN_VALUE;
        for( int i = 0;i<n;i++){
            if(arr[i]>large){
                sec_large = large;
                large =arr[i];
            }
            else if(arr[i]>sec_large && arr[i]<large){
                sec_large = arr[i];
            }
            
            
        }
        int small = arr[0];
        int sec_small=Integer.MAX_VALUE;
        for( int i = 0;i<n;i++){
            if(arr[i]<small){
                sec_small = small;
                small = arr[i];
            }
            else if(arr[i]<sec_small && arr[i]>small){
                sec_small = arr[i];
            }
       
        }
        System.out.println("Second Largest :"+sec_large+" Second smallest: "+sec_small);    

    }
}