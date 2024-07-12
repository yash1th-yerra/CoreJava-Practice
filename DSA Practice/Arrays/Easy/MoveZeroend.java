public class MoveZeroend{
    static int[] pushZeroEnd(int[] a,int n){
        int count =0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                a[count++]=a[i];
            }
        }
        while(count<n){
            a[count++] = 0 ;
        }
        return a;
    }
    public static void main(String[] args){
        int[] arr={1,0,1,2,3,1,0,0,1,1,0,1,2};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        arr = pushZeroEnd( arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}