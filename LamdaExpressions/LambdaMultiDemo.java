public class LambdaMultiDemo{
    interface FuncInter1{
        int operation(int a,int b);
    }
    private static int operate(int a ,int b,FuncInter1 fobj){
        return fobj.operation(a,b);
    }
    public static void main(String[] args) {
        FuncInter1 add = (x,y) -> x+y;
        FuncInter1 Multiply = ( x,y) -> x*y;
        System.out.println("addition is "+operate(1,2,add));
        System.out.println("multiplication is "+operate(1,2,Multiply));
    }
}