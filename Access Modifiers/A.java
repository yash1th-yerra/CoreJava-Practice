import java.io.*;

public class A{
    public void m1(){
        System.out.println("public");
    }
    protected void method(){
        System.out.println("protected");
    }
    private void method2(){
        System.out.println("private method")
    }


}
class B extends  A{
    public static void main(String[] args){
        A a=new A();
        a.m1();
        B b=new B();
        b.m1();
        A a1=new B();
        a1.m1(); 
        a1.method();
       // a1.method2();
        //a.method2();
    }
}