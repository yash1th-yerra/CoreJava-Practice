import java.util.*;

public class FindUnion {
    public static HashSet<Integer> findUnion(int[] a1, int[] a2, int n, int m) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(a1[i]);
        }
        for (int i = 0; i < m; i++) {
            set.add(a2[i]);
        }
        return set;
    }

    public static ArrayList<Integer> findUnion2(int[] a1, int[] a2, int n, int m) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> union = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            freq.put(a1[i], freq.getOrDefault(a1[i], 0) + 1);
        }
        for (int i = 0; i < m; i++) {
            freq.put(a2[i], freq.getOrDefault(a2[i], 0) + 1);
        }
        for (int it : freq.keySet()) {
            union.add(it);
        }
        return union;
    }

    public static ArrayList<Integer> findUnion3(int[] a1, int[] a2, int n, int m) {
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (i < n && j < m) {
            if (a1[i] <= a2[j]) {
                if (list.size() == 0 || list.get(list.size() - 1) != a1[j]) {
                    list.add(a1[i]);

                }
                i++;
            } else {
                if (list.size() == 0 || list.get(list.size() - 1) != a2[j]) {
                    list.add(a2[j]);
                }
                j++;
            }
        }
        while (i < n) {
            if (list.get(list.size() - 1) != a1[i]) {
                list.add(a1[i]);
            }
            i++;
        }
        while (j < m) {
            if (list.get(list.size() - 1) != a2[j]) {
                list.add(a2[j]);
            }
            j++;
        }
        return list;
    }
    public static ArrayList<Integer> findIntersection(int[] a1,int[] a2, int n,int m){
        ArrayList<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m){
            if(a1[i]==a2[j]){
                if(list.size==0||list.get(list.size()-1)!=a1[i])
                list.add(a1[i]);
            }
            i++;
        }
        else{

        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 2, 3 };
        int n = arr1.length;
        int arr2[] = { 2, 3, 4, 5, 6 };
        int m = arr2.length;
        // HashSet<Integer> union = findUnion(arr1, arr2, n, m);
        // ArrayList<Integer> union2 = findUnion2(arr1, arr2, n, m);
        ArrayList<Integer> union3 = findUnion3(arr1, arr2, n, m);
        ArrayList<Integer> intersection = findIntersection(arr1,arr2,n,m);
        // System.out.println("The Union of two arrays is : " + union);
        // System.out.println("The Union of two arrays is : " + union2);
        System.out.println("The Union of two arrays is : " + union3);
        System.out.println("The Intersection of two arrays is : " + intersection);
    }
}