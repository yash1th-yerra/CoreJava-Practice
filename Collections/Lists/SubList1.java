import java.util.*;
public class SubList1 {
    public static void main(String[] args) throws Exception {
        try{
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            System.out.println("Original ArrayList: "+list);
            List<Integer> list2 = list.subList(1,4);
            System.out.println("\nSub-ArrayList:"+list2+"\n");

        }
        catch(IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch(IllegalArgumentException e){
            e.printStackTrace();
        }
        
    }
}