import java.io.*;

public class ExternalizableDemo implements Externalizable{
    String name;
    int age;
    int jobId;
    public ExternalizableDemo(){
        System.out.println("Public no-argument constructor");

    }
    public ExternalizableDemo(String name,int age,int jobId){
        this.name = name;
        this.age = age;
        this.jobId = jobId;
    }
    public void writeExternal(ObjectOutput out) throws IOException{
        out.writeObject(name);
        out.writeObject(age);
    }
    public void readExternal(ObjectInput in )throws IOException,ClassNotFoundException{
        name = (String)in.readObject();
        age = in.readInt();
    }
    public static void main(String[] args) throws Exception {
        ExternalizableDemo t1  = new ExternalizableDemo("Yash",21,132);
        FileOutputStream fos = new FileOutputStream("C://Users//DELL//Desktop//hello123.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(t1);
        oos.close();
        fos.close();
        FileInputStream fis = new FileInputStream("C://Users//DELL//Desktop//hello123.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ExternalizableDemo t2 = (ExternalizableDemo)ois.readObject();
        System.out.println("Name: "+t2.name+" Age: "+t2.age);
        ois.close();
        fis.close();


    }

}