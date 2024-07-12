import java.util.*;
import java.util.function.Consumer;
public class ConsumerInterfaceDemo{
    public static void main(String[] args) {
        Consumer<Integer> display = a -> System.out.println(a);
        display.accept(2);//accept method will perform the operation on argument assigned to consumer type variable.
        Consumer<List<Integer>> modify = list->{//sending list as argument
            for(int i=0;i<list.size();i++)
            list.set(i,2*list.get(i));
        };
        Consumer <List<Integer>> dispList = list ->list.stream().forEach(a->System.out.print(a+" "));
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        try{
            modify.andThen(dispList).accept(list);//it will return consumer composedly as we are using extra method
        }
        catch(Exception e){
            e.printStackTrace();//if any exception occurs in any it will relay on caller of consumer i.e., accept
        }
        
        //dispList.accept(list);
    }
}