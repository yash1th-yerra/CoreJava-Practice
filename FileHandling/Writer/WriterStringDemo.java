import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
public class WriterStringDemo{
    public static void main(String[] args) throws IOException {
        String text = "Hello,This is Yashwanth\nHow are you? ";
        Path path = Path.of("C://Users//DELL//Desktop//JAVA//FileHandling//newFile2.txt");
        Files.writeString(path,text);
        String file_content = Files.readString(path);
        System.out.println(file_content);
        
    }
}