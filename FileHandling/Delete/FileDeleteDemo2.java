import java.nio.file.*;
import java.io.*;
public class FileDeleteDemo2{
    public static void main(String[] args) {
        try{
            Files.deleteIfExists(Paths.get("C://Users//DELL//Desktop//JAVA//FileHandling//Files//newfile4txt"));

        }
        catch(NoSuchFileException e){
            e.printStackTrace();    
        }
        catch(DirectoryNotEmptyException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}