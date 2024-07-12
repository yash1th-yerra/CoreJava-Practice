import java.util.*;
public class RevListCollecs {
   /*public static ArrayList<Integer> revList(ArrayList<Integer> list){
        for(int i=0;i<list.size()/2;i++){
            Integer temp = list.get(i);
            System.out.println(temp);
            list.set(i,list.get((list.size()-1-i)));
            System.out.println(list);
            list.set(list.size()-1-i,temp);
            System.out.println(list);
            
        }
        return list;
    }*/
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("after reverse")
        ;System.out.println(list);

    }
}