import java.util.*;
public class LambdaSingleDemo{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.forEach(n->System.out.println(n));
        al.forEach(n->{if(n%2==0)System.out.println(n);});

    }
}