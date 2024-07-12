//FileNotFoundException
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileNotFoundExceptionDemo {
    public static void main(String[] args) {
        try{
            File file = new File("E://File.txt");
            FileReader fr =new FileReader(file);
            fr.close();

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}