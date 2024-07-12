//IllegalArgumentException
public class IllegalArgumentExceptionDemo {
    public static void print(int a){
        if(a>=18){
            System.out.println("Eligible to Vote");
        }
        else{
            throw new IllegalArgumentException();
        }
    }
    public static void main(String[] args){
        IllegalArgumentExceptionDemo.print(21);
        IllegalArgumentExceptionDemo.print(17);
    }
}