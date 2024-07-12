//Chained Exception
public class ChainedExceptionDemo {
    public static void main(String[] args) {
        try{
            int num = 5;
            int c = num/0;
            System.out.println(c);

        }
        catch(ArithmeticException e){
            
            throw new RuntimeException("Error: you are dividing number by zero:",e);

        }
    }
}