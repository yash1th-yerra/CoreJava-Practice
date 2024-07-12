/* Private Constructors and Singleton Classes
 * singleton class = class having single object 
 * it can be achieved through defining a constructor private 
 * so the  way to get isntance of that class is by using class member instance and factory method as shown below
 */
class MySingleton {
    static MySingleton instance = null;
    private MySingleton() {

    }
    public static MySingleton getInstance() {
        if(instance ==null)
        return new MySingleton();
        else
        return instance;
    }

}
public class SingletonDemo2 {
    public static void main(String[] args) {
        MySingleton a = MySingleton.getInstance();
        System.out.println("Object created");
    }
}