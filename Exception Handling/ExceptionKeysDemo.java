// try,catch,throw,throws,finally
//try is keyword used to execute a block of statements where you think an exception will occur
//catch is block of code that handles the uncertain condition of try block
//throw is a keyword which transfers control from try block to catch block
//throws is a keyword which is used to handle exception without try and catch blocks
//finally is block of code which is to be executed irrespective of whether an exception occurs or not 
//Examples Below
public class ExceptionKeysDemo {
    static void method() throws IllegalAccessException {
        System.out.println("Inside Method");
        throw new IllegalAccessException();
    }
    public static void main(String[] args) {
        try{
            method();
        }
        catch(IllegalAccessException e){
            e.printStackTrace();
        }
    }

}