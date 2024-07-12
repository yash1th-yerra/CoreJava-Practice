import java.util.*;
import java.util.function.Predicate;

public class RemoveNullUsingRemoveIf{
    public static <T> List<T> removeElements(List<T> l,Predicate<T> p){
        l.removeIf(x->p.test(x));
        return l;
    }
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(Arrays.asList("Geeks",null,"forGeeks",null,"a computer portal"));
        System.out.println("List with nulls: "+l);
        Predicate<String> isNull = i->(i!=null);
        l=removeElements(l,isNull);
        System.out.println("List without nulls: "+l);
    }
}