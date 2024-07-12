import java.util.*;
public class UniqueInArray{
    static void findUnique(int[] a,int n){
        
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println("The unique element is "+a[i]);
            }
        }
    }//O(n*n)
    static void findUnique2(int[] a,int n){
        int res=a[0];
        for(int i=1;i<n;i++){
            res^=a[i];
        }
        System.out.println("The unique element is "+res);
    }//O(n)
    static void findUnique3(int[] a,int n){
        Map<Integer,Integer> m= new HashMap<>();
        int sum1=0,sum=0;
        for(int i=0;i<n;i++){
            if(!m.containsKey(a[i])){
                sum1+=a[i];
                m.put(a[i],1);
            }
            sum+=a[i];
        }
        System.out.println("The unique element is "+(2*sum1-sum));
    }//O(N) but extra space for Hashmap O(N)
    static void findUnique4(int[] a, int n){
        Arrays.sort(a);
        int low=0;int high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==a[mid^1]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println("The Unique Element is "+a[low]);
    }//O(nlogn)

    public static void main(String[] args){
        int[] a = {1,2,3,4,5,1,2,3,4,5,6};
        int n=a.length;
        findUnique(a,n);
        findUnique2(a,n);
        findUnique3(a,n);findUnique4(a,n);
    }
}