//Throw Demonstration 
public class ThrowDemo {
    public static void method(){
        throw new NullPointerException("demo");
        
            
       
    }
    public static void main(String[] args){
        try{
            method();
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
    }
}