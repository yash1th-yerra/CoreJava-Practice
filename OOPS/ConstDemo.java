class Base {
    int x;
    Base(int _x){
        x=_x;
    }
}
class Derived extends Base{
    int y;
    Derived(int _x,int _y){
        super(_x);
        y=_y;
    }
    void display(){
        System.out.println("X = "+x+",Y="+y); 
    }
}
public class ConstDemo {
    public static void main(String[] args) {
        Derived d=new Derived(10,20);  
        d.display();
    }
}