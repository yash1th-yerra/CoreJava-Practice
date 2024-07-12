import java.util.Stack;

public class LeaderInArray{
    static void findLeader(int[] a,int n){
        for(int i=0;i<n;i++){//O(n)
            int j;
            for(j=i+1;j<n;j++){//O(N*N)
                if(a[i]<=a[j]){
                    break;
                }

            }
            if(j==n){
                System.out.print(a[i]+" ");
            }
        }
    }//O(n*n)
    static void findLeader2(int[] a,int n){
        int max=a[n-1];
        System.out.print(max+" ");
        for(int i=n-2;i>=0;i--){
            if(a[i]>max){
                max=a[i];
                System.out.print(max+" ");
            }

        }
    }//O(n)
    //Another approach is using stack and findLeader2 method together will also give time complex- O(n) and O(n)for extra space used by stack
    static void findLeader3(int arr[], int size)
    {
        /* create stack to store leaders*/
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[size - 1]);
 
        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] >= stack.peek()) {
                stack.push(arr[i]);
            }
        }
 
        /* print stack elements*/
        /* run loop till stack is not empty*/
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
 
    public static void main(String[] args){
        int[] a={16,17,4,3,5,2};
        int n = a.length;
        findLeader(a,n);
        System.out.println();
        findLeader2(a,n);
        System.out.println();
        findLeader3(a, n);
    }
}