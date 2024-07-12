
import java.util.*;
public class ListInterface {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //adding elements
        System.out.println(list);
        list.add(4,5);//adding at position
        System.out.println(list);
        list.set(4,1);//updating at position
        System.out.println(list);
        int index = list.indexOf(1);//Searching of elements
        System.out.println(index);
        index = list.lastIndexOf(1);//Searching of duplicate element
        System.out.println(index);
        list.remove(4);//removing an element(integer-index,String- object)
        System.out.println(list);
        System.out.println(list.get(3));//accessing an element
        System.out.println(list.contains(4));//check elements is present or not using contains method
        for(Integer i : list){//iterating over a list
            System.out.println(i);
        }
        Iterator<Integer> iter = list.iterator();
        System.out.println("iterating over a list using iterator interface");
        while(iter.hasNext()){//Iterating over a list using iterator interface
            int x = (Integer)iter.next();
            if(x<3){
                iter.remove();
            }
        }
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.equals(4));


    }
}