 abstract class Car {
    public abstract void stop();
}
 class Honda extends Car {
    
    @Override public void stop() {
        System.out.println("Stop");

    }

}
public class AbstClass {
    public static void main(String[] args) {
        Car obj =new Honda();
        obj.stop();
    }
}