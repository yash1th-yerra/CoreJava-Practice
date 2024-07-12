import java.util.Arrays;
public class MaxMinArrange{
    static void rearrange(int a[],int n){
        int max=n-1;
        int maxEle=a[max]+1;
        int min=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                a[i] =a[i]+(a[max] % maxEle)*maxEle;
                max--;
            }
            else{
                a[i] =a[i]+(a[min]%maxEle)*maxEle;
                min++;
            }    
        }
        for(int i=0;i<n;i++){
            a[i]/=maxEle;
            System.out.print(a[i]+" ");
        }
        

    }
    public static void main(String[] args){
        int[] arr = {1,3,6,2,4,7,5,9,8};
        int n= arr.length;
        rearrange(arr,n);
    }
}