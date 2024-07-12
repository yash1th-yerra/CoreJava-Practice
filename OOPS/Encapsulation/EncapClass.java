class Car {
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}
public class EncapClass {
    public static void main(String[] args) {
        Car car=new Car();
        car.setName("BMW");
        System.out.println("Car name:"+car.getName());
    }
}