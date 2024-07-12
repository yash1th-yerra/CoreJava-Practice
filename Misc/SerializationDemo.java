//Serialization
//The process of converting state of object into a byte stream to persist or transmit it in a platform 
//independent form .It can be used to sent over network as a file
//Deserialization is reverse process
//value can't be saved if it is either final(forever constant),
//static(not saved but loaded with same value when deserialized) or 
//transient(not saved and also instialized with value 0).
import java.io.*;
class Demo implements java.io.Serializable{
    public int a;
    public String b;
    transient int c;
    static int d;
    public Demo(int a,int c,int d,String b){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
public class SerializationDemo {
    public static void main(String[] args) {
        Demo obj = new Demo(5,6,7,"hello");
        String filename = "File.ser";
        try{
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(obj);
            out.close();
            file.close();
            System.out.println("Serialization Started");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        Demo obj2 = null;
        try{
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream input=new ObjectInputStream(file);
            obj2 = (Demo)input.readObject();
            input.close();
            file.close();
            System.out.println("Deserialization Started");
            System.out.println(obj2.a+" "+obj2.b+" "+obj2.c+" "+obj2.d);
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}