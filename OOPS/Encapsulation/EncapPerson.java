class Person {
    private int age;
    private String name;
    public void setAge(int a) {
        this.age=a;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
public class EncapPerson {
    public static void main(String[] args) {
        Person person =new Person();
        person.setName("Yashwanth");
        person.setAge(21);
        System.out.println("name:"+person.getName()+" Age:"+person.getAge());
    }
}