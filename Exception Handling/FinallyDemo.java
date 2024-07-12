public class FinallyDemo {
    public static void main(String[] args) {
        try {
            
            int i=Integer.parseInt("abc");

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("finally block");
        }
    }
}