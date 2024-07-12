public class RotatebyReverse{
    static void reverse(int[] a,int start,int end){
        while (start<end) {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;end--;
        }
    }
    static void leftRotate(int[] a,int n,int d){
        if(d>n){return;}
        d=d%n;
        reverse(a,0,d-1);
        reverse(a,d,n-1);
        reverse(a,0,n-1);
    }
    static void printArray(int[] a,int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6,7,8,9};
        int d=2;
        int n=a.length;
        leftRotate(a,n,d);
        System.out.println();
        printArray(a,n);
    }
}