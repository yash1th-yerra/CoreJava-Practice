import java.io.FileWriter;
//import java.io.BufferedReader;
//import java.io.FileReader;
public class FileWriterDemo{
    public static void main(String[] args) {
        String text = "Hello this is yashwanth\nHow are you?";
        try{
            FileWriter fwriter = new FileWriter("C://Users//DELL//Desktop//JAVA//FileHandling//newFile2.txt");
            fwriter.write(text);
            fwriter.close();
            System.out.println("File is created succesfully with content");
           // BufferedReader br = new BufferedReader(new FileReader("C://Users//DELL//Desktop//JAVA//FileHandling//newFile2.txt"));
            //String st;
           // while((st=br.readLine())!=null)
                //System.out.println(st);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}