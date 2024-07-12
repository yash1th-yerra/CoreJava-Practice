class Car {
    public String wheelStatus;
    public int noOfWheels;
    public Car(String wheelStatus,int noOfWheels){
        this.wheelStatus = wheelStatus;
        this.noOfWheels = noOfWheels;
    }
    public void applyBreak(){
        wheelStatus="stop";
        System.out.println("Stop the car using break");

    }
    public String toString(){
        return ("NO.of wheels:"+this.noOfWheels+", wheelstatus:"+this.wheelStatus);
    }
}
class Honda extends Car {
    public boolean alloyWheel;
    public Honda(String wheelStatus,int noOfWheels,boolean alloyWheel ){
        super(wheelStatus,noOfWheels);
        this.alloyWheel=alloyWheel;
    }
    public void setAlloyWheel(Boolean aWheel)
    {
        alloyWheel = aWheel;
    }
    @Override public String toString(){
        return ("Honda ,"+super.toString()+", car alloy wheel:"+alloyWheel);
    }
}
public class InheritCar{
    public static void main(String[] args) {
        Honda honda=new Honda("Stop",4,true);
        System.out.println(honda.toString());
    }
}