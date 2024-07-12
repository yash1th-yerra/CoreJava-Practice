import java.util.*;
public class ReverseList {
    public static ArrayList<Integer> revList(ArrayList<Integer> list){
        ArrayList<Integer> revArrList = new ArrayList<Integer>();
        for(int i= list.size()-1;i>=0;i--){
            revArrList.add(list.get(i));
        }
        return revArrList;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        ArrayList<Integer> reverseList = revList(list);
        System.out.println(reverseList);

    }
}