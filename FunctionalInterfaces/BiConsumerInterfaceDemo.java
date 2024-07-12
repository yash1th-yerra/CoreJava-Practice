import java.util.function.BiConsumer;
import java.util.List;
import java.util.ArrayList;
public class BiConsumerInterfaceDemo{
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(4);
        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        BiConsumer<List<Integer>,List<Integer>> equals = (x,y)->{
            if(l1.size()!=l2.size()) System.out.println("False");
            else{
                for(int i=0;i<l2.size();i++){
                    if(l1.get(i)!=l2.get(i)){System.out.println("False");
                    return;}
                }
                System.out.println("True");
            }
            
        };
        BiConsumer<List<Integer>,List<Integer>> disp = (x,y)->{
            l1.stream().forEach(n->System.out.print(n+" "));
            System.out.println();
            l2.stream().forEach(m->System.out.print(m+" "));
            System.out.println();
        };
        try{
            equals.andThen(disp).accept(l1,l2);       
        }
        catch(Exception e){
            e.getMessage();
        }
        
    }
}