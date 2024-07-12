import java.io.*;
public class FilePermissionCheck{
    public static void main(String[] args) {
        File file = new File("C://Users//DELL//Desktop//JAVA//FileHandling//Files//NewFile.txt");
        if(file.exists()){
            System.out.println("Can file Executable: "+file.canExecute());
            System.out.println("Can file writeable: "+file.canRead());
            System.out.println("Can file Readable: "+file.canWrite());
        }
    }
}