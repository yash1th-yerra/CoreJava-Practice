/*      SingleTon classes     
 * In Java,A class is said to be singleton if it can have only one class
 * make constructor private 
 * static method that has return type object of this singleton class(lazy Intializtion is used in static method)
 * multiple reference variables calling singleton class static method will return the reference of existing 
 * object in memory which is created at first call(i.e instatiation).
 */
class MySingleton {
    private static MySingleton instance ;
    private String name;
    private MySingleton(String name) {
        this.name  = name;
    }
    public static MySingleton getInstance() {
        if(instance ==null)
        return new MySingleton("Romeo");
        else
        return instance;
    }
    public String getName(){
        return name;
    }


}
public class SingletonDemo3 {
    public static void main(String[] args) {
        MySingleton a = MySingleton.getInstance();
        System.out.println("Object created");
        System.out.println(a.getName());
    }
}