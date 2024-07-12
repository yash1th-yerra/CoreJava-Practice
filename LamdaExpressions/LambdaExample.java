@FunctionalInterface
interface Test1{
    void print();
}
public class LambdaExample{
    public static void main(String[] args) {
        //Test1 test = ()->System.out.println("Hello");
        fun( ()->System.out.println("Hello"));
    }
    private static void fun(Test1 test){
        test.print();
    }
}