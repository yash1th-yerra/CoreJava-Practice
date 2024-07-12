 class MyClass {
    private int value;

    // Default constructor
    public MyClass() {
        System.out.println("Default constructor");
    }

    // Parameterized constructor
    public MyClass(int value) {
        System.out.println("Parameterized constructor");
        this.value = value;
    }
}
public class ConstructOverload {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(); // Implicitly calls the default constructor
        MyClass obj2 = new MyClass(10); // Implicitly calls the default constructor, then the parameterized constructor
    }
}
