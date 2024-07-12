//Lambda expressions and parameters demo 
interface FuncInterface{
    void abstractFunc(int x);
    

    default void normalFun(){
        System.out.println("Non abstract method");
    }
}
interface FuncInterface2{
    
    void abstractFunc();
}
interface FuncInterface3{

    void abstractFunc(int x, int y);
}

public class LambdaDemo1{
    public static void main(String[] args) {
        FuncInterface fobj = (int x)/*parameter as object functionality*/  ->/*token  */  System.out.println(2*x)/*function */;
        FuncInterface2 fobj2 = ()/*parameter as object functionality*/  ->/*token  */  System.out.println("Zero parameter")/*function */;
        FuncInterface3 fobj3 = (int x,int y)/*parameter as object functionality*/  ->/*token  */  System.out.println((x+y)+" multi parameter")/*function */;

        fobj.abstractFunc(2);
        fobj2.abstractFunc();
        fobj3.abstractFunc(2,3);
    }
}