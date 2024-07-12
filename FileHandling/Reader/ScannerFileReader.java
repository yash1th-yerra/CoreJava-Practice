import java.util.Scanner;
import java.io.File;
public class ScannerFileReader{
    public static void main(String[] args)throws Exception {
        File file = new File("C://Users//DELL//Desktop//JAVA//FileHandling//NewFile.txt");
        Scanner sc = new Scanner(file);
        /*while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }*/
        sc.useDelimiter("//Z");// without using loops
        
        System.out.println(sc.next());
        
    }
}