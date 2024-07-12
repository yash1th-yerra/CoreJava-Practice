import java.io.BufferedWriter;
import java.io.FileWriter;
public class BufferedWriterDemo{
    public static void main(String[] args) {
        String text = "Hello This is Yashwanth";
        try{
            BufferedWriter bw  = new BufferedWriter(new FileWriter("C://Users//DELL//Desktop//JAVA//FileHandling//newFile3.txt"));
            bw.write(text);
            System.out.println("File is Created Successfully with Content");
            //System.out.println(text);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}