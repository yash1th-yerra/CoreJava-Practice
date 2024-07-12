public class CyclicSort{
    static void swap(int[] a,int b,int c){
        int temp=a[b];
        a[b]=a[c];
        a[c]=temp;
    }
    static void Sort(int[] a,int n){
        int i=0;
        while(i<n){
           int correct = a[i]-1;
            if(a[correct]==a[i]){
                i++;
            }
            else{
                swap(a,i,correct);
            }
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] a={9,8,7,6,5,4,3,2,1};
        int n=a.length;
        System.out.println("Before sorting: ");
        for(int x:a){
            System.out.print(x+" ");
        }
        System.out.println("\nAfter Sorting: ");
        Sort(a,n);
    }
}