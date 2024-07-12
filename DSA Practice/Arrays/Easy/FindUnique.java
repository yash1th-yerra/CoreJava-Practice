
public class FindUnique {
    public static int getSingleElement(int[] a) {
        int n = a.length;
        /*
         * HashMap<Integer,Integer> hash = new HashMap<>();
         * for(int i=0;i<n;i++){
         * int value = hash.getOrDefault(a[i],0);
         * hash.put(a[i],value+1);
         * }
         * for(Map.Entry<Integer,Integer> it : hash.entrySet()){
         * if(it.getValue()==1){
         * return it.getKey();
         * 
         * }
         * }
         * return -1;
         */

        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= a[i];
        }
        return xor;

    }

    public static void main(String[] args) {
        int[] a = { 4, 1, 2, 1, 2 };
        int ans = getSingleElement(a);
        System.out.println("Unique Element is " + ans);
    }
}