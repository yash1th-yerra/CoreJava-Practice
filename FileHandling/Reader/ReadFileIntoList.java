import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class ReadFileIntoList{
    public static List<String> readFileInList(String filename){
        List<String> lines = Collections.emptyList();
        try{
            lines = Files.readAllLines(Paths.get(filename),StandardCharsets.UTF_8);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return lines;
    }
    public static void main(String[] args){
        List l = readFileInList("C://Users//DELL//Desktop//JAVA//FileHandling//NewFile.txt");
        Iterator itr = l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}