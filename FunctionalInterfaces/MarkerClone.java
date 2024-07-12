import java.lang.Cloneable;
class A implements Cloneable{
    int i;
    String s;
    public A(int i,String s){
        this.i = i;
        this.s = s;
    }
    @Override protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class MarkerClone {
    public static void main(String[] args)throws CloneNotSupportedException {
        A a = new A(10,"Welcome");
        A b = (A)a.clone();
        System.out.println(a.i+" "+a.s+" "+b.i+" "+b.s);
    }
}