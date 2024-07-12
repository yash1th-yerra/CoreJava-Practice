import java.util.*;
class NameAdd{
    String name ="";
    public int count = 0;
    public void geekName(String geek,List<String> list){
        synchronized(this){
            this.name = geek;
            count++;
        }
        list.add(name);
    }
}
public class SyncBlockDemo{
    public static void main(String[] args) {
       NameAdd obj = new NameAdd();
       List<String> list  = new ArrayList<>();
       obj.geekName("Yash",list);
       obj.geekName("Yash1th",list);
       System.out.println(obj.name);
        
    }
}