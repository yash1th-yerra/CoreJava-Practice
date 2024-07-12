//ClassNotFoundException
public class ClassNotFoundExceptionDemo {
    public static void main(String[] args) {
        try{
            Class.forName("class1");

        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}