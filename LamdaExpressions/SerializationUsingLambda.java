import java.io.*;
import java.util.function.*;
@FunctionalInterface
interface MyInterface extends  Serializable{
    void hello(String name);

}
class MyImpl implements MyInterface{
    @Override public void hello(String name){
        System.out.println("Hello "+name);
    }
}
public class SerializationUsingLambda{
    private static void serialize(Serializable obj,String path) throws IOException{
        File outFile = new File(path);
        if(!outFile.exists()){
            outFile.createNewFile();
        }
        ObjectOutputStream outStream=null;
        try{
            outStream  = new ObjectOutputStream(new FileOutputStream(outFile));
            outStream.writeObject(obj);

        }
        finally{
            if(outStream!=null)
            outStream.close();
        }
    }
    private static Object deserialize(String path)throws IOException,ClassNotFoundException{
        File inFile = new File(path);
        ObjectInputStream inStream = null;
        try{
            inStream = new ObjectInputStream(new FileInputStream(inFile));
            return inStream.readObject();
        }
        finally{
            if(inStream!=null)
            inStream.close();

        }
    }

    private static void serializeAndDeserializeFunc()throws Exception {
        Function<Integer,String> fn = (Function<Integer,String>&Serializable)(n)->"Hello"+n;
        System.out.println("run Original function");
        fn.apply(10);
        String path = "./serialized-fn";
        serialize((Serializable)fn,path);
        System.out.println("Serialization funcation to "+path);
        Function<Integer,String> desfn = (Function<Integer,String>)deserialize(path);
        System.out.println("Deserialization to the "+path);
        System.out.println("Run derialization method"+desfn.apply(11));
    }
    private static void serializeAndDeserializeClass()throws Exception{
        String path = "./Serialized-class";
        serialize(new MyImpl(),path);
        System.out.println("Serializing to "+path);
        MyInterface ImplClass = (MyInterface)deserialize(path);
        System.out.println(ImplClass);
        System.out.println("Deserialized from "+path);
        MyInterface instance = new MyImpl();
        instance.hello("java");

    }
    public static void main(String[] args) {
        try{
        serializeAndDeserializeFunc();
        serializeAndDeserializeClass();}
        catch(Exception e){
            e.printStackTrace();
        }
    }
}