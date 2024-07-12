import java.util.function.Predicate;
public class PredicateDemo{
    static void pred(int n,Predicate<Integer> predicate){
        if(predicate.test(n)){
            System.out.println("Number "+n);
        }
    }
    public static void main(String[] args) {
        Predicate<Integer> lessthan = x->(x<20);
        Predicate<Integer> greaterthan = x->(x>10);
        System.out.println(lessthan.test(21));
        System.out.println(lessthan.and(greaterthan).test(14));
        pred(15,i->i<12);
    }
}