import java.io.*;
public class InstanceVariable {
    public String name;
    public int age;
    public InstanceVariable(){
        this.name="Yashwanth";
        this.age=21;
    }
    public static void main(String[] args) {
        InstanceVariable IV=new InstanceVariable();
        System.out.println("Name: "+IV.name);
        System.out.println("Age:"+IV.age);
    }
    
}
