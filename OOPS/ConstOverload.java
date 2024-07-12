/*  Constructor Overloading  */
class Box {
    double length,width,height;
    Box(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    Box(){ length = width = height = 0;}
    Box(int l){
        length = width = height = l;
    }
    double volume() {
        return length*width*height;
    }
}
public class ConstOverload {
    public static void main(String[] args) {
        Box b1 = new Box(10,12,11);
        Box b2 = new Box();
        Box b3 = new Box(7);
        System.out.println("Volume of box B1 is: "+b1.volume());
        System.out.println("Volume of box B2 is: "+b2.volume());
        System.out.println("Volume of box B3 is: "+b3.volume());
    }
}