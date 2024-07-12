import java.util.*;
public class DistinctInArray{
    static void findDistinct(int[] a,int n){
        /*for(int i=0;i<n;i++){
            int j=0;
            for( j=0;j<i;j++){
                if(a[i]==a[j]){
                    break;
                }
                
            }
            if(i==j){
                    System.out.print(a[i]+" ");
            }
        }
    }*/ // time complexity is O(n*n)
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(a[i]);
        }
        set.forEach(s->System.out.print(s+" "));//time complexity is O(n) but space complexity is O(n) for HashSet
        /*Arrays.sort(a);
        for(int i=0;i<n;i++){
            while(i<n-1 && a[i]==a[i+1]){
                i++;
            }
            System.out.print(a[i]+" ");
        }*/
    } //time conplexity is O(nlogn) which is less than O(n*n)

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,1,2,3,4,5,6};
        int n= a.length;
        findDistinct(a , n);

    }
}