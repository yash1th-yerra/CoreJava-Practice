/*AutoBoxing and Unboxing */
public class WrapDemo {
    public static void main(String[] args) {
        Integer i = 10;
        int j = (int)(i); // auto boxing of integer to primitive type
        System.out.println("j: " + j);// output : j=10
        System.out.println("i: " + i);// output : j=10
    }

}