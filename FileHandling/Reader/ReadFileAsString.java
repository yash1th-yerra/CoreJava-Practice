import java.io.*;
import java.nio.file.*;
public class ReadFileAsString{
    public static String readFileAsString(String filename) throws Exception{
        String data= "";
        data = new String(Files.readAllBytes(Paths.get(filename)));
        return data;
    }
    public static void main(String[] args)throws Exception{
        String data = readFileAsString("C://Users//DELL//Desktop//JAVA//FileHandling//NewFile.txt");
        System.out.println(data);
    }
}