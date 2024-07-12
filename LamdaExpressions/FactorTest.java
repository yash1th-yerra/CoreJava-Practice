import java.util.Scanner;
@FunctionalInterface
interface Test{
    boolean factortest(int n,int d);
}
public class FactorTest{
    public static void main(String[] args) {
        Test test = (n,d)->(n%d)==0;
        Scanner sc = new Scanner(System.in);
        if(test.factortest(sc.nextInt(),sc.nextInt())){
            System.out.println("Factor");
        }
        else{
            System.out.println("Not a Factor");
        }
    }
}