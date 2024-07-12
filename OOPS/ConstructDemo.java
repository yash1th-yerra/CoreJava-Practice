class Complex {
    private double re,im;
    public Complex(double re,double im){
        this.re=re;
        this.im=im;
    }
    public Complex(Complex c){
        re=c.re;
        im=c.im;
    }
    @Override public String toString(){
        return "("+re+"+"+im+"i)";
    }
}
public class ConstructDemo {
    public static void main(String[] args) {
        Complex c1=new Complex(10,20);
        Complex c2=new Complex(c1);
        System.out.println("Original complex number: "+c2); //prints (10
    }
}