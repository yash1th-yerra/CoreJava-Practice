class outer {
    private static void outerMethod() {
        System.out.println("outermethod");
    }
    static class inner {
        public static void display(){
            System.out.println("display");
            outerMethod();
        }
    }
}
public class NestedStatic {
    public static void main(String[] args) {
        outer.inner.display();
    }
}