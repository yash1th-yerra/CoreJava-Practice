import java.io.*;
public class FileReaderDemo{
    public static void main(String[] args)throws Exception {
        FileReader fr = new FileReader("C://Users//DELL//Desktop//JAVA//FileHandling//NewFile.txt");
        int i;
        while((i=fr.read())!=-1){
            System.out.print(i+",");
        }
    }
}