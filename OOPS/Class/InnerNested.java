/* inner nested class
 * 1.all private instance variables of outer class are accessible by inner class
 * 2.we cannot define a static method for inner class as it is implicitly associated with the object of outer 
 * class
 */


class outer {
    private int x=10;
    class inner{
        void show() {
            System.out.println("inner");
            System.out.println(x);
        }
    }
}
public class InnerNested {
    public static void main(String[] args) {
        outer.inner in = new outer().new inner();
        in.show();
    }
}

/*class outer {
    private int x=10;
    class inner{
        public static void show() {
            System.out.println("inner");
            System.out.println(x);
        }
    }
}*///it will leads to an error because static method can't be defined to a nested inner class