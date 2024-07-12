abstract class Shape {
    String color;
    abstract double area();
    public abstract String toString();
    public Shape (String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}
class Circle extends Shape {
    public double radius;
    public Circle(String color,double radius){
        super(color);
        this.radius = radius;
    }
    @Override double area(){
        return Math.PI*Math.pow(radius,2);
    }
    @Override public String toString(){
        return("circle color : "+super.getColor()+" \nArea : "+area());
    }
}
class Rectangle extends Shape {
    public int length,width;
    public Rectangle(String color,int length,int width){
        super(color);
        this.length = length;
        this.width = width;
    }
        @Override double area(){
            return length*width;
        }
        @Override  public String toString(){
            return("rectangle color : "+super.getColor()+"\nArea : "+area());
        }
    
}
public class AreaAbstract {
    public static void main(String[] args) {
        Shape s1 = new Circle("red",7);
        Shape s2 = new Rectangle("blue",5,5);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}