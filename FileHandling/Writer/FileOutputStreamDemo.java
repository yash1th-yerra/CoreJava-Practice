import java.io.FileOutputStream;
public class FileOutputStreamDemo{
    public static void main(String[] args) {
        String text ="Hello welcome !";
        FileOutputStream outputStream = null;
        try{
            outputStream = new FileOutputStream("C://Users//DELL//Desktop//JAVA//FileHandling//newFile3.txt");
            byte[] strtoBytes = text.getBytes();
            outputStream.write(strtoBytes);
            System.out.println("File is Created with content Succesfully");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(outputStream!= null){
                try{
                    outputStream.close();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}