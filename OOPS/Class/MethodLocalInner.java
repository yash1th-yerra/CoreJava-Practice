/* Method local Inner Class
 * 1.Inner class is kept inside the method of outer class and it is invoked in outer method 
 * 2.A non-Final variable in OuterClass can be accessed by inner class
 */


class Outer {
    void outerMethod () {
        System.out.println("Inside Outer Method");
        class Inner{
            void innerMethod(){
                System.out.println("Inner Method");
            }


        }
        Inner in = new Inner();
        in.innerMethod();
    }
}
public class MethodLocalInner {
    public static void main(String[] args) {
        Outer x = new Outer();
        x.outerMethod();
    }
}