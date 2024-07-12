import java.util.*;
public class RemoveDupUsingSets {
    public static <T> ArrayList<T> removeDupUsingSets(ArrayList<T> list){
        Set<T> set = new LinkedHashSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1,2,3,5,1,2,3,4));
        System.out.println("ArrayList with Duplicates : "+list);
        List<Integer> resultList=removeDupUsingSets(list);
        System.out.println("\nArrayList without duplicates: " +resultList );
    }
}