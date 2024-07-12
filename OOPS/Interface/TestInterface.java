interface vehicle {
    void changeGear(int a);
    void speedUp(int b);
    void applyBrake(int c);
}
class Bicycle implements vehicle {
    int gear;
    int speed;
    @Override public void changeGear(int newGear){
        gear=newGear;

    }
    @Override public void speedUp(int increment){
        speed+=increment;
    }
    @Override public void applyBrake(int decrement){
        speed-=decrement;

    }
    public void printStates(){
        System.out.println("speed:"+speed+" gear:"+gear);
    }
}
class Bike implements vehicle{
    int speed;
    int gear;
    @Override public void changeGear(int newGear){
        gear=newGear;

    }
   @Override public void speedUp(int increment){
        speed+=increment;
    }
    @Override public void applyBrake(int decrement){
        speed-=decrement;

    }
    public void printStates(){
        System.out.println("speed:"+speed+" gear:"+gear);
    }
}
public class TestInterface{
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrake(1);
        
        System.out.println("Bicycle present state :");
        bicycle.printStates();
         
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrake(3);
         
        System.out.println("Bike present state :");
        bike.printStates();

        
    }
}