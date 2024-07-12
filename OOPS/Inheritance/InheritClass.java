class Shape {
     protected double length;
     protected double width;
     public Shape(double length,double width){
        this.length=length;
        this.width=width;
     }
     public double calculateArea(){
        return length*width;
     }
}
class Rectangle extends Shape {
    public Rectangle(double length,double width){
        super(length,width);
    }
}
class Square extends Shape {
    public Square(double side) {
        super(side,side);
}
}
public class InheritClass{
    public static void main(String[] args) {
        Rectangle rct=new Rectangle(5,10);
        Square sqr=new Square(5);
        System.out.println("Rectangle Area:"+rct.calculateArea());
        System.out.println("Square area:"+sqr.calculateArea());
    }
}