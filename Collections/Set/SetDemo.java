import java.util.*;
enum demo{CODE,LEARN,PRACTICE,IMPLEMENT};
public class SetDemo{
    public static void main(String[] args) {
        Set <String> set = new HashSet<String>();
        set.add("Geeks");
        set.add("for");
        set.add("Geeks");
        set.add("set");
        set.add("Example");
        System.out.println(set);
        Set<Integer> set1 = new HashSet<>();
        for(int i=1;i<=5;i++){
            set1.add(i);
        }
        System.out.println("Set1: "+set1);
        Set<Integer> set2 = new HashSet<>();
        for(int i=3;i<=8;i++){
            set2.add(i);
        }
        System.out.println("Set2: "+set2);
        Set<Integer> union = new HashSet<Integer>(set1);
        union.addAll(set2);
        System.out.println("Union: "+union);
        Set<Integer> intersection = new HashSet<Integer>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: "+intersection);
        Set<Integer> diff = new HashSet<>(set1);
        diff.removeAll(set2);
        System.out.println("Difference : "+diff);
        Iterator<String> it = set.iterator();
        System.out.println("Set Elements:");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("\n"+set.size()+"\tElements in the Set.");
        Set<demo> set3 = EnumSet.of(demo.CODE,demo.PRACTICE,demo.IMPLEMENT,demo.LEARN);
        System.out.println("Set3 :"+set3);

    }
}