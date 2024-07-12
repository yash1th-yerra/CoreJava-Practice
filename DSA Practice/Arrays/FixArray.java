import java.util.*;
public class FixArray{
    public static void fixArray(int[] a,int n){
        int i,j,temp;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(a[j]==i){
                    temp =a[j];
                    a[j]=a[i];
                    a[i]= temp;
                    break;
                }
            }
        }
        for(i=0;i<n;i++){
            if(a[i]!=i){
                a[i]=-1;
            }
        }
        System.out.println("After Rearranging: ");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }//O(n*n)
    public static void fixArray2(int[] a,int n){
        Set<Integer> s = new HashSet<Integer>();
        for(int i=0;i<n;i++){
            s.add(a[i]);

        }
        for(int i=0;i<n;i++){
            if(s.contains(i)){
                a[i]=i;
            }
            else{
                a[i]=-1;
            }
        }
        for(int x : a){
            System.out.print(x+" ");
        }
    }//O(n*n)
    public static void fixArray3(int[] a,int n){
        for(int i=0;i<n;i++){
            if(a[i]!=-1 &&a[i]!=i){
                int x=a[i];
                while(a[x]!=-1&&a[x]!=x){
                    int y=a[x];
                    a[x] = x;
                     x=y;
                }
            }
            if(a[i]!=i){
                a[i]=-1;
            }
            
        }
        System.out.println("After Rearranging: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }//O(n)
    
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,7,6,9,0,8};
        int n=a.length;
        System.out.println("Before Rearranging: ");
        for (int x : a){
            System.out.print(x+" ");
        }
        System.out.println();
        fixArray2(a,n);
        /*for(int i=0;i<n;i++){
            if(a[i]>=0&&a[i]!=i){
                int ele =a[a[i]];
                a[a[i]] =a[i];
                a[i] =ele;
            }
        }
        System.out.println();
        for(int x: a){
            System.out.print(x+ " ");
        }*/ //O(n)
    }
}