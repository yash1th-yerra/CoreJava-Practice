//UserDefinedException
public class MyException extends Exception {
    private static int accno[] = {1001,1002,1003,1004};
    private static String name[] = {"yash","akhil","koushik","yatwik"};
    private static double bal[] = {10000.00, 12000.00, 5600.0, 999.00};
    MyException() {

    }
    MyException(String s){
        super(s);
    }
    public static void main(String[] args) {
        try {
            System.out.println("Account"+"/t"+"Customer"+"/t"+"Balance");
            for (int i = 0; i<5 ; i++)
            {
                System.out.println(accno[i] + "\t" + name[i] +"\t" + bal[i]);
                                               
            
                if(bal[i] < 1000){
                    MyException me = new MyException("Less Balance");
                    throw me;
                }
            }
        }
        catch(MyException e){
            e.printStackTrace();
        }
    }
}