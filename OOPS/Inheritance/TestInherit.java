class Bicycle {
    public int gear;
    public int speed;
    public Bicycle(int gear,int speed){
        this.gear=gear;
        this.speed=speed;
    }
    public void applyBreak(int decrement){
        speed-=decrement;
    }
    public void accelerate(int increment){
        speed+=increment;
    }
    public String toString(){
        return ("no.of gears: "+gear+" speed of bicycle:"+speed);
    }
}
class MountainBike extends Bicycle {
    public int seatHeight;
    public MountainBike(int gear,int speed,int seatHeight) {
        super(gear,speed);
        this.seatHeight = seatHeight;
    }
    public void setHeight(int newValue){
        seatHeight=newValue;
    }
    @Override public String toString(){
        return(super.toString()+" seat height is "+seatHeight);
    }
}
public class TestInherit {
    public static void main(String[] args) {
        MountainBike mb= new MountainBike(3,80,25);
        System.out.println(mb.toString());
    }
}