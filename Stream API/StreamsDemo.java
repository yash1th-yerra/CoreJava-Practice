 import java.util.*;
 public class StreamsDemo{
    public static void main(String[] args) {
        List<String> companyList = new ArrayList<>();
        companyList.add("Google");
        companyList.add("Microoft");
        companyList.add("Infosys");
        companyList.add("TCS");
        companyList.stream().sorted().forEach(System.out::println);
        
        

    }
    
}