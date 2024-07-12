//Converting ArrayList to String
import java.util.List;

import javax.swing.text.Style;

import java.util.ArrayList;
import java.util.Arrays;
public class ConvArrToStr1 {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("welcome");
        String [] str = new String[list.size()];
        for(int i= 0; i<list.size();i++){
            str[i] = list.get(i);
            
        }
        System.out.println("\n"+Arrays.toString(str));
        for(String s : str){
            System.out.println(s);
        }
        
    }
}