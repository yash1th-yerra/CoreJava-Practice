abstract class Wheels {
    public abstract void countWheels();
}
class Car extends Wheels {
    @Override
    public void countWheels() {
        System.out.println("Car has 4 wheels");
    }
}
class Bike extends Wheels {
    @Override
    public void countWheels() {
        System.out.println("Bike has two wheels");
    }
}
public class Vehicle{
    public static void main(String[] args) {
        Wheels obj1 = new Car();
        obj1.countWheels();
        Wheels obj2 = new Bike();
        obj2.countWheels();
    }
}