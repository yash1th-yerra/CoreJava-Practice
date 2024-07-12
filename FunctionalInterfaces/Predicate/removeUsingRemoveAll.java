import java.util.*;
import java.util.function.Predicate;
public class removeUsingRemoveAll {
    public static <T>List<T> removeElements(List<T> l,Predicate<T> p){
        Collection<T> collection = new ArrayList<>();
        for(T t:l){
            if(p.test(t)){
                collection.add(t);
            }
        }
        System.out.println("Collection to be removed: "+collection);
        l.removeAll(collection);
        return l;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,7,34,56,7,89,7,4,6,7,54));
        System.out.println("Original List: "+list);
        Predicate<Integer> is7 = n->(n==7);
        list =  removeElements(list,is7);
        System.out.println("Updated List: "+list);

    }
}