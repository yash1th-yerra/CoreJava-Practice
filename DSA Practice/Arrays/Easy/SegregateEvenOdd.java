public class SegregateEvenOdd{
   /*static void arrEvenOdd(int[] a,int n){
        int i=-1;
        for(int j=0;j<n;j++){
            if(a[j]%2==0){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }*/
    static void arrEvenOdd(int[] a,int n){
        int[] temp =new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                temp[count++]=a[i];
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                temp[count++]=a[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        arrEvenOdd(arr,n);
    }
}