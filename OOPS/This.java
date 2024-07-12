class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person getName() {
        return this; // Return the current instance of the Person class
    }
}
public class This {
    public static void main(String[] args) {
        Person p=new Person("Yash");
        System.out.println((p).getName().toString());

    }
}