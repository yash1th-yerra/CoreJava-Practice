import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
public class BufferedFileReader {
    public static void main(String[] args) throws Exception {
        File file = new File("C://Users//DELL//Desktop//JAVA//FileHandling//NewFile.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while((st=br.readLine())!=null){
            System.out.println(st);
        }
    }
}