/*Dynamic Method Dispatch(MethodOVerriding)
when we call a overriden method through superclass reference java determines the method to be executed is based 
upon the object type that is calling the method but not reference type.
*/
class A {
    void example() {
        System.out.println("SuperClass");
    }
}
class B extends A {
    @Override void example() {
        System.out.println("ChildClass");

    }
}
public class DynMethDispatch {
    public static void main(String[] args) {
        A a = new B();
        a.example();
        A b = new A();
        b.example();
        B c = new B();
        c.example();
    }
}