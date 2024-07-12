/* Exception Handling  */
//Arthimetic Exception
public class ArthimeticExceptionDemo {
    public static void main(String[] args) {
        try {
            int a=10,b=0;
            int c = a/b;
            System.out.println(c);
        }
        catch(ArthimeticException e){
            e.printStackTrace();
        }
    }
}