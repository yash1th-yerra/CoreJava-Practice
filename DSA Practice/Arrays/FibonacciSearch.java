public class FibonacciSearch{
    public static int fibonacciSearch(int[] a,int key,int low,int high){
       
        return -1;

    }
    public static void main(String[] args){
        int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21,
            22, 23, 24, 33, 35, 42, 47 };
            int n = arr.length;
            int key=18;
            int index=fibonaaciSearch(arr,key,0,n-1);
            if(index!=-1){
                System.out.println("Element found at position "+index);
            }
            else{
                System.out.println("Element not present");
            }
    }
}