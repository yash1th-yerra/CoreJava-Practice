import java.io.*;
public class LocalScope{
    static int a=5;
    void method()
    {
         a=10;
        System.out.println(a);
    }
    public static void main(String[] args) {
        LocalScope obj = new LocalScope();
        obj.method();
        System.out.println("Local Scope: "+obj.a); 
        
    }
}