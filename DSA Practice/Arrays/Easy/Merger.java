public class Merger {
public static  merge(int[] arr1 int[] arr2,int n, int m){
int i = 0;
int j = 0;
int index =0;
while(i<n && j<m){
    if(arr1[i]!=0 || arr2[j]!=0){
        if(arr1[i]<= arr[j] ){
            result[index++]=arr1[i++];

        
        }
        else{
            result[index++]=arr2[j++];
        }
    }
}
while(i<n && arr[i]!=0){
    result[index++]=arr1[i++];
}
while(j<m && arr[j]!=0){
    result[index++]=arr2[j++];
}
int[] arr1 = new int[n+m];
for( int i=0;i<result.length;i++){
    arr1[i] = result[i];
}
  for (int num :arr1) {
            System.out.print(num + " ");
        }
}

    public static void main(String[] args) {
        int[] arr1 = { 3, 5, 7 };
        int[] arr2 = { 9, 8, 6 };
        int n = arr1.length;
        int m = arr2.length;
        merge(arr1, arr2, n, m);

    }
}