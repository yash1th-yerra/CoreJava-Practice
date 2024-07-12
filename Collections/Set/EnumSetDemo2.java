import java.util.*;
enum CARS{
    RANGE_ROVER,MUSTANG,CAMARO,FERRARI,AUDI,BMW
};
public class EnumSetDemo2{
    public static void main(String[] args) {
        EnumSet<CARS> e_set =null;
        System.out.println(e_set);
        e_set=EnumSet.allOf(CARS.class);
        System.out.println(e_set);
    }
}