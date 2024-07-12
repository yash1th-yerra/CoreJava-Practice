class Bicycle {
    public int gear,speed;
    public Bicycle(int gear,int speed){
        this.gear = gear;
        this.speed = speed;
    }
    public void applybreak(int decrement) {
        speed -= decrement;
    }
    public void accelerate(int increment) {
        speed +=increment;
    }
    public String toString() {
        return ("Gear : "+gear+" Speed : "+speed) ;
    }
    
}
class Motorbike extends Bicycle {
    public int seatheight;
    public Motorbike(int gear,int speed,int startheight) {
        super(gear,speed);
        seatheight = startheight;
    }
    public void setHeight(int height) {
        seatheight = height;
    }
    @Override public String toString() {
        return(super.toString()+" Seatheight : "+seatheight);
    }
}
public class BicycleInherit {
    public static void main(String[] args) {
        Motorbike mb = new Motorbike(3,10,5);
        System.out.println("Mountain Bike Details: "+mb.toString());
    }
}