import java.util.function.Predicate;
import java.util.*;
class User{
    String name,role;
    User(String name,String role){
        this.name = name;
        this.role = role;
    }
    String getName(){
        return this.name;
    }
    String getRole(){
        return this.role;
    }
    public String toString(){
        return "UserName: "+name+" Role: "+role;
    }
}
public class PredicateCollectionDemo{
    public static void main(String[] args) {
        List<User> users =  new ArrayList<User>();
        users.add(new User("John","admin"));
        users.add(new User("Peter","admin"));
        
        List admins = process(users,(u)-> u.getRole().equals("admin"));
        System.out.println(admins);
    }
    public static List<User> process(List<User> users,Predicate<User> predicate){
        List<User> result = new ArrayList<User>();
        for(User user:users){
            if(predicate.test(user)){
                result.add(user);
            }
            
        }
        return result;
    }
}