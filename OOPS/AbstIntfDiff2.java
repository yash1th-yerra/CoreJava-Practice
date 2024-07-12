interface class Shape {

    abstract public double area();
    abstract public void draw();
}
class Circle extends Shape {
   final double PI = 3.14;
   int radius;
    String name;
    Circle(int radius,String name){
        this.name = name;
        this.radius = radius;
    }
    public void moveTo(int x,int y){
        System.out.println(this.name+" has been moved to x:"+x+" and y:"+y);
    }
   @Override public double area(){
    return (PI*radius*radius);
   }
   @Override public void draw(){
    System.out.println("Circle is drawn");
   }

}
class Rectangle extends Shape {
    int length,width;
    String name;
    Rectangle(int length,int width,String name){
        this.name = name;
        this.length = length;
        this.width = width;
    }
    public void moveTo(int x,int y){
        System.out.println(this.name+" has been moved to x:"+x+" and y:"+y);
    }

    @Override public double area(){
        return length*width;
    }
    @Override public void draw(){
        System.out.println("Rectangle is drawn");
    }
}
public class AbstIntfDiff {
    public static void main(String[] args) {
        Shape r = new Rectangle(2,3,"Rectangle");
        r.draw();
        System.out.println("area : "+r.area());
        r.moveTo(2,4);
        
        Shape c = new Circle(7,"Circle");
        c.draw();
        System.out.println("area : "+c.area());
        c.moveTo(3,5);

    }
}