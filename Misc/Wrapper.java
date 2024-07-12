import java.io.*;
public class Wrapper{
    public static void main(String[] args) {
        byte a=1;
        Byte bytobj=new Byte(a);
        char c='a';
        Character chobj= new Character(c);
        short s=100;
        Short shobj = new Short((short)(s));
        int i=256;
        Integer inumobj = new Integer(i);
        long l=3489;
        Long lonmobj = new Long(l);
        float f=-7.8f;
        Float flomobj = new Float(f);
        double d=-12.3d;
        Double dobjs = new Double(d);
        
        System.out.println("Byte:"+bytobj);
        System.out.println("Character:"+chobj);
        System.out.println("Short:"+shobj);
        System.out.println("Integer:"+inumobj);
        System.out.println("Long:"+lonmobj);
        System.out.println("Float:"+flomobj);
        System.out.println("Double:"+dobjs);
    }
    
}
