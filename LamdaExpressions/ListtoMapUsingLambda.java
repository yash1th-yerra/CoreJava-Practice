import java.util.*;
class ListItems{
    private Integer key;
    private String value;
    public ListItems(Integer id,String name){
        this.key = id;
        this.value = name;
    }
    public Integer getKey(){
        return this.key;
    }
    public String getValue(){
        return this.value;
    }
}
public class ListtoMapUsingLambda{
    public static void main(String[] args) {
        List<ListItems> list = new ArrayList<ListItems>();
        list.add(new ListItems(1,"Sachin"));
        list.add(new ListItems(2,"Kohli"));
        list.add(new ListItems(3,"Dhoni"));
        list.add(new ListItems(5,"Rohit"));
        list.add(new ListItems(4,"Raina"));
        Map<Integer,String> map= new HashMap<>();
        list.forEach(n->{map.put(n.getKey(),n.getValue());});
        System.out.println(map);
    }
}