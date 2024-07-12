import java.util.Arrays;
public class MaxMinADJ{
    static void rearrange(int[] a,int n){
        Arrays.sort(a);
        int[] temp = a.clone();
        int l=0;int r=n-1;
        boolean flag = true;
        for(int i=0;i<n;i++){
            if(flag){
                temp[i]=a[r--];
            }
            else{
                temp[i] =a[l++];
            }
            flag = !flag;
        }
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }

    }
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        rearrange(arr , n );
    }
}