import java.util.function.Function;
public class FuncInterfaceDemo{
    public static void main(String[] args) {
        Function<Integer,Integer> half = a->a/2;//apply(first one)
        try{
            half = half.andThen(a->a*3);//it returns a composed function  where in parameterized function will be executed after first one(apply)
        }
        catch(Exception e){
            e.getMessage();
        }
        try{
            half = half.compose(a->a*3);// it will return composed function where in parameterized function will be executed first and then first one
        }
        catch(Exception e){
            e.getMessage();
        }
        Function<Integer,Integer> i = Function.identity();
        System.out.println(i.apply(20));// if you want to know what is argument use identity it will return function which returns only its argument.

        System.out.println("Half :"+half.apply(20));
        
    }
}