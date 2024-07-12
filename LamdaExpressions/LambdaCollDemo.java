import java.util.*;
public class LambdaCollDEmo{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(2);
        al.add(4);
        al.add(3);
        al.add(1);
        Collections.sort(al,((o1,o2)->(o1>o2)?1:(o1<o2)?-1:0));
        System.out.println(al);
    }
}