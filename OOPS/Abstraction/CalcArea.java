import java.lang.Math;
abstract class Area {
    public abstract double calculateArea();
}
class Circle extends Area {
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateArea(){
        return (Math.PI * this.radius * this.radius);
    }
}
class Rectangle extends Area {
    private int length, breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public double calculateArea() {
        return (this.length * this.breadth);
    }
}
class Square extends Area {
    private int side;
    public Square(int side) {
        this.side=side;
    }
    @Override
    public double calculateArea(){
        return Math.pow((this.side),2);
    }
}
public class CalcArea {
    public static void main(String[] args) {
        Area obj1 = new Circle(7); 
        Area obj2 = new Rectangle(5,10);
        Area obj3 = new Square(5);
        System.out.println("Area of circle:"+obj1.calculateArea());    
        System.out.println("Area of reactangle:"+obj2.calculateArea());
        System.out.println("Area of square:"+obj3.calculateArea());    
    }
}