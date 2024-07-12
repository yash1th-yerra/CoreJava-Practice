import java.util.*;
enum demo{CODE,LEARN,PRACTICE,IMPLEMENT};
public class EnumSetDemo{
    public static void main(String[] args) {
        Set<demo> set = EnumSet.of(demo.CODE,demo.PRACTICE,demo.IMPLEMENT,demo.LEARN);
        System.out.println("Set3 :"+set);

    }
}