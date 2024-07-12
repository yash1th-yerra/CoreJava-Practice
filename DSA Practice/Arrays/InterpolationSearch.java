public class InterpolationSearch{
    public static int interpolationSearch(int[] a,int key,int low,int high){
        int pos;
        while(low<=high && key>=a[low] && key<=a[high]){
            pos = (low + ((key-a[low])*(high-low))/(a[high]-a[low]));
            if(a[pos]==key){
                return pos;
            }
            else if(a[pos]<key){
                return interpolationSearch(a,key,pos+1,high);
            }
            else{
                return interpolationSearch(a,key,low,pos-1);
            }
        }
        return -1;

    }
    public static void main(String[] args){
        int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21,
            22, 23, 24, 33, 35, 42, 47 };
            int n = arr.length;
            int key=18;
            int index=interpolationSearch(arr,key,0,n-1);
            if(index!=-1){
                System.out.println("Element found at position "+index);
            }
            else{
                System.out.println("Element not present");
            }
    }
}