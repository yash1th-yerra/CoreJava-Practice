import java.util.Arrays;
public class CountTriangles{
    static int countit(int[] a,int n){
        Arrays.sort(a);
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(a[i]+a[j]>a[k]){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] a= { 10, 21, 22, 100, 101, 200, 300 };
        int n=a.length;
        System.out.println("Number of triangles are "+countit(a,n));
    }
}