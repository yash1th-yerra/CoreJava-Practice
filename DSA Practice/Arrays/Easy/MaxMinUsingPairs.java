public class MaxMinUsingPairs{
    static class Pair{
        int min;
        int max;
    }
    static Pair getMinMax(int a[],int n){
        Pair minmax = new Pair();
        int i;
        if(n%2==0){
            if(a[0]>a[1]){
                minmax.min= a[1];
                minmax.max = a[0];
            }
            else{
                minmax.min = a[0];
                minmax.max = a[1];
            }
            i=2;
        }
        else{
            minmax.min = a[0];
            minmax.max = a[0];
            i = 1;
        }
        while(i<n-1){
            if(a[i]>a[i+1]){
                if(a[i]>minmax.max){
                    minmax.max=a[i];
                }
                if(a[i+1]<minmax.min){
                    minmax.min = a[i];
                }
            }
            else{
                if(a[i+1]>minmax.max){
                    minmax.max = a[i+1];
                }
                if(a[i]<minmax.min){
                    minmax.min =a[i];
                }
            }
        }
        return minmax;
    }
    public static void main(String[] args){
        int arr[] = {100,1,20,5,45,330};
        int n = 6;
        Pair minmax = getMinMax(arr,n);
        System.out.println("Max:"+minmax.max);
        System.out.println("Min:"+minmax.min);
    }
}