public class OptimizedRotate{
    static void rotate(int[] a,int n,int k){
        int mod = k%n;
        if(mod ==0) return;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nRight Rotation: ");
        for(int i=0;i<n;i++){
            System.out.print(a[(n-mod+i)%n]+" ");
        }
        System.out.println("\nLeft Rotation: ");
        for(int i=0;i<n;i++){
            System.out.print(a[(mod+i)%n]+" ");
        }
    }
    public static void main(String args[]){
        int[] a = {1,2,3,4,5,6,7,8,9};
        int n=a.length;
        int k=3;
        rotate(a,n,k);
    }
}