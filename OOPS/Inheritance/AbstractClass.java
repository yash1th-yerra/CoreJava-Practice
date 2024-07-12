abstract class Shape {
    private String color;
    abstract double area();
    public abstract String toString();
    public Shape(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
}
class Circle extends Shape {
    double radius;
    public Circle(String color,Double radius){
        super(color);
        this.radius=radius;
    }
    @Override public double area(){
        return("Area of circle is "+Math.PI*this.radius*this.radius);
    }
    @Override public String toString(){
        return "Circle with Color:"+super.getColor()+"area :"+area();
    }
}
public class AbstractClass {
    public static void main(String[] args)
    {
        Shape s1 = new Circle("Red", 2.2);
        System.out.println(s1.toString());
    }
}