//User-Defined Exception
class MyException extends Exception{
    public MyException(String str){
        super(str);
    }
}
public class UserDefinedException {
    public static void main(String[] args) {
        try{
            throw new MyException("yash");
        }
        catch(MyException e){
            System.out.println("caught");
            e.printStackTrace();

        }
    }
}