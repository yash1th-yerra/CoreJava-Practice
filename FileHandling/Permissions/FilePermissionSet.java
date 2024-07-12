import java.io.*;
public class FilePermissionSet{
    public static void main(String[] args) {
        File file = new File("C://Users//DELL//Desktop//JAVA//FileHandling//Files//NewFile.txt");
        if(file.exists()){
            file.setExecutable(true);
            file.setReadable(true);
            file.setWritable(false);
            System.out.println("can file Executable: "+file.canExecute());
            System.out.println("can file Readable: "+file.canRead());
            System.out.println("can file Writeable: "+file.canWrite());
        }
    }
}