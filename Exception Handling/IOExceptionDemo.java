//IOException
import java.util.Scanner;
public class IOExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner("Hello");
        System.out.println(" "+sc.nextLine());
        System.out.println("Exception Output: "+sc.ioException());
        sc.close();
    }
}