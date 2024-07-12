
public class SubarrayOfSum{
    static void findsubArray(int [] a,int n,int sum){
        
        for(int i=0;i<n;i++){
            int add=a[i];
            if(add==sum){
                System.out.println();
                System.out.println(a[i]+" ");
            }
            else{
                for(int j=i+1;j<n;j++){
                    add+=a[j];
                    int pointer=i;
                    if(add==sum){
                        while(pointer<=j){
                            System.out.print(a[pointer]+" ");
                            pointer++;
                        }
                        return;
                    }
                    
                }
            }
            
        }
       System.out.println("No subarray found");
       return;
        
    }
    static void findSubarraySlide(int[] a,int n,int sum){
        int sum2=a[0];int start=0;
        for(int i=1;i<n;i++){
            if(sum2==sum){
                int temp = start;
                while(temp<=i-1){
                    System.out.print(a[temp]+" ");
                    temp++;
                }
                return;
            }
            if(sum2<sum){
                sum2+=a[i];
            }
            while(sum2>sum && start<i-1){
                sum2-=a[start];
                start++;
            }
        }
        System.out.println("No Subarray found");
        return;
        
    }
    
    public static void main (String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        findsubArray(arr, n, sum);
        System.out.println("\n");
        findSubarraySlide(arr,n,sum);
    }
}