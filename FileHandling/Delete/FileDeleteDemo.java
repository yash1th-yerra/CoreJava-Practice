import java.io.*;
public class FileDeleteDemo{
    public static void main(String[] args) {
        File file = new File("C://Users//DELL//Desktop//JAVA//FileHandling//Files//newfile3.pdf");
        if(file.delete()){
            System.out.println("Delete success");
        }
        else{
            System.out.println("Delete not success");

        }
    }
}