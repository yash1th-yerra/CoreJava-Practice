import java.util.Arrays;
public class SortInWave{
   /* static void sortInWave(int a[],int n){
        Arrays.sort(a);
        for(int i=1;i<n-1;i+=2){
            int temp = a[i];
            a[i]=a[i-1];
            a[i-1]=temp;
        }
    }*/
    static void swap(int[] a,int l,int r){
        int temp =a[l];
        a[l] = a[r];
        a[r] =temp;
    }
    static void sortInWave(int[] a,int n){
        for(int i=0;i<n-1;i+=2){
            if(i>0 && a[i-1] < a[i]){
                swap(a,i,i-1);
            
                 
            }
            if(i<n-1 && a[i+1]<a[i]){
                    swap(a,i,i+1);
            }  
        }
        
    }
    static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] a ={1,2,3,4,5,6,7,8,9};
        System.out.println("Before sorting");
        printArray(a);
        sortInWave(a , 9 );
        System.out.println("\nAfter sorting ");
        printArray(a);
    }
}