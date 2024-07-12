import java.util.Arrays;
public class EvenLarge{
    static void assign1(int[] a,int n){
        Arrays.sort(a);
        int p=0,q=n-1;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans[i]=a[q--];
            }
            else{
                ans[i]=a[p++];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }    
    }
    static void assign2(int[] a,int n){
        for(int i=1;i<n;i++){
            if(i%2==0){
                if(a[i]<a[i-1]){
                    int temp = a[i];
                    a[i]=a[i-1];
                    a[i-1]=temp;
                }
            }
            else{
                if(a[i]>a[i-1]){
                    int temp =a[i];
                    a[i]=a[i-1];
                    a[i-1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr={ 1, 3, 2, 2, 5 };
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        assign1(arr,n);
        System.out.println();
        assign2(arr,n);
    }
}