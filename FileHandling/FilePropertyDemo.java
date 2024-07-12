import java.io.File;
public class FilePropertyDemo{
    public static void main(String[] args) {
        String fname = "xyz.txt";
        File f = new File(fname);
        System.out.println("File name: "+f.getName());
        System.out.println("File path: "+f.getPath());
        System.out.println("File absolute path: "+f.getAbsolutePath());
        System.out.println("File parent: "+f.getParent());
        System.out.println("File existence: "+f.exists());
        if(f.exists()){
            System.out.println("Is writable:"+f.canWrite());
            System.out.println("Is readable:"+f.canRead());
            System.out.println("Is a Directory: "+f.isDirectory());
            System.out.println("File length:"+f.length());
            String[] a = f.list();
           for(String i:a){
            System.out.println(i);
           }

        }


    }
} 