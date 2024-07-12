//allOf(EnumType.Type) - used to add enum types into EnumSet
//of()-used to get few enum types into enumset.
//complementOf()- used to get residual enum types into enumset from enum which are not inckluded in specified enumset.
//clone - used to create a shallow copy of enumset or collection that created using enum.



import java.util.*;
enum CARS{
    RANGE_ROVER,MUSTANG,CAMARO,FERRARI,AUDI,BMW
};
public class EnumSetDemo3{
    public static void main(String[] args) {
        EnumSet<CARS> e_set =null;
        System.out.println(e_set);
        e_set=EnumSet.of(CARS.RANGE_ROVER,CARS.AUDI,CARS.BMW);
        System.out.println(e_set);
        EnumSet<CARS> final_set = EnumSet.complementOf(e_set);
        System.out.println(final_set);
        Collection<CARS> list = new ArrayList<CARS>();
        list.add(CARS.MUSTANG);
        list.add(CARS.BMW);
        list.add(CARS.AUDI);
        System.out.println(list);
        EnumSet<CARS> copy_set = EnumSet.copyOf(list);
        System.out.println(copy_set);
        EnumSet<CARS> copy_set2 = EnumSet.copyOf(e_set);
        System.out.println(copy_set2);
        EnumSet<CARS> e_set3 = EnumSet.allOf(CARS.class);
        System.out.println(e_set3);
        EnumSet<CARS> e_set4 = EnumSet.noneOf(CARS.class);
        System.out.println(e_set4);
        EnumSet e_set5 = EnumSet.range(CARS.MUSTANG,CARS.FERRARI);
        System.out.println(e_set5);
    }
}