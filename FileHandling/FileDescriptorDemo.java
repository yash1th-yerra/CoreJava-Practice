import java.io.*;
public class FileDescriptorDemo{
    public static void main(String[] args)throws IOException  {
        FileDescriptor fd = null;
        FileOutputStream fs = null;
        byte[] buffer = {71,69,69,75,83};
        try{
            fs = new FileOutputStream("C://Users//DELL//Desktop//JAVA//FileHandling//Files//newFile3.txt");
            fd = fs.getFD();
            fs.write(buffer);
            fd.sync();
            System.out.println("FileDescriptor is valid : "+fd.valid());
            System.out.println("Use of Sync is Successfull");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(fs!= null){
                fs.close();
            }
        }

        
    }
}