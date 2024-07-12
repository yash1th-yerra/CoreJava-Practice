public class Circle {
    private double radius;
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double calculateArea(){
        return (Math.PI * radius * radius);
    }
}
class Main {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.setRadius(7);
        System.out.println("The Area of the circle having radius "+c.getRadius()+" is "+c.calculateArea());
    }
}