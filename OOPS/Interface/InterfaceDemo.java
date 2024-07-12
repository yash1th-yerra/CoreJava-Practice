interface Vehicle {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
class Bicycle implements Vehicle {
    int gear;
    int speed;
    @Override public void changeGear(int a){
        gear = a;
    }
    @Override public void speedUp(int a ){
        speed += a;
    }
    @Override public void applyBrakes(int a){
        speed -= a;
    }
    public void printStates(){
        System.out.println("Speed :"+speed+" gear : "+gear);
    }
}
class Bike implements Vehicle {
    int gear;
    int speed;
    @Override public void changeGear(int a){
        gear = a;
    }
    @Override public void speedUp(int a){
        speed += a;
    }
    @Override public void applyBrakes(int a){
        speed -=a;
    }
    public void printStates(){
        System.out.println("Speed :"+speed+" gear : "+gear);
    }
    
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        Bike bk = new Bike();
        b.changeGear(4);
        b.speedUp(40);
        b.applyBrakes(10);
        b.printStates();
        bk.changeGear(4);
        bk.speedUp(40);
        bk.applyBrakes(10);
        bk.printStates();

    }
}