/*Inner Class(Nested Inner Class) */
//nested inner class{It can access private instance variables of outer method,we can't define static methods in inner class as it is implicitly associated with outer class
//so inner class can't create a method for itself as it can be invoked through outer class object}
class Outer{
    public void show(){
        System.out.println("Anonymous class called");
    }
    class Inner{
        public void show(){
            System.out.println("Hello from inner");
        }
    }
//      Method local class
// method local inner classes{these classes can't use local variable of outer class until it is not declared as final}
    public void outerMethod(){
        System.out.println("OuterMethod");
        class MethodClass {
            void innerMethod(){System.out.println("innerclass of outer method");}
        }
        MethodClass mc = new MethodClass();
        mc.innerMethod();
        
    }
//      Static nested class
//basically these are not class but they are static members of outer class
     static class Inner2{
        public static void display(){
            System.out.println("Static Nested Inner-display()");
        } 
     }
     

}
//       Anonymous class
// these acts like innerclass
class OuterChild {
    static OuterChild oc = new OuterChild();
    void show(){
        super.show();
        System.out.println("Anonymousclass");
    }
}
public class InnerClassDemo1 {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.show();
        Outer oc = new Outer();
        oc.outerMethod();
        Outer.Inner2.display();
        oc.show();
    }
}