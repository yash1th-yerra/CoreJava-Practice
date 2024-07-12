class Person {
    private String name;
    private int age;
    // getters and setters omitted for brevity
    public void setInfo(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class EncapDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setInfo("yashwanth",21);
        System.out.println("Name: " +p1.getName());
        System.out.println("Age : " +p1.getAge());
    }
}