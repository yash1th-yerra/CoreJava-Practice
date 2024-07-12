public class Rectangle {
    double l,b;
    double area(){
        return l*b;
    }
    public static void main(String[] args) {
        Rectangle rect1=new Rectangle();
        Rectangle rect2=new Rectangle();
        rect1.l=10;
        rect1.b=20;
        System.out.println("Area of rectangle 1 is "+rect1.area());
        rect2.l=30;
        rect2.b=40;
        System.out.println("Area of rectangle 2 is "+rect2.area());

    }
}