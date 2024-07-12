import java.util.function.Supplier;
public class SupplierInterfaceDemo{
    public static void main(String[] args) {
        Supplier<Integer> coin = ()->(int)Math.random();
        for(int i=0;i<5;i++){
            System.out.println(coin.get());
        }
    }
}