import java.io.*;
class Test implements Serializable{
    private static Long serialVersionUID = 12345678L;
    public int a;
    transient int c;
    static int d;
    public String  b;
    public Test(String b, int a){
        this.a = a;
        this.b = b;
        this.c = a;
        this.d = a;
    }
}
public class SerializationDemo{
    public static void main(String[] args) {
        Test object = new Test("Hello",1);
        String filename = "C://Users//DELL//Desktop//Hello.txt";
        try{
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        }
        catch(IOException e){
            e.printStackTrace();

        }
        Test object1 = null;
        try{
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            object1 = (Test)in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been Deserialized");
            System.out.println("a "+object1.a);
            System.out.println("b "+object1.b);
            System.out.println("c "+object1.c);
            System.out.println("d "+object1.d);
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}