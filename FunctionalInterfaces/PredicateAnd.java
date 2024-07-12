import java.util.function.Predicate;
import java.util.Objects;
public class PredicateAnd{
    public static Predicate<String> hasLengthof10 = new Predicate<String>(){
        @Override 
        public boolean test(String t){
            return t.length()>10;
        }
    };
    public static void predicate_And(){
        Predicate<String> nonNullPredicate = Objects::nonNull;
        String nullString = null;
        boolean outCome = nonNullPredicate.and(hasLengthof10).test(nullString);//if any of predicate object is false it will return false
        System.out.println(outCome);
        String String = " WElCOme to String";
        boolean outCome2 = nonNullPredicate.and(hasLengthof10).test(String);//first we are testing nonNullPredicate object which is null
        // using string so it will check the type of object with interface reference as null objects has null 
        //reference at first instance it return true hence the final output will false
        //but in second instance String as some value so it matches the reference of interface
        //and then it will check that object with test method which has condition length of that string greater than 10 
        //if it has it will return true.final result will be true cuz both objects holding true if it is false it will return false
        System.out.println(outCome2);

    }
    public static void predicate_or(){
        Predicate<String> nonNullPredicate = Objects :: nonNull;
        String nullString = null;
        boolean outCome = nonNullPredicate.and(hasLengthof10).test(nullString);//if any of predicate object is false it will return false
        System.out.println(outCome);
        Predicate<String> containsLetterA = p->p.contains("A");
        String containsA = "And";
        boolean outCome3 = containsLetterA.or(hasLengthof10).test(containsA);
        System.out.println(outCome3);
        boolean outCome4 = containsLetterA.negate().test(containsA);
        System.out.println(outCome4);
    }
    public static void main(String[] args) {
        predicate_And();
        predicate_or();
    }
}