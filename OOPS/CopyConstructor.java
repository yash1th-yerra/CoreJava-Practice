/*     Copy constructor
 * define a class.
 * define instance variables.
 * define a constructor that takes same instance of object as argument.
 * intialize the instance variables from the values of argument object.
 * use this keyword for instance variables.
 * implement deep copying of constructor(create a new instance of object to intialize the instance of objects if argument object has null values for instance variables)
 */
class  Person {
    private int age;
    private String name;
    Person(int age,String name) {
        this.age = age;
        this.name = name;
    }
    Person(Person obj){
        
        this(obj.age,obj.name);
        System.out.println("copy Constructor");        
    }
    @Override public String toString(){
        return "Age: "+this.age+" Name:"+this.name ;
    }

}
public class CopyConstructor {
    public static void main(String[] args) {
        Person p = new Person(21,"Yashwanth");
        Person p2 = new Person(p);
        System.out.println(p2);

    }
}