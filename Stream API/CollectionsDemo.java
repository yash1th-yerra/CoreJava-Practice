 import java.util.*;
 public class CollectionsDemo{
    public static void main(String[] args) {
        List<String> companyList = new ArrayList<>();
        companyList.add("Google");
        companyList.add("MicroSoft");
        companyList.add("Infosys");
        companyList.add("TCS");
        Comparator<String> com = (String o1,String o2)->o1.compareTo(o2);
        Collections.sort(companyList,com);
        for(String name:companyList){
            System.out.println(name+" ");
        }

    }
    
}