//NumberFormatException
public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        try{
            Integer num = Integer.parseInt("YAsh");
            System.out.println(num);
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }
    }
}