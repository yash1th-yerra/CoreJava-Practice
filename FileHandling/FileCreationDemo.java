import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class FileCreationDemo{
    public static void main(String[] args) {
        FileCreationDemo obj  = new FileCreationDemo();
        obj.newFile();
    }
    public void newFile(){
        String name="",path = "";
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter File Name:");
            name = br.readLine();
            System.out.println("Enter path :");
            path = br.readLine();
            File file = new File(path+""+name+".txt");
            file.createNewFile();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}