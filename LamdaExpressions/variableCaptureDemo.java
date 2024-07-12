import java.io.*;

interface myFunction {
    void func(int n);
}

public class variableCaptureDemo {
    int data = 10;

    public static void main(String[] args) {
        int number = 10;
        variableCaptureDemo obj = new variableCaptureDemo();
        System.out.println(obj.data);
        System.out.println(number);
        myFunction mylambda = (n) -> {
            int value = number + n;
            obj.data += 10;
            System.out.println(obj.data);
            System.out.println(value);
        };
        mylambda.func(10);
        System.out.println(number);
        System.out.println(obj.data);

        System.out.println("Main");
    }
}