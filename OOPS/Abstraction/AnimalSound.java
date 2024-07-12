abstract class Animal {
    public abstract void makeSound();
}
class Dog extends Animal {
    @Override public void makeSound(){
        System.out.println("Woof!");
    }
}
class Cat extends Animal {
    
    @Override public void makeSound(){
        System.out.println("Meow");
    }
}
public class AnimalSound {
    public static void main(String[] args) {
        Animal obj1=new Dog();
        obj1.makeSound();
        Animal obj2=new Cat();
        obj2.makeSound();
    }
}