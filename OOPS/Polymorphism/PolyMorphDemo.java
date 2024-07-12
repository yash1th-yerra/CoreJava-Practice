class Parent {
    public void method() {
        System.out.println("Parent");
    }
    public String parent(String name){
        return name;
    }
}
class Child extends Parent {
    @Override public void method() {
        System.out.println("Child");
    }
    public int  parent(int age){
        return age;
    }
}
public class PolyMorphDemo {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child p2 = new Child();
        p1.method();
        p2.method();
        System.out.println("age  :" +p1.parent("parent"));
        System.out.println("Name :" +p2.parent(33));

    }
}